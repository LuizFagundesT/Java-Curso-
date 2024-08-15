/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.terminaleargumentosjava;

/**
 *
 * @author Luiz
 */
public class TerminalEArgumentosJava {

    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double  altura = Double.valueOf(args[3]);
        
        
        System.out.println("Ola me chamo"+nome+" "+sobrenome);
        System.out.println("Tenho"+idade+"anos");
        System.out.println("Minha altura é"+altura+"cm");
        
        
        
    }
}
