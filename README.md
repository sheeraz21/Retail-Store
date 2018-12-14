
Please review the following code
The codes intent is to have a class that takes a number and returns the roman numberal string.

You task is to code review the code and identify issues that you would like to change keeping in mind coding best practices.

package converters;

public class RomanNumber
{
   private int number;

   private static final int maxValue = 3000;
   public RomanNumber(int number) throws Exception
   {
      if(number > maxValue) throw new Exception("RomanNumber only supports numbers up to 3000");
      this.number = number;
   }

   public void SetNumber(String number) throws Exception
   {
      this.number = Integer.parseInt(number);
      if(this.number > maxValue) throw new Exception("RomanNumber only supports numbers up to 3000");

   }

   public String convert()
   {
      String result = "";

      try {
         int thousands = this.number / 1000;
         result += times(thousands, "M");
         int hundreds = this.number / 100 % 10;
         result += times(hundreds, "C", "D", "M");
         int tens = this.number / 10 % 10;
         result += times(tens, "X", "L", "C");
         int ones = this.number % 10;
         result += times(ones, "I", "V", "X");
      } catch (Exception ex){
         System.out.println("An error occured");
      }
   }

   private String times(int number, String character)
   {
      String result = "";

      for(int i = 0; i < this.number; i++)
      {
         result += character;
      }
      return result;
   }
   private String times(int number, String o, String f, String t) throws Exception
   {
      switch(number)
      {
         case 0:
            return "";
         case 1:
         case 2:
         case 3:
            return times(number, o);
         case 4:
            return o + f;
         case 5:
         case 6:
         case 7:
         case 8:
            return f + times(number - 5, o);
         case 9:
            return o + t;
         default:
            throw new Exception("Only single digits allowed - not " + number);
      }
   }
}














































# Retail-Store
_____________________________________________________________________________________________________________________________________
Retail Store Application for calculating the discount 

Created Restful application for calculating the discount for retail store product based on the below condition 

1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

Technology : It is Spring Boot based restful application, below are the technology i used for developing the Retail store app.
Java, Spring Boot, Spring Rest, Spring Core, Actuator for api health check, devtools, Junit for testing, postman, Heruku cloud  for deployment
Git, Github for source code management.

_____________________________________________________________________________________________________________________________________














 
