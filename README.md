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

_________________________________________________________________________________________________________________

Getting Started
Requirements:
Checkout code from below location

git clone https://github.com/sheeraz21/Retail-Store.git
cd Retail-Store

Run Below Command 
mvn install
mvn clean

I have developed a retail store discount application for calculating the discount.

For this I have Used:
1. **Java**, **Spring Boot**,**Spring Rest**, **Spring Core**.
2. **Actuator** for api health check, **devtools**. 
3. **Junit** for testing,
4. **Postman**
5. **Heruku** cloud for deployment
6. **Git**, **Github** for source code management.
7. **Maven**

I have used a factory design pattern for creating a retail store application. In factory design pattern we create an object without exposing the creation logic to the client and refer to a newly created object using a common interface.

In retail store application, IDiscountService is an interface and DiscountServiceImpl is a concrete class which implement the IDiscountService interface.

I have  Declare  "getFinalDiscount(String item, Double price , String discountType)" method  in interface IDiscountService and  DiscountServiceImpl  class provide implementation of method  "getFinalDiscount(String item, Double price , String discountType)".
_____________________________________________________________________________________________________________________________________

UML Diagram:

![UML DIAGRAM](https://github.com/sheeraz21/Retail-Store/blob/master/retail-storeapp.png)

_________________________________________________________________________________________________________________
Sample Input and Output 

Input
				              
| Item        | DiscountTpye  | Price |
| ------------|:-------------:| -----:|
| Mobile      | affiliate     |990 |
| groceries   | affiliate     |990 |
| Mobile      | store         |990 |
| Mobile      | Two Year Old  |990 |
________________________________________________________________________________________________________________

OutPut

| FinalDiscount | 
| ------------- |
| 144.0  |
| 0.0    | 
| 342.0  | 
| 94.5   | 


