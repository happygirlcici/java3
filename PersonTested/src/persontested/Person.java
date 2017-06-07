package persontested;

import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Person {
    
   public Person (String name,int age,String postalCode,double weightKg,Date dateOfBirth){
           
   this.name = name;
   this.age=age;
   this.postalCode = postalCode;
   this.weightKg = weightKg;
   this.dateOfBirth = dateOfBirth;
   
}
   public Person (String name,int age){
           
   this.name = name;
   this.age=age;
   
   
}
    //home work 1) encapsulate fields 2) write setters 3) write unite tests for each setter
    private String name;
    private int age;
    String postalCode; //"7A7 A7A"
    double weightKg; // 0-300 (both inclusive)
    Date dateOfBirth;//valid date YYYY-MM-DD from 1900 to 2099 year

    
    public String getName() {
        return name;
    }

    SimpleDateFormat formatter = new SimpleDateFormat("yyyyy-mm-dd");
  
    public final void setName(String name) {
        if (name == null || name.length() < 2 || name.length() > 20){
            throw new IllegalArgumentException("Name to short");
        }
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    
    public final void setAge(int age) {
        if (age <0 || age > 150 ){
            throw new IllegalArgumentException("Invalid Age ");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    public final void setPostalCode(String postalCode) {
        
        //boolean isPostcodeInvalid = postalCode.matches("[0-9][A-Z][0-9] ?[A-Z][0-9][A-Z]");
        //\s*,\s*
        
        boolean isPostcodeInvalid = postalCode.toLowerCase().matches("[A-Z][0-9][A-Z] ?[0-9][A-Z][0-9] ");
        //boolean isStringCommaInvalid = postalCode.toLowerCase().matches("\\s*,\\s*");
        if ( isPostcodeInvalid == false){
            throw new IllegalArgumentException("Invalid postal code ");
        }
                
        this.postalCode = postalCode;
    }

    public final void setWeightKg(double weightKg) {
        
        if ( weightKg <0 || weightKg > 300){
            throw new IllegalArgumentException("Invalid weightKg ");
        }
        this.weightKg = weightKg;
    }

    
    
    public final void setDateOfBirth(Date dateOfBirth) throws ParseException {
        
        String strDateBirth = dateOfBirth.toString();
        //dateOfBirth.get
        /*
        
    Date theDate = format.parse("JAN 13,2014  09:15");

    Calendar myCal = new GregorianCalendar();
    myCal.setTime(theDate);

    System.out.println("Day: " + myCal.get(Calendar.DAY_OF_MONTH));
    System.out.println("Month: " + myCal.get(Calendar.MONTH) + 1);
    System.out.println("Year: " + myCal.get(Calendar.YEAR));
        
        
        SimpleDateFormat format = new SimpleDateFormat("MMM dd,yyyy  hh:mm", Locale.ENGLISH);
        Date theDate = format.parse("JAN 13,2014  09:15");
        Calendar myCal = new GregorianCalendar();
        myCal.setTime(theDate);
        int int_y = myCal.get(Calendar.YEAR);
        ///
        */
        
        /*
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateOfBirth);
        int year = cal.get(Calendar.YEAR);
        */
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        //String strYear = 
        int intYear = Integer.parseInt(df.format(dateOfBirth));
        
        if ((intYear < 1900)|| (intYear > 2099 )) {
            throw new IllegalArgumentException("Invalid Date Of Birth ");
        
        }
        
        this.dateOfBirth = dateOfBirth;
    }
    
    
}
