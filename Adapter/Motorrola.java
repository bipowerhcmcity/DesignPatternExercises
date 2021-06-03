/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Latiude 7480
 */
public class Motorrola implements MicroUSBPhone{
    public void charge(){
        System.out.println("Motorrola is charging");
    }
}
