package models;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {

    private static Map<Integer, Nota> notasComNumeros = (Map<Integer, Nota>) new HashMap<Integer, Nota>();
    private static Map<String, Nota> notasComSimbolos = (Map<String, Nota>) new HashMap<String, Nota>();
    
    static {
    	notasComSimbolos.put("do", new Do());
    	notasComSimbolos.put("doMaior", new DoMaior());
    	notasComSimbolos.put("re", new Re());
    	notasComSimbolos.put("reMaior", new ReMaior());
    	notasComSimbolos.put("mi", new Mi());
    	notasComSimbolos.put("fa", new Fa());
    	notasComSimbolos.put("faMaior", new FaMaior());
    	notasComSimbolos.put("sol", new Sol());
    	notasComSimbolos.put("solMaior", new SolMaior());
    	notasComSimbolos.put("la", new La());
    	notasComSimbolos.put("laMaior", new LaMaior());
    	notasComSimbolos.put("si", new Si());
    }
    
    static {
        notasComNumeros.put(1, new Do(pega("doMaior"), pega("re")));
        notasComNumeros.put(2, new DoMaior(pega("re"), pega("reMaior")));
        notasComNumeros.put(3, new Re(pega("reMaior"), pega("mi")));
        notasComNumeros.put(4, new ReMaior(pega("mi"), pega("fa")));
        notasComNumeros.put(5, new Mi(pega("fa"), pega("faMaior")));
        notasComNumeros.put(6, new Fa(pega("faMaior"), pega("sol")));
        notasComNumeros.put(7, new FaMaior(pega("sol"), pega("solMaior")));
        notasComNumeros.put(8, new Sol(pega("solMaior"), pega("la")));
        notasComNumeros.put(9, new SolMaior(pega("la"), pega("laMaior")));
        notasComNumeros.put(10, new La(pega("laMaior"), pega("si")));
        notasComNumeros.put(11, new LaMaior(pega("si"), pega("do")));
        notasComNumeros.put(12, new Si(pega("do"), pega("doMaior")));
    } 
    

    public static Nota pega(String nome) {
        return notasComSimbolos.get(nome);
    }
    public Nota pegaANota(Integer tom) {
    	return notasComNumeros.get(tom);
    }

}
