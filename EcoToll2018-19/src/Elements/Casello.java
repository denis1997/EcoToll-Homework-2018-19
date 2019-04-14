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
public class Casello {
    
    String nome;
    int km;
   
        public Casello(String nome,int km) {
            this.nome=nome;
            this.km=km;
        }
        
        public String getNome() {
            return nome;
	}
        
        public int getKm() {
            return km;
	}
       
        public int kmPercorsi(Casello a) {
            return Math.abs(this.km - a.getKm());
	}
        
}
