/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg5.escuela;

/**
 *
 * @author carre
 */
public class Alumno {
    private double promedioAnoAnterior;
    private String nombreAlumno, CURP, nomMadre, nomPadre, nomTutor, escuelaAnterior, grado, fechaNac;
    private double[] califsActuales = new double[4];

    public Alumno(double promedioAnoAnterior, String nombreAlumno, String CURP, String nomMadre, String nomPadre, String nomTutor, String escuelaAnterior, String grado, String fechaNac) {
        this.promedioAnoAnterior = promedioAnoAnterior;
        this.nombreAlumno = nombreAlumno;
        this.CURP = CURP;
        this.nomMadre = nomMadre;
        this.nomPadre = nomPadre;
        this.nomTutor = nomTutor;
        this.escuelaAnterior = escuelaAnterior;
        this.grado = grado;
        this.fechaNac = fechaNac;
    }

    

    public boolean equals(Alumno otro) {
        if (nombreAlumno.equals(otro.getNombreAlumno())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alumno{" + "promedioAnoAnterior=" + promedioAnoAnterior + ", nombreAlumno=" + nombreAlumno + ", CURP=" + CURP + ", nomMadre=" + nomMadre + ", nomPadre=" + nomPadre + ", nomTutor=" + nomTutor + ", escuelaAnterior=" + escuelaAnterior + ", califsActuales=" + califsActuales + '}';
    }

    public double getPromedioAnoAnterior() {
        return promedioAnoAnterior;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getCURP() {
        return CURP;
    }

    public String getNomMadre() {
        return nomMadre;
    }

    public String getNomPadre() {
        return nomPadre;
    }

    public String getNomTutor() {
        return nomTutor;
    }

    public String getEscuelaAnterior() {
        return escuelaAnterior;
    }

    public double[] getCalifsActuales() {
        return califsActuales;
    }

    public String getGrado() {
        return grado;
    }

    public String getFechaNac() {
        return fechaNac;
    }
    
    public void setPromedioAnoAnterior(double promedioAnoAnterior) {
        this.promedioAnoAnterior = promedioAnoAnterior;
    }

    public void setNomTutor(String nomTutor) {
        this.nomTutor = nomTutor;
    }

    public void setEscuelaAnterior(String escuelaAnterior) {
        this.escuelaAnterior = escuelaAnterior;
    }

    public void setCalifsActuales(double[] califsActuales) {
        this.califsActuales = califsActuales;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    
    
}
