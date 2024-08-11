/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usuario;

/**
 *
 * @author Luiz
 */
public class Usuario {

    public static void main(String[] args) {
        /*Neste momento eu acabei de criar um novo objeto com os atributos da classe SmartTv */
        SmartTv smartTv = new SmartTv();
        //alterando o volume da Tv
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        //vamos ligar a tv 
        smartTv.ligar();
        //vamos desligar a tv 
        smartTv.desligar();
        
        //alterando o canal 
        smartTv.aumentarCanal();
        
        smartTv.diminuirCnal();
        //verficando status da TV 
        smartTv.status();
        //colocando o canal de minha preferencia
        smartTv.mudarCanal(12);
        //verficando status da TV 
        smartTv.status();
        
        
    }
}
