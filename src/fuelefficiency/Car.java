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
public class Car extends Vehicle{
    private static final double efficiency=9.4/100;
    public Car(){}
    public double getDistance(double fuel){
        return fuel/efficiency;
    }
}
