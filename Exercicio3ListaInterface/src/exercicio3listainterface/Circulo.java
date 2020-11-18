package exercicio3listainterface;

public class Circulo extends Forma {
    private float raio;
    private double area;

    public Circulo(float raio) {
        super(raio);
    }
   

    public double getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
       this.area = this.getRaio()*this.getRaio()*3.14;
       return this.area;
    }
    
}
