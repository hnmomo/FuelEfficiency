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
    public Truck(){}
    public double getDistance(double fuel){
        return fuel/efficiency;
    }
}
