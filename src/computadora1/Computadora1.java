/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora1;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import java.awt.BorderLayout;

/**
 *
 * @author pc
 */
public class Computadora1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Computadora pc1=new Computadora("Acer", " Aspire");
    Monitor mt1=new Monitor("PnP ", "Generico ", 15);
    Mouse mo1=new Mouse("Microsoft ", "Basic Optical", " alambrico");
    Teclado tcl=new Teclado("Dell", " SK-9811 ", 100, 10);
    CPU cpu1=new CPU("Intel", " Core I5 ", 2);
        
        System.out.println(pc1.getMarca()+ pc1.getModelo());
        System.out.println(mt1.getMarca()+ mt1.getModelo()+ mt1.getPulgadas()+ " pulgadas");
        System.out.println(mo1.getMarca()+ mo1.getModelo()+ mo1.getTipo());
        System.out.println(tcl.getMarca()+ tcl.getModelo()+ tcl.getNumeroDeTeclas()+ " " + tcl.getMultimedia());
        System.out.println(cpu1.getMarca()+ cpu1.getModelo()+ cpu1.getVelocidadProcesador()+ ".0Ghz");
        
    }
    
}
