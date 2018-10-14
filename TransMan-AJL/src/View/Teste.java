/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Controller;
import Model.Cliente;

/**
 *
 * @author User
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Cliente c=new Cliente();
        c.setId(0);
        c.setNome("Francois Bettencourt Meyer");
        c.setNuit("872301");
        
        System.out.println(c.gravar());
        System.exit(0);
        
    }
    
}
