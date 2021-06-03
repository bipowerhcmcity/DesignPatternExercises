/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Latiude 7480
 */
public class Main {
    public static void main(String args[]){
        HouseBuilder builder = new HouseBuilder();
        House house = builder.addDoor("Wooden door")
               .addFloor("2 storey house")
               .addPaint_roof("Red roof")
               .addWindow("Glass Window")
               .build();
        System.out.println(house.toString());
    }
}
