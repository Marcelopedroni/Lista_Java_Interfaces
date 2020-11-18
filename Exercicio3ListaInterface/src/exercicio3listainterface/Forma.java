package exercicio3listainterface;

public abstract class Forma implements AreaCalculavel , Comparable{

    private double lado;
    private double base;
    private double altura;
    private float raio;

    
    @Override
    public int compareTo(Object temp){
        Forma other = (Forma) temp;
        if (calcularArea() > other.calcularArea()){
            return 1;
        } else if (calcularArea() < other.calcularArea()){
            return -1;
        } else {
            return 0;
        }
    }
    
    
    
    public Forma() {
    }

    public Forma(float raio) {
        this.setRaio(raio);
    }

    public Forma(double lado) {
        this.setLado(lado);
    }

    public Forma(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }    

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    
    
}
