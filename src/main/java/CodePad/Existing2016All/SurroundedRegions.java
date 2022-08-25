package CodePad.Existing2016All;

import java.util.LinkedList;
import java.util.Queue;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;

/**
 * Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
 *
 * A region is captured by flipping all 'O's into 'X's in that surrounded region .
 *
 * For example,
 *
 * X X X X X O O X X X O X X O X X After running your function, the board should be:
 *
 * X X X X X X X X X X X X X O X X
 */

public class SurroundedRegions extends InvokableBase {

  @Override
  public Priority getRunPriority() {
    return new Priority(/*yymdd*/160101, 0, Category.LeetCode);
  }

  @Override
  public void run() {
  }

  public void solve(char[][] board) {
    int height = board.length;
    int width = 0;
    if (height > 0) {
      width = board[0].length;
    }

    Queue<Point> q = new LinkedList<Point>();
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        if ((i == 0 || i == width - 1 || j == 0 || j == height - 1)
            && board[i][j] == 'O') {
          q.add(new Point(i, j));
        }
      }
    }

    while (q.peek() != null) {
      Point p = q.remove();
      board[p.x][p.y] = '-';
      if (p.x > 0 && board[p.x - 1][p.y] == 'O') {
        q.add(new Point(p.x - 1, p.y));
      }
      if (p.x < width - 1 && board[p.x + 1][p.y] == 'O') {
        q.add(new Point(p.x + 1, p.y));
      }
      if (p.y > 0 && board[p.x][p.y - 1] == 'O') {
        q.add(new Point(p.x, p.y - 1));
      }
      if (p.y < height - 1 && board[p.x][p.y + 1] == 'O') {
        q.add(new Point(p.x, p.y + 1));
      }
    }

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        if (board[i][j] != 'X') {
          board[i][j] = board[i][j] == 'O' ? 'X' : 'O';
        }
      }
    }
  }

  public class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}