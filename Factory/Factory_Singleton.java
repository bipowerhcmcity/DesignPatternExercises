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
public class Factory_Singleton {
    private static final Factory_Singleton INSTANCE = new Factory_Singleton();
    
    private Factory_Singleton(){}
    
    public Color getColor(String type){
        if(type.equals("Bgr")){
            return new Bgr();
        }
        if(type.equals("Grayscale")){
            return new Grayscale();
        }
        return null;
    }
    
    public static Factory_Singleton getInstance(){
        return INSTANCE;
    }
    
    
}
