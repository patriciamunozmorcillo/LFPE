/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfpe;

/**
 *
 * @author usuario
 */
public class EquipoPrimera extends Equipo {

    private String nombre_estadio;
    private int capacidad_estadio;

    public String getNombre_estadio() {
        return nombre_estadio;
    }

    public void setNombre_estadio(String nombre_estadio) {
        this.nombre_estadio = nombre_estadio;
    }

    public int getCapacidad_estadio() {
        return capacidad_estadio;
    }

    public void setCapacidad_estadio(int capacidad_estadio) {
        this.capacidad_estadio = capacidad_estadio;
    }

}
