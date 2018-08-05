/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamburguesa;

import java.util.Scanner;

/**
 *
 * @author cibarba
 */
public class Crud {
    Hamburguesa hamburguesa = new Hamburguesa();
    
    public void Create(Hamburguesa hamburguesa){
        Scanner scan = new Scanner(System.in);
        System.out.println("Que rollo viejo!");
        System.out.println("Que tipo de carne quieres?");
        String carne = scan.nextLine();
        System.out.println("La quiere con todo joven?");
        int conTodo = scan.nextInt();
        
            if(conTodo == 1){    
                hamburguesa = new Hamburguesa(carne,true,true,true,true,true,true,true);
            }
            else{
                
            }
            
            
    }
    
    public void Read(){
        
    }
    
    public void Update(){
        
    }
    
    public void Delete(){
        
    }
    
}
