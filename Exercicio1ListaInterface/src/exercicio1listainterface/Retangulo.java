package exercicio1listainterface;

public class Retangulo extends Forma{
    
    private double area;
    private double perimetro;
    private double base;
    private double altura;

    public Retangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularPerimetro (){
        this.perimetro = this.getBase()*2 + this.getAltura()*2;
        return perimetro;
    }
    
    @Override
    public double calcularArea(){
       this.area = this.getBase()*this.getAltura();
       return this.area;
    }
}
