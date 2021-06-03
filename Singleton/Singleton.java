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
public final class Singleton {
    private int value;
    private static final Singleton INSTANCE = new Singleton();
    
    private Singleton(){}
    public static Singleton getInstance(){
        return INSTANCE;
    }
    
    public void updateValue(int value){
        this.value=value;
    }
    public void printValue(){
        System.out.println(this.value);
    }
}
