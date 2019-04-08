/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

/**
 *
 * @author THATA
 */
public class Utilitaria {
    /**
     * Metodo que genera el numero aleatorio
     * @return int retorna el numero obtenido
     */
    public static int random(){
        int numero = (int) (Math.random() * 3) + 1;
        return numero;
    }
}
