package Atts_Montanha;

import java.util.Scanner;

public class att6 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
           double raio;
           double area;
           double pi = 3.14;

           System.out.println("digite o raio:");
           
           raio = scanner.nextDouble();

           area = pi  * (raio * raio);
           System.out.println("a'rea:"+ area);

         }
}