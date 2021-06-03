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
public class Main {
    public static void main(String args[]){
        Pizza normalPizza = new NormalPizza();
        System.out.println(normalPizza.viewDescription());
        
        Pizza normalPizzaWithCheese = new CheeseDecorator(normalPizza);
        System.out.println(normalPizzaWithCheese.viewDescription());
        
        Pizza normalPizzaWithCheeseWithSauce = new SauceDecorator( normalPizzaWithCheese );
        System.out.println( normalPizzaWithCheeseWithSauce.viewDescription() );
        
    }
}
