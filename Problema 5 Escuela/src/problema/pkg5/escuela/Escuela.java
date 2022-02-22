/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg5.escuela;

import java.util.ArrayList;

/**
 *
 * @author carre
 */
public class Escuela {
    private String escuela;
    private final int MAX_ALUMNOS = 50;
    private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    private int numAlumnos = 0;

    public Escuela(String escuela) {
        this.escuela = escuela;
    }
    
    public Escuela(String escuela, String direccion, Alumno[] alumnos, int numAlumnos) {
        this.escuela = escuela;
        this.alumnos = alumnos;
        this.numAlumnos = numAlumnos;
    }
    
    public int buscador(String nombre){
        for(int i = 0; i < numAlumnos; i++){
            if(alumnos[i].getNombreAlumno().equals(nombre))
                return i;
        }
        return -1;
    }
    
    public boolean altaAlumno(Alumno este){
        if(numAlumnos < MAX_ALUMNOS && buscador(este.getNombreAlumno()) == -1){
            alumnos[numAlumnos] = este;
            numAlumnos++;
            return true;
        }
        return false;
    }
    
    public String bajaAlumno(String nombre){
        int inicio = buscador(nombre);
        if(inicio != -1){
            for(int i = inicio; i < numAlumnos; i++){
                alumnos[i] = alumnos [i + 1];
            }
            numAlumnos--;
            return nombre;
        }
        return "";
    }
    
    public String toStringAlumno(String nombre){
        if(buscador(nombre) == -1){
            return "no existe?????";
        }
        return alumnos[buscador(nombre)].toString();
    }
    
    public String toStringTodosAlumnos(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numAlumnos; i++){
            sb.append("\n" + alumnos[i].getNombreAlumno());
        }
        return sb.toString();
    }
    
}
