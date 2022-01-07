import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Person {
    private String name;
    private String address;
    private String phone;
  
    public Person() {}
  
    public Person(String name, String address,String phone) {
      this.setName(name);
      this.setAddress(address);
      this.setPhone(phone);
    }
  
    // Getters and Setters
    public String getName() {
      return this.name;
    }
    public String getPhone() {
      return this.phone;
    }
    public void setPhone(String phone) {
      try {
        if (phone.length() !=10)
          this.phone= null;
    
          String regex = "(0/91)?[7-9][0-9]{9}";
    
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
    
        if (matcher.matches())
          this.phone =phone; 
        else 
          System.out.println("\nInvalid number passed!");
      } catch (NullPointerException e) {
        System.out.println("\nName cannot be null and should be of 10 digits ");
      }
    }
  
  
    public void setName(String name) {
      try {
        if (name.length() < 2)
          this.name = null;
    
        String regex = "^[\\p{L} .'-]+$"; // any name from any language
    
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
    
        if (matcher.matches())
          this.name = name; 
        else 
          System.out.println("\nInvalid name passed!");
      } catch (NullPointerException e) {
        System.out.println("\nName cannot be null");
      }
    }
  
    public String getAddress() {
      return this.address;
    }
  
    public void setAddress(String address) {
      try {
      if (address.trim().length() > 3)
        this.address = address;
      else 
        System.out.println("\nInvalid address passed!");
      } catch (NullPointerException e) {
        System.out.println("\nAddress cannot be null");
      }
    }
  
    public String toString() {
      return "Person[name = '" + this.name  + "', address = '" + this.address +  "', phone number = '" + this.phone +"']";
    }
  }