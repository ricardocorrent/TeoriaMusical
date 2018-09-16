package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Nota;
import models.NotasMusicais;

public class GeradorDeEscalaMaior {

    NotasMusicais notasMusicais = new NotasMusicais();

    public List<Nota> gerarEscala(Nota nota) {
        List<Nota> escala = new ArrayList<Nota>();
        int[] regra = {2, 2, 1, 2, 2, 2};

        escala.add(nota);
        Nota proximaNota = nota;
        
        for (int r : regra) {
            if (r == 2) {
                proximaNota = notasMusicais.pegaANota(proximaNota.proximoTom());
            } else {
                proximaNota = notasMusicais.pegaANota(proximaNota.proximoMeioTom());
            }
            escala.add(proximaNota);
        }
        return escala;
    }
    
    public List<Integer> gerarEscalaComInteger(List<Nota> escala){
        List<Integer> escalaComInteger = new ArrayList<Integer>();
        
        for(Nota nota: escala){
            escalaComInteger.add(nota.tom());
        }
        return escalaComInteger;
    }

}
