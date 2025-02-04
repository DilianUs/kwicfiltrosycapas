/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author braul
 */
public class CombinerFilter extends Filtro{
    @Override
    public void ejecutar() {
        Object obj = read();
        System.out.println("realizando combinaciones");
        if (obj instanceof String[]) {
            String[] tokens = (String[]) obj;
            int length = tokens.length;
            String[] combinations = new String[length];

            for (int i = 0; i < length; i++) {
                StringBuilder combinationBuilder = new StringBuilder();
                for (int j = i; j < length; j++) {
                    combinationBuilder.append(tokens[j]).append(" ");
                }
                for (int j = 0; j < i; j++) {
                    combinationBuilder.append(tokens[j]).append(" ");
                }
                combinations[i] = combinationBuilder.toString().trim();
            }

            
            write(combinations);
        }
    }
}
