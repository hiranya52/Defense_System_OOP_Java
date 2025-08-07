/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;

import Obs.ControlRoom;
import Obs.Observer;
import View.Helicopter;
import View.MainController;
import View.Submarine;
import View.Tank;

/**
 *
 * @author hiranyamendis
 */
public class StartMain {
    public static void main(String[] args) {
        
        ControlRoom controlRoom = new ControlRoom();
        
        controlRoom.addObserver(new Helicopter());
        controlRoom.addObserver(new Tank());
        controlRoom.addObserver(new Submarine());
        
        new MainController(controlRoom);
    }
}
