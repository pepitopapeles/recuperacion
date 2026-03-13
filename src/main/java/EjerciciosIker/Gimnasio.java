package EjerciciosIker;

public class Gimnasio extends Empresa implements Promocionable {

        private double precioServicio;
        private String servicio;

        public Gimnasio(int n_clientes, int n_empleados, int n_locales,
                        String nombre, String direccion, String poderAdquisitivo,
                        double dinero, double precioServicio, String servicio) {

            super(n_clientes, n_empleados, n_locales, nombre, direccion, poderAdquisitivo, dinero);

            this.precioServicio = precioServicio;
            this.servicio = servicio;
        }

        // GETTERS Y SETTERS

        public double getPrecioServicio() {
            return precioServicio;
        }

        public void setPrecioServicio(double precioServicio) {
            this.precioServicio = precioServicio;
        }

        public String getServicio() {
            return servicio;
        }

        public void setServicio(String servicio) {
            this.servicio = servicio;
        }

        // DESCUENTO

        @Override
        public double aplicarDescuento(double precioOriginal) {

            if (precioOriginal > 40) {
                return precioOriginal * 0.9;
            }

            return precioOriginal;
        }

        // EMPRESA GRANDE

        @Override
        public boolean esGrande() {

            return n_clientes > 400;

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
            return "Gimnasio{" +
                    "nombre='" + nombre + '\'' +
                    ", clientes=" + n_clientes +
                    ", empleados=" + n_empleados +
                    ", locales=" + n_locales +
                    ", direccion='" + direccion + '\'' +
                    ", poderAdquisitivo='" + poderAdquisitivo + '\'' +
                    ", dinero=" + dinero +
                    ", servicio='" + servicio + '\'' +
                    ", precioServicio=" + precioServicio +
                    '}';
        }

}

