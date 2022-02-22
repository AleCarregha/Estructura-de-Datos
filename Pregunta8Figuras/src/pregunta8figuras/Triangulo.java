/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta8figuras;

/**
 *
 * @author carre
 */
public class Triangulo implements FigGeometrica{
    private double lado1, lado2, lado3, angulo;

    public Triangulo(double lado1, double lado2, double lado3, double angulo) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.angulo = angulo;
    }
    
    
    public double calculaArea(){
        return lado3 * (lado2 * Math.sin(angulo))/ 2;
    }
    public double calculaPerim(){
        return lado1 + lado2 + lado3;
    }

    public boolean esEquilatero(){
        return lado1 == lado2 && lado1 == lado3;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
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
        final Triangulo other = (Triangulo) obj;
        if (Double.doubleToLongBits(this.lado1) != Double.doubleToLongBits(other.lado1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado2) != Double.doubleToLongBits(other.lado2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado3) != Double.doubleToLongBits(other.lado3)) {
            return false;
        }
        return Double.doubleToLongBits(this.angulo) == Double.doubleToLongBits(other.angulo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangulo{");
        sb.append("lado1=").append(lado1);
        sb.append(", lado2=").append(lado2);
        sb.append(", lado3=").append(lado3);
        sb.append(", angulo=").append(angulo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
