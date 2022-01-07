class Disease {
    private String disease_name;
    private String disease_type;
    
    public Disease()
    {

    }
    public Disease(String disease_name, String disease_type) {
      this.disease_name = disease_name;
      this.disease_type = disease_type;
     
    }
    public String getDiseasename() {
      return this.disease_name;
    }
    public String getDiseasetype() {
      return this.disease_type;
    }

    public void setDiseasename(String disease_name) {
      this.disease_name = disease_name;
    }
    public void setDiseasetype(String disease_type) {
        this.disease_type= disease_type;
      }
     
    public String toString() {
        return "disease Name = " + this.disease_name + " , disease type = " + this.disease_type ;
    }
  }