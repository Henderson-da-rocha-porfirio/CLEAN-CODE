package src.main.java.name.intentionrevealingname.cleancode.methodnames;

/*Methods should have verb or verb phrase names like postPayment, deletePage, or save. Accessors, mutators,
        and predicates should be named for their value and prefixed with get, set,
        and is according to the javabean standard.*/

import javax.print.attribute.Attribute;

public class Employee {

    // Example1:
    string name = employee.getName();
    customer.setName(”mike”);
    if (paycheck.isPosted());


    // Example2:
    void deletePage(Attribute attribute) {
        attribute = new Attribute() {
            @Override
            public Class<? extends Attribute> getCategory() {
                return null;
            }

            @Override
            public String getName() {
                return null;
            }
        };
        attribute.a = 20;
    }

}
