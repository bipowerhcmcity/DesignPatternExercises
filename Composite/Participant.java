/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Latiude 7480
 */
public class Participant implements Tournament{
    
    private String name;
    private Tournament winner;
    
    public Participant(String name){
        this.name = name;
    }    
    
    public String getName(){
        return name;
    }
    
    @Override
    public String getInfo() {
        return "\t"+name;
    }
   
}
