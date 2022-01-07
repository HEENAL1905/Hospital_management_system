

class Patient extends Person {
    private int P_Id;
    private int age;
    private Disease disease;
    
  
    public Patient() {}
  
    public Patient(String name, String address, int P_Id , int age , Disease disease,String phone) {
      this.setName(name);
      this.setAddress(address);
      this.setP_Id(P_Id);
      this.setAge(age);
      this.setDisease(disease);
      this.setPhone(phone);
    }
    public int getP_Id() {
        return this.P_Id;
      }
      public Disease getdisease() {
        return this.disease;
      }
    public void setDisease(Disease disease) {
      this.disease = disease;
    }
    public void setP_Id(int P_Id) {
        this.P_Id= P_Id;
      }
    
  
    public Integer getAge() {
      return this.age;
    }
  
    public void setAge(int age) {
      try {
        if (age > 0) 
          this.age = age;
        else 
        System.out.println("\nage has to be greater than 0");
      } catch (NullPointerException e) {
        System.out.println("\nage cannot be null");
      }
    }
  

    public String toString() {
        return super.toString() + ", patient ID = " + this.P_Id +", age: "+this.age +"\ndiseases details =[" +disease.toString()+"]";
    }
  }