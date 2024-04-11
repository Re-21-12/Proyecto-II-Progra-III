/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
public class MatrizOrtogonal {

    private NodosFilasIndice filas;
    private NodosColumnaIndice columnas;

    public MatrizOrtogonal() {
        filas = new NodosFilasIndice();
        columnas = new NodosColumnaIndice();
    }

    public void insertarEnMatriz(int x, int y, Vehiculo carro) {
        //Si me trae falso es por que esta vacioo
        NodoX tempFila;
        NodoY tempColumna;
        NodoOrtogonal _nodoOrtogonal = new NodoOrtogonal(carro, x, y);
        if (filas.estaDisponibleEnX(y) == false) {
            filas.insertarEnVertical(new NodoX(y));
        }
        if (columnas.estaDisponibleEnX(x) == false) {
            columnas.insertarEnHorizontal(new NodoY(x));
        }
        tempFila = filas.buscarEnFilas(y);
        tempColumna = columnas.buscarEnColumnas(x);

        tempFila.getFilas().insertarEnHorizontal(_nodoOrtogonal);
        tempColumna.getColumnas().insertarEnVertical(_nodoOrtogonal);
    }

}
