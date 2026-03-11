package EjerciciosMaria;

public class Animales_Maria {


    //atributos
    private String tipo;
    private String nombre;


    //constructor
    public Animales_Maria(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }


    //getter y setter
    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //metodos
    public void correr(){
        System.out.println("El " +tipo+ " está corriendo");
    }

    public String toString(){
        return "Tipo: " +tipo+ " Nombre: " +nombre;
    }

}
