package exercicio1listainterface;

public class Exercicio1ListaInterface {
    
    
    public static void main(String[] args) {

    Quadrado q = new Quadrado();
    q.setLado(2.5);
    System.out.println("Área do Quadrado: " + q.calcularArea());
    System.out.println("Perímetro do Quadrado: " + q.calcularPerimetro());
    System.out.println("============================");
     
    Circulo c = new Circulo();
    c.setRaio(3);
    System.out.println("Área do Círculo: " + c.calcularArea());
    System.out.println("Perímetro do Círculo: " + c.calcularPerimetro());
    System.out.println("============================");
    
    Retangulo r = new Retangulo();
    r.setAltura(4);
    r.setBase(2);
    System.out.println("Área do Retângulo: " + r.calcularArea());
    System.out.println("Perímetro do Retângulo: " + r.calcularPerimetro());
    System.out.println("============================");
    
    
    Triangulo t = new Triangulo();
    t.setLado(5.5);
    System.out.println("Área do Triângulo: " + t.calcularArea());
    System.out.println("Perímetro do Triângulo: " + t.calcularPerimetro());
    System.out.println("============================");
    }
    
}
