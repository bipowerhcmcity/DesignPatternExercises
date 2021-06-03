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
public class Decorator implements Pizza{
    Pizza pizza;
    
    public Decorator(Pizza pizza){
        this.pizza = pizza;
    }
        @Override
    public String viewDescription() {
        return this.pizza.viewDescription();
    }

}
