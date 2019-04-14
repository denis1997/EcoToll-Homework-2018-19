/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Denis Di Patrizio---Mat. 248639
 */
public class AltezzaErrata extends Exception {

    public AltezzaErrata(){
       System.out.println("Errore: L'altezza del veicolo di Classe B è errata.");
    }
}