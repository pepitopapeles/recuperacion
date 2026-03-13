package EjerciciosIker;

public class Main {

    public static void main(String[] args) {

        Empresa[] empresas = new Empresa[4];

        empresas[0] = new Supermercado(100,20,3,"Mercadona","Calle A","medio",10000,500,50);
        empresas[1] = new Supermercado(200,40,6,"Lidl","Calle B","alto",20000,600,60);

        empresas[2] = new Gimnasio(150,10,2,"FitGym","Calle C","medio",5000,45,"pesas");
        empresas[3] = new Gimnasio(300,20,7,"PowerGym","Calle D","alto",8000,50,"cardio");

        for(Empresa e : empresas){

            System.out.println(e);

            System.out.println("Es grande: " + e.esGrande());

            System.out.println("Muchos locales: " + e.tieneMuchosLocales());

            System.out.println("Ratio clientes/empleado: " + e.empleadosXcliente());
        }
    }
}
