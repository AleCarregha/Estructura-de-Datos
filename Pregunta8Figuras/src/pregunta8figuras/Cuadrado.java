/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta8figuras;

/**
 *
 * @author carre
 */
public class Cuadrado extends Cuadrilatero{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    public double calculaArea(){
        return lado * lado;
    }
    public double calculaPerim(){
        return lado * 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuadrado other = (Cuadrado) obj;
        return Double.doubleToLongBits(this.lado) == Double.doubleToLongBits(other.lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
}
