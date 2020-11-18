package exercicio3listainterface;

public class Retangulo extends Forma{
    
    private double area;
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(base, altura);
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
    public double calcularArea(){
       this.area = this.getBase()*this.getAltura();
       return this.area;
    }
}
