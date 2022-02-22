/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta8figuras;

/**
 *
 * @author carre
 */
public class Circulo implements FigGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        
    }
    
    public double calculaArea(){
        return 2 * Math.PI * radio;
    }
    public double calculaPerim(){
        return Math.PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
        final Circulo other = (Circulo) obj;
        return Double.doubleToLongBits(this.radio) == Double.doubleToLongBits(other.radio);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
}
