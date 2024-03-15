import player.Player;
import jumper.Jumper;
import board.Board;
import game.Game;
import dice.Dice;
import coordinates.Coordinates;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Jumper> map = new HashMap<>();
        map.put("6", new Jumper(new Coordinates(9, 5), new Coordinates(6, 6)));
        map.put("97", new Jumper(new Coordinates(0, 1), new Coordinates(9, 9)));
        map.put("21", new Jumper(new Coordinates(7, 0), new Coordinates(0, 9)));
        map.put("64", new Jumper(new Coordinates(3, 3), new Coordinates(7, 4)));

        Player p1 = new Player();
        p1 = p1.setPlayerNameFromUserInput();
        Player p2 = new Player();
        p2 = p2.setPlayerNameFromUserInput();
        p1.displayPlayerName();
        p2.displayPlayerName();

        Board b = new Board(10, map);
        b.displayBoard();

        Game game = new Game(b, new Player[] {p1,p2}, new Dice());
        game.play();
    }
}
