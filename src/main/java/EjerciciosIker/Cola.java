package EjerciciosIker;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Cola<T> {

    private ArrayList<T> elementos;

    public Cola() {

        elementos = new ArrayList<>();

    }

    // Encolar
    public void encolar(T elemento) {

        elementos.add(elemento);

    }

    // Desencolar
    public T desencolar() {

        if (estaVacia()) {

            throw new NoSuchElementException();

        }

        return elementos.remove(0);

    }

    // Ver frente
    public T frente() {

        if (estaVacia()) {

            throw new NoSuchElementException();

        }

        return elementos.get(0);

    }

    // Está vacía
    public boolean estaVacia() {

        return elementos.isEmpty();

    }

    // Tamaño
    public int tamano() {

        return elementos.size();

    }

}
