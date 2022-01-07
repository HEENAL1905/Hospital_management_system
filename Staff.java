import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Staff extends Person {
    private String designation;
    private Double pay;
    private int S_Id;
    double salary ;
  
    public Staff() {}
  
    public Staff(String name, String address, String designation, Double pay,int S_Id,String phone) {
      this.setName(name);
      this.setAddress(address);
      this.setDesignation(designation);
      this.setPay(pay);
      this.setS_Id(S_Id);
      this.setPhone(phone);
    }
  
  
    public String getDesignation() {
      return this.designation;
    }
  
    public void setDesignation(String designation) {
      try {
        if (designation.length() < 2)
        this.designation = null;
  
        String regex = "^[\\p{L} .'-]+$";
  
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(designation);
  
        if (matcher.matches())
          this.designation=designation; 
        else 
          System.out.println("\nInvalid designation");
      } catch (NullPointerException e) {
        System.out.println("\ndesignation cannot be null");
      }
    }
  
    public Double getPay() {
      return this.pay;
    }
  
    public void setPay(Double pay) {
      try {
        if (pay > 0 && pay < 1000000)
          this.pay = pay;
        else
          System.out.println("\nPay value has to be between 0 and 1,000,000");
      } catch (NullPointerException e) {
        System.out.println("\nFee cannot be null");
      }
    }
    public void Calculateyearlysalary(double pay)
    {
      salary=this.pay*12;
    }
    public int getS_Id() {
        return this.S_Id;
      }
   
    public void setS_Id(int S_Id) {
        this.S_Id= S_Id;
      }
    // Helper function
    public String toString() {
        return super.toString() + "\nstaff ID = " + this.S_Id+"\nmonthly pay "+this.pay
        +"\ndesignation: "+this.designation + "\nannual salary ="+this.salary;
    }
  }