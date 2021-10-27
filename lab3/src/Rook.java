public class Rook extends Piece {

    public Rook(int value, boolean isWhite) {
        super(5, isWhite);
    }

    public Rook(int value) {
        super(5);
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{value='" + getValue() +
                "', isWhite='" + isWhite() + '\'' + '}';
    }

    public boolean equals(Object Piece) {
        if( isWhite() && Piece.equals(getValue())){
            return true;
        }return false;
    }
}
