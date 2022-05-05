package src.main.java.functions.nocleancode.switches;

import src.main.java.names.cleancode.methodnames.Employee;

/*Consider Payroll It shows just one of the operations that might depend on the type of employee:*/

public class Payrool {

    public Money calculatePay(Employee e)
            throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }
}

/*
        There are several problems with this function.
        First, it’s large, and when new employee types are added, it will grow.
        Second, it very clearly does more than one thing.
        Third, it violates the Single Responsibility Principle7 (SRP) because there is more than one reason for it to change.
        Fourth, it violates the Open Closed Principle8 (OCP) because it must change whenever new types are added.
        But possibly the worst problem with this function is that there are an unlimited number of other functions that will have the same structure.
        For example we could have
        a. http:// www.objectmentor.com/ resources/ articles/ srp.pdf
        b. http:// www.objectmentor.com/ resources/ articles/ ocp.pdf
        isPayday( Employee e, Date date),
        or
        deliverPay( Employee e, Money pay),
        or
        a host of others.
        All of which would have the same deleterious structure.

        The solution to this problem (see Employee, EmployeeFactory and EmployeeFactoryImp)
        is to bury the switch statement in the basement of an ABSTRACT FACTORY, and never let anyonone see it.
        The factory will use the switch statement to create appropriate instances of the derivatives of
        Employee,
        and the various functions, such as
        calculatePay,
        isPayday,
        and deliverPay,
        will be dispatched polymorphically through the
        Employee interfaces.

        My general rule for
        switch statements
        is that they can be tolerated if they appear only once,
        are used to create polymorphic dataandobjects, and are hidden behind an inheritance relationship so that the rest of the system can’t see them.
        Of course every circumstance is unique, and there are times when I violate one or more parts of that rule.*/
