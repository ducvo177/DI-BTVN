/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component.battery;
import Interface.IBattery;
/**
 *
 * @author Acer
 */
public class LithiumBattery implements IBattery {
   String nb="Lithium Battery";

    @Override
    public void battery() {
       System.out.println("This car have: "+nb);
    }
    
    
}
