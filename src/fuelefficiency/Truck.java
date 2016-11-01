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
public class Truck extends Vehicle{
    private static final double efficiency=14.1/100;
    /**constructor
     * pre:none
     * post:create a truck object
     */
    public Truck(int s){
        super(s);
    }
    /**calculate distance
     * pre:none
     * post:return the distance
     */
    public double getDistance(double fuel){
        return fuel/efficiency;
    }
}
