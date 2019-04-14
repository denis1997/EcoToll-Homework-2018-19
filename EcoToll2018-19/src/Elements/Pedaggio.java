/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

import Interfaces.GestionePedaggio;
/**
 *
 * @author Denis Di Patrizio---Mat. 248639
 */
public class Pedaggio implements GestionePedaggio {
    
    public double CalcoloPedaggio (Veicolo a, Autostrada v, Casello in,Casello out) {
	
	double costo;
	double tariffa = a.getTariffa() + v.getTariffa() ;
	int km = in.kmPercorsi(out);
	double c = (km * tariffa);
	costo = (c +(0.22*c)); //calcolo dell'iva al 22%
	
		
            System.out.print("Il costo del pedaggio è: " + Math.round(costo*10.0)/10.0 + " euro ");
            
                return costo;
	
    }
}
