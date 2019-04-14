/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;
import java.util.List;

/**
 *
 * @author Denis Di Patrizio---Mat. 248639
 */
public class Autostrada {
    
    public String codice;
    public String nome;
    public String tipo;
    public List<Casello> Caselli;
    public double tariffa;
        
        public Autostrada(String codice, String nome, String tipo, List<Casello> Caselli, double tariffa){
            this.codice = codice;
            this.nome = nome;
            this.tipo = tipo;
            this.Caselli = Caselli;
            this.tariffa=tariffa;
        }   
        
        public String getCodice() {
            return codice;
        }
        
        public void setCodice(String codice) {
            this.codice = codice;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getTipo() {
            return tipo;
        }
        
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        
        public List<Casello> getCaselli() {
            return Caselli;
        }
        
        public void setCaselli(List<Casello> caselli) {
            this.Caselli = caselli;
        }
        
        public double getTariffa(){
            return tariffa;
        }
        
        public void setTariffa(double tariffa){
            this.tariffa=tariffa;
        }
        
}
    

