/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuela;
import java.util.*;
/**
 *
 * @author carre
 */
public class Escuela {
    private String escuela;
    private String direccion;
    private final int MAX_ALUMNOS = 50;
    private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    private int numAlumnos = 0;

    public Escuela(String escuela, String direccion) {
        this.escuela = escuela;
        this.direccion = direccion;
    }
    
    public Escuela(String escuela, String direccion, Alumno[] alumnos, int numAlumnos) {
        this.escuela = escuela;
        this.direccion = direccion;
        this.alumnos = alumnos;
        this.numAlumnos = numAlumnos;
    }
    
    public int buscador(int clave){
        for(int i = 0; i < numAlumnos; i++){
            if(alumnos[i].getClaveUnica() == clave)
                return i;
        }
        return -1;
    }
    
    public boolean altaAlumno(Alumno este){
        if(numAlumnos < MAX_ALUMNOS && buscador(este.getClaveUnica()) == -1){
            alumnos[numAlumnos] = este;
            numAlumnos++;
            return true;
        }
        return false;
    }
    
    public int bajaAlumno(int clave){
        int inicio = buscador(clave);
        if(inicio != -1){
            for(int i = inicio; i < numAlumnos; i++){
                alumnos[i] = alumnos [i + 1];
            }
            numAlumnos--;
            return clave;
        }
        return -1;
    }
    
    public boolean altaCalifAlumno(int clave, double cali){
        if(buscador(clave) == -1){
            return false;
        }
        alumnos[buscador(clave)].altaCalificacion(cali);
        return true;
    }
    
    public String alumnoMayorMateriasAprobadas(){
        int cuantas = 0;
        String nombre = "";
        for(int i = 0; i < numAlumnos; i++){
            if(alumnos[i].getTotalCalif() > cuantas){
                cuantas = alumnos[i].getTotalCalif();
                nombre = alumnos[i].getNombreAlumno();
            }
        }
        return nombre;
    }
    
    public ArrayList<String> muchosaAumnosMayorMateriasAprobadas(){
        int cuantas = 0;
        ArrayList<String> nombres = new ArrayList<String>();
        for(int i = 0; i < numAlumnos; i++){
            if(alumnos[i].getTotalCalif() > cuantas){
                cuantas = alumnos[i].getTotalCalif();
                nombres.clear();
            }
            if(alumnos[i].getTotalCalif() == cuantas){
                nombres.add(alumnos[i].getNombreAlumno());
            }
        }
        return nombres;
    }
    
    public String toStringAlumno(int clave){
        if(buscador(clave) == -1){
            return "no existe?????";
        }
        return alumnos[buscador(clave)].toString();
    }
    
    public String toStringTodosAlumnos(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numAlumnos; i++){
            sb.append("\n" + alumnos[i].getNombreAlumno() + alumnos[i].calculaPromedio());
        }
        return sb.toString();
    }
    
}
