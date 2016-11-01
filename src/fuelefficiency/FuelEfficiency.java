/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double fuel;
        Vehicle veh;
        int choice;
        do{
            System.out.println("what vehicle do you have?\n"
                    + "1-truck\n"
                    + "2-car\n"
                    + "3-hybrid car\n"
                    + "4-motorcycle\n"
                    + "0-quit");
            choice=in.nextInt();
            if(choice>0&&choice<5){
                System.out.println("how much fuel do you have?");
                fuel=in.nextDouble();
                System.out.println("what's the speed of your vehicle?");
                int s=in.nextInt();
                switch(choice){
                    case 1:
                        veh=new Truck(s);
                        break;
                    case 2:
                        veh=new Car(s);
                        break;
                    case 3:
                        veh=new HybridCar(s);
                        break;
                    case 4:
                        veh=new Motorcycle(s);
                        break;
                    default:
                        veh=new Truck(s);
                }
                System.out.println("your vehicle runs "+veh.getDistance(fuel)+"km\n"
                        +veh.getSpeed());
            }
        }while(choice!=0);
    }
    
}
