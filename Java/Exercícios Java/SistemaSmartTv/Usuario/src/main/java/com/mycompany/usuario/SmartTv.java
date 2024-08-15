/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

/**
 *
 * @author Luiz
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    
    //NESTE MOMENTO VAMOS CRIAR ALGUNS METODOS PARA MANIPULAR A TV 
    //verificador de status da televisão 
    public void status(){
        System.out.println("Status da TV: ");
        System.out.println("A televisao esta ligada?"+ ligada);
        System.out.println("Canal da TV:"+canal);
        System.out.println("Volume da TV:"+ volume);
    }
    //ligando e desligando a tv 
    public void ligar(){
        ligada = true;
        System.out.println("Ligando a TV...");
    }
    
    public void desligar(){
        ligada = false;
        System.out.println("Desligando a TV...");
    }
    
    //alterando o volume da tv 
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para :"+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Reduzindo o volume para:"+volume);
    }
    //alterando os canais 
    public void aumentarCanal(){
        canal++;
        System.out.println("Pulando par ao canal:"+canal);
    }
    public void diminuirCnal(){
        canal--;
        System.out.println("Reduzindo para o canal:"+canal);
    }
    //pegando um canal especifico 
    
    public void mudarCanal (int novoCanal){
        canal=novoCanal;
        
    }
}
