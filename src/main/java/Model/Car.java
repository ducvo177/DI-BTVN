/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Component.battery.LithiumBattery;
import Component.wheels.FourWheels;
import Interface.IBattery;
import Interface.IWheels;

/**
 *
 * @author Acer
 */
public class Car {

   
    public IWheels wheel;
    public IBattery battery;
    
    public String name;

    public Car() {
    }

    public Car(IWheels wheel, IBattery battery, String name) {
        this.wheel = wheel;
        this.battery = battery;
        
        this.name = name;
    }

 
    public String getName() {
        return name;
    }
    public  void setName(String name) {
        this.name = name;
    }

    public IWheels getWheel() {
        return wheel;
    }

    public void setWheel(IWheels wheel) {
        this.wheel = wheel;
    }

    public IBattery getBattery() {
        return battery;
    }

    public void setBattery(IBattery battery) {
        this.battery = battery;
    }
    
    public void Display(){
        System.out.println("Car name: "+name);
                
    }
    
    
   
    public static void main(String[] args) {
       
      IWheels nw = new FourWheels();
        IBattery nb = new LithiumBattery();
        Car car = new Car(nw, nb, "Tesla Model S");
        car.Display();
        nw.wheel();
        nb.battery();
         
        
        
    }
    
}
