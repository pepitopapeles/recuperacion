package Basico.Ej1;
import java.util.*;


public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int suma;

        System.out.println("Ingrese el primer numero");
        n1= sc.nextInt();

        System.out.println("Ahora el segundo");
        n2 = sc.nextInt();

        suma= n1 + n2;

        System.out.println("La suma es: " +suma);

    }
}
