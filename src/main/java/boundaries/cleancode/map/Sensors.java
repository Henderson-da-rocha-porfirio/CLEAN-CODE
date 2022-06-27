package boundaries.cleancode.map;

import java.util.HashMap;
import java.util.Map;
import java.util.hashmap;
import java.util.map;

  /*A cleaner way to use Map might look like the following.
 No user of Sensors would care one bit if generics were used or not.
 That choice has become (and always should be) an implementation detail.*/

public class Sensors {

        private java.util.Map sensors = new HashMap();

        public Sensor getById(String id) {
            return (Sensor) sensors.get(id);
        }
         ...


        // snip
}
