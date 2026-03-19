package EjerciciosIker;


import java.sql.SQLOutput;
import java.util.*;

public class Supervisor {

    private ArrayList<Supermercado> listaSupermercados;

    //constructor
    public Supervisor() {
        listaSupermercados = new ArrayList<>();
    }

    // Insertar un supermercado al inicio, al final o en una posicion especififca
    public void insertar(Supermercado sup) {
        System.out.println("Donde desea insertar? 'Inicio', 'Especifica' o 'Final'");
        Scanner sc = new Scanner(System.in);
        String opcion;
        opcion = sc.nextLine();

        switch (opcion) {

            case "Inicio":
                listaSupermercados.add(0, sup);
                break;


            case "Especifico":
                System.out.println("Indique donde quiere insertarlo");
                System.out.println("El tamaño del array es de: " + listaSupermercados.size());
                int indice;
                indice = sc.nextInt();
                listaSupermercados.add(indice, sup);
                break;


            case "Final":
                listaSupermercados.add(sup);
                break;


        }
    }



        // Eliminar un supermercado por índice o por nombre
        public void eliminar() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Desea eliminar por 'Indice' o por 'Nombre'?");
            String opcion = sc.nextLine();

            switch (opcion) {

                case "Indice":
                    System.out.println("Que indice quieres eliminar?");
                    int indice = sc.nextInt();
                    listaSupermercados.remove(indice);
                    break;

                case "Nombre":
                    System.out.println("Indique el nombre del supermercado");
                    String nombre = sc.nextLine();
                    for (int i = 0; i < listaSupermercados.size(); i++) {
                        if (listaSupermercados.get(i).getNombre().equals(nombre)) {
                            listaSupermercados.remove(i);
                            break;
                        }
                    }
            }
        }


        // Buscar el índice de un supermercado por su nombre
        public void buscarIndice() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el nombre del supermercado");
            String nombre = sc.nextLine();

            for (int i = 0; i < listaSupermercados.size(); i++) {
                if (listaSupermercados.get(i).getNombre().equals(nombre)) {
                    System.out.println("El supermercado esta en el indice: " +i);
                    break;
                }

            }
        }


        // Verificar si un supermercado ya está presente en la lista
        public void verificarSupermercado() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre del supermercado");
            String nombre = sc.nextLine();

            for (Supermercado supers : listaSupermercados) {
                if (supers.getNombre().equals(nombre)) {
                    System.out.println("El supermercado SI esta en la lista");
                } else {
                    System.out.println("El supermercado NO existe");
                }
            }
        }


        // Reemplazar el supermercado en una posición dada
        public void reemplazarSupermercado(Supermercado nuevo) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Indica el indice a reemplazar");
            System.out.println("El tamaño del array es de: " + listaSupermercados.size());
            int indice = sc.nextInt();

            listaSupermercados.set(indice, nuevo); // (posicion, NuevoValor)
        }


        // Ordenar la lista alfabéticamente por el nombre del supermercado
        public void ordenarSupermercados() {
            Collections.sort(listaSupermercados);
        }


        // Recorre todas las lista para mostrar todos los elementos con su índice
        public void mostrarLista() {
            for (int i = 0; i < listaSupermercados.size(); i++) {
                System.out.println(i+ " -----> " + listaSupermercados.get(i).toString());
            }
        }


        // Consultar el tamaño, verificar si está vacía y limpiar toda la lista
        public void informacionLista() {
            System.out.println("Tamaño de la lista:" +listaSupermercados.size());
            System.out.println("Esta vacia? " +listaSupermercados.isEmpty());
        }

        public void limpiarLista() {
            listaSupermercados.clear();
            System.out.println("Lista limpiada");
        }


        // Genera una copia del arraylist usando el metodo clone()
        public void clonarLista() {
            ArrayList<Supermercado> copia = (ArrayList<Supermercado>) listaSupermercados.clone();
            System.out.println("ArrayList clonado ");
        }


        // Convierte el arraylist original en un array de supermercado usando toArray()
        public void convertirAArray() {
            //Tipo[] array = lista.toArray(new Tipo[0]);
            Supermercado[] array = listaSupermercados.toArray(new Supermercado[0]);
            System.out.println("Contenido del array: ");
        }
}
