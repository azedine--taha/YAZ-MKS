import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.services.familleEquipementService.FamilleEquipementService;

public class FamilleEquipementRepositoryTest {

	
	public class BlogServiceTest {

		private FamilleEquipementService familleEquipementService;

		@Before
		public void setUp() throws Exception {
			familleEquipementService = new FamilleEquipementService();
		}

		@Test
		public void testGetLastIndexDateMinutes() {
			assertEquals(familleEquipementService.getFamilleEquipementByCode("famille1"), "famille1");
		}

		@Test
		public void testGetLastIndexDateMinutesEmptyDateFinish() {
			assertEquals(familleEquipementService.getFamilleEquipementByCode("famille1"), "famille1");
		}
	}
}
