/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Obs;

/**
 *
 * @author hiranyamendis
 */
public interface Observer {
    public void areaCleared(boolean areaClear);
    public void txtSender(String msg);
    public void defenceUnloker(int value);
}
