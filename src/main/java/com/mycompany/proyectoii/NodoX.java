/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
public class NodoX {

    private Vehiculo carro; // Declara una variable privada carro de tipo Vehiculo
    private int y; // Declara una variable privada y de tipo entero, representa la coordenada en y
    private NodoX arriba; // Declara una variable privada arriba de tipo NodoX, representa el nodo ubicado arriba del nodo actual
    private NodoX abajo; // Declara una variable privada abajo de tipo NodoX, representa el nodo ubicado abajo del nodo actual
    //cada nodo Columna contiene una lista de fila
    private NodoListaHorizontal filas; // Declara una variable privada filas de tipo NodoListaHorizontal, representa la lista horizontal asociada al nodo actual

    public NodoX(int y, Vehiculo carro) { // Constructor de la clase NodoX con parámetros
        this.y = y; // Inicializa la variable y con el parámetro y
        this.carro = carro; // Inicializa la variable carro con el parámetro carro
        //creamos una columna por cada nodo fila
        this.filas = new NodoListaHorizontal(); // Inicializa la variable filas como una nueva instancia de NodoListaHorizontal
        this.arriba = this.abajo = null; // Inicializa las variables arriba y abajo como nulas
    }

    public Vehiculo getCarro() { // Método para obtener el vehículo asociado al nodo
        return carro; // Retorna el vehículo asociado al nodo
    }

    public void setCarro(Vehiculo carro) { // Método para establecer el vehículo asociado al nodo
        this.carro = carro; // Asigna el vehículo con el parámetro carro
    }

    public int getY() { // Método para obtener el valor de y (coordenada en y)
        return y; // Retorna el valor de y
    }

    public void setY(int y) { // Método para establecer el valor de y (coordenada en y)
        this.y = y; // Asigna el valor de y con el parámetro y
    }

    public NodoX getArriba() { // Método para obtener el nodo ubicado arriba del nodo actual
        return arriba; // Retorna el nodo ubicado arriba del nodo actual
    }

    public void setArriba(NodoX arriba) { // Método para establecer el nodo ubicado arriba del nodo actual
        this.arriba = arriba; // Asigna el nodo ubicado arriba del nodo actual
    }

    public NodoX getAbajo() { // Método para obtener el nodo ubicado abajo del nodo actual
        return abajo; // Retorna el nodo ubicado abajo del nodo actual
    }

    public void setAbajo(NodoX abajo) { // Método para establecer el nodo ubicado abajo del nodo actual
        this.abajo = abajo; // Asigna el nodo ubicado abajo del nodo actual
    }

    public NodoListaHorizontal getFilas() { // Método para obtener la lista horizontal asociada al nodo actual
        return filas; // Retorna la lista horizontal asociada al nodo actual
    }

    public void setFilas(NodoListaHorizontal filas) { // Método para establecer la lista horizontal asociada al nodo actual
        this.filas = filas; // Asigna la lista horizontal con el parámetro filas
    }
}
