package EjerciciosIker;

import java.util.*;

public class gestorGym {

    private HashMap<String, Gimnasio> mapaGimnasios;

    //constructor
    public gestorGym() {
        mapaGimnasios = new HashMap<>();
    }

    //Registrar un nuevo gimnasio
    public void registrarGimnasio(Gimnasio g) {

        String nombre = g.getNombre();

        if (mapaGimnasios.containsKey(nombre)) {
            throw new IllegalArgumentException("Ya existe un gimnasio con ese nombre");
        }

        mapaGimnasios.put(nombre, g);
    }


    // Recuperar un gimnasio por su nombre
    public void recuperarGimnasio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del gimnasio");
        String nombre = sc.nextLine();

            if (!mapaGimnasios.containsKey(nombre)) {
                throw new NoSuchElementException("No existe ese gimnasio");
            }
        System.out.println(mapaGimnasios.get(nombre));
    }


    // Actualizar el nombre de un gimnasio existente
    public void actualizarNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre actual:");
        String nombre = sc.nextLine();

        if (!mapaGimnasios.containsKey(nombre)) {
            throw new NoSuchElementException("No existe ese gimnasio");
        }

        System.out.println("Nuevo nombre:");
        String nuevoNombre = sc.nextLine();

        Gimnasio g = mapaGimnasios.remove(nombre);
        g.setNombre(nuevoNombre);

        mapaGimnasios.put(nuevoNombre, g);
    }


    //Eliminar un gimnasio por su nombre
    public void eliminarGimnasio() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del gimnasio a eliminar:");
        String nombre = sc.nextLine();

        if (!mapaGimnasios.containsKey(nombre)) {
            throw new NoSuchElementException("No existe ese gimnasio");
        }

        mapaGimnasios.remove(nombre);
    }


    //Verificar si un nombre ya está registrado
    public void verificarNombre() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();

        if (mapaGimnasios.containsKey(nombre)) {
            System.out.println("Ya está registrado");
        } else {
            System.out.println("No está registrado");
        }
    }


    //Obtener todas las claves, todos los valores y todos los pares clave-valor
    public void obtenerTodo() {

        System.out.println("CLAVES:");
        System.out.println(mapaGimnasios.keySet());

        System.out.println("\nVALORES:");
        System.out.println(mapaGimnasios.values());

        System.out.println("\nENTRADAS:");
        System.out.println(mapaGimnasios.entrySet());
    }


    //Mostrar el contenido por claves, por valores o por entradas
    public void mostrarContenido() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Mostrar por 'Claves', 'Valores' o 'Entradas'?");
        String opcion = sc.nextLine();

        switch (opcion) {

            case "Claves":
                for (String clave : mapaGimnasios.keySet()) {
                    System.out.println(clave);
                }
                break;

            case "Valores":
                for (Gimnasio g : mapaGimnasios.values()) {
                    System.out.println(g);
                }
                break;

            case "Entradas":
                for (Map.Entry<String, Gimnasio> entry : mapaGimnasios.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }


    //Consultar el número total de gimnasios, verificar si el gestor está vacío y limpiarlo completamente
    public void infoMapa() {

        System.out.println("Total gimnasios: " + mapaGimnasios.size());
        System.out.println("¿Está vacío? " + mapaGimnasios.isEmpty());
    }

    public void limpiarMapa() {

        mapaGimnasios.clear();
        System.out.println("Mapa limpiado");
    }
}