import java.util.Random;
public class Player {
    Cell position;
    Player() {
        position = new Cell(0);
    }
    void move(Board board) {
        int dice = rollDice();
        int currIdx = position.getIdx();
        System.out.println("current position " + currIdx);
        System.out.println("dice roll number " + dice);
        Cell nextCell = BoardUtils.getCell(board, currIdx + dice);
        while(nextCell.isHasSnakeOrLadder()) {
            nextCell = BoardUtils.getCell(board, nextCell.getStep().getEnd());
        }
        position = nextCell;
        System.out.println("new position " + position.getIdx());
    }
    int rollDice() {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        return dice;
    }
}
