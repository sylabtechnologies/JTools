package p311;

import java.util.*;

public class RandomShapeGenerator {
    final private Random rand;

    {
        Date mydate = new Date();
        int seed = Integer.parseInt(mydate.toString().substring(17, 19));
        rand = new Random(seed);
    }
    
    public Shape next() {
        switch(rand.nextInt(3))
        {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

}
