package exercicio3listainterface;

public class Exercicio3ListaInterface {

    public static void main(String[] args) {

            Forma f1 = new Quadrado(4);
            Forma f2 = new Retangulo(2,10);
            
            System.out.println("Comparando os cômodos: " + f1.compareTo(f2));
            int result = f1.compareTo(f2);
            
            if (result > 0) {
                System.out.println("O cômodo f1 é maior que f2 ");
                System.out.println("Área f1: " + f1.calcularArea());
                System.out.println("Área f2: " + f2.calcularArea());
            }
            
            else if (result < 0) {
                System.out.println("O cômodo f2 é maior que f1 ");
                System.out.println("Área f2: " + f2.calcularArea());
                System.out.println("Área f1: " + f1.calcularArea());
            } else {
                System.out.println("Ambos os cômodos tem a mesma área!");
            }
    }
    
}
