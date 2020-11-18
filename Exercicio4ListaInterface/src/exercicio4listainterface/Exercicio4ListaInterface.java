package exercicio4listainterface;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio4ListaInterface {

    public static void main(String[] args) {
        
        ArrayList<Forma>listaDeComodos = new ArrayList<>();
                
                
        Forma f1 = new Quadrado(4);
        Forma f2 = new Retangulo(2, 10);
        Forma f3 = new Circulo(4);
        Forma f4 = new Triangulo(9);
        
        listaDeComodos.add(f1);
        listaDeComodos.add(f2);
        listaDeComodos.add(f3);
        listaDeComodos.add(f4);
        
        Collections.sort(listaDeComodos);

        for (Forma f: listaDeComodos){
            System.out.println(f.toString());
        }
        
    }

}
