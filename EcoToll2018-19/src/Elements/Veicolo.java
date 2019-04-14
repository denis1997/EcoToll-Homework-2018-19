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
public class Veicolo {
    public String modello;
    public String marca; 
    public String targa;
    public int anno;
    public int assi;
    public double tariffa;
    public double peso;
    public double altezza;
    
        public Veicolo() {}
     
        public String getModello() {
            return modello;
        }
     
        public String getMarca() {
            return marca;
        }
        public String getTarga() {
            return targa;
	}

        public int getAnno() {
            return anno;
	}

        public int getAssi() {
            return assi;
	}

	public double getTariffa() {
            return tariffa;
	}

	public double getPeso() {
            return peso;
	}

        public double getAltezza() {
            return altezza;
	}
     
}
