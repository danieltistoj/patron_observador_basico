/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ObservadorConcreto implements Observador{
    private SujetoConcreto sujetoConcreto;

    public ObservadorConcreto(SujetoConcreto sujeto) {
        this.sujetoConcreto = sujeto;
        this.sujetoConcreto.añadirObservador(this);
    }
    
    @Override
    public void actualizar() {
        System.out.println("GT: "+(sujetoConcreto.getEstado()*7));
    }

}
