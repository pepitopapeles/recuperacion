package EjerciciosIker;

public abstract class Empresa {

    //atributos
    protected int n_clientes;
    protected int n_empleados;
    protected int n_locales;
    protected String nombre;
    protected String direccion;
    protected String poderAdquisitivo;
    protected double dinero;


    //constructores
    public Empresa(int n_clientes, int n_empleados, int n_locales,
                   String nombre, String direccion, String poderAdquisitivo, double dinero) {
        this.n_clientes = n_clientes;
        this.n_empleados = n_empleados;
        this.n_locales = n_locales;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poderAdquisitivo = poderAdquisitivo;
        this.dinero = dinero;
    }


    //metodos abstractos
    public abstract void poderAdquisitivo();

    public abstract double empleadosXcliente();

    public abstract void contratarEmpleadosODespedir(int dinero);

    public abstract boolean tieneMuchosLocales();

    public abstract boolean esGrande();


    @Override
    public String toString() {

        return "Empresa:::: " +
                "clientes=" + n_clientes +
                ", empleados=" + n_empleados +
                ", locales=" + n_locales +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", poderAdquisitivo='" + poderAdquisitivo + '\'' +
                ", dinero=" + dinero;
    }


}
