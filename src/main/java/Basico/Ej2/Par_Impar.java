package Basico.Ej2;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int n1;
                int pares=0;
                int impares=0;

                System.out.println("Ingrese el primer numero");
                n1= sc.nextInt();

                if( n1 % 2 == 0) {
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero es impar");
                }




    }
}
