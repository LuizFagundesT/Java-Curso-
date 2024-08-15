/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contaterminal;

import java.util.Scanner;

/**
 *
 * @author Luiz
 * 
 * TODO: Obter informações de uma conta bancária através de atributos de uma classe e exibir estes dados 
 */
public class ContaTerminal {
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta:");
        conta.titularDaConta= s.nextLine();
        System.out.println("Digite o numero da conta: ");
        conta.numeroDaConta= s.nextLine();
        System.out.println("Digite o valor da conta:");
        conta.saldo= s.nextFloat();
        
        System.out.println("Dados da conta:\nNome de Titular:"+conta.titularDaConta+"\nNumero da Conta:"+conta.numeroDaConta+"\nSaldo em conta:"+conta.saldo);
                
    }
}
