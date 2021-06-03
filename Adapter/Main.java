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
public class Main {
    public static void main(String args[]){
        Android androidPhone = new Android();
        Motorrola motorollaPhone = new Motorrola();
        
        
//        AdapterMicroUSBtoLightning adapter = new AdapterMicroUSBtoLightning(androidPhone);
//        AdapterMicroUSBtoLightning adapterMotorolla = new AdapterMicroUSBtoLightning(motorollaPhone);
//        
//        adapter.recharge();
//        adapterMotorolla.recharge();

        AdapterInheritanceAndroidtoLightning adapterAndroid = new AdapterInheritanceAndroidtoLightning();
        adapterAndroid.charge();
    }
}
