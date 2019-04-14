/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

/**
 *
 * @author Denis Di Patrizio---Mat. 248639
 */
public class ClasseA extends Veicolo {
    
    public ClasseA (String modello, String marca, String targa, int anno, int assi, double tariffa, double peso, double altezza){
        this.modello = modello;
	this.marca = marca;
	this.targa = targa;
        this.anno = anno;
	this.assi = 2;
        this.tariffa=tariffa;
	this.peso = peso;
        this.altezza = altezza;
    }
    
}
