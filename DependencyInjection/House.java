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
public class House {
    private Animal animal;
    private Animal animal2;
    House(Animal animal){
        this.animal = animal;
    }
    
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    
    public void getAnimal1Roar(){
        animal.roar();
    }
    
    public void getAnimal2Roar(){
        animal2.roar();
    }
}
