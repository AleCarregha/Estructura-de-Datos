/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema6empleado;

/**
 *
 * @author carre
 */
public class Operario extends Empleado{
    private int horasExtra;
   
    public Operario(){
        super();
    }
    public Operario(String nomEmpleado, double sueldoBase, int horasExtra){
        super(nomEmpleado, sueldoBase);
        this.horasExtra=horasExtra;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString());
        sb.append("Horas Extra: "+horasExtra+"\n");
        return sb.toString();
    }
    public double calculaSalario(double prestac, double deduc, double precioHE){
        return calculaSalario(prestac, deduc) + horasExtra * precioHE;
    }
    
    public double calculaSalario(double prestac, double deduc){
        return getSueldoBase() + prestac/100 - deduc/100;
    }
    
}
