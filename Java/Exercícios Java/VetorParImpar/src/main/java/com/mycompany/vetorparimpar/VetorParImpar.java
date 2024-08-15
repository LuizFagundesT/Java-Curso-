/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorparimpar;

import java.util.Scanner;

/**
 *
 * @author Luiz
 *  Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A.
 *  Crie um vetor ParImpar de 2 posições e armazene no índice 0 quantos elementos de A são
 *  par e no índice 1 quantos elementos de A são ímpar. Ao final, imprima o vetor ParImpar
 */
public class VetorParImpar {
    
    

    public static void main(String[] args) {
        int tamanhoVetor=10;
        int vetorA[]=new int[tamanhoVetor];
        int parImpar[]=new int[2];
        
        
        populaVetor(vetorA);
        classificaNumero(vetorA, parImpar);
        System.out.println("A somatoria dos valores pares sao:"+parImpar[0]);
        System.out.println("A somatoria dos valores impares sao:"+parImpar[1]);
        
        
    }
    
    public static void imprimeVetor (int vetor[] ) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            
        }
    }
    
    public static void populaVetor (int vetor[] ) {
        Scanner scanner = new Scanner(System.in); 
        
        
        for (int i = 0; i < vetor.length; i++) {
            int posicao=1+i;
            System.out.println("Digite o valor da posicao "+ posicao +":");
            vetor[i]= scanner.nextInt();
            
        }
    }
    
    public static void classificaNumero (int vetorA[],int vetorParImpar[]){
        int valPar=0,valImpar=0;
    
        for (int i = 0; i < vetorA.length; i++) {
            
            if(vetorA[i]%2==0){
                valPar ++;
            }else{
                valImpar ++;
            }
            
        }
        vetorParImpar[0]=valPar;
        vetorParImpar[1]=valImpar;
                
    }
    
}
