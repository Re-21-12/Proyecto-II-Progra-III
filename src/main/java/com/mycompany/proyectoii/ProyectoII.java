/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoii;

import java.util.Scanner;
import java.util.Stack;
import java.util.Random;


public class ProyectoII {

    public static void main(String[] args) {
        MatrizOrtogonal matrizDinamica = new MatrizOrtogonal(); // Creación de una nueva matriz ortogonal

        matrizDinamica.mostrarMatriz(); // Mostrar la matriz por consola

        // Creación de un objeto Random para generar números aleatorios
        Random random = new Random();
        Scanner entrada = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario
        Integer opcion; // Variable para almacenar la opción seleccionada por el usuario
        int x = 0; // Coordenada X del vehículo
        int y = 0; // Coordenada Y del vehículo
        String aleatorio; // Opción para ingresar las coordenadas de manera aleatoria
        String continuar; // Variable para indicar si se desea continuar con la operación

        String porCoordenada; // Variable para indicar si se desea buscar o eliminar por coordenadas
        System.out.println("Bienvenido a Proyecto 2!");

        do {
            System.out.println("Seleccione una opcion: ");
            System.out.println("[1]\t Ingresar nuevo carro");
            System.out.println("[2]\t Buscar un carro");
            System.out.println("[3]\t Eliminar un carro");
            System.out.println("[0]\t Salir");
            opcion = entrada.nextInt(); // Leer la opción seleccionada por el usuario
            continuar = "";
            switch (opcion) {
                case 1: // Opción para ingresar un nuevo carro
                    entrada.nextLine();
                    System.out.println("Ingrese un carro nuevo:");
                    do {
                        System.out.println("Desea ingresar de manera aleatoria las posiciones?: [s/N]");
                        aleatorio = entrada.nextLine(); // Leer la opción para ingresar coordenadas aleatorias
                        if (aleatorio.equalsIgnoreCase("s")) { // Si se elige ingresar aleatoriamente
                            x = random.nextInt(1000); // Generar una coordenada X aleatoria
                            y = random.nextInt(1000); // Generar una coordenada Y aleatoria
                        } else if (aleatorio.equalsIgnoreCase("n")) { // Si se elige ingresar manualmente
                            System.out.println("Ingrese una posicion en X para el vehiculo");
                            x = entrada.nextInt(); // Leer la coordenada X
                            System.out.println("Ingrese una posicion en Y para el vehiculo");
                            y = entrada.nextInt(); // Leer la coordenada Y
                        }
                        Vehiculo carro = ingresarDatosCarro(); // Llamar a la función para ingresar los datos del carro
                        matrizDinamica.insertarEnMatriz(x, y, carro); // Insertar el carro en la matriz
                        matrizDinamica.mostrarMatriz(); // Mostrar la matriz actualizada
                        System.out.println("Desea ingresar otro carro [s/n]");
                        continuar = entrada.nextLine(); // Leer si se desea continuar ingresando carros
                    } while (continuar.equalsIgnoreCase("s")); // Repetir mientras se desee continuar
                    break;
                case 2: // Opción para buscar un carro
                    entrada.nextLine();
                    System.out.println("Bienvenido a busqueda de carro ");
                    do {
                        System.out.println("Desea buscar por coordenadas? [s/N]");
                        porCoordenada = entrada.nextLine(); // Leer la opción para buscar por coordenadas
                        if (porCoordenada.equalsIgnoreCase("s")) { // Si se elige buscar por coordenadas
                            System.out.println("Ingrese una posicion en X para el vehiculo");
                            x = entrada.nextInt(); // Leer la coordenada X
                            System.out.println("Ingrese una posicion en Y para el vehiculo");
                            y = entrada.nextInt(); // Leer la coordenada Y
                            matrizDinamica.buscarEnMatriz(x, y); // Buscar el carro en la matriz por coordenadas
                        } else if (porCoordenada.equalsIgnoreCase("n")) { // Si se elige buscar por propiedades
                            buscarDatosCarro(matrizDinamica); // Llamar a la función para buscar por propiedades
                        }
                        System.out.println("Desea buscar otro carro [s/n]");
                        continuar = entrada.nextLine(); // Leer si se desea continuar buscando carros
                    } while (continuar.equalsIgnoreCase("s")); // Repetir mientras se desee continuar
                    break;
                case 3: // Opción para eliminar un carro
                    entrada.nextLine();
                    System.out.println("Bienvenido a eliminar carro");
                    do {
                        System.out.println("Desea eliminar por coordenadas? [s/N]");
                        porCoordenada = entrada.nextLine(); // Leer la opción para eliminar por coordenadas
                        if (porCoordenada.equalsIgnoreCase("s")) { // Si se elige eliminar por coordenadas
                            System.out.println("Ingrese una posicion en X para el vehiculo");
                            x = entrada.nextInt(); // Leer la coordenada X
                            System.out.println("Ingrese una posicion en Y para el vehiculo");
                            y = entrada.nextInt(); // Leer la coordenada Y
                            matrizDinamica.eliminarEnMatriz(x, y); // Eliminar el carro en la matriz por coordenadas
                        } else if (porCoordenada.equalsIgnoreCase("n")) { // Si se elige eliminar por propiedades
                            eliminarDatosCarroEnMatriz(matrizDinamica); // Llamar a la función para eliminar por propiedades
                        }
                        System.out.println("Desea buscar otro carro [s/n]");
                        continuar = entrada.nextLine(); // Leer si se desea continuar eliminando carros
                    } while (continuar.equalsIgnoreCase("s")); // Repetir mientras se desee continuar
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion disponible");
            }
        } while (opcion != 0); // Repetir hasta que se seleccione la opción de salir
    }

    public static Vehiculo ingresarDatosCarro() {
        Scanner entrada = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese una placa para el vehiculo");
        String placa = entrada.nextLine(); // Leer la placa del vehículo
        System.out.println("Ingrese un color para el vehiculo");
        String color = entrada.nextLine(); // Leer el color del vehículo
        System.out.println("Ingrese una linea para el vehiculo");
        String linea = entrada.nextLine(); // Leer la linea del vehículo
        System.out.println("Ingrese el nombre del propietario para el vehiculo");
        String propietario = entrada.nextLine(); // Leer el nombre del propietario del vehículo
        System.out.println("Ingrese un  modelo para el vehiculo");
        String modelo = entrada.nextLine(); // Leer el modelo del vehículo
        Vehiculo carro = new Vehiculo(placa, color, linea, modelo, propietario); // Crear un nuevo objeto Vehiculo con los datos ingresados
        return carro; // Retornar el objeto Vehiculo creado
    }

    public static void buscarDatosCarro(MatrizOrtogonal matrizDinamica) {
        Scanner entrada = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario
        int opcion = 0; // Variable para almacenar la opción seleccionada por el usuario
        System.out.println("Seleccione una opcion para buscar");
        System.out.println("[1] Busqueda por placa");
        System.out.println("[2] Busqueda por color");
        System.out.println("[3] Busqueda por linea");
        System.out.println("[4] Busqueda por modelo");
        System.out.println("[5] Busqueda por nombre del propietario");
        opcion = entrada.nextInt(); // Leer la opción seleccionada por el usuario
        entrada.nextLine(); // Consumir el salto de línea pendiente
        switch (opcion) {
            case 1: // Opción para buscar por placa
                System.out.println("Ingrese una placa para buscar el vehiculo");
                String placa = entrada.nextLine(); // Leer la placa del vehículo a buscar
                matrizDinamica.buscarEnMatrizPorCarro(placa, "", "", "", ""); // Buscar el vehículo en la matriz por placa
                break;
            case 2: // Opción para buscar por color
                System.out.println("Ingrese un color para buscar el vehiculo");
                String color = entrada.nextLine(); // Leer el color del vehículo a buscar
                matrizDinamica.buscarEnMatrizPorCarro("", color, "", "", ""); // Buscar el vehículo en la matriz por color
                break;
            case 3: // Opción para buscar por linea
                System.out.println("Ingrese una linea para buscar el vehiculo");
                String linea = entrada.nextLine(); // Leer la linea del vehículo a buscar
                matrizDinamica.buscarEnMatrizPorCarro("", "", linea, "", ""); // Buscar el vehículo en la matriz por linea
                break;
            case 4: // Opción para buscar por modelo
                System.out.println("Ingrese un  modelo para el vehiculo");
                String modelo = entrada.nextLine(); // Leer el modelo del vehículo a buscar
                matrizDinamica.buscarEnMatrizPorCarro("", "", "", "", modelo); // Buscar el vehículo en la matriz por modelo
                break;
            case 5: // Opción para buscar por nombre del propietario
                System.out.println("Ingrese el nombre del propietario para buscar el vehiculo");
                String propietario = entrada.nextLine(); // Leer el nombre del propietario del vehículo a buscar
                matrizDinamica.buscarEnMatrizPorCarro("", "", "", propietario, ""); // Buscar el vehículo en la matriz por propietario
                break;
        }
    }

    public static void eliminarDatosCarroEnMatriz(MatrizOrtogonal matrizDinamica) {
        Scanner entrada = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario
        int opcion = 0; // Variable para almacenar la opción seleccionada por el usuario
        System.out.println("Seleccione una opcion para buscar");
        System.out.println("[1] Eliminar por placa");
        System.out.println("[2] Eliminar por color");
        System.out.println("[3] Eliminar por linea");
        System.out.println("[4] Eliminar por modelo");
        System.out.println("[5] Eliminar por nombre del propietario");
        opcion = entrada.nextInt(); // Leer la opción seleccionada por el usuario
        entrada.nextLine(); // Consumir el salto de línea pendiente
        switch (opcion) {
            case 1: // Opción para eliminar por placa
                System.out.println("Ingrese una placa para buscar el vehiculo");
                String placa = entrada.nextLine(); // Leer la placa del vehículo a eliminar
                matrizDinamica.eliminarEnMatrizPorPropiedad(placa, "", "", "", ""); // Eliminar el vehículo en la matriz por placa
                break;
            case 2: // Opción para eliminar por color
                System.out.println("Ingrese un color para buscar el vehiculo");
                String color = entrada.nextLine(); // Leer el color del vehículo a eliminar
                matrizDinamica.eliminarEnMatrizPorPropiedad("", color, "", "", ""); // Eliminar el vehículo en la matriz por color
                break;
            case 3: // Opción para eliminar por linea
                System.out.println("Ingrese una linea para buscar el vehiculo");
                String linea = entrada.nextLine(); // Leer la linea del vehículo a eliminar
                matrizDinamica.eliminarEnMatrizPorPropiedad("", "", linea, "", ""); // Eliminar el vehículo en la matriz por linea
                break;
            case 4: // Opción para eliminar por modelo
                System.out.println("Ingrese un  modelo para el vehiculo");
                String modelo = entrada.nextLine(); // Leer el modelo del vehículo a eliminar
                matrizDinamica.eliminarEnMatrizPorPropiedad("", "", "", "", modelo); // Eliminar el vehículo en la matriz por modelo
                break;
            case 5: // Opción para eliminar por nombre del propietario
                System.out.println("Ingrese el nombre del propietario para buscar el vehiculo");
                String propietario = entrada.nextLine(); // Leer el nombre del propietario del vehículo a eliminar
                matrizDinamica.eliminarEnMatrizPorPropiedad("", "", "", propietario, ""); // Eliminar el vehículo en la matriz por propietario
                break;
        }
    }

}
