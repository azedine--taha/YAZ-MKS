package app.controllers.equipement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import app.entity.equipementEntity;
import app.services.equipementService.GererEquipementService;
import app.services.familleEquipementService.GererFamilleEquipementService;

@Controller
@RequestMapping("/gererEquipement")
public class GererEquipementController {
	
    @Autowired
    GererEquipementService gererEquipementService;
	
	
	@RequestMapping( value="/createEquipement")
	public String index(Model model)
	{
		model.addAttribute("listEquipement",gererEquipementService.getListEquipement());
		return "createEquipement";
	}
	
	@ModelAttribute("equipement")
	public EquipementDTO construct(){
		return gererEquipementService.createEquipement();
	}
	@RequestMapping( value="/annuler")
	public String cancel(Model model){
		model.addAttribute("equipement",new equipementEntity());
		return "redirect:/gererEquipement/createEquipement.html";
	}
	//permet de submit le form avec la méthode POST
	@RequestMapping( value="/createEquipement",method=RequestMethod.POST)
	public String Register(@ModelAttribute("equipement")  EquipementDTO equipementDTO,BindingResult result,Model model,RedirectAttributes redirectAttributes){
		if(result.hasErrors()){
			return "createEquipement";
		}
		equipementDTO=gererEquipementService.validateEquipement(equipementDTO);
		 model.addAttribute("equipement",equipementDTO);
		 redirectAttributes.addFlashAttribute("equipementDTO", equipementDTO);
		return "redirect:/gererEquipement/createEquipement.htm";
	}
	
	@RequestMapping(value="/updateEquipement/{id}",method=RequestMethod.GET)
	public String updateEquipement(Model model,@PathVariable int id){
		EquipementDTO equipementDTO =gererEquipementService.getEquipementByID(id);
		model.addAttribute("equipement",equipementDTO);
	   model.addAttribute("eqp",equipementDTO);
	    model.addAttribute("listEquipement",gererEquipementService.getListEquipement());
		return "createEquipement";
	}
	@RequestMapping(value="/updateEquipement/{id}",method=RequestMethod.POST)
	public String updateEquipement(@ModelAttribute("equipement")  EquipementDTO equipementDTO,@PathVariable int id){
	    gererEquipementService.validateEquipement(equipementDTO);
		return "redirect:/gererEquipement/createEquipement.html";
	}
	
	@RequestMapping(value="/deleteEquipement/{id}")
	public String deleteEquipement(@PathVariable Integer id){
		EquipementDTO equipementDTO =gererEquipementService.getEquipementByID(id);
		gererEquipementService.deleteEquipement(equipementDTO);
		return "redirect:/gererEquipement/createEquipement.html";
	}

}
