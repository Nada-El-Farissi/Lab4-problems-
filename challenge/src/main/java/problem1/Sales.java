package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int SALESPEOPLE=scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");//modified the ids to start with 1 instead of 0
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max=sales[0]; //to get the maximum sale
        int idMax=1; //to store  the id of the person who made the max sale
        int min=sales[0]; //to get the minimum sale
        int idMin=1; //to store  the id of the person who made the min sale
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1)  + "          " + sales[i]);
            sum += sales[i];
            //getting the maximum sale
            if (sales[i]>max){
                max=sales[i];
                idMax=i+1;
            }
            if (sales[i]<min){
                max=sales[i];
                idMin=i+1;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        //Compute and print the average sale
        double averageSale= (double) sum/SALESPEOPLE;
        System.out.println("The average sale is: "+averageSale);

        //print the maximum and minimum sale
        System.out.println("Salesperson "+idMax+" had the highest sale with $"+max);
        System.out.println("Salesperson "+idMin+" had the lowest sale with $"+min);

        //ask the user to enter an input
        System.out.print("Enter a value: ");
        double value=scan.nextDouble();
        int num=0;
        //printing ids of people who exceeded that amount in their sales
        System.out.println("Salespeople who exceeded the amount $"+value+": ");
        System.out.println("SalespersonId Sales");
        for (int i=0;i<sales.length;i++){
            if (sales[i]>value){
                System.out.println(" "+(i+1)+"            "+sales[i]);
                num++;
            }
        }
        //printing number of salespeopel who exceeded the amount
        System.out.println("The number of salespeople who exceeded the amount $"+value+" is: "+num);








    }


}