import java.util.Arrays;
class Prescription {
    private String type;
    private String[] mediciene_name;
    private String DEA_number;
    private double[] mediciene_price; 
    private Patient patient;
    double bill;
   
    public  Prescription()
    {}
    public  Prescription(String type, String[] mediciene_name, String DEA_number , double[] mediciene_price,Patient patient) {
      this.type = type;
      this.mediciene_name = Arrays.copyOf(mediciene_name, mediciene_name.length);
      this.DEA_number = DEA_number;
      this.mediciene_price=Arrays.copyOf(mediciene_price, mediciene_price.length);
      this.patient=patient;

    }
    public String[] getMediciene_name() {
        return mediciene_name;
    }
    public double[] getMediciene_price() {
        return mediciene_price;
    }
    public String getType() {
      return this.type;
    }
 
    public String getDEA_number() {
        return this.DEA_number;
      }

    public void setType(String type) {
      this.type = type;
    }

      public void setDEA_number(String DEA_number) {
        this.DEA_number = DEA_number;
      }
    public void Bill(double[] mediciene_price){
       for (int i=0;i< mediciene_price.length;i++)
        {
            bill=bill+this.mediciene_price[i];
        }
   }
    public void setMediciene_name(String[] mediciene_name) {
      this.mediciene_name = Arrays.copyOf(mediciene_name, mediciene_name.length);
    }
    public void setMediciene_price(double[] mediciene_price) {
      this.mediciene_price=Arrays.copyOf(mediciene_price, mediciene_price.length);
    }

    public Patient getPatient() {
      return patient;
  }
  public void setPatient(Patient patient) {
    this.patient = patient;
  }
 
    public String toString() {
        return "Patient details =["+patient.toString()+"\nprescription details =[type = " + this.type + ", DEA_number = "+this.DEA_number + ", Bill = "+this.bill+"]]" ;
    }
  }