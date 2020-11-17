package exercicio1listainterface;

public interface AreaCalculavel {
    
    default double calcularArea(){
        return 0;
    }
}
