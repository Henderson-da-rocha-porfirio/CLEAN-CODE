package boundaries.nocleancode.map;
import java.util.hashmap;
import java.util.map;

public class Sensors {

    package boundaries.nocleancode;



    . . .

        /*if our application needs a map of sensors, you might find the sensors set up like this:*/
        map sensors = new hashmap();

    . . .

        /*then, when some other part of the code needs to access the sensor, you see this code:*/
        sensor s = (sensor) sensors.get( sensorid );

    . . .

    /* we don’t just see it once, but over and over again throughout the code.
    the client of this code carries the responsibility of getting an object from
    the map and casting it to the right type. this works, but it’s not clean code.
    also, this code does not tell its story as well as it could.
    the readability of this code can be greatly improved by using generics, as shown below,
    however, this doesn’t solve the problem that map < sensor > provides more capability than we need or want:*/

        map<sensor> sensors = new hashmap<sensor>(); …
        sensor s = sensors.get(sensorid);

    . . .



    }

}
