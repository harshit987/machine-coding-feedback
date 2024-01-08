import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> board;
    Board() {
        board = new ArrayList<Cell>(101);
        for(int i=0;i<=100;i++) {
            board.add(new Cell(i));
        }
    }

    Cell getCell(int idx) {
        return idx > 100 ? board.get(100) : board.get(idx);
    }
    void addSnake(int head, int tail) {
        Cell cell = board.get(head);
        cell.setHasSnakeOrLadder(true);
        cell.setStep(head, tail);
    }

    void addLadder(int start, int end) {
        Cell cell = board.get(start);
        cell.setHasSnakeOrLadder(true);
        cell.setStep(start, end);
    }
}
