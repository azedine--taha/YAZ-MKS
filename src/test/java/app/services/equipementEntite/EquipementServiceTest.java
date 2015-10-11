package app.services.equipementEntite;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import app.entity.equipementEntity;
import app.services.equipementService.EquipementService;

public class EquipementServiceTest {

    @Autowired
    EquipementService equipementService;
	
	@Before
	public void setUp() throws Exception {
		equipementService=new EquipementService();
	}

	@Test
	public void testGetListEquipement() {
	List<equipementEntity> list=new ArrayList<equipementEntity>();
	list=   equipementService.getListEquipement();
		assertEquals(list.size(), 2);
	}

}
