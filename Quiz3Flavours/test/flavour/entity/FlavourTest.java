
package flavour.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FlavourTest {
    
    public FlavourTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*@Test
    public void testSetFlavourID() {
        System.out.println("setFlavourID");
        int flavourID = 0;
        Flavour instance = null;
        instance.setFlavourID(flavourID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    
    @Test
    //Test 1 flavour name is null
    public void testSetNameNull() {
        System.out.println("setNameNull ....");
        Flavour instance = new Flavour(1,"chocolate");
        String name = null;
        boolean exception = false;
        try {
            instance.setName(name);
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertEquals("Exception expected for Flavour Name " + name, exception, true);
        System.out.println("Pass test 1 SetNameNull");
    }

    @Test
    //name is at 2 character
    public void testSetNameTooShort() {
        System.out.println("set Flavour Name TooShort  ....");
        Flavour f = new Flavour(1,"chocolate");
        String name = "";
        boolean exception = false;

        try {
            f.setName("");;
        } catch (IllegalArgumentException e) {
            exception = true;
        } catch (NullPointerException e) {
            fail("Set Flavour Name must throw nullpointexception");
        }
        assertEquals("Exception Too Short " + name, exception, true);

        try {
            f.setName("a");;
        } catch (IllegalArgumentException e) {
            exception = true;
        } catch (NullPointerException e) {
            fail("SetName must throw nullpointexception");
        }
        assertEquals("Exception Too Short " + name, exception, true);
        System.out.println("Pass test 2 Name at 2 characters");
    }
    
    @Test
    //name is empty string
    public void testSetNameEmptyString() {

        Flavour f = new Flavour(1,"chocolate");
        String name = "";
        boolean exception = false;
        try {
            f.setName(null);;
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertEquals("Exception expected for EmptyString " + name, exception, true);
        System.out.println("Pass test 3 setName EmptyString test passed ....");
    }

    
    
    
    
    
    
    
    
    
    
}
