// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i =0;i<n;i++) {
            Scanner lineScanner = new Scanner(scanner.nextLine());
            while (lineScanner.hasNext()) {
                int head = lineScanner.nextInt();
                int tail = lineScanner.nextInt();
                board.addSnake(head, tail);
            }
        }
        int m = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<m;i++) {
            Scanner lineScanner = new Scanner(scanner.nextLine());
            while (lineScanner.hasNext()) {
                int start = lineScanner.nextInt();
                int end = lineScanner.nextInt();
                board.addLadder(start, end);
            }
        }

        int numPlayers = Integer.parseInt(scanner.nextLine());
        List<Player> players = new ArrayList<>(numPlayers);
        for(int i=0;i<numPlayers;i++) {
            players.add(new Player());
        }

        boolean gameComplete = false;
        while(!gameComplete) {
            for(int i=0;i<numPlayers;i++) {
                Player player = players.get(i);
                System.out.println("current player " + (i+1));
                player.move(board);
                Cell pos = player.position;
                if (pos.getIdx() == 100) {
                    System.out.println("player " + (i + 1) + " won");
                    gameComplete = true;
                    break;
                }
            }
        }
    }
}