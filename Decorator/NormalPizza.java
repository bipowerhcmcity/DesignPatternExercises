/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Latiude 7480
 */
public class NormalPizza implements Pizza{
    private String description;
    public NormalPizza (){
        description = "normal pizza ";
    }
    @Override
    public String viewDescription() {
        return description;
                
    }
}
