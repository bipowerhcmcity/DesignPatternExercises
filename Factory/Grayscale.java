/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Latiude 7480
 */
public class Grayscale implements Color{

    @Override
    public void getName() {
        System.out.println("This is Grayscale color");
    }
    
}
