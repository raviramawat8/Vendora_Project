import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class CompoundInterest {
    
    public static void main(String[] args) {
        double principal;
        double rate;
        int year;
        int compoundFrequency;
        double amount;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal Amount: ");
        principal= scanner.nextDouble();
        System.out.print("Enter the rate of Interest in %: ");
        rate= scanner.nextDouble()/100;
        System.out.print("Enter the number of years: ");
        year=scanner.nextInt();
        System.out.print("Enter the number of time interest is compound per year: ");
        compoundFrequency= scanner.nextInt();
        amount = principal * Math.pow(1 + (rate / compoundFrequency), compoundFrequency * year);

        System.out.println("The amount after "+year+" years is : "+amount);
        scanner.close();
    }
}