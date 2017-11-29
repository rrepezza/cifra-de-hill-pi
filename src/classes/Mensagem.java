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
public class Mensagem {

    
    //Método que transforma a mensagem digitada em um array de char
    public char[] stringParaChars(String m){
        //Caso o tamanho da string não seja um número par, adiciona o espaço
        //no final da string
        if(m.length() % 2 != 0){
            m += " ";
        }
        
        char[] caracteres = m.toCharArray();
        return caracteres;
    }
    
    //Método que recebe um array de char e cria um array de inteiros 
    //correspondentes de acordo com os caracteres da tabela ascii
    public int[] charsParaInteiros(char[] chars){
        int[] inteiros = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            inteiros[i] = (int) chars[i];
        }
        return inteiros;
    }
    
    //Método que recebe um array de char e cria um array de inteiros 
    //correspondentes de acordo com os caracteres da tabela ascii
    public char[] inteirosParaChars(int[] inteiros){
        char[] chars = new char[inteiros.length];
        for (int i = 0; i < inteiros.length; i++) {
            chars[i] = (char) inteiros[i];
        }
        return chars;
    }
}
