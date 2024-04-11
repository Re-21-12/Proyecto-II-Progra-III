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

            int x;
            int y;
            Vehicle vehicle;
            Node left;
            Node right;
            Node up;
            Node down;

            Node(int x, int y, Vehicle vehicle) {
                this.x = x;
                this.y = y;
                this.vehicle = vehicle;
                this.left = null;
                this.right = null;
                this.up = null;
                this.down = null;
            }
        }

        static class NodeList {

            Node head;

            NodeList() {
                this.head = null;
            }

            void insert(Node node) {
                if (head == null) {
                    head = node;
                } else {
                    Node current = head;
                    while (current.right != null) {
                        current = current.right;
                    }
                    current.right = node;
                }
            }
        }

        static class Matrix {

            NodeList rows;
            NodeList cols;

            Matrix() {
                this.rows = new NodeList();
                this.cols = new NodeList();
            }

            void insert(Vehicle vehicle, int x, int y) {
                Node newNode = new Node(x, y, vehicle);

                // Insertar en la fila
                Node rowNode = insertNodeInList(rows, newNode, true);

                // Insertar en la columna
                Node colNode = insertNodeInList(cols, newNode, false);

                // Conectar nodos horizontal y verticalmente
                connectNodes(newNode, rowNode, true);
                connectNodes(newNode, colNode, false);
            }

            Node insertNodeInList(NodeList list, Node newNode, boolean horizontal) {
                Node current = list.head;
                Node prev = null;

                while (current != null && ((horizontal && current.x < newNode.x) || (!horizontal && current.y < newNode.y))) {
                    prev = current;
                    current = current.right;
                }

                if (prev == null) {
                    list.head = newNode;
                } else {
                    prev.right = newNode;
                }

                newNode.right = current;

                return newNode;
            }

            void connectNodes(Node newNode, Node listNode, boolean horizontal) {
                if (horizontal) {
                    Node temp = listNode;
                    while (temp != null && temp.y != newNode.y) {
                        temp = temp.down;
                    }
                    if (temp != null) {
                        newNode.up = temp;
                        temp.down = newNode;
                    }
                } else {
                    Node temp = listNode;
                    while (temp != null && temp.x != newNode.x) {
                        temp = temp.right;
                    }
                    if (temp != null) {
                        newNode.left = temp;
                        temp.right = newNode;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Matrix matrix = new Matrix();

            // Insertar un vehículo en la posición (5, 100)
            Vehicle car = new Vehicle("ABC123", "Red", "Toyota", "Corolla", "John Doe");
            matrix.insert(car, 5, 100);

            // Insertar otro vehículo en la posición (3, 50)
            Vehicle car2 = new Vehicle("XYZ456", "Blue", "Honda", "Civic", "Jane Doe");
            matrix.insert(car2, 3, 50);

        }
    }
}
