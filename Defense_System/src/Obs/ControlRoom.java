/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Obs;

import View.Helicopter;
import View.MainController;

/**
 *
 * @author hiranyamendis
 */
public class ControlRoom {
    private Observer[] observerArray = new Observer[100];
    private int nextIndex;
    
    
    public void addObserver(Observer ob){
        observerArray[nextIndex++]=ob;
    }
    
    public void setArea(boolean area){
        for(int i=0; i<nextIndex; i++){
            Observer ob=observerArray[i];
            ob.areaCleared(area);
        }
    }
    
     public void setMsg(String msg){
        for(int i=0; i<nextIndex; i++){
            Observer ob=observerArray[i];
            ob.txtSender(msg);
        }
    }
    
    public void setDefenceUnlocker(int value){
        for(int i=0; i<nextIndex; i++){
            Observer ob=observerArray[i];
            ob.defenceUnloker(value);
        }
    }

    public void sendMsg(String msg){
        for(int i=0; i<nextIndex; i++){
            Observer ob=observerArray[i];
            ob.getMsg(msg);
        }
    }
    
    public void sendPrivateMsg(String defence, String msg){
        for(int i=0; i<nextIndex; i++){
            Observer ob=observerArray[i];
            ob.getPrivateMsg(defence, msg);
        }
    }
   

}
