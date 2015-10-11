package app.services.equipementEntite;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import app.entity.equipementEntity;
import app.repositories.EquipementRepository;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class EquipementServiceTest1 {

    @Autowired
    EquipementRepository equipementRepository;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testValidateEquipement() {
    }

    @Test
    public void testGetListEquipement() {
        List<equipementEntity>  list=   equipementRepository.findAll();
            assertEquals(list.size(), 3);
    }

    

}
