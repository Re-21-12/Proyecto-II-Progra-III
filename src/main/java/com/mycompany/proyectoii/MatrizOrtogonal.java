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
            NodoX nodoX = new NodoX(y, carro);
            filas.insertarEnVertical(nodoX);
        }
        if (columnas.estaDisponibleEnX(x) == false) {
            NodoY nodoY = new NodoY(y, carro);
            columnas.insertarEnHorizontal(nodoY);
        }
        tempFila = filas.buscarEnFilas(y);
        tempColumna = columnas.buscarEnColumnas(x);

        tempFila.getFilas().insertarEnHorizontal(_nodoOrtogonal);
        tempColumna.getColumnas().insertarEnVertical(_nodoOrtogonal);
    }

    //falta implementar
    public void eliminarEnMatriz(int x, int y, Vehiculo carro) {
        //Si me trae falso es por que esta vacioo
        NodoX tempFila;
        NodoY tempColumna;
        NodoOrtogonal _nodoOrtogonal = new NodoOrtogonal(carro, x, y);
        if (filas.estaDisponibleEnX(y) == false) {
           // filas.eliminarEnVertical();
        }
        if (columnas.estaDisponibleEnX(x) == false) {
            columnas.insertarEnHorizontal(new NodoY(x, carro));
        }
        tempFila = filas.buscarEnFilas(y);
        tempColumna = columnas.buscarEnColumnas(x);

        tempFila.getFilas().insertarEnHorizontal(_nodoOrtogonal);
        tempColumna.getColumnas().insertarEnVertical(_nodoOrtogonal);
    }

    public void buscarEnMatriz(int x, int y, Vehiculo carro) {
        //Si me trae falso es por que esta vacioo
        filas.buscarEnFilas(y);//->private NodosFilasIndice filas;
        columnas.buscarEnColumnas(x);//->private NodosColumnaIndice columnas;
    }

    public void buscarEnMatrizPorCarro(String placa, String color, String linea, String propietario) {
        //Si me trae falso es por que esta vacioo
        filas.buscarEnFilasCarroPorPropiedad(placa, color, linea, propietario);//->private NodosFilasIndice filas;
        columnas.buscarEnColumnasCarroPorPropiedad(placa, color, linea, propietario);//->private NodosColumnaIndice columnas;
    }

    public void mostrarMatriz() {
        //Si me trae falso es por que esta vacioo
        columnas.mostrarLista();
        filas.mostrarLista();

    }

}
