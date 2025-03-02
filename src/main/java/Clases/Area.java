/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
public class Area {
    double Ancho;
    double Largo;

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    public Area(double Ancho, double Largo) {
        this.Ancho = Ancho;
        this.Largo = Largo;
    }
    
    
    public double calcularArea(double ancho, double largo){
      
        double resultado = 0;
        
        resultado = ancho*largo;
        
        
        return resultado;
    }
    
}
