/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kwicfiltrostuberias;
import Filtros.*;
/**
 *
 * @author braul
 */
public class KwicFiltrosTuberias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Tubo pipe1 = new Tubo();
        Tubo pipe2 = new Tubo();
        Tubo pipe3 = new Tubo();
        Tubo pipe4 = new Tubo();

        Filtro inputReaderFilter = new InputReaderFilter();
        Filtro tokenizerFilter = new TokenizerFilter();
        Filtro combinerFilter = new CombinerFilter();
        Filtro sorterFilter = new SorterFilter();
        Filtro outputWriterFilter = new OutputWriterFilter();

        inputReaderFilter.setOut(pipe1);
        tokenizerFilter.setIn(pipe1);
        tokenizerFilter.setOut(pipe2);
        combinerFilter.setIn(pipe2);
        combinerFilter.setOut(pipe3);
        sorterFilter.setIn(pipe3);
        sorterFilter.setOut(pipe4);
        outputWriterFilter.setIn(pipe4);

        System.out.println("Configurando pipeline con los siguientes filtros:");
        System.out.println("InputReaderFilter: " + inputReaderFilter);
        System.out.println("TokenizerFilter: " + tokenizerFilter);
        System.out.println("CombinerFilter: " + combinerFilter);
        System.out.println("SorterFilter: " + sorterFilter);
        System.out.println("OutputWriterFilter: " + outputWriterFilter);

        inputReaderFilter.ejecutar();
        tokenizerFilter.ejecutar();
        combinerFilter.ejecutar();
        sorterFilter.ejecutar();
        outputWriterFilter.ejecutar();
    
    }
    
}
