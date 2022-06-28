package SevenSegment;

public class SevenSegmentDisplay {
    private final char[][] segmentArray;
    private final int row;
    private final int column;

    public SevenSegmentDisplay(int row, int column) {
        this.row = row;
        this.column = column;
        segmentArray = new char[row][column];
    }

    public int length() {
        return segmentArray.length;
    }

    public void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (segmentArray[i][j] == '1') {
                    System.out.print("#" + " ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void setLight(String command) {
        char[] checkLight = command.toCharArray();
        if (checkLight[7] == '1') {
            for (int j = 0; j < 7; j++) {
                if (checkLight[j] == '1') {
                    switch (j) {
                        case 0 -> {
                            for (int i = 0; i < column; i++) {
                                segmentArray[0][i] = '1';
                            }
                        }
                        case 1 -> {
                            for (int i = 0; i < row / 2 + 1; i++) {
                                segmentArray[i][3] = '1';
                            }
                        }
                        case 2 -> {
                            for (int i = row / 2; i < row; i++) {
                                segmentArray[i][3] = '1';
                            }
                        }
                        case 3 -> {
                            for (int i = 0; i < column; i++) {
                                segmentArray[4][i] = '1';
                            }
                        }
                        case 4 -> {
                            for (int i = row / 2; i < row; i++) {
                                segmentArray[i][0] = '1';
                            }
                        }
                        case 5 -> {
                            for (int i = 0; i < row / 2 + 1; i++) {
                                segmentArray[i][0] = '1';
                            }
                        }
                        case 6 -> {
                            for (int i = 0; i < column; i++) {
                                segmentArray[2][i] = '1';
                            }
                        }
                    }
                }
            }
        }
    }
}
