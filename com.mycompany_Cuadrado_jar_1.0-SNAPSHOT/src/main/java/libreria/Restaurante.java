/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author carre
 */
public class Restaurante {
    private static String nombre;
    private static int numMesas = 0;
    private static Cuadrado[] mesas = new Cuadrado[10];
    
    public static void main(String args[]){
        System.out.println(altaAlb(10));
        System.out.println(altaAlb(3));
        System.out.println(totalArea());
        System.out.println(totalPerimetro());
        
    }
    
    public static boolean altaMesa(Cuadrado este){
        if(numMesas < 11){
            mesas[numMesas - 1] = este;
            numMesas ++;
            return true;
        }
        return false;
    }
    
    public static boolean altaAlb(double lado){
        if(numMesas < 11){
            mesas[numMesas - 1] = new Cuadrado(lado);
            numMesas ++;
            return true;
        }
        return false;
    }
    
    public static double totalArea(){
        double resp = 0;
        for(int i = 0; i < numMesas - 1; i ++){
            resp += mesas[i].calculaArea();
        }
        return resp;
    }
    
    public static double totalPerimetro(){
        double resp = 0;
        for(int i = 0; i < numMesas - 1; i ++){
            resp += mesas[i].calculaPerimetro();
        }
        return resp;
    }
    
}
