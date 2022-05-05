package src.main.java.objects.objectsversusdatas;

import java.awt.*;

/*      Consider, for example, the procedural shape example.
        The Geometry class operates on the three shape classes.
        The shape classes are simple data structures without any behavior.
        All the behavior is in the Geometry class.

        1. "Procedural code (code using data structures) makes it easy to
        add new functions without changing the existing data structures."
        2. "Procedural code makes it hard to add new data structures because
         all the functions must change." */

public class DatasProceduralShape {
    public class Square {
        public Point topLeft;
        public double side;
    }

    public class Rectangle {
        public Point topLeft;
        public double height;
        public double width;
    }

    public class Circle {
        public Point center;
        public double radius;
    }

    public class Geometry {
        public final double PI = 3.141592653589793;

        public double area(Object shape) throws NoSuchShapeException {
            if (shape instanceof Square) {
                Square s = (Square) shape;
                return s.side * s.side;
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                return r.height * r.width;
            }
        } else if(shape instanceof Circle)

        {
            Circle c = (Circle) shape;
            return PI * c.radius * c.radius;
        } throw new

        NoSuchShapeException();
    }
}
