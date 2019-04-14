/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Elements.Veicolo;
import Elements.Casello;
import Elements.Autostrada;


/**
 *
 * @author Denis Di Patrizio---Mat. 248639
 */
public interface GestionePedaggio {
    
    public double CalcoloPedaggio(Veicolo a, Autostrada v, Casello in, Casello out);
    
}
