package DesafioFinal.Principal;

import DesafioFinal.Modelos.Musica;
import DesafioFinal.Modelos.Podcast;
import DesafioFinal.Modelos.Preferidas;

public class main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("333");
        musica.setCantor("Matue");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }


        Podcast podcast = new Podcast();
        podcast.setTitulo("Podpah");
        podcast.setApresentador("Igão");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();

        preferidas.inclui(podcast);
        preferidas.inclui(musica);

    }
}
