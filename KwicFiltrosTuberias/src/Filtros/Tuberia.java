/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;

/**
 *
 * @author braul
 */
public class Tuberia {
     private Filtro[] filtros;

    public Tuberia(Filtro... filtros) {
        this.filtros = filtros;

        for (int i = 0; i < filtros.length - 1; i++) {
            Tubo p = new Tubo();
            System.out.println("Tubo creado: " + p);
            filtros[i].setOut(p);
            filtros[i + 1].setIn(p);
        }

        for (int i = 0; i < filtros.length; i++) {
            System.out.println("Filtro " + i + " out: " + filtros[i].out);
            if (i + 1 < filtros.length) {
                System.out.println("Filtro " + (i + 1) + " in: " + filtros[i + 1].in);
            }
        }
    }

    public void ejecutar() {
        for (Filtro f : filtros) {
            System.out.println("Ejecutando filtro: " + f);
            f.ejecutar();
        }
    }
}
