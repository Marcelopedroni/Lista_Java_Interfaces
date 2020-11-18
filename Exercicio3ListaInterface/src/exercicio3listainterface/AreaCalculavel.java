package exercicio3listainterface;

public interface AreaCalculavel {
    
    default double calcularArea(){
        return 0;
    }
}
