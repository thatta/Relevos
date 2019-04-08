/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda Bernal
 */
public class Equipo extends Thread {
    static int starJamaica;
    static int starColmbia;
    static int starEEUU;
    static int tiempoJamaica;
    static int tiempoColombia;
    static int tiempoEEUU;
    /**
     * Nombre del equipo.
     * @param nombre
     */
    private String nombre;
    /**
     * Punto donde inicia la carrera.
     * @param inicio
     */
    private int inicio;
    /**
     * Punto donde termina la carrera.
     * @param fin
     */
    private int fin;
    /**
     * Posicion inicial del primer corredor de cada equipo 
     * @param posicionA
     */
    private int posicionA;
     /**
     * Segunda posicion del segundi corredor de cada equipo 
     * @param posicionB
     */
    private int posicionB;
    /**
     * Tercera posicion del tercer corredor de cada equipo 
     * @param posicionA
     */
    private int posicionC;
    
    /**
     * El constructor recibe el nombre del equipo, el inicio y el fin de la carrera y estan quemados las posiciones de corredores
     * @param nombre
     * @param inicio
     * @param fin
     */
    public Equipo(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.posicionA = 0;
        this.posicionB = 33;
        this.posicionC = 66;
    }
    
    /**
     * Metodo que retorna el nombre del equipo.
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que establece el nombre del equipo.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que retorna el valor de inicio de la carrera.
     * @return int
     */
    public int getInicio() {
        return inicio;
    }
    /**
     * Metodo que establece el valor de inicio de la carrera.
     * @param inicio 
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    /**
     * Metodo que retorna el valor de final de la carrera.
     * @return int
     */
    public int getFin() {
        return fin;
    }
    /**
     * Metodo que establece el valor de inicio de la carrera.
     * @param fin
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
    /**
     * Metodo que retorna la posicion actual del corredor uno de cada equipo
     * @return int
     */
    public int getPosicionA() {
        return posicionA;
    }
    /**
     * Metodo que establece la posicion del corredor uno de cada equipo
     * @param posicionA
     */
    public void setPosicionA(int posicionA) {
        this.posicionA = posicionA;
    }
    /**
     * Metodo que retorna la posicion actual del corredor dos de cada equipo
     * @return int
     */
    public int getPosicionB() {
        return posicionB;
    }
    
    public void setPosicionB(int posicionB) {
        this.posicionB = posicionB;
    }
    /**
     * Metodo que retorna la posicion actual del corredor tres de cada equipo
     * @return int
     */
    public int getPosicionC() {
        return posicionC;
    }
   
    public void setPosicionC(int posicionC) {
        this.posicionC = posicionC;
    }
    
    public synchronized String imprimirPersona() {
        String trayecto = "Equipo: "+nombre+" ";
        for (int i = inicio; i <= fin; i++) {
            if (i == posicionA) {
                trayecto += "P1";
            } else if (i == posicionB) {
                trayecto += "P2";
            } else if (i == posicionC) {
                trayecto += "P3";
            } else {
                trayecto += "-";
            }
        }
        
        return trayecto;
        
    }

}