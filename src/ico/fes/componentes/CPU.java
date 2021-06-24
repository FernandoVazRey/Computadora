/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author pc
 */
public class CPU {
    
   private String marca;
   private String modelo;
   private int VelocidadProcesador;

    public CPU() {
    }

    public CPU(String marca, String modelo, int VelocidadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.VelocidadProcesador = VelocidadProcesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadProcesador() {
        return VelocidadProcesador;
    }

    public void setVelocidadProcesador(int VelocidadProcesador) {
        this.VelocidadProcesador = VelocidadProcesador;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", VelocidadProcesador=" + VelocidadProcesador + '}';
    }
   
   
}
