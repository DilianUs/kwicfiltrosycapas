/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author braul
 */
public class OutputWriterFilter extends Filtro{
     @Override
    public void ejecutar() {
        Object obj = read();
        System.out.println("Imprimiendo combinaciones" );
        if (obj instanceof String[]) {
            String[] results = (String[]) obj;
            for (String result : results) {
                System.out.println(result);
            }
        }
    }
    
}
