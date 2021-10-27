import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

    private static Piece Queen;
    private static Piece Knight;
    public static Piece getQueen() {
        return Queen;
    }
    public static void setQueen(Piece queen) {
        Queen = queen;
    }

    public static Piece getKnight() {
        return Knight;
    }

    public static void setKnight(Piece knight) {
        Knight = knight;
    }

    public static void main(String[] args) {
        Piece pawn = new Pawn(1);
        Piece knight = new Knight(2);
        Piece bishop = new Bishop(3);
        Piece rook = new Rook(5);
        Piece king = new King(1000);
        Piece queen = new Queen(9);
        ArrayList<Piece> pieces = new ArrayList<>(Arrays.asList(pawn, knight, bishop, rook, queen, king));
        for(int i = 0; i < pieces.size(); i ++){
            pieces.get(i).move();
        }
        Pawn p1= new Pawn(1,true,true,Queen );
        Pawn p2= new Pawn(1, true, false, null);
        Pawn p3= new Pawn(1, false, false, null);
        Pawn p4= new Pawn(1, false, true,Queen);
        Pawn p5= new Pawn(1, true, true, Knight);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}
