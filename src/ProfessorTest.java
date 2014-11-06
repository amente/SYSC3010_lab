import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ProfessorTest {

	static Professor testProfessor;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testProfessor = new Professor("Bobby", "Chawla");
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
	public void constructorTest(){
		assertEquals("Incorrect first name", testProfessor.getFirstName(), "Bobby");
		assertEquals("Incorrect last name", testProfessor.getLastName(), "Chawla");
	}
}
