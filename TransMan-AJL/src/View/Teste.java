/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Controller;
import Model.Cliente;
import Model.Veiculo;

/**
 *
 * @author User
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Cliente
        Cliente c=new Cliente();
        c.setNome("Francois Bettencourt Meyer");
        c.setNuit("872301");
        
        System.out.println(c.gravar());
        System.exit(0);
        */
        
        //Veiculo
        Veiculo v=new Veiculo("MLW-145-MP", "Volvo", "XC40", 1998, 2000);
        System.out.println(v.gravar());
        System.exit(0);
        
    }
    
}
