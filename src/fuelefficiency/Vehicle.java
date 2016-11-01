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
    /**constructor
     * pre:none
     * post:create a vehicle object
     */
    public Vehicle(){}
    /**calculate distance
     * pre:none
     * post:return the distance
     */
    public abstract double getDistance(double fule);
}
