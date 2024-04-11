/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */// creamos una clase para manejar los nodos de las filas de la matriz ortogonal
public class NodosFilasIndice {

    private NodoX cabeza; // declaramos un nodo que apunta al inicio de la lista
    private NodoX cola; // declaramos un nodo que apunta al final de la lista

    // creamos un constructor para inicializar la lista con valores nulos
    public NodosFilasIndice() {
        cabeza = cola = null;
    }

    // creamos un método para insertar nodos en vertical
    public void insertarEnVertical(NodoX nodoVertical) {
        if (cabeza == null) { // si la lista está vacía
            this.cabeza = this.cola = nodoVertical; // el nuevo nodo será la cabeza y la cola
        } else { // si la lista no está vacía
            if (nodoVertical.getY() < cabeza.getY()) { // si el nuevo nodo es menor que la cabeza
                cabeza = insertarInicio(nodoVertical); // insertamos el nodo al principio
            } else if (nodoVertical.getY() > cola.getY()) { // si el nuevo nodo es mayor que la cola
                cola = insertarFinal(nodoVertical); // insertamos el nodo al final
            } else { // si el nuevo nodo está entre la cabeza y la cola
                insertarEnMedio(nodoVertical); // insertamos el nodo en medio
            }
        }
    }

    // método privado para insertar un nodo al principio de la lista
    private NodoX insertarInicio(NodoX nodoVertical) {
        nodoVertical.setAbajo(cabeza);
        // creamos un nuevo nodo
        if (cabeza != null) { // si la cabeza no es nula
            cabeza.setArriba(nodoVertical); // la cabeza anterior apunta arriba al nuevo nodo
        }
        cabeza = nodoVertical; // el nuevo nodo se convierte en la cabeza
        return cabeza;
    }

    // método privado para insertar un nodo al final de la lista
    private NodoX insertarFinal(NodoX nodoVertical) {
        NodoX nuevoNodo = nodoVertical; // creamos un nuevo nodo
        if (cabeza == null) { // si la cabeza es nula
            return nuevoNodo; // retornamos el nuevo nodo
        }
        NodoX actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual.getAbajo() != null) { // mientras no lleguemos al final de la lista
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }
        actual.setAbajo(nuevoNodo); // establecemos el nuevo nodo como el siguiente del último
        nuevoNodo.setArriba(actual); // el nodo anterior al nuevo nodo será el último
        cola = nuevoNodo; // el nuevo nodo se convierte en la cola
        return cola; // retornamos la cabeza
    }

    // método privado para insertar un nodo en medio de la lista
    private NodoX insertarEnMedio(NodoX nodoVertical) {
        NodoX actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza

        while (actual != null && nodoVertical.getY() > actual.getY()) { // mientras no lleguemos al final y la posición del nodo actual sea menor que la del nuevo nodo
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }

        if (actual == null) { // si llegamos al final de la lista
            System.out.println("El valor después del cual se desea insertar no se encontró en la lista."); // mostramos un mensaje de error
            return cabeza; // retornamos la cabeza
        }

        NodoX anterior = actual.getArriba();
        nodoVertical.setAbajo(actual); // el nodo siguiente al nuevo nodo será el siguiente del nodo actual
        nodoVertical.setArriba(anterior); // el nodo anterior al nuevo nodo será el nodo actual
        actual.setArriba(nodoVertical); // el nodo actual apuntará abajo al nuevo nodo
        if (anterior != null) {
            anterior.setAbajo(nodoVertical);
        } else {
            cabeza = nodoVertical;
        }

        return cabeza; // retornamos la cabeza
    }

    public void eliminarEnVertical(NodoX nodoVertical) {
        if (cabeza == null) { // si la lista está vacía
            this.cabeza = this.cola = nodoVertical; // el nuevo nodo será la cabeza y la cola
        } else { // si la lista no está vacía
            if (nodoVertical.getY() < cabeza.getY()) { // si el nuevo nodo es menor que la cabeza
                cabeza = eliminarInicio(); // insertamos el nodo al principio
            } else if (nodoVertical.getY() > cola.getY()) { // si el nuevo nodo es mayor que la cola
                cola = eliminarFinal(); // insertamos el nodo al final
            } else { // si el nuevo nodo está entre la cabeza y la cola
                eliminarEnMedio(nodoVertical); // insertamos el nodo en medio
            }
        }
    }

    public NodoX eliminarInicio() {
        // Verificamos si la pila está vacía
        if (cabeza == null) {
            System.out.println("La pila está vacía, no se puede eliminar.");
            return null;
        }
        // Avanzamos al segundo elemento  a la izquierda
        //actualizamos el nuevo null
        NodoX nuevoTopeIzquierda = cabeza.getAbajo();
        // Eliminamos el tope actual asignando null como siguiente elemento
        cabeza.setAbajo(null);
        // Retornamos el nuevo tope de la pila
        return nuevoTopeIzquierda;
    }

    public NodoX eliminarFinal() {
        // verificamos si la lista está vacía
        if (cabeza == null) {
            System.out.println("la lista está vacía, no se puede eliminar.");
            return null;
        }
        // si solo hay un elemento en la lista, eliminamos la cabeza
        if (cabeza.getAbajo() == null) {
            NodoX nodoEliminado = cabeza;
            cabeza = null;
            return nodoEliminado;
        }
        // recorremos la lista hasta llegar al penúltimo elemento
        NodoX actual = cabeza;
        while (actual.getAbajo().getAbajo() != null) {
            actual = actual.getAbajo();
        }
        // guardamos una referencia al último nodo
        NodoX nodoEliminado = actual.getAbajo();
        // eliminamos la conexión al último nodo
        actual.setAbajo(null);
        return nodoEliminado;
    }

    public void eliminarEnMedio(NodoX nodoEliminar) {
        // verificamos si la lista está vacía
        if (cabeza == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }
        // si el nodo a eliminar es igual a la cabeza
        if (nodoEliminar.equals(cabeza)) {
            cabeza = cabeza.getAbajo(); // eliminamos el primer elemento
            return;
        }
        // buscamos el nodo anterior al que queremos eliminar
        NodoX actual = cabeza;
        while (actual != null && actual.getAbajo() != null && !actual.getAbajo().equals(nodoEliminar)) {
            actual = actual.getAbajo();
        }
        // si no encontramos el nodo a eliminar
        if (actual == null || actual.getAbajo() == null) {
            System.out.println("El nodo a eliminar no está en la lista.");
            return;
        }
        // eliminamos la conexión del nodo a eliminar
        actual.setAbajo(actual.getAbajo().getAbajo());
    }

    public NodoX buscarEnFilas(int y) {
        NodoX actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getY() == y) {
                //System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                return actual;
            }
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }
        return null;
    }

    //placa, color,linea, modelo y propietario
    public NodoX buscarEnFilasCarroPorPropiedad(String placa, String color, String linea, String propietario) {

        NodoX actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getCarro().getColor().equalsIgnoreCase(color)) {
                System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                break;
            }
            if (actual.getCarro().getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                break;
            }
            if (actual.getCarro().getLinea().equalsIgnoreCase(linea)) {
                System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                break;
            }
            if (actual.getCarro().getPropietario().equalsIgnoreCase(propietario)) {
                System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                break;
            }
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }
        return null;
    }

    public boolean estaDisponibleEnX(int y) {
        boolean bandera = false;
        NodoX actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getY() == y) {
                //System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                bandera = true;
                return bandera;
            }
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }
        return bandera;
    }

    // método para mostrar la lista
    public void mostrarLista() {
        NodoX actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            System.out.println("|" + actual.getY() + "|"); // imprimimos el valor del nodo actual
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }
    }
}
