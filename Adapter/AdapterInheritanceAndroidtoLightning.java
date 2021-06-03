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
public class AdapterInheritanceAndroidtoLightning extends Android implements LightningPhone {

    @Override
    public void recharge() {
        this.charge();
    }
    
}
