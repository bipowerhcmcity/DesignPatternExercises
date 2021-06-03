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
public class AdapterMicroUSBtoLightning implements LightningPhone{
    
    private MicroUSBPhone adaptee;
    
    public AdapterMicroUSBtoLightning(MicroUSBPhone adaptee){
        this.adaptee=adaptee;
    }
    public void recharge(){
        adaptee.charge();
    }
}
