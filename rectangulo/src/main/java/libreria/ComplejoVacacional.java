/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author carre
 */
public class ComplejoVacacional {
    private static String nombre;
    private static int numAlb = 1;
    private static Rectangulo[] albercas = new Rectangulo[10];
    
    public static void main(String args[]){
        Rectangulo r1 = new Rectangulo();
        r1.setLado1(10);
        r1.setLado2(5);
        System.out.println(altaAlb(r1));
        System.out.println(altaAlb(3, 4));
        System.out.println(totalArea());
        System.out.println(totalPerimetro());
        
    }
    
    public static boolean altaAlb(Rectangulo este){
        if(numAlb < 11){
            albercas[numAlb - 1] = este;
            numAlb ++;
            return true;
        }
        return false;
    }
    
    public static boolean altaAlb(double lado1, double lado2){
        if(numAlb < 11){
            albercas[numAlb - 1] = new Rectangulo(lado1, lado2);
            numAlb ++;
            return true;
        }
        return false;
    }
    
    public static double totalArea(){
        double resp = 0;
        for(int i = 0; i < numAlb - 1; i ++){
            resp += albercas[i].calculaArea();
        }
        return resp;
    }
    
    public static double totalPerimetro(){
        double resp = 0;
        for(int i = 0; i < numAlb - 1; i ++){
            resp += albercas[i].calculaPerimetro();
        }
        return resp;
    }
    
}
