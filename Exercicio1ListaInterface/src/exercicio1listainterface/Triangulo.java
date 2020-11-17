package exercicio1listainterface;

import static java.lang.Math.sqrt;

public class Triangulo extends Forma{

    private double area;
    private double perimetro;
    private double lado;

    public Triangulo() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
     
    @Override
    public double calcularPerimetro (){
        this.perimetro = this.getLado()*3;
        return perimetro;
    }
    
    @Override
    public double calcularArea(){
       this.area = (this.getLado()*this.getLado()*sqrt(3))/4;
       return this.area;
    }
}