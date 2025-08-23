import java.util.Scanner;

public class Conversion {
//Conversion of deccimal number into binary number
 
//     public static int decConversion(int decNUm){
//         int ans=0;
//         int power=1;
//         while(decNUm>0){
//             int rem= decNUm % 2;
//             decNUm= decNUm/2;
//             ans= ans+(rem*power);
//             power= power*10;
            
//         }
//         System.out.println("The binary number is"+ans);
//         return 0;
//     }
//     public static void main(String[] args){
//         int decNum;
//         Scanner sc =new Scanner(System.in);
//         decNum= sc.nextInt();
//         decConversion(decNum);
//     }

 //conversion of binary number into decimal   number
  public static void binConversion(int binNum){
    int ans=0;
    int power =1;
    while (binNum>0) {
        int rem = binNum%10;
        ans= ans+(rem*power);
        binNum=binNum/10;
        power= power*2;
    }
    System.out.println("The decimal number is "+ans);
  }
  public static void main(String[] args){
    int binNum =1000;
    binConversion(binNum);
  }    
}