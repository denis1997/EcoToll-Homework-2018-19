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
        
        public void setModello(String modello){
            this.modello=modello;
        }
     
        public String getMarca() {
            return marca;
        }
        
        public void setMarca(String marca){
            this.marca=marca;
        }
        
        public String getTarga() {
            return targa;
	}
        
        public void setTarga(String targa){
            this.targa=targa;
        }

        public int getAnno() {
            return anno;
	}
        
        public void setAnno(int anno){
            this.anno=anno;
        }

        public int getAssi() {
            return assi;
	}
        
        public void setAssi(int assi){
            this.assi=assi;
        }

	public double getTariffa() {
            return tariffa;
	}
        
        public void setTariffa(double tariffa){
            this.tariffa=tariffa;
        }

	public double getPeso() {
            return peso;
	}
        
        public void setPeso(double peso){
            this.peso=peso;
        }

        public double getAltezza() {
            return altezza;
	}
        
        public void setAltezza(double altezza){
            this.altezza=altezza;
        }
     
}
