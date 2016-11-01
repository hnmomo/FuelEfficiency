/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author jihua5758
 */
public abstract class Vehicle {
    public int speed;
    /**constructor
     * pre:none
     * post:create a vehicle object
     */
    public Vehicle(int s){
        speed=s;
    }
    /**calculate distance
     * pre:none
     * post:return the distance
     */
    public abstract double getDistance(double fule);
    /**comment your speed
     * pre:none
     * post:return fast if the speed is greater than 100
     */
    public String getSpeed(){
        if(speed>100){
            return "your car is running fast";
        }else{
            return "your car is running slow";
        }
    }
}
