package turtle_package;

import static turtle_package.Direction.*;

public class Turtle {

    private boolean penUp = true;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);
    private int row;
    private int column;

    public boolean isPenUp() {
        return penUp;
    }

    public void penDown() {
        penUp = false;
    }

    public void penUp() {
        penUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void face(Direction direction){
        currentDirection = direction;
    }

    public void turRight() {
        switch (currentDirection){
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
            case SOUTH -> face(WEST);
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }

    public void move(int noOfSteps, SketchPad sc) {
        int currentRow = currentPosition.getRow();
        if (currentDirection == EAST) increaseColumnBy(noOfSteps);
    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(noOfSteps + currentColumn);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void writeOn(int noOfSteps, SketchPad sc){
        int [][] floor = sc.getFloor();
    }
}









































































//
//if(currentDirection == EAST) {
//            currentDirection = SOUTH;
//            return;
//        }
//        if(currentDirection == SOUTH) {
//            face(WEST);                     // this is the same as stating currentDirection = WEST
//            return;
//        }
//        if(currentDirection == WEST) {
//            face(NORTH);                   // this is the same as stating currentDirection = NORTH
//            return;
//        }
//        if(currentDirection == NORTH) {
//            currentDirection = EAST;
//        }