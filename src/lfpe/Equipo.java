/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfpe;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public abstract class Equipo {
    private static String nombre;
    private int ano_fundacion;
   private Entrenador entrenador;
    private Masajista masajista;
    private static ArrayList<Jugador> jugadores=new ArrayList <Jugador>();

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Equipo.nombre = nombre;
    }

    public int getAno_fundacion() {
        return ano_fundacion;
    }

    public void setAno_fundacion(int ano_fundacion) {
        this.ano_fundacion = ano_fundacion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Masajista getMasajista() {
        return masajista;
    }

    public void setMasajista(Masajista masajista) {
        this.masajista = masajista;
    }

    public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public static void setJugadores(ArrayList<Jugador> jugadores) {
        Equipo.jugadores = jugadores;
    }
    
    public void anadirJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
    public void borrarJugador(Jugador jugador){
        this.jugadores.remove(jugador);
    }
}
