package exercicio4listainterface;

public abstract class Forma implements AreaCalculavel, Comparable<Forma> {

    private double lado;
    private double base;
    private double altura;
    private float raio;

    public int compareTo(Forma temp) {

        if (this.calcularArea() > temp.calcularArea()) {
            return 1;
        } else if (this.calcularArea() < temp.calcularArea()) {
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

    @Override
    public String toString() {
        return "Forma{" + " Area = " + calcularArea() + '}';
    }
    
    

}
