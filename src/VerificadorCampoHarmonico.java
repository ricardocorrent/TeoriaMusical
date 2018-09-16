
import controllers.GeradorDeEscalaMaior;
import java.util.ArrayList;
import java.util.List;
import models.Nota;
import models.NotasMusicais;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricardocorrent
 */
class VerificadorCampoHarmonico {

    GeradorDeEscalaMaior geradorDeEscala = new GeradorDeEscalaMaior();
    NotasMusicais notasMusicais = new NotasMusicais();

    private List<Integer> pegarNotasBasicas(List<Integer> musica) {
        List<Integer> novaMusica = new ArrayList<>();
        for (int m : musica) {
            if (m > 12) {
                m = pegaNotaBasica(m);
            }
            novaMusica.add(m);
        }
        return novaMusica;
    }

    Integer isAfinado(List<Integer> musica) {
        
        if(!isValidarMusica(musica)){
            return -1;
        }      
                
        List<Integer> musicaBasica = pegarNotasBasicas(musica);
        
        for (int i = 1; i < 13; i++) {
            List<Nota> escalaComNota = geradorDeEscala.gerarEscala(notasMusicais.pegaANota(i));
            List<Integer> escalaComInteger = geradorDeEscala.gerarEscalaComInteger(escalaComNota);

            int afinado = musicaBasica.size();
            
            for(int m: musicaBasica){
                for(int e: escalaComInteger){
                    if(m == e){
                        afinado--;                        
                    }
                }
            }
            if(afinado == 0){
                return escalaComInteger.get(0);
            }
        }
        return 0;
    }
    
    public boolean isValidarMusica(List<Integer> musica){
        if(musica.size() > 105){
            return false;
        }
                
        for(int i: musica){
            if(i > 61){
                return false;
            }
        }
        
        for(int i: musica){
            if(i < 1){
                return false;
            }
        }
        return true;
    }

    private int pegaNotaBasica(int m) {
        while (m > 12) {
            m -= 12;
        }
        return m;
    }
}
