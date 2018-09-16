/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controllers.GeradorDeEscalaMaior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Nota;
import models.NotasMusicais;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ricardocorrent
 */
public class TeoriaMusicalTest {
    
    NotasMusicais notasMusicais = new NotasMusicais();
    GeradorDeEscalaMaior gerador = new GeradorDeEscalaMaior();
    VerificadorCampoHarmonico verificarCampo = new VerificadorCampoHarmonico();
    
    @Test
    public void testCriarMusicaComMaisDe105Notas(){
        List<Integer> musica = new ArrayList<Integer>();        
        
        for(int i = 1; i <= 106; i++){
            musica.add(i);
        }
        assertTrue(verificarCampo.isAfinado(musica).equals(-1));
    }
    
    @Test
    public void testCriarMusicaComNotaMusicalAcimaDe61(){
        List<Integer> musica = Arrays.asList(62);
        assertTrue(verificarCampo.isAfinado(musica).equals(-1));
    }
    
    @Test
    public void testCriarMusicaComNotaMusicalAbaixoDe1(){
        List<Integer> musica = Arrays.asList(0);
        assertTrue(verificarCampo.isAfinado(musica).equals(-1));
    }
    
    @Test
    public void testCriarNotaDo() {
        assertEquals(true, notasMusicais.pegaANota(1).simbolo().equals("C"));
    }

    @Test
    public void testCriarNotaDoMaior() {
        assertEquals(true, notasMusicais.pegaANota(2).simbolo().equals("C#"));
    }

    @Test
    public void testCriarNotaRe() {
        assertEquals(true, notasMusicais.pegaANota(3).simbolo().equals("D"));
    }

    @Test
    public void testCriarNotaReMaior() {
        assertEquals(true, notasMusicais.pegaANota(4).simbolo().equals("D#"));
    }
    
    @Test
    public void testCriarNotaMi() {
        assertEquals(true, notasMusicais.pegaANota(5).simbolo().equals("E"));
    }
    
    @Test
    public void testCriarNotaFa() {
        assertEquals(true, notasMusicais.pegaANota(6).simbolo().equals("F"));
    }
    
    @Test
    public void testCriarNotaFaMaior() {
        assertEquals(true, notasMusicais.pegaANota(7).simbolo().equals("F#"));
    }
    
    @Test
    public void testCriarNotaSol() {
        assertEquals(true, notasMusicais.pegaANota(8).simbolo().equals("G"));
    }
    
    @Test
    public void testCriarNotaSolMaior() {
        assertEquals(true, notasMusicais.pegaANota(9).simbolo().equals("G#"));
    }
    
    @Test
    public void testCriarNotaLa() {
        assertEquals(true, notasMusicais.pegaANota(10).simbolo().equals("A"));
    }
    
    @Test
    public void testCriarNotaLaMaior() {
        assertEquals(true, notasMusicais.pegaANota(11).simbolo().equals("A#"));
    }
    
    @Test
    public void testCriarNotaSi() {
        assertEquals(true, notasMusicais.pegaANota(12).simbolo().equals("B"));
    }

    @Test
    public void testCriarEscalaHarmonicaDo() {        
        List<Nota> escalaDo = gerador.gerarEscala(notasMusicais.pegaANota(1));
        
        String escalaOriginal = "C - D - E - F - G - A - B - C";
        String escalaGerada = "";
        
        for (Nota n : escalaDo) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";
        }
        escalaGerada = escalaGerada + escalaDo.get(0).simbolo();      
        assertEquals(escalaGerada, escalaOriginal);
    }
    
    @Test
    public void testCriarEscalaHarmonicaDoMaior() {
        List<Nota> escalaDoMaior = gerador.gerarEscala(notasMusicais.pegaANota(2));
        
        String escalaOriginal = "C# - D# - F - F# - G# - A# - C - C#";
        String escalaGerada = "";
        
        for (Nota n : escalaDoMaior) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";
        }
        escalaGerada = escalaGerada + escalaDoMaior.get(0).simbolo();      
        assertEquals(escalaGerada, escalaOriginal);
    }
    
    @Test
    public void testCriarEscalaHarmonicaRe() {
        List<Nota> escalaRe = gerador.gerarEscala(notasMusicais.pegaANota(3));
        
        String escalaOriginal = "D - E - F# - G - A - B - C# - D";
        String escalaGerada = "";
        
        for (Nota n : escalaRe) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";
        }
        escalaGerada = escalaGerada + escalaRe.get(0).simbolo();      
        assertEquals(escalaGerada, escalaOriginal);
    }
    
    @Test
    public void testCriarEscalaHarmonicaReMaior() {
        List<Nota> escalaReMaior = gerador.gerarEscala(notasMusicais.pegaANota(4));
        
        String escalaOriginal = "D# - F - G - G# - A# - C - D - D#";
        String escalaGerada = "";
        
        for (Nota n : escalaReMaior) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";
        }
        escalaGerada = escalaGerada + escalaReMaior.get(0).simbolo();      
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testCriarEscalaHarmonicaMi() {
        List<Nota> escalaMi = gerador.gerarEscala(notasMusicais.pegaANota(5));
        
        String escalaOriginal = "E - F# - G# - A - B - C# - D# - E";
        String escalaGerada = "";
        
        for (Nota n : escalaMi) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";
        }
        escalaGerada = escalaGerada + escalaMi.get(0).simbolo();      
        assertEquals(escalaGerada, escalaOriginal);
    }
    
    @Test
    public void testCriarEscalaHarmonicaFa() {
        List<Nota> escalaFa = gerador.gerarEscala(notasMusicais.pegaANota(6));
        
        String escalaOriginal = "F - G - A - A# - C - D - E - F";
        String escalaGerada = "";
        
        for (Nota n : escalaFa) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";            
        }
        escalaGerada = escalaGerada + escalaFa.get(0).simbolo();
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testCriarEscalaHarmonicaFaMaior() {
        List<Nota> escalaFaMaior = gerador.gerarEscala(notasMusicais.pegaANota(7));
        
        String escalaOriginal = "F# - G# - A# - B - C# - D# - F - F#";
        String escalaGerada = "";
        
        for (Nota n : escalaFaMaior) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";            
        }
        escalaGerada = escalaGerada + escalaFaMaior.get(0).simbolo();
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testCriarEscalaHarmonicaSol() {
        List<Nota> escalaSol = gerador.gerarEscala(notasMusicais.pegaANota(8));
        
        String escalaOriginal = "G - A - B - C - D - E - F# - G";
        String escalaGerada = "";
        
        for (Nota n : escalaSol) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";            
        }
        escalaGerada = escalaGerada + escalaSol.get(0).simbolo();
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testCriarEscalaHarmonicaSolMaior() {
        List<Nota> escalaSolMaior = gerador.gerarEscala(notasMusicais.pegaANota(9));
        
        String escalaOriginal = "G# - A# - C - C# - D# - F - G - G#";
        String escalaGerada = "";
        
        for (Nota n : escalaSolMaior) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";            
        }
        escalaGerada = escalaGerada + escalaSolMaior.get(0).simbolo();
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testCriarEscalaHarmonicaLa() {
        List<Nota> escalaLa = gerador.gerarEscala(notasMusicais.pegaANota(10));
        
        String escalaOriginal = "A - B - C# - D - E - F# - G# - A";
        String escalaGerada = "";
        
        for (Nota n : escalaLa) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";            
        }
        escalaGerada = escalaGerada + escalaLa.get(0).simbolo();
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testCriarEscalaHarmonicaLaMaior() {
        List<Nota> escalaLaMaior = gerador.gerarEscala(notasMusicais.pegaANota(11));
        
        String escalaOriginal = "A# - C - D - D# - F - G - A - A#";
        String escalaGerada = "";
        
        for (Nota n : escalaLaMaior) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";            
        }
        escalaGerada = escalaGerada + escalaLaMaior.get(0).simbolo();
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testCriarEscalaHarmonicaSi() {
        List<Nota> escalaSi = gerador.gerarEscala(notasMusicais.pegaANota(12));
        
        String escalaOriginal = "B - C# - D# - E - F# - G# - A# - B";
        String escalaGerada = "";
        
        for (Nota n : escalaSi) {
            escalaGerada = escalaGerada + n.simbolo() + " - ";            
        }
        escalaGerada = escalaGerada + escalaSi.get(0).simbolo();
        assertEquals(escalaOriginal, escalaGerada);
    }
    
    @Test
    public void testVerificarCampoHarmonicoDo(){        
        List<Integer> musica = Arrays.asList(
                1, 13, 25, 37, 49, 61, 
                3, 15, 27, 39, 51,
                5, 17, 29, 41, 53,
                6, 18, 30, 42, 54,
                8, 20, 32, 44, 56,
                10,22, 34, 46, 58,
                12,24, 36, 48, 60
        );        
        assertEquals(true, verificarCampo.isAfinado(musica).equals(1));
    }
    
    @Test
    public void testVerificarCampoHarmonicoDoMaior(){       
        List<Integer> musica = Arrays.asList(
                2, 14, 26, 38, 50,
                4, 16, 28, 40, 52,
                6, 18, 30, 42, 54,
                7, 19, 31, 43, 55,
                9, 21, 33, 45, 57,
                11,23, 35, 47, 59,
                1, 13, 25, 37, 49, 61
        );        
        assertEquals(true, verificarCampo.isAfinado(musica).equals(2));
    }
    
    @Test
    public void testVerificarCampoHarmonicoReMaior(){
        List<Integer> musica = Arrays.asList(8, 11, 21, 16, 11, 8, 27, 57, 27, 21);        
        assertEquals(true, verificarCampo.isAfinado(musica).equals(4));
    }
    
    @Test
    public void testVerificarCampoHarmonicoDesafinado(){
        List<Integer> musica = Arrays.asList(2, 2, 4, 3, 12, 12, 3);        
        assertEquals(true, verificarCampo.isAfinado(musica).equals(0));
    }

    
    
}
