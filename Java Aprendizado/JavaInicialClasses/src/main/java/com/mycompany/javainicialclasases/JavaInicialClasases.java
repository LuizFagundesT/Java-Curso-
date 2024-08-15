/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javainicialclasases;

/**
 *
 * @author Luiz
 */
public class JavaInicialClasases {

    public static void main(String[] args) {
        System.out.println("ta rolando o codigo !");
        
        
        int numero= 10;//neste caso é possivel alterar 
        final int numero2 = 15;//neste caso o prefixo final faz com que o numero seja fixo como uma constante !
        
        
        String primeiroNome = "Luiz Gustavo";
        String segundoNome = "Fagundes Teixeira";
        boolean verdadeira = true;
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    //criando o metodo que junta nomes 
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
