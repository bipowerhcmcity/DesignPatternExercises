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
public class Injector {
    public static void main(String args[]){
        House house = new House(new Cat());
        house.setAnimal(new Dog());
        house.getAnimal2Roar();
    }
}
