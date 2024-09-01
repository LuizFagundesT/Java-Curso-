/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aboutme;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Luiz
 * A IDEIA POR TRAZ DO BLOCO TRY CATCH: em um bloco Try teremos a tentativa de realziarmos um bloco de código e caso 
 * apresente erro teremos no bloco Catch a melhor tyrattiva pra este problema.
 * 
 * EXECESSÕES IMPORTANTES
 * java.util.InputMismatchExceptions : quando queremos o cod não consegue transformar int em string ou vice versa
 * java.lang.NullPointerException : quando tentamos obter alguma informação de uma variável nula.
 * java.lang.ArithmeticExeception : quando tentamos dividir um valor por zero
 * java.sql.SQLException : quando existe algum erro relacionado a interaça
 */
public class AboutMe {

    public static void main(String[] args) {
        //criando scanner
        Scanner s = new Scanner(System.in);
        try{
        System.out.println("Digite seu nome:");
        String nome = s.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = s.next();
        System.out.println("Digite dua idade:");
        int idade = s.nextInt();
        System.out.println("Digite sua altura:");
        double altura = s.nextDouble();
        System.out.println("Ola, me chamo "+nome.toUpperCase()+" "+sobrenome.toUpperCase());
        System.out.println("Tenho "+idade+" anos e "+ altura +" de altura" );
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
        
    }
}
