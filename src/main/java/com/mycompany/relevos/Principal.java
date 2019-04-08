/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

import static com.mycompany.relevos.Atleta.tiempoColombia;
import static com.mycompany.relevos.Atleta.tiempoEEUU;
import static com.mycompany.relevos.Atleta.tiempoJamaica;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda Bernal
 */
public class Principal {

    static int starJamaica;
    static int starColmbia;
    static int starEEUU;
    static int tiempoJamaica;
    static int tiempoColombia;
    static int tiempoEEUU;
    /*creo los 3 equipos desde la distancia 0 a la 100 */
    Equipo equipo1 = new Equipo("JAMAICA", 0, 100);
    Equipo equipo2 = new Equipo("COLOMBIA", 0, 100);
    Equipo equipo3 = new Equipo("EEUU", 0, 100);
    /*creo los 3 corredores por equipo siendo 33 la segunda posicion de los corredores dos de cada equipo 
    y 66 la tercera posicion de los terceros corredores de cada equipo*/
     /**
     * Objeto que contiene la informacion del primer atleta del primer equipo.
     * @param Atleta
     */
    Atleta atleta1 = new Atleta(equipo1, 0, 33);
    /**
     * Objeto que contiene la informacion del segundo atleta del segundo equipo.
     * @param Atleta
     */
    Atleta atleta2 = new Atleta(equipo2, 0, 33);
    /**
     * Objeto que contiene la informacion del tercer atleta del tercer equipo.
     * @param Atleta
     */
    Atleta atleta3 = new Atleta(equipo3, 0, 33);
    /**
     * Objeto que contiene la informacion del segundo atleta del primer equipo.
     * @param Atleta
     */
    Atleta atleta4 = new Atleta(equipo1, 33, 66);
    /**
     * Objeto que contiene la informacion del segundo atleta del segundo equipo.
     * @param Atleta
     */
    Atleta atleta5 = new Atleta(equipo2, 33, 66);
    /**
     * Objeto que contiene la informacion del segundo atleta del tercer equipo.
     * @param Atleta
     */
    Atleta atleta6 = new Atleta(equipo3, 33, 66);
     /**
     * Objeto que contiene la informacion del tercer atleta del primer equipo.
     * @param Atleta
     */
    Atleta atleta7 = new Atleta(equipo1, 66, 100);
     /**
     * Objeto que contiene la informacion del tercer atleta del segundo equipo.
     * @param Atleta
     */
    Atleta atleta8 = new Atleta(equipo2, 66, 100);
     /**
     * Objeto que contiene la informacion del tercer atleta del tercer equipo.
     * @param Atleta
     */
    Atleta atleta9 = new Atleta(equipo3, 66, 100);
    
    public void iniciar(){
        atleta1.start ();

        atleta2.start ();

        atleta3.start ();

        atleta4.start ();

        atleta5.start ();

        atleta6.start ();

        atleta7.start ();

        atleta8.start ();

        atleta9.start ();
        
        
        
    }
    
}