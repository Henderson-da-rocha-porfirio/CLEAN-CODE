package boundaries.cleancode.map;

import java.util.HashMap;
import java.util.Map;
import java.util.hashmap;
import java.util.map;

  /*A cleaner way to use Map might look like the following.
 No user of Sensors would care one bit if generics were used or not.
 That choice has become (and always should be) an implementation detail.

  The workinginterfacesinapis at the boundary (Map) is hidden. It is able to evolve with very little impact on the rest of the application.
  The use of generics is no longer a big issue because the casting and type management is handled inside the Sensors class.
  This workinginterfacesinapis is also tailored and constrained to meet the needs of the application.
  It results in code that is easier to understand and harder to misuse.
  The Sensors class can enforce design and business rules.
  We are not suggesting that every use of Map be encapsulated in this form.
  Rather, we are advising you not to pass Maps (or any other workinginterfacesinapis at a boundary) around your system.
  If you use a boundary workinginterfacesinapis like Map, keep it inside the class, or close family of classes, where it is used.
  Avoid returning it from, or accepting it as an argument to, public APIs.*/


public class Sensors {

    private java.util.Map sensors = new HashMap();

    public Sensor getById(String id) {
        return (Sensor) sensors.get(id);
    }
         ...


    // snip
}
