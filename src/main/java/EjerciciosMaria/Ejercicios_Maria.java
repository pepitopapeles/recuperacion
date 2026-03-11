package EjerciciosMaria;

import java.util.*;

public class Ejercicios_Maria {

    public static void main(String[] args) {

        //usar abreviatura de scanner
        Scanner sc = new Scanner(System.in);


        //lo que nos piden del nombre
        System.out.println("Como te llamas?");
        String nombre = sc.nextLine();


        //menu
        int ejercicio;

        do {

            System.out.println("Hola " + nombre);

            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1 (Metodo 1)");
            System.out.println("2 (Metodo 2)");
            System.out.println("3 (Metodo 3)");
            System.out.println("4 (Metodo 4)");
            System.out.println("5 (Metodo 5)");
            System.out.println("6 (Metodo 6)");
            System.out.println("0 (Salir)");

            ejercicio = sc.nextInt();

            switch (ejercicio) {

                case 1:
                    System.out.println("La suma es: " +m1());
                    break;

                case 2:

                    System.out.println("Introduce un numero");
                    int num = sc.nextInt();
                    m2(num);
                    break;

                case 3:

                    System.out.println("");
                    m1();
                    break;

                case 4:

                    System.out.println("Introduce un numero");
                    int numero = sc.nextInt();
                    m4(numero);

                    break;

                case 5:
                    m5();
                    break;

                case 6:
                    System.out.println("Metodo 6 aun no implementado");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");

            }

        } while (ejercicio != 0);

    }



    ///Metodo 1
    //Pedir al usuario cinco números
    //Sumarlos hasta que uno de los números sea mayor que 10.
    //Retornar la suma total
    //Mostrar un mensaje en el menú principal con la suma total.


    public static int m1() {

        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Introduce un numero");
            int num = sc.nextInt();

            if (num <= 10) {
                suma += num;
            } else {
                break;
            }
        }

        return suma;
    }



    ///Metodo 2 (int número)
    //Antes de inicial el metodo, en el menú principal pide al usuario un número entero y pásalo como parámetros
    //En el metodo, genera la tabla de multiplicar (hasta el 10) con el número recibido por parámetro.
    //Muestra por pantalla la tabla de multiplicar

    public static void m2(int num) {


        //esta sera la tabla que pide el ejercicio
        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));

        }

    }


    ///Metodo 3
    //Crea un juego que simule una lucha con un número aleatorio de enemigos
    //•	Se llevará el conteo de las victorias y derrotas en dos variables con el mismo nombre.
    //•	mostrar un menú con tres opciones: Instrucciones, Jugar o Salir.
    //•	En la opción de Instrucciones únicamente se mostrarán las instrucciones del juego y volverá al menú.
    //•	En la opción de Salir se mostrará un mensaje “Hasta pronto…”, y volverá al menú
    //•	En la opción de Jugar se implementarán las siguientes instrucciones:
    //  Mostrar mensaje “ha encontrado con un número de enemigos: n” (n será un número aleatorio entre 1 y 9).
    //  Si n está entre 1 y 4 se mostrará el mensaje “Tienes posibilidades de ganar” y si n está entra 5 y 9 el mensaje será “Será difícil ganar”.
    //  Mostrar menú con dos opciones para el usuario: Luchar o Huir.
    //  Si marca Huir, mostrar un mensaje “Has huido…”
    //  Si marca Luchar, generaremos un número aleatorio entre 1 y n:
    //      Si el número aleatorio es igual a 1 mostrar un mensaje indicando que ha ganado y mostrar el número total de victorias y derrotas.
    //      Si no, mostrar un mensaje de que ha perdido y el número total de victorias y derrotas.



    public static void m3() {





    }


    ///Metodo 4
    //Vuelve a hacer lo mismo que en la “opción 2” pero añadiendo los datos resultantes en un array.
    //Este metodo debe retornar el Array

    public static int[] m4(int numero) {

        System.out.println("Tabla de multiplicar:");

        int[] tabla = new int[10];

        for(int i=1;i<=10;i++){
            tabla[i-1] = numero * i;
            System.out.println(numero + " X " +i+ " = " +tabla[i-1]);
        }

        return tabla;

    }




    ///Metodo 5
    //Con este Array predefinido realice las siguientes acciones:
    //Array predefinido: {“Ana”, “Maria”, “Antonio”, “José”, “Mariano”, “Juan”, “Julia”}
    //  Pedir al usuario nombre a buscar.
    //  Buscar el nombre ingresado por el usuario.
    //  Mostrar un mensaje si fue encontrado o no.
    //  Si fue encontrado, mostrar también la posición.
    //  Mostrar todos los elementos del array.

    public static void m5() {

        Scanner sc = new Scanner(System.in);
        String[] nombres = {"Ana", "Maria", "Antonio", "Jose", "Mariano", "Juan", "Julia"};

        System.out.println("Introduce nombre a buscar:");
        String buscar = sc.nextLine();


        boolean encontrado = false;

        for(int i=0; i < nombres.length ;i++){
            if(nombres[i].equals(buscar)){
                System.out.println("Nombre encontrado en posicion " + i);
                encontrado = true;
            }
        }

        if(encontrado = false){
            System.out.println("Nombre no encontrado");
        }

        System.out.println("Array completo:");
        System.out.println("");
        for(String n : nombres){
            System.out.println(n);
        }

    }

    ///Metodo 6
    //Para esta opción vamos a apoyarnos de un objeto, para ello crea un objeto “Animales” con dos atributos (tipo y nombre). Añade todos los métodos necesarios (constructor, getter, setter, toString) y un metodo “correr” que imprima el siguiente mensaje  “el “ + tipo + “está corriendo”.
    //En el main, crea un menú para:
    //•	Crea 5 animales y añádelos a un array que se llame arrayAnimales.
    //•	Muestra el metodo corre de todos los animales del array
    //•	Muestra los datos de todos los animales del array

    public static void m6() {

        Scanner sc = new Scanner(System.in);

        Animales_Maria[] arrayAnimales = new Animales_Maria[5];

        int opcion;

        do{
            System.out.println("1 Crear animales");
            System.out.println("2 Hacerlos correr");
            System.out.println("3 Mostrar datos");
            System.out.println("0 Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {

                case 1:

                    for(int i=0; i < arrayAnimales.length ;i++){
                        System.out.println("Introduce tipo de animal:");
                        String tipo = sc.nextLine();

                        System.out.println("Introduce nombre del animal:");
                        String nombre = sc.nextLine();
                        arrayAnimales[i] = new Animales_Maria(tipo,nombre);
                    }
                    break;

                case 2:

                    for(int i=0;i<arrayAnimales.length;i++){
                        if(arrayAnimales[i]!=null){
                            arrayAnimales[i].correr();
                        }
                    }

                    break;

                case 3:

                    for(int i=0;i<arrayAnimales.length;i++){
                        if(arrayAnimales[i]!=null){
                            System.out.println(arrayAnimales[i]);
                        }
                    }

                    break;

                case 0:

                    System.out.println("Saliendo del menu animales");
                    break;

                default:
                    System.out.println("Opcion no valida");
        }

        } while(opcion!=0);


    }

}