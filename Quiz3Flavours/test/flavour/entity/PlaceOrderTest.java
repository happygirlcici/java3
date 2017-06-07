
package flavour.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlaceOrderTest {
    
    public PlaceOrderTest() {
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

    
    @Test
    //Test 1 customer name is null
    public void testSetCustomerNameNull() {
        System.out.println("setCustomer NameNull ....");
        PlaceOrder p = new PlaceOrder(1,"Jerry","chocolate");
        String custName = null;
        boolean exception = false;
        try {
            p.setCustomerName(custName);
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertEquals("Exception expected for Customer Name " + custName, exception, true);
        System.out.println("Pass test 4 SetCustomerNameNull");
    }

    @Test
    //Customer name is at 2 character
    public void testSetCustomerNameTooShort() {
        System.out.println("set Flavour Name TooShort  ....");
        PlaceOrder p = new PlaceOrder(1,"Jerry","chocolate");
        String custName = "";
        boolean exception = false;

        try {
            p.setCustomerName(custName);;
        } catch (IllegalArgumentException e) {
            exception = true;
        } catch (NullPointerException e) {
            fail("Set Flavour Name must throw nullpointexception");
        }
        assertEquals("Exception Too Short " + custName, exception, true);

        try {
            p.setCustomerName("a");;
        } catch (IllegalArgumentException e) {
            exception = true;
        } catch (NullPointerException e) {
            fail("SetName must throw nullpointexception");
        }
        assertEquals("Exception Too Short " + custName, exception, true);
        System.out.println("Pass test 5 SetCustomerNameTooShort");
    }
    
    @Test
    //Test 1 customer name is null
    public void testSetFlavourListNull() {
        System.out.println("setFlavourList Null ....");
        PlaceOrder p = new PlaceOrder(1,"Jerry","chocolate");
        String flavList = null;
        boolean exception = false;
        try {
            p.setFlavourList(flavList);
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        assertEquals("Exception expected for Customer Name " + flavList, exception, true);
        System.out.println("Pass test 6 SetFlavourListNull");
    }
    
    @Test
    //Test 1 customer name is null
    public void testSetFlavourListCommaSeparated() {
        System.out.println("setFlavourList comma-separated words valid....");
        PlaceOrder p = new PlaceOrder(1,"Jerry","chocolate");
        //String flavList = null;
        String[] flavList = {"vanilla,mango", "chocolate    mango orange","god2 543253 4532534"};
        boolean exception = false;
        for (String flav : flavList) {
        try {
            p.setFlavourList(flav);
        } catch (IllegalArgumentException e) {
            exception = true;
        }
        }
        assertEquals("Exception expected for setFlavourList comma-separated words valid " + flavList, exception, true);
        System.out.println("Pass test 7 SetFlavourListCommaSeparated");
    }
    
    
    
    
    
}
