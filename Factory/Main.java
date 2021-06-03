/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Latiude 7480
 */
public class Main {
    public static void main(String args[]){
        Factory factory = new Factory();
        Color c = factory.getColor("Bgr");
        
        Factory_Singleton fact_Single = Factory_Singleton.getInstance();
        Color d = fact_Single.getColor("Grayscale");
        Color e = fact_Single.getColor("Grayscale");
        
        c.getName();
        
        d.getName();
        e.getName();
    }
}
