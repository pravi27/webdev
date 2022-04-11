import java.util.Scanner;
 class elevator
 {
     public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter weight of person");
         double weight=s.nextDouble();
         System.out.println("Enter number of people");
         int  people=s.nextInt();
         int answer=0;
         int max=1320;
         
         
         double capacity=(weight*people);
         if(capacity>max)
         {
            answer=max/(int)weight;
         }
         else
         {
             answer=people;
         }
         
         System.out.println("No of people = " +answer);
         


     }
 }