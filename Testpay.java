

import org.junit.Test;
import static org.junit.Assert.assertEquals;

 public class Testpay{
     Total total = new Total();
     Staff staff = new Staff();
     double pay;

     @Test

     public void testTotal(){
         staff.setPay((double) 400);
         double totalamount=total.calculatetotal(staff);
         assertEquals(4800,totalamount,0.0);
     } 
 }