package exercicio2listainterface;

import static java.lang.Math.sqrt;

public class Triangulo extends Forma{

    private double area;
    private double lado;

    public Triangulo(double lado) {
        super(lado);
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
         
    @Override
    public double calcularArea(){
       this.area = (this.getLado()*this.getLado()*sqrt(3))/4;
       return this.area;
    }
}