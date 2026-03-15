package EjerciciosIker;

import EjerciciosIker.Supermercado;
import EjerciciosIker.Gimnasio;
import EjerciciosIker.Pila;
import EjerciciosIker.Cola;

public class MainColaPila {

    public static void main(String[] args) {

        // PILA DE SUPERMERCADOS
        System.out.println("===== PILA =====");

        Pila<Supermercado> pila = new Pila<>();

        Supermercado s1 = new Supermercado(100,20,2,"Mercadona","Calle A","medio",10000,300,30);
        Supermercado s2 = new Supermercado(200,30,4,"Lidl","Calle B","alto",20000,500,50);
        Supermercado s3 = new Supermercado(150,25,3,"Carrefour","Calle C","medio",15000,600,60);

        pila.apilar(s1);
        pila.apilar(s2);
        pila.apilar(s3);

        System.out.println("Cima de la pila:");
        System.out.println(pila.cima());

        System.out.println("Desapilando elementos:");

        while(!pila.estaVacia()){

            System.out.println(pila.desapilar());

        }


        // COLA DE GIMNASIO
        System.out.println("===== COLA =====");

        Cola<Gimnasio> cola = new Cola<>();

        Gimnasio g1 = new Gimnasio(100,10,2,"FitGym","Calle A","medio",5000,40,"pesas");
        Gimnasio g2 = new Gimnasio(200,20,3,"PowerGym","Calle B","alto",8000,50,"cardio");
        Gimnasio g3 = new Gimnasio(150,15,1,"BasicGym","Calle C","medio",6000,35,"yoga");

        cola.encolar(g1);
        cola.encolar(g2);
        cola.encolar(g3);

        System.out.println("Frente de la cola:");
        System.out.println(cola.frente());

        System.out.println("Desencolando elementos:");

        while(!cola.estaVacia()){

            System.out.println(cola.desencolar());

        }

    }

}
