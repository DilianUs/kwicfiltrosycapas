/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author braul
 */
public class SorterFilter extends Filtro{
     @Override
    public void ejecutar() {
        Object obj = read();
        if (obj instanceof String[]) {
            String[] combinations = (String[]) obj;
            List<String> combinationList = new ArrayList<>();
            Collections.addAll(combinationList, combinations);
            Collections.sort(combinationList);
            write(combinationList.toArray(new String[0]));
            System.out.println("Ordenamiento realziado");
        }
    }
}
