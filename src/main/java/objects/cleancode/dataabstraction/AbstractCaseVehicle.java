package src.main.java.objects.cleancode.dataabstraction;

/* 1. The second (the first is ConcreteCaseVehicle class) does so with the abstraction of percentage
*  2. In this abstract case you have no clue at all about the form of the data.
*  3. In both of the above cases the second option is preferable.
*  4. We don't want to expose the details of our data.
*  5. Rather we want to express our data in abstract terms.
*  6. This is not merely accomplished by using workinginterfacesinapis and/or getters and setters.
*  7. Serious thought needs to be put into the best way to represent the data that an object contains.
*  8. The worst option is to blithely add getters and setters.*/

public interface AbstractCaseVehicle {

    double getPercentFuelRemaining();

}
