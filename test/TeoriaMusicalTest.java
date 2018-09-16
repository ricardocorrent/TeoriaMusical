/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controllers.GeradorDeEscalaMaior;
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
        
        String escala = "C - D - E - F - G - A - B - C";
        String strDo = "";
        
        for (Nota n : escalaDo) {
            strDo = strDo + n.simbolo() + " - ";
        }
        strDo = strDo + escalaDo.get(0).simbolo();      
        assertEquals(strDo, escala);
    }
    
    @Test
    public void testCriarEscalaHarmonicaDoMaior() {
        List<Nota> escalaDo = gerador.gerarEscala(notasMusicais.pegaANota(2));
        
        String escala = "C# - D# - F - F# - G# - A# - C - C#";
        String strDo = "";
        
        for (Nota n : escalaDo) {
            strDo = strDo + n.simbolo() + " - ";
        }
        strDo = strDo + escalaDo.get(0).simbolo();      
        assertEquals(strDo, escala);
    }
    
    @Test
    public void testCriarEscalaHarmonicaRe() {
        List<Nota> escalaRe = gerador.gerarEscala(notasMusicais.pegaANota(3));
        
        for (Nota n : escalaRe) {
            
        }
    }
    
    @Test
    public void testCriarEscalaHarmonicaReMaior() {
        List<Nota> escalaReMaior = gerador.gerarEscala(notasMusicais.pegaANota(4));
        
        for (Nota n : escalaReMaior) {
            
        }
    }
    
    @Test
    public void testVerificarCampoHarmonicoDo(){        
        List<Integer> musica = Arrays.asList(1, 3, 5, 6, 8, 10, 12, 13);        
        assertEquals(true, verificarCampo.isAfinado(musica).equals(1));
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
