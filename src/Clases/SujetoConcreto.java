/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SujetoConcreto implements Sujeto{
    private int estado;
    private List<Observador> observadores = new ArrayList<Observador>();

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        notificarObservador();
    }
    
    @Override
    public void añadirObservador(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void notificarObservador() {
        for(Observador observador:observadores){
            observador.actualizar();
        }
    }

}
