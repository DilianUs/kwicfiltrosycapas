/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtros;
import java.io.EOFException;
/**
 *
 * @author braul
 */
public abstract class Filtro{

   protected Tubo in, out;

    public void setIn(Tubo p) {
        in = p;
    }

    public void setOut(Tubo p) {
        out = p;
    }

    public void write(Object data) {
        out.setData(data);
    }

    public Object read() {
        return in.getData();
    }
   

    public abstract void ejecutar();
}
