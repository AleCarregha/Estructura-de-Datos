/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema6empleado;

/**
 *
 * @author carre
 */
public class Problema6Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa apple=new Empresa("Apple","Silicon Valley","Steve Jobs");
        Operario Juan=new Operario("JUAN",2500,3);
        Operario Pedro=new Operario("Pedro",3000,4);
        Operario Chucho=new Operario("Chucho",2800,5);
        Administrativo Maria=new Administrativo("Maria",5000, "Ventas","5581726144");
        Administrativo Rosa=new Administrativo("Rosa",5000,"Sistemas","5512345678");
        Administrativo Ari=new Administrativo("Ari",5000,"Gerente","559087675");
        apple.altaAdministrativo(Rosa);
        apple.altaAdministrativo(Maria);
        apple.altaAdministrativo(Ari);
        apple.altaOperario(Juan);
        apple.altaOperario(Pedro);
        apple.altaOperario(Chucho);
        System.out.println(apple.reporteAdministrativos());
        System.out.println(apple.reporteOperarios());
        System.out.println(Rosa.toString());
        System.out.println(apple.actualizaAS(104, 50));
        System.out.println(Rosa.toString());
        System.out.println(apple.sueldoMenor(3000));
        System.out.println(apple.cuantoCobraO(100, 30, 10, 300));
    }
    
}
