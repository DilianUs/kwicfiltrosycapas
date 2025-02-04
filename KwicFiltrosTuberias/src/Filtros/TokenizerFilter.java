/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author braul
 */
public class TokenizerFilter extends Filtro{
    
    @Override
    public void ejecutar() {
        Object obj = read();
        if (obj instanceof String) {
            String phrase = (String) obj;
            System.out.println("Frase para tokenizar: " + phrase);
            String[] tokens = phrase.split(" ");
            for (String token : tokens) {
                System.out.println("Token generado: " + token);
            }
            write(tokens);
        }
    }
}
