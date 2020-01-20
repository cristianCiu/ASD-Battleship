package sample;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    void attack() {
        Ship ship= new Ship(2,2,4,Direction.LEFT,2,2);
       // ShipPart shippart = new ShipPart(new Point(2,2))
        int x = 2,  y = 2;
        assertTrue(ship.attack(x,y));
    }

    @Test
    void checkIfDestroyed() {


        Ship ship= new Ship(2,2,1,Direction.LEFT,2,2);

        for (ShipPart i : ship.getShipParts())
            i.destroy();

        assertTrue(ship.checkIfDestroyed());

    }
}