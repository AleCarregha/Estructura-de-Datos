/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author carre
 */
public class Cuadrado {
    private double lado;
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public void setLado(double este){
        this.lado = este;
    }
    
    public double getLado(){
        return lado;
    }
    
    public double calculaArea(){
        return lado*lado;
    }
    
    public double calculaPerimetro(){
        return lado * 4;
    }
    
    public boolean equals(Cuadrado comp){
        if(comp.getLado() == lado)
            return true;
        return false;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lado:" + lado);
        return sb.toString();
    }
}
