package src.main.java.functions.cleancode.switches.interfaces;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
