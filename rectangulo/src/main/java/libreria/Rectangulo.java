/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author carre
 */
public class Rectangulo {
    private double lado1, lado2;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void setLado1(double este){
        this.lado1 = este;
    }
    
    public void setLado2(double este){
        this.lado2 = este;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public double calculaArea(){
        return lado1 * lado2;
    }
    
    public double calculaPerimetro(){
        return (lado1 * 2) + (lado2 * 2);
    }
    
    public boolean equals(Rectangulo comp){
        if(comp.getLado1() == lado1 && comp.getLado2() == lado2)
            return true;
        return false;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lado 1:" + lado1);
        sb.append("Lado 2:" + lado2);
        return sb.toString();
    }
}
