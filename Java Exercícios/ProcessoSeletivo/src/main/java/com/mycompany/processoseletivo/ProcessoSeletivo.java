package com.mycompany.processoseletivo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Luiz
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = {
            "ANA",
            "CALOS",
            "FERNANDA",
            "GABRIEL",
            "JULIANA",
            "LUCAS",
            "MARIANA",
            "PEDRO",
            "ROBERTA",
            "THIAGO"
        };
        
        String[] aprovados = selecaoCandidatos(candidatos);

        // Exibindo a lista de aprovados
        System.out.println("Candidatos aprovados:");
        for (String aprovado : aprovados) {
            if (aprovado != null) { // Verifica se o candidato não é nulo
                System.out.println(aprovado);
            }
        }
    }

    // Criando seleção de candidatos com base no salário
    static String[] selecaoCandidatos(String[] candidatos) {
        String[] aprovados = new String[5];
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        // A verificação do while deve lidar com o limite de candidatos que podem ser selecionados
        // e também o meu candidato atual não pode ser algum que não estiver na lista
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                // Adiciona o candidato aprovado e incrementa o número de candidatos selecionados
                aprovados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            
            // Passa para o próximo candidato da lista
            candidatoAtual++;
        }
        
        return aprovados;
    }
    
    // Criando um método que sempre me entrega um valor aleatório entre um determinado intervalo
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
    
    // Método para analisar o candidato
    static void analisaCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
       
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
