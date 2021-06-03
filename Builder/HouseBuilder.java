/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
Builder is a creation design pattern so it works well when creating new object. 
* Object which is created cannot be modified. 
* Builder is used when class has many different many ways to create new object .
 */
public class HouseBuilder {
    private String roof;
    private String paint;
    private String window;
    private String roof_paint;
    private String door;
    private String floor;
    
    public HouseBuilder addRoof(String roof){
        this.roof =roof;
        return this;
    }
    public HouseBuilder addPaint_roof(String roof_paint){
        this.roof_paint = roof_paint;
        return this;
    }
    public HouseBuilder addPaint(String paint){
        this.paint =paint;
        return this;
    }
    public HouseBuilder addWindow(String window){
        this.window =window;
        return this;
    }
    public HouseBuilder addFloor(String floor){
        this.floor =floor;
        return this;
    }
    public HouseBuilder addDoor(String door){
        this.door =door;
        return this;
    }
    public House build(){
        return new House(roof , paint,  window,  roof_paint,  door,  floor);
    }
    
    
}
