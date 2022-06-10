/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component.wheels;
import Interface.IWheels;

/** 
 *
 * @author Acer
 */
public class FourWheels implements IWheels{
    String nw="4 wheels";

    @Override
    public void wheel() {
       System.out.println("This car have: "+nw);
    }
    
    
    
}
