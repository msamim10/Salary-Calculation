import java.util.Scanner;

 class IncomeTax {
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      final String SALARY_PROMPT = "\nEnter annual salary (0 to exit): ";
      int annualSalary;
      int deduction;
      int totalDeductions;
      double taxRate;
      int taxToPay;

      System.out.println(SALARY_PROMPT);
      annualSalary = scnr.nextInt();

      while (annualSalary > 0) {

         if (annualSalary <= 10000) {
            taxRate = 0.10;        
         }
         else if(annualSalary >= 10000 && annualSalary <= 41000 ){
            taxRate = 0.12;
         }
         else if(annualSalary >= 41000 && annualSalary <= 89000 ){
            taxRate = 0.22;
         }
         else if(annualSalary >= 89000 && annualSalary <= 170000 ){
            taxRate = 0.24;
         }
         else if(annualSalary >= 170000 && annualSalary <= 215000 ){
            taxRate = 0.32;
         }
         else if(annualSalary >= 215000 && annualSalary <= 539000 ){
            taxRate = 0.35;
         }
         else {
            taxRate = 0.37;
         }

         taxToPay = (int)(annualSalary * taxRate);   
         System.out.println("Annual salary: " + annualSalary); 
         System.out.println("Tax rate: " + taxRate);
         System.out.println("Tax to pay: " + taxToPay);

         // Get the next annual salary
         System.out.println(SALARY_PROMPT);
         annualSalary = scnr.nextInt();
      }
   } 
} 