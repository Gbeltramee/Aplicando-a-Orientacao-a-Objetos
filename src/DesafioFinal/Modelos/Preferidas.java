package DesafioFinal.Modelos;

public class Preferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() > 9) {
            System.out.println(audio.getTitulo() + " é muito curtido!");
        } else {
            System.out.println("Ouça depois!");
        }
    }
}
