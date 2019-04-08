/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;


import static com.mycompany.relevos.Principal.tiempoJamaica;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que maneja la informacion y el movimiento de los corredores de cada equipo.
 * @author Tatiana Almansa
 * @author Juan David Ojeda Bernal
 */
public class Atleta extends Thread {

    Equipo equipo;
    private int posicion;
    private int fin;
    private String starJAMAICA;
    private String starCOLOMBIA;
    private String starEEUU;
    static int tiempoJamaica,tiempoColombia,tiempoEEUU;
    
    /**
     * Constuctor de la clase atleta recible el equipo al que pertenece el atleta con su posicion inicial y su posicion final
     * @param equipo
     * @param posicion
     * @param fin 
     */
    public Atleta(Equipo equipo, int posicion, int fin) {
        this.equipo = equipo;
        this.posicion = posicion;
        this.fin = fin;
    }

    @Override
    public void run() {
        if (posicion == 0) {
            while (true) {
                int pasoActual = avanzar(1);
               
                if (pasoActual >= 33) {
                    equipo.setPosicionA(33);
                    synchronized (equipo) {
                        equipo.notifyAll();
                        posicion = 33;
                        Principal.tiempoJamaica+=Principal.starJamaica;
                        Principal.tiempoColombia+=Principal.starColmbia;
                        Principal.tiempoEEUU+=Principal.starEEUU;
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 33) {
            while (true) {
                int pasoActual = avanzar(2);
                if (pasoActual >= 66) {
                    equipo.setPosicionB(66);
                    synchronized (equipo) {
                        equipo.notify();
                        int valorAvance = Utilitaria.random();
                        Principal.tiempoColombia=valorAvance;
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 66) {
            while (true) {
                int pasoActual = avanzar(3);
                
                if (pasoActual >= 100) {
                    equipo.setPosicionC(100);
                    Principal.tiempoJamaica= avanzar (3);
                    
                    System.out.println("EL GANADOR ES: "+equipo.getNombre());
                   /* System.out.println("\nResultados oficiales");
		System.out.println("JAMAICA :"+tiempoJamaica);
		System.out.println("COLOMBIA  :"+tiempoColombia);
		System.out.println("EE.UU   :"+tiempoEEUU);
		if(tiempoJamaica>tiempoColombia && tiempoJamaica>tiempoEEUU) System.out.println("\nGanador Grupo 1");
		if(tiempoColombia>tiempoJamaica && tiempoColombia>tiempoEEUU) System.out.println("\nGanador Grupo 2");
		if(tiempoEEUU>tiempoColombia && tiempoEEUU>tiempoJamaica) System.out.println("\nGanador Grupo 3");
		System.out.println("");*/
                    System.exit(0);
                    
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public int avanzar(int numeroAtleta) {
        try {
            Thread.sleep(500);            
        } catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int valorAvance = Utilitaria.random();
        if (numeroAtleta == 1) {
            equipo.setPosicionA(equipo.getPosicionA() + valorAvance);
            if(equipo.imprimirPersona().contains("JAMAICA")){
                starJAMAICA=equipo.imprimirPersona();
                
            }else if(equipo.imprimirPersona().contains("EEUU")){
                starEEUU=equipo.imprimirPersona();
            }else if(equipo.imprimirPersona().contains("COLOMBIA")){
                starCOLOMBIA=equipo.imprimirPersona();
            }
            if(starJAMAICA!=null){
                System.out.println(starJAMAICA);
            }
            if(starCOLOMBIA!=null){
                System.out.println(starCOLOMBIA);
            }
            if(starEEUU!=null){
                System.out.println(starEEUU);
            }            
            return equipo.getPosicionA();
        }
        if (numeroAtleta == 2) {
            equipo.setPosicionB(equipo.getPosicionB() + valorAvance);
            if(equipo.imprimirPersona().contains("JAMAICA")){
                starJAMAICA=equipo.imprimirPersona();
            }else if(equipo.imprimirPersona().contains("EEUU")){
                starEEUU=equipo.imprimirPersona();
            }else if(equipo.imprimirPersona().contains("COLOMBIA")){
                starCOLOMBIA=equipo.imprimirPersona();
            }
            if(starJAMAICA!=null){
                System.out.println(starJAMAICA);
            }
            if(starCOLOMBIA!=null){
                System.out.println(starCOLOMBIA);
            }
            if(starEEUU!=null){
                System.out.println(starEEUU);
            }
            return equipo.getPosicionB();
        }
        if (numeroAtleta == 3) {
            equipo.setPosicionC(equipo.getPosicionC() + valorAvance);
          
                
                
            if(equipo.imprimirPersona().contains("JAMAICA")){
                starJAMAICA=equipo.imprimirPersona();
                Principal.tiempoJamaica=valorAvance;
            }else if(equipo.imprimirPersona().contains("EEUU")){
                starEEUU=equipo.imprimirPersona();
                Principal.tiempoEEUU=valorAvance;
            }else if(equipo.imprimirPersona().contains("COLOMBIA")){
                starCOLOMBIA=equipo.imprimirPersona();
                
            }
            if(starJAMAICA!=null){
                System.out.println(starJAMAICA);
            }
            if(starCOLOMBIA!=null){
                System.out.println(starCOLOMBIA);
                
            }
            if(starEEUU!=null){
                System.out.println(starEEUU);
            }
            
            return equipo.getPosicionC();
        }
        return 0;
    }
    public static void tablero() throws InterruptedException{
		String c11="";
		String c22="";
		String c33="";
		for (int i = 0; i < 101; i++) {
			Thread.sleep(500);
			System.out.println("\n");
			for (int j = 0; j < Principal.starJamaica; j++) {
				c11+="_";
			}
			for (int j = 0; j < Principal.starColmbia; j++) {
				c22+="_";
			}
			for (int j = 0; j < Principal.starEEUU; j++) {
				c33+="_";
			}
			System.out.println("JAMAICA :"+c11);
			System.out.println("EE.UU   :"+c22);
			System.out.println("BRAZIL  :"+c33);
					
		}
    }
}





