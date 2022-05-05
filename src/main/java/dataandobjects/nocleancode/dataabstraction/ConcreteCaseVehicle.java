package src.main.java.dataandobjects.nocleancode.dataabstraction;

/* 1. The first (the second is AbstractCaseVehicle class)uses concrete terms to communicate the fuel level of a vehicle.
*  2. In this concrete case you can be pretty sure that these are just accessors of variables.*/

public interface ConcreteCaseVehicle {

    double getFuelTankCapacityInGallons();

    double getGallonsOfGasoline();

}