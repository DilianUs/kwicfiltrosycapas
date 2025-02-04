/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

import java.util.Scanner;
/**
 *
 * @author braul
 */
public class InputReaderFilter extends Filtro {
     @Override
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase:");
        String phrase = scanner.nextLine();
        System.out.println("Frase leida: " + phrase);
        write(phrase);
    }

   
}
