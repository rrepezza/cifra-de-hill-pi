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
public class Matriz {
    
    //Modulo Padrao
    int modulo = 256;
    
    //Matriz Chave Padrão
    int[][] chave = {{3,3}, {2,5}};
    
    //Matriz Chave Inversa do Modulo Padrão
    int[][] chaveInversa = {{29,85},{142,171}};
    
    //Método que retorna se a matriz é inversível ou não, através do determinante
    public boolean isInversivel(int determinante){
        return determinante != 0;
    }
    
    //Método que calcula o determinante da matriz
    public int calculaDeterminante(int[][] matriz){
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }
     
    //Método que calcula a matriz inversa da matriz
    public int[][] calculaInversa(int[][] matriz){
        int[][] inversa = new int[2][2];
        inversa[0][0] = matriz[1][1];
        inversa[0][1] = matriz[0][1] * -1;
        inversa[1][0] = matriz[1][0] * -1;
        inversa[1][1] = matriz[0][0];
        return inversa;
    }
    
    //Método que multiplica um par de inteiros por uma matriz qualquer
    //utilizando o modulo desejado
    public int[] parPorMatriz(int el1, int el2, int[][] matriz, int modulo){
        int[] parMultiplicado = new int[2];
        parMultiplicado[0] = ((el1 * matriz[0][0]) + (el2 * matriz[1][0])) % modulo;
        parMultiplicado[1] = ((el1 * matriz[0][1]) + (el2 * matriz[1][1])) % modulo;
        return parMultiplicado;
    }
}
