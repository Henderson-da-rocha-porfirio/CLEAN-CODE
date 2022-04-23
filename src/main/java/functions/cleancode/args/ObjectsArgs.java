package src.main.java.functions.cleancode.args;


/*Reducing the number of arguments by creating objects out of them may seem like cheating, but it’s not.
        When groups of variables are passed together, the way x and y are in the example above,
        they are likely part of a concept that deserves a name of its own.*/

import java.awt.*;

public class ObjectsArgs {

    Circle makeCircle(Point center, double radius);

}
