/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema6empleado;

/**
 *
 * @author carre
 */
public class Administrativo extends Empleado{
    private String departamento;
    private String telefono;
   
    public Administrativo(){
        super();
    }
    public Administrativo(String nomEmpleado, double sueldoBase, String departamento,String telefono){
        super(nomEmpleado,sueldoBase);
        this.departamento=departamento;
        this.telefono=telefono;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString());
        sb.append("Departamento: "+departamento+"\n");
        sb.append("Telefono: "+telefono+"\n");
        return sb.toString();
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
    public double calculaSalario(double prestac, double deduc){
        double resp = getSueldoBase() + prestac - deduc;
        return resp;
    }
    
}
