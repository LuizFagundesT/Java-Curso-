package com.mycompany.invertestring;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        // Criando o scanner
        Scanner scanner = new Scanner(System.in);
        String s;

        System.out.println("Digite a string que deseja inverter:");
        s = scanner.nextLine();

        // Convertendo a string em um array de caracteres usando toCharArray()
        char[] array = s.toCharArray();
        char[] arrayInvertido = new char[array.length];

        // Invertendo o array para que eu precise somente inverter cada elemento separadamente assim que encontrar o espaço
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrayInvertido[j] = array[i];
        }

        // Imprimindo o array invertido somente para melhor visualização
        System.out.println("Array invertido:");
        System.out.println(new String(arrayInvertido));

        // Imprimindo as palavras na ordem invertida
        System.out.println("Palavras invertidas:");
        for (int i = 0; i < arrayInvertido.length; i++) {
            //no momento que o meu for achar um caracter de espaço ele vai ler ao contrario ate o inicio de onde começou a ler
            //incialmente ele vai ler ate a posição 0 e após ele vai ler somente ate o espaço, para isso é necessario o espaço
            if (arrayInvertido[i] == ' ') {
                // assim que encontrar o espaço, imprime a palavra anterior a ele
                int j = i - 1;
                //condição de parada sera se achar o 0 da primeira palavra ou então o espaço entre as palavras
                while (j >= 0 && arrayInvertido[j] != ' ') {
                    System.out.print(arrayInvertido[j]);
                    j--;
                }
                System.out.print(" ");
            }
        }

        // Imprimir a última palavra se não houver espaço final
        /*
            *neste caso eu preciso dizer que minha posição anterior ao \0 ou seja arrayInvertido.length - 1
            *sendo assim se não tiver um espaço nesta minha ultima posição do vetor ele vai entender e ler ate encontrar o espaço
            *que vira logo após a penultima palavra, logo ele vai imprimir a ultima !
        */
        int i = arrayInvertido.length - 1;
        while (i >= 0 && arrayInvertido[i] != ' ') {
            System.out.print(arrayInvertido[i]);
            i--;
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
