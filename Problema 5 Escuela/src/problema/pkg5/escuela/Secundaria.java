/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg5.escuela;

/**
 *
 * @author carre
 */
public class Secundaria extends Alumno{
    private String actividad;

    public Secundaria(String actividad, double promedioAnoAnterior, String nombreAlumno, String CURP, String nomMadre, String nomPadre, String nomTutor, String escuelaAnterior, String grado, String fechaNac) {
        super(promedioAnoAnterior, nombreAlumno, CURP, nomMadre, nomPadre, nomTutor, escuelaAnterior, grado, fechaNac);
        this.actividad = actividad;
    }
    
    
    
    
}
