package EjerciciosIker;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila<T> {

    private ArrayList<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    // Apilar (push)
    public void apilar(T elemento) {

        elementos.add(elemento);

    }

    // Desapilar (pop)
    public T desapilar() {

        if (estaVacia()) {

            throw new EmptyStackException();

        }

        return elementos.remove(elementos.size() - 1);

    }

    // Ver cima
    public T cima() {

        if (estaVacia()) {

            throw new EmptyStackException();

        }

        return elementos.get(elementos.size() - 1);

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
