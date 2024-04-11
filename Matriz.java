/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jsalazar
 */
public class Matriz {
    
    public class MatrizOrtogonal {
    
    static class Vehicle {
        String plate;
        String color;
        String brand;
        String model;
        String owner;

        Vehicle(String plate, String color, String brand, String model, String owner) {
            this.plate = plate;
            this.color = color;
            this.brand = brand;
            this.model = model;
            this.owner = owner;
        }
    }

    static class Node {
        Vehicle vehicle;
        Node right;
        Node down;

        Node(Vehicle vehicle) {
            this.vehicle = vehicle;
            this.right = null;
            this.down = null;
        }
    }

    static class Matrix {
        Node topLeft;

        void insert(Vehicle vehicle, int row, int col) {
            Node newNode = new Node(vehicle);

            // Mover a la fila y columna especificadas
            Node rowNode = moveOrAddRow(row);
            Node colNode = moveOrAddColumn(col);

            // Insertar el nodo en la posición especificada
            Node current = rowNode;
            while (current.right != null && current.right.vehicle != null && current.right.vehicle.col < col) {
                current = current.right;
            }
            newNode.right = current.right;
            current.right = newNode;

            current = colNode;
            while (current.down != null && current.down.vehicle != null && current.down.vehicle.row < row) {
                current = current.down;
            }
            newNode.down = current.down;
            current.down = newNode;
        }

        Node moveOrAddRow(int row) {
            Node temp = topLeft;
            while (temp.down != null && temp.down.vehicle != null && temp.down.vehicle.row < row) {
                temp = temp.down;
            }
            if (temp.down == null || temp.down.vehicle == null || temp.down.vehicle.row != row) {
                Node newRow = new Node(null);
                newRow.down = temp.down;
                temp.down = newRow;
                temp = newRow;
            }
            return temp;
        }

        Node moveOrAddColumn(int col) {
            Node temp = topLeft;
            while (temp.right != null && temp.right.vehicle != null && temp.right.vehicle.col < col) {
                temp = temp.right;
            }
            if (temp.right == null || temp.right.vehicle == null || temp.right.vehicle.col != col) {
                Node newCol = new Node(null);
                newCol.right = temp.right;
                temp.right = newCol;
                temp = newCol;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        // Insertar vehículo en la posición (5, 100)
        Vehicle car = new Vehicle("ABC123", "Red", "Toyota", "Corolla", "John Doe");
        matrix.insert(car, 5, 100);

        // Imprimir la matriz ortogonal (no implementado en esta versión)
        System.out.println("Vehicle inserted at position (5, 100).");
    }
    }}

