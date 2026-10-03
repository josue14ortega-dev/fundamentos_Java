/*
Ejercicio 8 — Calculadora interactiva
Haz un programa que permita al usuario introducir dos números y después muestre:
- Suma
- Resta
- Multiplicación
- División
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float r1, r2;
        float resultado;
        int opcion;
    
         do {
            System.out.println("Primer digito: ");
            r1 = entrada.nextInt();
            System.out.println("Segundo digito: ");
            r2 = entrada.nextInt();
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("Selecciona una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    resultado = r1 + r2;
                    System.out.println("Suma: " + resultado);
                    break;
                case 2:
                    resultado = r1 - r2;
                    System.out.println("Resta: "+ resultado);
                    break;
                case 3:
                    resultado = r1 * r2;
                    System.out.println("Multiplicacion: "+ resultado);
                    break;
                case 4:
                    resultado = r1 / r2;
                    System.out.println("Division: "+ resultado);
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora");
            }
        } while (opcion !=5);
        
        entrada.close();
    }


}
