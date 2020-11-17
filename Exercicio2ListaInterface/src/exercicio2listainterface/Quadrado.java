package exercicio2listainterface;

public class Quadrado extends Forma {
    
    private double lado;
    private double area;

    public Quadrado() {
    }

    public Quadrado(double lado) {
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
       this.area = this.getLado()*this.getLado();
       return this.area;
    }
}
