/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.List;

import Elements.ClasseA;
import Elements.Casello;
import Elements.Pedaggio;
import Elements.ClasseB;
import Exception.AltezzaErrata;
import Elements.Autostrada;



/**
 *
 * @author Denis Di Patrizio---Mat. 248639
 */
public class EcoToll201819 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AltezzaErrata {
        // TODO code application logic here
        
        ClasseA	automobile= new ClasseA("Punto","Fiat","AT057VA",1998,2,0.1,500,1.2);
        ClasseB autobus= new ClasseB("EcoDaily","Iveco","CA890RB",2007,2,0.2,800,1.7);
        
        List<Casello> Caselli_a = new ArrayList<>();
        Autostrada a= new Autostrada("A14", "Autostrada Adriatica", "Mare", Caselli_a, 0.1);
        Casello x = new Casello("Val Vibrata",180);
	Casello y = new Casello("Mosciano Sant'Angelo",215);
        Casello z = new Casello("Montesilvano",280);
        Caselli_a.add(x);
	Caselli_a.add(y);
	Caselli_a.add(z);
        
        List<Casello> Caselli_b = new ArrayList<>();
        Autostrada b=new Autostrada("A24", "Strada Dei Parchi", "Montagna", Caselli_b, 0.2);
        Casello j= new Casello("Val Vomano", 180);
        Casello k= new Casello("L'Aquila Est", 215);
        Casello d= new Casello("L'Aquila Ovest", 280);
        Caselli_b.add(j);
	Caselli_b.add(k);
	Caselli_b.add(d);
        
        Pedaggio p = new Pedaggio();
        
        
        
        System.out.println("La distanza percorsa dall'automobile è di " + x.kmPercorsi(y) + "km");
         p.CalcoloPedaggio(automobile, a, x, y); 
        
        System.out.println( "\nLa distanza percorsa dall'autobus è di " + x.kmPercorsi(z) + "km");
         p.CalcoloPedaggio(autobus, a, x, z);
        
        System.out.println("\nLa distanza percorsa dall'automobile è di " + j.kmPercorsi(k) + "km");
         p.CalcoloPedaggio(automobile, b, j, k);
         
        System.out.println("\nLa distanza percorsa dall'autobus è di " + j.kmPercorsi(d) + "km");
         p.CalcoloPedaggio(autobus, b, j, d);
       
        
    }
    
}
