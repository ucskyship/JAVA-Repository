package turtle_package;

import java.util.Arrays;

public class SketchPad {
    private final int[][] floor;

    public SketchPad(int length, int breadth){
        floor = new int[length][breadth];
    }

    public int[][] getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "SketchPad{" +
                "floor=" + Arrays.toString(floor) +
                '}';
    }
}
