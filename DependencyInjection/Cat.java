/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection;

/**
 *
 * @author Latiude 7480
 */
public class Cat implements Animal{

    @Override
    public void roar() {
        System.out.println("Cat MEOW");
    }
    
}
