/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Latiude 7480
 */
public class Main {
    public static void main(String args[]){
        Singleton obj = Singleton.getInstance();
        obj.updateValue(10);
        
        
        Singleton obj2 = Singleton.getInstance();
        obj2.updateValue(5);
        
        obj.printValue();
        obj2.printValue();
    }
}
