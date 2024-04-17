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
    private Vehiculo carro;
    private int y;//su coordenada en x
    private NodoX arriba;
    private NodoX abajo;
    //cada nodoo Columna contiene una lista de fila 
    private NodoListaHorizontal filas; 

    public NodoX(int y, Vehiculo carro) {
        this.y = y;
        this.carro = carro;
        //creamos una columna por cada nodofila
        this.filas = new NodoListaHorizontal();
        this.arriba = this.abajo = null;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public NodoX getArriba() {
        return arriba;
    }

    public void setArriba(NodoX arriba) {
        this.arriba = arriba;
    }

    public NodoX getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoX abajo) {
        this.abajo = abajo;
    }

    public NodoListaHorizontal getFilas() {
        return filas;
    }

    public void setFilas(NodoListaHorizontal filas) {
        this.filas = filas;
    }



 

    
}
