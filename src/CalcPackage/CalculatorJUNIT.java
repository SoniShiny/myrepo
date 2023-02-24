package CalcPackage;

import static org.junit.Assert.*;
import org.junit.Test;
 
public class CalculatorJUNIT {
   @Test
   public void testAddPass() {
      
      assertEquals("error in add()",  9, Calculator.add(9, 0));
   }
 
   @Test
   public void testAddFail() {
      
      assertNotEquals("error in add()", 0, Calculator.add(1, 2));
   }
 
   @Test
   public void testSubPass() {
      
      assertEquals("error in sub()",  0, Calculator.sub(2, 2));
   }
 
   @Test
   public void testSubFail() {
      assertNotEquals("error in sub()", 0, Calculator.sub(2, 1));
   }
   @Test
   public void testmulPass() {
      
      assertEquals("error in mul()",  9, Calculator.mul(9, 1));
   }
 
   @Test
   public void testmulFail() {
      
      assertEquals("error in mul()", 2, Calculator.mul(1, 2));
   }
   @Test
   public void testdivFail() {
      
      assertNotEquals("error in div()",  3, Calculator.div(6, 3));
   }
 
   @Test
   public void testdivPass() {
      
      assertNotEquals("error in div()", 3, Calculator.div(3, 1));
   }
   
}