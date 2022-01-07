interface Laboratory{
    public abstract String getTestname();
    public abstract int getT_id();
    public abstract int getTprice();
}
interface Report {
  public abstract String getReportid();
  public abstract String getDate_of_issue();
}
public class Labtest implements Laboratory,Report {
    private String testname;
    private int T_id;
    private int Tprice;
    private String reportid;
    private String date_of_issue;
  
    // Constructors
    public Labtest() {}
  
    public Labtest(String testname, int T_id,int Tprice, String reportid,String date_of_issue) {
      this.setTestname(testname);
      this.setT_id(T_id);
      this.setTprice(Tprice);
      this.setReportid(reportid);
      this.setDate_of_issue(date_of_issue);
    }
  
    // Getters and Setters
    @Override
    public String getTestname() {
      return this.testname;
    }
  
    public void setTestname(String testname) {

          this.testname =testname; 

    }
    public String getReportid() {
      return this.reportid;
    }
  
    public void setReportid(String reportid) {

          this.reportid=reportid; 

    }
    public String getDate_of_issue() {
      return this.date_of_issue;
    }
  
    public void setDate_of_issue(String date_of_issue) {

          this.date_of_issue =date_of_issue; 

    }
    public int getT_id() {
        return this.T_id;
      }
    
      public void setT_id(int T_id) {
        
          this.T_id = T_id;
       
      }
    public int getTprice() {
      return this.Tprice;
    }
  
    public void setTprice(int Tprice) {
      
        this.Tprice = Tprice;
     
    }
  
    // Helper function
    @Override
    public String toString() {
      return "\n\ntestname = " + this.testname + "\nT_id = " + this.T_id + "\nT_price = "+this.Tprice + "\nDate_of_issue="+this.date_of_issue+"\nReportid = "+this.reportid;
    }
  }
  