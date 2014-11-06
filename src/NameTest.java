import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class NameTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testName()
	{
		Name name = new Name("Yuan","Sun");
		assertEquals("Yuan",name.getFirst());
		assertEquals("Sun",name.getLast());
	}
	
	@Test
	public void testName_nullCase()
	{
		try {
			Name name = new Name(null,null);
		}catch(NullPointerException e) {
			//pass
		}catch(Exception e) {
			fail("fail to catch the right exception when passing null to the constructor.");
		}
	}
	
	@Test
	public void testToString()
	{
		Name name = new Name("Yuan","Sun");
		assertEquals("Yuan Sun",name.toString());
	}
	
	@Test
	public void testEquals_happy()
	{
		Name name1 = new Name("Yuan","Sun");
		Name name2 = new Name("Yuan","Sun");
		assertTrue(name1.equals(name2));
	}
	
	@Test
	public void testEquals_sad()
	{
		Name name1 = new Name("Yuan","Sun");
		Name name2 = new Name("Amente","Sun");
		assertFalse(name1.equals(name2));
	}
}
