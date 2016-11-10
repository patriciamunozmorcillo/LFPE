/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfpe;

import java.util.ArrayList;

public class LFPE {

    public static ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public static void rellenarDatos() {
        EquipoPrimera e1;
        EquipoSegunda e2;
        Jugador j;
        Entrenador en;
        Masajista m;
        for (int i = 0; i < 20; i++) {
            e1 = new EquipoPrimera();
            e1.setNombre_estadio("Estadio" + i);
            e1.setAno_fundacion(1000 + i);
            e1.setCapacidad_estadio(2000 * i);

            en = new Entrenador();
            en.setNombre("Entrenador" + i);
            en.setEdad(50);
            en.setNacionalidad("española");
            e1.setEntrenador(en);

            m = new Masajista();
            m.setNombre("Masajista" + i);
            m.setEdad(30);
            m.setNum_colegiado("2987" + i);
            e1.setMasajista(m);

            for (int k = 0; k < 22; k++) {

                j = new Jugador();
                j.setNombre("Ronaldo" + k);
                j.setEdad((int) Math.random() * (30 - 21) + 21);
                j.setAltura((double) Math.random() * (1.95 - 1.70) + 1.70);
                j.setPeso((double) Math.random() * (100 - 70) + 70);

                e1.anadirJugador(j);

            }
            equipos.add(e1);

            e2 = new EquipoSegunda();
            e2.setAno_fundacion(1000 + i);

            en = new Entrenador();
            en.setNombre("Entrenador" + i);
            en.setEdad(50);
            en.setNacionalidad("española");
            e1.setEntrenador(en);

            m = new Masajista();
            m.setNombre("Masajista" + i);
            m.setEdad(30);
            m.setNum_colegiado("2987" + i);
            e1.setMasajista(m);

            for (int k = 0; k < 22; k++) {

                j = new Jugador();
                j.setNombre("Messi" + k);
                j.setEdad((int) Math.random() * (30 - 21) + 21);
                j.setAltura((double) Math.random() * (1.95 - 1.70) + 1.70);
                j.setPeso((double) Math.random() * (100 - 70) + 70);

                e1.anadirJugador(j);

            }
            equipos.add(e2);
        }
    }

    public static void traspasar( Equipo origen, Equipo destino, Jugador jugador){
        destino.anadirJugador(jugador);
        origen.borrarJugador(jugador);
    }
    public static void main(String[] args) {
        //rellenarDatos();
        Jugador jug=equipos.get(2).getJugadores().get(10);
        //coge el jugador de la posición 10 del equipo 2.
        traspasar (equipos.get(2),equipos.get(8),jug);
        // se lleva el jugador al destino indicado y borra el del origen
        // se lleva el jugador de la posición 10 del equipo 2 al equipo 8.
        
        traspasar (equipos.get(6),equipos.get(8),jug);
        traspasar (equipos.get(5),equipos.get(8),jug);
        
    }

}
