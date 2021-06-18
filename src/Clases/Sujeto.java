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
public interface Sujeto {
    public void añadirObservador(Observador observador);
    public void notificarObservador();
}
