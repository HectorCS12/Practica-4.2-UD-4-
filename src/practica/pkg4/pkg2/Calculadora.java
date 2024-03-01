/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg4.pkg2;

/**
 *
 * @author hecto
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 5;
        int b = 13;

        System.out.println("La suma de a y b es: " + sumar(a, b));
        System.out.println("La suma de a y b es: " + restar(a, b));
        System.out.println("La multiplicacion de a y b es: " + multiplicar(a, b));
        System.out.println("La división de a entre b es: " + division(a, b));
        System.out.println("El area del triangulo es: " + areatriangulo(a, b));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double division(int a, int b){
        return a / b;
    }
    public static int areatriangulo(int a, int b) {
        return (a * b)/2;
    }
}
