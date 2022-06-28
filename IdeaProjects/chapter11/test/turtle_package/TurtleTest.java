package turtle_package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static turtle_package.Direction.*;

public class TurtleTest {

    Turtle myTurtle;
    SketchPad pad;

    @BeforeEach
    public void setUp(){
        myTurtle = new Turtle();
        pad = new SketchPad(0, 5);
    }

    @Test
    void testThatTurtleExist(){
        assertNotNull(myTurtle);
    }

    @Test
    void testThatTurtlePenIsUpByDefault(){
        assertTrue(myTurtle.isPenUp());
    }

    @Test
    void testThatTurtlePenCanBeDown(){
        assertTrue(myTurtle.isPenUp());
        myTurtle.penDown();
        assertFalse(myTurtle.isPenUp());
    }

    @Test
    void testThatPenCanGoUpBack(){
        assertTrue(myTurtle.isPenUp());
        myTurtle.penDown();
        assertFalse(myTurtle.isPenUp());
        myTurtle.penUp();
        assertTrue(myTurtle.isPenUp());
    }

    @Test
    void whenFacingEastByDefault_turtleCanTurnRightTes(){
        assertSame(EAST, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(SOUTH, myTurtle.getCurrentDirection());
    }

    @Test
    void whenFacingSouth_turtleCanTurnRightTest(){
        assertSame(EAST, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(SOUTH, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(WEST, myTurtle.getCurrentDirection());
    }

    @Test
    void whenFacingWest_turtleCanTurnRightTest(){
        myTurtle.turRight();
        assertSame(SOUTH, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(WEST, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());
    }

    @Test
    void whenFacingNorth_turtleCanTurnRightTest(){
        myTurtle.turRight();
        assertSame(SOUTH, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(WEST, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(Direction.NORTH, myTurtle.getCurrentDirection());

        myTurtle.turRight();
        assertSame(EAST, myTurtle.getCurrentDirection());
    }

    @Test
    void whenFacingEast_turtleCanTurnLeftTest(){
        assertSame(EAST, myTurtle.getCurrentDirection());

        myTurtle.turnLeft();
        assertSame(NORTH, myTurtle.getCurrentDirection());
    }

    @Test
    void whenFacingNorth_turtleCanTurnLeftTest(){
        myTurtle.turnLeft();
        assertSame(NORTH, myTurtle.getCurrentDirection());

        myTurtle.turnLeft();
        assertSame(WEST, myTurtle.getCurrentDirection());
    }

    @Test
    void whenFacingWest_turtleCanTurnLeft(){
        myTurtle.turnLeft();
        assertSame(NORTH, myTurtle.getCurrentDirection());

        myTurtle.turnLeft();
        assertSame(WEST, myTurtle.getCurrentDirection());

        myTurtle.turnLeft();
        assertSame(SOUTH, myTurtle.getCurrentDirection());

        myTurtle.turnLeft();
        assertSame(EAST, myTurtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveTestFacingEast(){
        assertSame(EAST, myTurtle.getCurrentDirection());
        myTurtle.move(5, pad);
        Position myPosition = new Position(0,5);
        assertEquals(myPosition, myTurtle.getCurrentPosition()); //        assertEquals(myPosition, myTurtle.getCurrentPosition());
    }

    @Test
    void whenPenisDown_turtleCanWriteWhileMoving(){
        assertSame(EAST, myTurtle.getCurrentDirection());
        myTurtle.penDown();
        int currentColumn = myTurtle.getCurrentPosition().getColumn();
        int currentRow = myTurtle.getCurrentPosition().getRow();
        myTurtle.move(5, pad);

        assertEquals(new Position(0, 5), myTurtle.getCurrentPosition());
        int [][] floor = new int[5][5];

        for (int i = currentRow; i < currentRow + 5; i++) {
            floor[currentColumn][i] = 1;
        }
//        System.out.println(Arrays.deepToString(floor));
        for (int[] ints : floor) {
            for (int j = 0; j < floor.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
