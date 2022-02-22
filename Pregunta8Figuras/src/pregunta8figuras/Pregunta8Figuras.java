/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta8figuras;

/**
 *
 * @author carre
 */
public class Pregunta8Figuras {
    public static final int MAX_FIGURAS = 20;
    private FigGeometrica[] figuras;
    private int cuantos;

    public Pregunta8Figuras() {
        figuras = new FigGeometrica[MAX_FIGURAS];
    }

    public Pregunta8Figuras(FigGeometrica[] figuras, int cuantos) {
        this.figuras = figuras;
        this.cuantos = cuantos;
    }
    
    public boolean altaFigura(FigGeometrica esta){
        if (cuantos < MAX_FIGURAS){
            figuras[cuantos] = esta;
            cuantos ++;
            return true;
        }
        return false;
    }
    
    public boolean altaFigura(double lado, boolean esCuadrado){
        if (cuantos < MAX_FIGURAS){
            if(esCuadrado){
                figuras[cuantos] = new Cuadrado(lado);
            }else
                figuras[cuantos] = new Circulo(lado);
            cuantos ++;
            return true;
        }
        return false;
    }
    
    public boolean altaFigura(double lado1, double lado2){
        if (cuantos < MAX_FIGURAS){
            figuras[cuantos] = new Rectangulo(lado1, lado2);
            cuantos ++;
            return true;
        }
        return false;
    }
    
    public boolean altaFigura(double lado1, double lado2, double lado3, double angulo){
        if (cuantos < MAX_FIGURAS){
            figuras[cuantos] = new Triangulo(lado1, lado2, lado3, angulo);
            cuantos ++;
            return true;
        }
        return false;
    }
    
    public String calcAreas(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cuantos; i++){
            sb.append(figuras[i].getClass().getSimpleName() + figuras[i].calculaArea());
        }
        return sb.toString();
    }
    
    public String circuloGrande(){
        if(cuantos == 0){
            return "no hay elementos";
        }
        int pos = 0;
        while(pos < cuantos || figuras[pos].getClass().getSimpleName().equals("Circulo")){
            pos ++;
        }
        if(pos > cuantos){
            return "no hay circulos";
        }
        for(int i = pos; i < cuantos; i++){
            if(figuras[i].getClass().getSimpleName().equals("Circulo")){
                if(figuras[pos].calculaArea() < figuras[i].calculaArea()){
                    pos = i;
                }
            }
        }
        return pos + figuras[pos].calculaArea()+ "";
    }
    
    public int cuantosCuadrados(){
        int cuantosCua = 0;
        for(int i = 0; i < cuantos; i++){
            if(figuras[i].getClass().getSimpleName().equals("Cuadrado"))
                cuantosCua++;
        }
        return cuantosCua;
    }
    
    public void eliminarEquilateros(){
        for(int i = 0; i < cuantos; i++){
            if(figuras[i].getClass().getSimpleName().equals("Triangulo")){
                if(((Triangulo)figuras[i]).esEquilatero()){
                    figuras[i] = figuras[cuantos];
                    cuantos --;
                    i --;
                }
            }
        }
    }
    
}
