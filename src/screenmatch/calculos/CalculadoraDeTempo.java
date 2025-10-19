package screenmatch.calculos;

import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempototal;

    public int getTempototal() {
        return tempototal;
    }

//    public void adicionaTempoTotal (Filme f){
//        tempototal += f.getDuracaoEmMinutos();
//    }
//
//    public void adicionaTempoTotal (Serie s){
//        tempototal += s.getDuracaoEmMinutos();
//    }

    public void adicionaTempoTotal (Titulo titulo){
        tempototal += titulo.getDuracaoEmMinutos();
    }
}
