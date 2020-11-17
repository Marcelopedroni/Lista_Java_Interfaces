package exercicio1listainterface;

public class Circulo extends Forma {
    private double raio;
    private double area;
    private double perimetro;
    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularPerimetro (){
        this.perimetro = this.getRaio()*2*3.14;
        return perimetro;
    }
    
    @Override
    public double calcularArea(){
       this.area = this.getRaio()*this.getRaio()*3.14;
       return this.area;
    }
    
}
