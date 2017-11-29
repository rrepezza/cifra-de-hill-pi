/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author rodolpho.repezza
 */
public class Cifra {
    
    public String encriptar(String s){
        Mensagem msg = new Mensagem();
        char[] chars = msg.stringParaChars(s);
        int[] inteiros = msg.charsParaInteiros(chars);
        Matriz mt = new Matriz();
        int[] convertidos = new int[inteiros.length];
        for (int i = 0; i < inteiros.length; i+=2) {
            int e1 = inteiros[i];
            int e2 = inteiros[i+1];
            int[] newP = mt.parPorMatriz(e1, e2, mt.chave, mt.modulo);
            convertidos[i] = newP[0];
            convertidos[1 + i] = newP[1];
        }
        char[] caracteresCriptografados = msg.inteirosParaChars(convertidos);
        String encrypted = "";
        for (int i = 0; i < caracteresCriptografados.length; i++) {
            encrypted += caracteresCriptografados[i];
        }
        return encrypted;
    }
    
    public String decriptar(String s){
        Mensagem msg = new Mensagem();
        char[] chars = msg.stringParaChars(s);
        int[] inteiros = msg.charsParaInteiros(chars);
        Matriz mt = new Matriz();
        int[] convertidos = new int[inteiros.length];
        for (int i = 0; i < inteiros.length; i+=2) {
            int e1 = inteiros[i];
            int e2 = inteiros[i+1];
            int[] newP = mt.parPorMatriz(e1, e2, mt.chaveInversa, mt.modulo);
            convertidos[i] = newP[0];
            convertidos[1 + i] = newP[1];
        }
        char[] caracteresCriptografados = msg.inteirosParaChars(convertidos);
        String decrypted = "";
        for (int i = 0; i < caracteresCriptografados.length; i++) {
            decrypted += caracteresCriptografados[i];
        }
        return decrypted;
    }
}
