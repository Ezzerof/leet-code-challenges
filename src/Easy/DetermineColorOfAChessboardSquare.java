package Easy;

import java.util.HashMap;
import java.util.Map;

public class DetermineColorOfAChessboardSquare {

    public boolean squareIsWhite(String coordinates) {

        String[][] chessboard = new String[][] {
                {"black", "white", "black", "white", "black", "white", "black", "white"},
                {"white", "black", "white", "black", "white", "black", "white", "black"},
                {"black", "white", "black", "white", "black", "white", "black", "white"},
                {"white", "black", "white", "black", "white", "black", "white", "black"},
                {"black", "white", "black", "white", "black", "white", "black", "white"},
                {"white", "black", "white", "black", "white", "black", "white", "black"},
                {"black", "white", "black", "white", "black", "white", "black", "white"},
                {"white", "black", "white", "black", "white", "black", "white", "black"},
        };

        Map<Character, Integer> map = new HashMap<>();
        int c = 97;

        for (int i = 1; i <= 8; i++) {
            map.put((char) c++, i);
        }

        int col = Integer.valueOf(String.valueOf(coordinates.charAt(1))) - 1;
        int row = map.get(coordinates.charAt(0)) - 1;

        if (chessboard[col][row] == "black") {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        DetermineColorOfAChessboardSquare d = new DetermineColorOfAChessboardSquare();
        System.out.println(d.squareIsWhite("a1"));

    }

}
