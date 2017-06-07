/*
 *  Homework: 1) encapsulate fields, 2) write setters, 3) write unit tests for each setter
    String postalCode; // "7A7 A7A"
    double weightKg; // 0-300 (both inclusive)
    Date dateOfBirth; // valid date YYYY-MM-DD from 1900 to 2099 year
 */
package persontested;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

    public PersonTest() {
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

    /* @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = null;

        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */
    @Test
    public void testSetAge1to150() {
        System.out.println("setAge ....");
        //int age = 0;
        //Person instance = null;
        Person instance = new Person("Jerry", 1);
        for (int age = 0; age <= 150; age++) {
            instance.setAge(age);
        }
        System.out.println("setAge 1 to 150 passed");
        //instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetAgeOutOfRangeNagative() {
        System.out.println("setAge ....");
        Person instance = new Person("Jerry", 1);
        for (int age = -1; age > -100; age--) {
            boolean exception = false;
            try {
                instance.setAge(age);
            } catch (IllegalArgumentException e) {
                exception = true;
            }
            //if exception != true then fail with the message
            assertEquals("Exception expected for age " + age, exception, true);
        }

    }

    @Test
    public void testSetAgeOutOfRangeAbove150() {
        System.out.println("setAge ....");
        Person instance = new Person("Jerry", 1);
        for (int age = 151; age < 250; age++) {
            boolean exception = false;
            try {
                instance.setAge(age);
            } catch (IllegalArgumentException e) {
                exception = true;
            }
            //if exception != true then fail with the message
            assertEquals("Exception expected for age " + age, exception, true);
        }

    }

////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    //name is null
    public void testSetNameNull() {
        System.out.println("setNameNull ....");
        Person instance = new Person("Jerry", 1);
        String name = null;
        boolean exception = false;
        try {
            instance.setName(name);;
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertEquals("Exception expected for Name " + name, exception, true);
    }

    @Test
    //name is empty string
    public void testSetNameEmptyString() {

        Person instance = new Person("Jerry", 1);
        String name = "";
        boolean exception = false;
        try {
            instance.setName(null);;
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertEquals("Exception expected for EmptyString " + name, exception, true);
        System.out.println("setName EmptyString test passed ....");
    }

    @Test
    //name is empty string
    public void testSetNameAA() {
        System.out.println("setName EmptyString  ....");
        Person p = new Person("Jerry", 1);
        String name = "";
        boolean exception = false;
        if (name.contains("aa") || name.contains("AA") || name.contains("AAA") || name.contains("aaa")) {
            try {
                p.setName(name);;
            } catch (IllegalArgumentException e) {
                exception = true;
            } catch (NullPointerException e) {
                fail("SetName must throw nullpointexception");
            }
            assertEquals("Exception expected for EmptyString " + name, exception, true);
        }
    }

    @Test
    //name is empty string
    public void testSetNameTooShort() {
        System.out.println("setName TooShort  ....");
        Person p = new Person("Jerry", 1);
        String name = "";
        boolean exception = false;

        try {
            p.setName("");;
        } catch (IllegalArgumentException e) {
            exception = true;
        } catch (NullPointerException e) {
            fail("SetName must throw nullpointexception");
        }
        assertEquals("Exception Too Short " + name, exception, true);

        try {
            p.setName("a");;
        } catch (IllegalArgumentException e) {
            exception = true;
        } catch (NullPointerException e) {
            fail("SetName must throw nullpointexception");
        }
        assertEquals("Exception Too Short " + name, exception, true);
    }

    @Test
    public void testSetNameLongEnough() {
        System.out.println("setName long enough");
        Person p = new Person("aaaaa", 7);
        String name = "M";
        try {
            for (int i = 2; i <= 20; i++) {
                name += "a";
                p.setName(name);
            }
        } catch (IllegalArgumentException e) {
            fail("setName(\"" + name + "\") should not throw IllegalArgumentException");
        }
    }

    /*
    @Test
    public void testSetPostalCodeInvalid() {
        System.out.println("setPostalCode Invalid  ....Test");
        
        String postalCode = "7B7A1A";
        boolean exception = false;
        
        try {
            Date dateBirth = dt1.parse("2001-01-01");
            Person p = new Person("aaaaa",1,"7A7 A7A", 50.00,dateBirth);
            //p.setDateOfBirth(dateBirth);
            p.setPostalCode(postalCode);
        } catch (IllegalArgumentException e) {
            exception = true;
        } catch (NullPointerException e) {
            fail("SetPostalCode must throw nullpointexception");
        } catch (ParseException e){
            fail("SetPostalCode must throw ParseException");
        }
            
        assertEquals("Exception expected for PostalCodeInvalid  ", exception, true);

    }
     */
    @Test
    public void testSetPostalCode() throws ParseException {
        Date birthDate = formatter.parse("2001-01-01");
        System.out.println("setPostalCode is valid...");
        String postalCode = "7A7 666";
        Person instance = new Person("Jerry", 1, "7A7 A1A", 55.0, birthDate);
        boolean exception = false;
        try {
            instance.setPostalCode(postalCode);
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertEquals("Exception expected for PostalCode " + postalCode, exception, true);
        System.out.println("setPostalCode passsed");
    }

    @Test
    public void testSetDateOfBirthAbove2099() {
        System.out.println("setDateOfBirth Invalid  ....Test");
        boolean exception = false;
        for (int iYear = 2100; iYear < 9999; iYear++) {
            try {
                Date dateBirth = formatter.parse(iYear+"-01-01");
                Person p = new Person("Jerry", 1, "7A7 A1A", 55.0, dateBirth);
                p.setDateOfBirth(dateBirth);
            } catch (IllegalArgumentException e) {
                exception = true;
            } catch (NullPointerException e) {
                fail("SetPostalCode must throw nullpointexception");
            } catch (ParseException e) {
                fail("SetPostalCode must throw ParseException");
            }
        }
        assertEquals("Exception expected for DateOfBirth Above 2099  ", exception, true);

    }

    //weightKg
    @Test
    public void testSetWeightOutOfRangeAbove300() {
        System.out.println("setWeight ....");
        Person instance = new Person("Jerry", 1);
        for (double weight = 301; weight < 900; weight++) {
            boolean exception = false;
            try {
                instance.setWeightKg(weight);
            } catch (IllegalArgumentException e) {
                exception = true;
            }
            //if exception != true then fail with the message
            assertEquals("Exception expected for weight " + weight, exception, true);
        }

    }

    @Test
    public void testSetWeightOutOfRangeLower0() {
        System.out.println("setWeight ....");
        Person instance = new Person("Jerry", 1);
        for (double weight = -1; weight > -100; weight--) {
            boolean exception = false;
            try {
                instance.setWeightKg(weight);
            } catch (IllegalArgumentException e) {
                exception = true;
            }
            //if exception != true then fail with the message
            assertEquals("Exception expected for weight " + weight, exception, true);
        }

    }
////////////////////////////////////////////////////////////////////////////////////////////////
    /*@Test
    public void testToString() {
        System.out.println("toString");
        Person instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */
}
