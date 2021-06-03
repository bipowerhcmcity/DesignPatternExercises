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
public class CheeseDecorator extends Decorator{
    private String decoratorDescription = "with cheese ";
    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }
    public String viewDescription(){
        String pizzaDescription = pizza.viewDescription();
        return pizzaDescription+decoratorDescription;
    }
    
}
