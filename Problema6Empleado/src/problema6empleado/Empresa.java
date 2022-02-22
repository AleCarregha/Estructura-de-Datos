/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema6empleado;

/**
 *
 * @author carre
 */
public class Empresa {
    private String nomEmpresa;
    private String direccion;
    private String dueño;
    private Administrativo[] administrativos;
    private Operario[] operarios;
    private int totA, totO;
    private static final int MAX=100;
   
    public Empresa(){
        administrativos=new Administrativo[MAX];
        operarios=new Operario[MAX];
        totA=0;
        totO=0;
    }
    public Empresa(String nomEmpresa,String direccion,String dueño){
        this();
        this.nomEmpresa=nomEmpresa;
        this.direccion=direccion;
        this.dueño=dueño;
    }
    public boolean altaOperario(Operario a){
        boolean resp=false;
        if(totO<MAX){
            operarios[totO]=a;
            totO++;
            resp=true;
        }
        return resp;
    }
    public boolean altaOperario2(String nomEmpleado, double sueldoBase, int horasExtra){
        boolean resp=false;
        if(totO<MAX){
            operarios[totO]=new Operario(nomEmpleado,sueldoBase,horasExtra);
            totO++;
            resp=true;
        }
        return resp;
    }
    public boolean altaAdministrativo(Administrativo a){
        boolean resp=false;
        if(totA<MAX){
            administrativos[totA]=a;
            totA++;
            resp=true;
        }
        return resp;
    }
    public boolean altaAdministrativo2(String nomEmpleado, double sueldoBase, String departamento,String telefono){
        boolean resp=false;
        if(totA<MAX){
            administrativos[totA]=new Administrativo(nomEmpleado,sueldoBase,departamento,telefono);
            totA++;
            resp=true;
        }
        return resp;
    }
    public boolean actualizaAS(int clave, int aumento){
        boolean resp=false;
        double salarioN;
        for(int i=0;i<totA;i++){
            if(administrativos[i].getClaveEmpleado()==clave){
                salarioN=administrativos[i].getSueldoBase()*aumento*.01;
                administrativos[i].setSueldoBase(administrativos[i].getSueldoBase()+salarioN);
                resp=true;
            }
        }
        return resp;
    }
    public boolean actualizaAD(int clave, String departamento){
        boolean resp=false;
        for(int i=0;i<totA;i++){
            if(administrativos[i].getClaveEmpleado()==clave){
                administrativos[i].setDepartamento(departamento);
                resp=true;
            }
        }
        return resp;
    }
    public double cuantoCobraO(int clave,double prestac, double deduc, double precioHE){
        double resp=0;
        int horasExtra=0;
        double prestaciones,deducciones;
        double salario=0;
        for(int i=0;i<totO;i++){
            if(operarios[i].getClaveEmpleado()==clave){
                horasExtra=operarios[i].getHorasExtra();
                resp=horasExtra*precioHE;
                prestaciones=(operarios[i].getSueldoBase()*prestac*.01);
                deducciones=(operarios[i].getSueldoBase()*deduc*.01);
                salario=operarios[i].getSueldoBase()+prestaciones-deducciones;
                resp=salario+resp;
            }
        }
        return resp;
    }
    public String reporteAdministrativos(){
        StringBuilder sb=new StringBuilder();
        sb.append("Datos de los administrativos \n");
        for(int i=0;i<totA;i++){
            sb.append("Nombre: "+administrativos[i].getNomEmpleado()+"\n");
            sb.append("Sueldo base: "+administrativos[i].getSueldoBase()+"\n");
            sb.append("");
        }
        return sb.toString();
    }
    public String reporteOperarios(){
        StringBuilder sb=new StringBuilder();
        sb.append("Datos de los operarios \n");
        for(int i=0;i<totA;i++){
            sb.append("Nombre: "+operarios[i].getNomEmpleado()+"\n");
            sb.append("Sueldo base: "+operarios[i].getSueldoBase()+"\n");
            sb.append("");
        }
        return sb.toString();
    }
    public String sueldoMenor(int minimo){
        StringBuilder sb=new StringBuilder();
        int cont=0;
        for(int i=0;i<totO;i++){
            if(operarios[i].getSueldoBase()<minimo){
                sb.append(operarios[i].toString());
                cont++;
            }
        }
        sb.append("Cantidad de personas: "+cont);
        return sb.toString();
    }
}
