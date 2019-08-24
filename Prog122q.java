import java.io.*;
import java.util.*;
import java.text.*;
public class Prog122q
{
    public static void main(String[] args)
    {
        System.out.print("Enter initial deposit: ");
        Scanner keyboard = new Scanner(System.in);
        double deposit = keyboard.nextDouble();
        double initialDeposit = deposit;
        System.out.print("Enter interest rate: ");
        Scanner keyboard2 = new Scanner(System.in);
        double rate = keyboard2.nextDouble();
      
        double time =0;
        double amount = 0;
        while (amount < initialDeposit*2) {
        time +=((.01)*100+.5)/100;
        amount =((deposit*(Math.pow((1+rate/100),time)))*100+.5)/100;  //interest formula A = P(1+r/100)^t rounded
        
    } 
        System.out.print(time);
    }
}