package EjerciciosIker;

public class Supermercado extends Empresa implements Promocionable {

    private int n_productos;
    private double precioProducto;

    // Constructor completo
    public Supermercado(int n_clientes, int n_empleados, int n_locales,
                        String nombre, String direccion, String poderAdquisitivo,
                        double dinero, int n_productos, double precioProducto) {
        super(n_clientes, n_empleados, n_locales, nombre, direccion, poderAdquisitivo, dinero);
        this.n_productos = n_productos;
        this.precioProducto = precioProducto;
    }

    // Constructor con clientes y empleados
    public Supermercado(int n_clientes, int n_empleados) {
        super(n_clientes, n_empleados, 0, "", "", "", 0);
    }

    // GETTERS Y SETTERS

    public int getN_productos() {
        return n_productos;
    }

    public void setN_productos(int n_productos) {
        this.n_productos = n_productos;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    // DESCUENTO

    public double aplicarDescuento(double precioOriginal) {

        if (precioOriginal > 40) {
            return precioOriginal * 0.9;
        }

        return precioOriginal;
    }

    // EMPRESA GRANDE

    @Override
    public boolean esGrande() {

        return n_productos > 400;

    }

    // MUCHOS LOCALES

    @Override
    public boolean tieneMuchosLocales() {

        return n_locales > 5;

    }

    // RATIO CLIENTES/EMPLEADO

    @Override
    public double empleadosXcliente() {

        return (double) n_clientes / n_empleados;

    }

    // CONTRATAR O DESPEDIR

    @Override
    public void contratarEmpleadosODespedir(int dinero) {

        if (dinero < 0) {

            n_empleados--;

        } else {

            n_empleados++;

        }

    }

    // PODER ADQUISITIVO
    @Override
    public void poderAdquisitivo() {

        if (n_empleados == 1 && n_clientes == 1 && dinero == 1000) {

            System.out.println("Poder adquisitivo bajo");

        } else {

            System.out.println("Poder adquisitivo medio o alto");

        }

    }

    @Override
    public String toString() {

        return "Supermercado{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + n_clientes +
                ", empleados=" + n_empleados +
                ", locales=" + n_locales +
                ", direccion='" + direccion + '\'' +
                ", poderAdquisitivo='" + poderAdquisitivo + '\'' +
                ", dinero=" + dinero +
                ", productos=" + n_productos +
                ", precioProducto=" + precioProducto +
                '}';
    }

}
