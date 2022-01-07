import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Doctor extends Staff {
    private String speciality;
    private String designation;
    private int S_Id;
    private int years_of_experience;
  
    public Doctor() {}
  
    public Doctor(String speciality,int years_of_experience,String name, String address, String designation, Double pay,int S_Id,String phone) {
      this.setSpeciality(speciality);
      this.setYearsofexperience(years_of_experience);
      this.setName(name);
      this.setAddress(address);
      this.setDesignation(designation);
      this.setPay(pay);
      this.setS_Id(S_Id);
      this.setPhone(phone);
     
    }
    public int getS_Id() {
      return this.S_Id;
    }

    public String getDesignation() {
      return this.designation;
    }
  

    public String getSpeciality() {
      return this.speciality;
    }
  
    public void setSpeciality(String speciality) {
      try {
        if (speciality.length() < 2)
        this.speciality= null;
  
        String regex = "^[\\p{L} .'-]+$";
  
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(speciality);
  
        if (matcher.matches())
          this.speciality=speciality; 
        else 
          System.out.println("\nInvalid speciality");
      } catch (NullPointerException e) {
        System.out.println("\nspeciality cannot be null");
      }
    }
  
    public int getYearsofexperience() {
      return this.years_of_experience;
    }
  
    public void setYearsofexperience(int years_of_experience) {
     
          this.years_of_experience =years_of_experience;
       
    }

    // Helper function
    public String toString() {
        return super.toString() + "\nspeciality = " + this.speciality+"\n number of years of experience="+this.years_of_experience;
    }
  }