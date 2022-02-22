/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author carre
 */
public class Prueba {
    public static void main(String[] args) {
       Escuela e1 = new Escuela("ITAM", "Rio Hondo 1");
       Alumno a1 = new Alumno("Alejandro", 00001);
       a1.altaCalificacion(100);
       a1.altaCalificacion(95);
       a1.altaCalificacion(87);
       Alumno a2 = new Alumno("Ignacio", 00002);
       a2.altaCalificacion(83);
       a2.altaCalificacion(77);
       e1.altaAlumno(a1);
       e1.altaAlumno(a2);
       e1.altaCalifAlumno(0001, 93);
       System.out.println(e1.toStringAlumno(00001));
       System.out.println(e1.toStringTodosAlumnos());
       System.out.println(e1.alumnoMayorMateriasAprobadas());
       System.out.println(e1.bajaAlumno(00002));
       System.out.println(e1.toStringTodosAlumnos());
       
       Alumno a3 = new Alumno("Alberto", 00003);
       a3.altaCalificacion(83);
       a3.altaCalificacion(77);
       a3.altaCalificacion(95);
       a3.altaCalificacion(87);
       e1.altaAlumno(a3);
       
       System.out.println(e1.toStringTodosAlumnos());
       System.out.println(e1.muchosaAumnosMayorMateriasAprobadas());
    }
}
