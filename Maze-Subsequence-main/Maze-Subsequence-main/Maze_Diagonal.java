package Stack;


public class Maze_Diagonal{
    static void mazePathProblem(int row, int col, int endRow, int endCol, String result) {
    if (row == endRow && col == endCol) {
        System.out.println(result);
        return;
    }
    if (col < endCol) {
        mazePathProblem(row, col + 1, endRow, endCol, result + "R");
    }
    if (row < endRow) {
        mazePathProblem(row + 1, col, endRow, endCol, result + "D");
    }
    if (row < endRow && col < endCol) {
        mazePathProblem(row + 1, col + 1, endRow, endCol, result + "X");
    }
    }
    public static void main(String[] args) {
        mazePathProblem(0, 0, 2, 3, "");
        mazePathProblem(0, 0, 3, 3, "");

    }
}