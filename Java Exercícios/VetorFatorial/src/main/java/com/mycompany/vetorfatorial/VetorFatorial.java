/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorfatorial;

import java.util.Scanner;

/**
 *
 * @author Luiz
 * Faça um programa que leia um vetor A com 15 elementos inteiros. Em seguida, construa
 * um vetor B do mesmo tipo, em que cada elemento de B deva ser o resultado do fatorial
 * correspondente de cada elemento de A. Imprima na tela os vetores A e B.
 */
public class VetorFatorial {
    
    
    
    //MÉTODOS
    public static void main(String[] args) {
        //VARIÁVEIS 
        int tamanhoDoVetor=5;
        int vetorA[]= new int[tamanhoDoVetor];
        int vetorB[]= new int[tamanhoDoVetor];
        
        //lendo valores e populando o vetor 
        populaVetor(vetorA);
        //fazendo o fatorial das posições
        fatorialDosElementosVetor(vetorA, vetorB);
        //imprimindo o vetor 
        imprimeVetor(vetorB);
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
    
    public static void fatorialDosElementosVetor (int vetorA[], int vetorB[]) {
        
        for (int i = 0; i < vetorA.length; i++) {
            int valorA = vetorA[i];
            int acumula = 1;
            for (int j = 1; j <= valorA ; j++) {
                if(valorA==0){
                    acumula = 1;
                }
                acumula = j* acumula;
                
            }
           vetorB[i] = acumula;
        }
    }
}
