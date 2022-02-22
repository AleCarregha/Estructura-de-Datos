/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema6empleado;

/**
 *
 * @author carre
 */
public abstract class Empleado {
    private static int serie=100;
    private int claveEmpleado;
    private String nomEmpleado;
    protected double sueldoBase;
   
    protected Empleado(){
        claveEmpleado=serie;
        serie++;
    }
    
    protected Empleado(String nomEmpleado, double sueldoBase){
        this();
        this.nomEmpleado=nomEmpleado;
        this.sueldoBase=sueldoBase;
    }

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Nombre del empleado: "+nomEmpleado+"\n");
        sb.append("Sueldo base: "+sueldoBase+"\n");
        sb.append("Clave del empleado: "+claveEmpleado+"\n");
        return sb.toString();
    }
    
    public boolean equals(Empleado otro){
        boolean resp=false;
        if(nomEmpleado.equals(otro.getNomEmpleado())){
            resp=true;
        }
        return resp;
    }
    
    public abstract double calculaSalario(double prestac, double deduc);
}
