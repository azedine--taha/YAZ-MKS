package app.services.familleEquipementEntite;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import app.entity.familleEquipementEntity;
import app.repositories.FamilleEquipementRepository;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class FamilleEquipementServiceTest {

   @Autowired
    FamilleEquipementRepository familleEquipementRepository;
   
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetFamilleEquipementByCode() {
        familleEquipementEntity f=familleEquipementRepository.findOne(1);
        familleEquipementEntity f2=familleEquipementRepository.findByCode("F1");
        assertEquals(f2, f);
        
    }

}
