package src.main.java.objects.cleancode.dataabstraction;

/* 1. The second (the first is ConcreteCaseVehicle class) does so with the abstraction of percentage
*  2. In this abstract case you have no clue at all about the form of the data.*/

public interface AbstractCaseVehicle {

    double getPercentFuelRemaining();

}
