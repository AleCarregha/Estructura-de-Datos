/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author carre
 */
public class Alumno {
    private static int serie = 100;
    private int claveUnica;
    private String nombreAlumno;
    private final int MAX_CALIF = 50;
    private double[] califMateriasAprob = new double[MAX_CALIF];
    private int totalCalif;

    public Alumno(String nombreAlumno, int clave) {
        this.nombreAlumno = nombreAlumno;
        this.claveUnica = clave;
    }
    
    public boolean altaCalificacion(double cali){
        if(totalCalif < MAX_CALIF){
            califMateriasAprob[totalCalif] = cali;
            totalCalif ++;
            return true;
        }
        return false;
    }
    
    public String getNombreAlumno(){
        return nombreAlumno;
    }

    public boolean equals(Alumno otro) {
        if (nombreAlumno.equals(otro.getNombreAlumno())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return claveUnica + " " + nombreAlumno + " " + toStringCalificacion();
    }
    
    public String toStringCalificacion() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < totalCalif; i++){
            sb.append(califMateriasAprob[i]);
        }
        return sb.toString();
    }
    
    public double calculaPromedio(){
        double prom = 0;
        for(int i = 0; i < totalCalif; i++){
            prom += califMateriasAprob[i];
        }
        return prom / totalCalif;
    }

    public int getClaveUnica() {
        return claveUnica;
    }
    
    public int getTotalCalif() {
        return totalCalif;
    }
}
