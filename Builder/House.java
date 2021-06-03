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
public class House {
    private String roof;
    private String paint;
    private String window;
    private String roof_paint;
    private String door;
    private String floor;
    
    public House(String roof , String paint, String window, String roof_paint, String door, String floor){
        this.roof = roof;
        this.paint = paint;
        this.window= window;
        this.roof_paint = roof_paint;
        this.door = door;
        this.floor = floor;
    }
    public String toString(){
        return this.floor+" has "+ this.door+", "+ this.window+", "+ this.paint+", "+ this.roof+", ";
    }
}
