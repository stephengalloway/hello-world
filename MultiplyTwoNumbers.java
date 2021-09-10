/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplytwonumbers;

/**
 *
 * @author hp
 */
public class MultiplyTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1,num2,product;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number");
       num1=sc.nextInt();
       System.out.println("Enter the second number");
       num2=sc.nextInt();
       sc.close();
       System.out.println("The product of the two numbers will be:"+product);
       product=num1*num2;
    }

    private static class Scanner {

        public Scanner() {
        }
    }
    
}
