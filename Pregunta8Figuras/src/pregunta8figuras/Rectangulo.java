/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta8figuras;

/**
 *
 * @author carre
 */
public class Rectangulo extends Cuadrilatero {
    private double lado1, lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    
    public double calculaArea(){
        return lado1 * lado2;
    }
    public double calculaPerim(){
        return lado1 * 2 + lado2 * 2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

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
        final Rectangulo other = (Rectangulo) obj;
        if (Double.doubleToLongBits(this.lado1) != Double.doubleToLongBits(other.lado1)) {
            return false;
        }
        return Double.doubleToLongBits(this.lado2) == Double.doubleToLongBits(other.lado2);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
}
