/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areas_emilio;

import java.util.Scanner;

/**
 *
 * @author eag4l
 */
public class Areas_Emilio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Calculadora de Áreas");
            System.out.println("1. Área de un círculo");
            System.out.println("2. Área de un cuadrado");
            System.out.println("3. Área de un triángulo");
            System.out.println("4. Área de un rectángulo   ");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el radio del círculo: ");
                    double radio = sc.nextDouble();
                    double areaCirculo = Math.PI * radio * radio;
                    System.out.println("Área del círculo: " + areaCirculo);
                    break;
                case 2:
                    System.out.print("Introduce el lado del cuadrado: ");
                    double lado = sc.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("Área del cuadrado: " + areaCuadrado);
                    break;
                case 3:
                    System.out.print("Introduce la base del triángulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    double altura = sc.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("Área del triángulo: " + areaTriangulo);
                    break;
                case 4:
                    System.out.print("Introduce la base del rectángulo: ");
                    double baseR = sc.nextDouble();
                    System.out.print("Introduce la altura del rectángulo: ");
                    double alturaR = sc.nextDouble();
                    double areaRectangulo = baseR * alturaR;
                    System.out.println("Área del rectángulo: " + areaRectangulo);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 5);
        sc.close();
    }
}
