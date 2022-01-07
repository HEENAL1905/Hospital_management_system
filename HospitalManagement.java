import java.util.Scanner; 
  class HospitalManagement {
    public static void main(String[] args) {
      System.out.println();
      System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM" );
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter your choice \n1.patient \n2.staff \n3.doctor \n4.labtest: " );
      int choice = sc.nextInt();
      String[] med_name=new String[20];
double[] med_price=new double[20];
      switch(choice)
      {
         case 1:
         Patient patient = new Patient();
         System.out.println("Enter patient name: " );
         patient.setName(sc.next());
         System.out.println("Enter patient address" );
patient.setAddress(sc.next());
System.out.println("Enter patient phone number" );
patient.setPhone(sc.next());
System.out.println("enter patient id: ");
patient.setP_Id(sc.nextInt());
System.out.println("enter patient age: ");
patient.setAge(sc.nextInt());

Disease D1=new Disease();
System.out.println("Enter disease name: " );
D1.setDiseasename(sc.next());
System.out.println("Enter disease type: " );
D1.setDiseasetype(sc.next());
patient.setDisease(D1);

Prescription P1=new Prescription();
System.out.println("Enter Prescription type: " );
P1.setType(sc.next());
System.out.println("Enter Prescription DEA number: " );
P1.setDEA_number(sc.next());
System.out.println("Enter number of mediciene: " );
int n=sc.nextInt();

for(int i=0;i<n;i++){
  System.out.println("Enter mediciene"+(i+1)+" :" );
  med_name[i]=sc.next();
    System.out.println("Enter price of mediciene"+(i+1)+" :" );
    med_price[i]=sc.nextDouble();
}
P1.setMediciene_name(med_name);
P1.setMediciene_price(med_price);
P1.Bill(med_price);
P1.setPatient(patient);
System.out.println("\n" + P1.toString());
break;     
   case 2:
   Staff staff = new Staff();
   System.out.println("Enter staff name: " );
   staff.setName(sc.next());
   System.out.println("Enter contact number: " );
   staff.setPhone(sc.next());
   System.out.println("Enter staff address" );
   staff.setAddress(sc.next());
   System.out.println("Enter staff monthly pay" );
  double staffpay=sc.nextDouble();
   staff.setPay(staffpay);
   staff.Calculateyearlysalary(staffpay);
   System.out.println("enter Staff Designation: ");
   staff.setDesignation(sc.next());
   System.out.println("enter staff id: ");
   staff.setS_Id(sc.nextInt());
  System.out.println("\n" + staff.toString());
  break;
   case 3:
   Doctor doctor = new Doctor();
   System.out.println("Enter doctor name: " );
   doctor.setName(sc.next());
   System.out.println("Enter doctor's address" );
doctor.setAddress(sc.next());
System.out.println("enter Staff Designation: ");
doctor.setDesignation(sc.next());
System.out.println("enter doctor's speciality ");
doctor.setSpeciality(sc.next());
System.out.println("enter years of experience ");
doctor.setYearsofexperience(sc.nextInt());
System.out.println("enter doctor's Id ");
doctor.setS_Id(sc.nextInt());
System.out.println("enter montly salary ");
double doctorpay=sc.nextDouble();
doctor.setPay(doctorpay);
doctor.Calculateyearlysalary(doctorpay);
System.out.println("\n" + doctor.toString());
break;
     case 4:
     Labtest t1=new Labtest();   
     System.out.println("Enter test name: " );  
     t1.setTestname(sc.next());
     System.out.println("enter test id: ");
     t1.setT_id(sc.nextInt());
     System.out.println("enter test price: ");
     t1.setTprice(sc.nextInt());
     System.out.println("enter test report id ");
     t1.setReportid(sc.next());
     System.out.println("enter test date (dd/mm/yyyy): ");
     t1.setDate_of_issue(sc.next());
System.out.println("\n" + t1.toString());
break;
         default:
         System.out.println("invalid input" );
     break;
       }

    sc.close();
  }
  }