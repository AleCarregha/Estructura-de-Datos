/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inviertecad;
import pilas.PilaArreglo;

/**
 *
 * @author carre
 */
public class InvierteCad {
    private String cadenaInicial, cadenaInvertida;

    public InvierteCad(String cadenaInicial) {
        this.cadenaInicial = cadenaInicial;
        this.cadenaInvertida = "";
    }
    
    public String invertidor(){
        PilaArreglo pila = new PilaArreglo();
        for(int i = 0; i < cadenaInicial.length(); i++){
            pila.push(cadenaInicial.charAt(i));
        }
        while(!pila.isEmpty()){
            cadenaInvertida += pila.peek();
            pila.pop();
        }
        return cadenaInvertida;
    }
    
}
