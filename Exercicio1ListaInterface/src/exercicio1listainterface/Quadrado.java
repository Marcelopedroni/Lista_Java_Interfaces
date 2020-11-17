package exercicio1listainterface;

public class Quadrado extends Forma {
    
    private double lado;
    private double perimetro;
    private double area;

    public Quadrado() {
    }
  
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro (){
        this.perimetro = this.getLado()*4;
        return perimetro;
    }
    
    @Override
    public double calcularArea(){
       this.area = this.getLado()*this.getLado();
       return this.area;
    }
}
