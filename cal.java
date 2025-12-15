// Source - https://stackoverflow.com/q
// Posted by leimelson06, modified by community. See post 'Timeline' for change history
// Retrieved 2025-12-15, License - CC BY-SA 3.0

import java.io.*;
public class Ordering_System
{
     public static void main(String []args) throws Exception
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String order,again;
         int quantity,price1=0,price2=0,loop1=0,quantity1,quantity2=0;

         System.out.println("  ");  

         System.out.println("Welcome to MgRonalds, What do you want to order?");

         System.out.println(" ");
         System.out.println("*******************************************************************");
         System.out.println("*   Code    Meal             ''MENU''              Price          *");
         System.out.println("*                                                                 *");
         System.out.println("*   (A1)   MgBurger                                P30.00         *");
         System.out.println("*   (A2)   Big Mac                                 P139.00        *");
         System.out.println("*   (B1)   Cheese Burger                           P35.00         *");
         System.out.println("*   (B2)   Chicken Burger                          P50.00         *");
         System.out.println("*   (C1)   MgNuggets                               P65.00         *");
         System.out.println("*   (C2)   MgChicken                               P79.00         *");
         System.out.println("*   (D1)   MgSpagetti                              P60.00         *");
         System.out.println("*   (D2)   MgFries                                 P40.00         *");
         System.out.println("*   (E1)   Coke                                    P10.00         *");
         System.out.println("*   (E2)   Sprite                                  P10.00         *");
         System.out.println("*   (E3)   Royal                                   P10.00         *");
         System.out.println("*   (F1)   Sundae                                  P25.00         *");
         System.out.println("*   (F2)   MgFloat                                 P25.00         *");
         System.out.println("*                                                                 *");
         System.out.println("*******************************************************************");

         do{
            System.out.println("");
            System.out.print("Enter Code Order      : ");
            order=br.readLine();
            if (order.equalsIgnoreCase("A1")) {
                price1=30;
                System.out.println("Order Description     : MgBurger ");
            } else if (order.equalsIgnoreCase("A2")) {
                price1=139;
                System.out.println("Order Description     : Big Mac ");
            }   

            System.out.print("Enter Quantity        : ");
            quantity1= Integer.parseInt(br.readLine());
            quantity2=quantity1+quantity2;

            price2=price1*quantity2;   

            System.out.print("Another Order?  (Y/N) : ");
            again=br.readLine();
            if (again.equalsIgnoreCase("y"))
                loop1=loop1+1;
            else loop1=loop1-100;
      } while (loop1==1);    

     System.out.println(" ");
     System.out.println("Total Price           : "+price2);   

 }
}
