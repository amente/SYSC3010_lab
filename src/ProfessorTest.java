import static org.junit.Assert.*;
<<<<<<< HEAD
=======
import junit.framework.Assert;
>>>>>>> ad74495ab2dc43b73a171a87cc2ca788afefe9d4

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ProfessorTest {

<<<<<<< HEAD
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
=======
	static Professor testProfessor;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testProfessor = new Professor("Bobby", "Chawla");
>>>>>>> ad74495ab2dc43b73a171a87cc2ca788afefe9d4
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
<<<<<<< HEAD
=======
	
	@Test
	public void constructorTest(){
		assertEquals("Incorrect first name", testProfessor.getFirstName(), "Bobby");
		assertEquals("Incorrect last name", testProfessor.getLastName(), "Chawla");
	}
>>>>>>> ad74495ab2dc43b73a171a87cc2ca788afefe9d4

}
