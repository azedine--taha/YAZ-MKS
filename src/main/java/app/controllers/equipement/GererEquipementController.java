package app.controllers.equipement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.entity.equipementEntity;
import app.services.EquipementService;

@Controller
@RequestMapping("/gererEquipement")
public class GererEquipementController {
	
	@Autowired
	EquipementService equipementService;
	
	@RequestMapping( value="/createEquipement")
	public String index(Model model)
	{
		model.addAttribute("listEquipement",equipementService.getListEquipement());
		return "createEquipement";
	}
	
	@ModelAttribute("equipement")
	public equipementEntity construct(){
		return new equipementEntity();
	}
	@RequestMapping( value="/annuler")
	public String cancel(Model model){
		model.addAttribute("equipement",new equipementEntity());
		return "redirect:/gererEquipement/createEquipement.html";
	}
	
	@RequestMapping( value="/createEquipement",method=RequestMethod.POST)
	public String Register(@ModelAttribute("equipement")  equipementEntity equipementEntity,BindingResult result,Model model){
		if(result.hasErrors()){
			return "createEquipement";
		}
		equipementService.validateEquipement(equipementEntity);
		return "redirect:/gererEquipement/createEquipement.html?success=true";
	}
	
	@RequestMapping(value="/updateEquipement/{id}",method=RequestMethod.GET)
	public String updateEquipement(Model model,@PathVariable int id){
		equipementEntity equipementEntity =equipementService.getEquipementByID(id);
	   model.addAttribute("equipement",equipementEntity);
	    model.addAttribute("listEquipement",equipementService.getListEquipement());
		return this.index(model);
	}
	@RequestMapping(value="/updateEquipement/{id}",method=RequestMethod.POST)
	public String updateEquipement(@ModelAttribute("equipement")  equipementEntity equipementEntity,@PathVariable int id){
		equipementService.validateEquipement(equipementEntity);
		return "redirect:/gererEquipement/createEquipement.html";
	}
	
	@RequestMapping(value="/deleteEquipement/{id}")
	public String deleteEquipement(@PathVariable Integer id){
		equipementEntity equipementEntity=equipementService.getEquipementByID(id);
		equipementService.deleteEquipement(equipementEntity);
		return "redirect:/gererEquipement/createEquipement.html";
	}

}
