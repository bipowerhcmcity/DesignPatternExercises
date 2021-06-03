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
public class Factory {
    public Color getColor(String type){
        if(type.equals("Bgr")){
            return new Bgr();
        }
        if(type.equals("Grayscale")){
            return new Grayscale();
        }
        return null;
    }
}
