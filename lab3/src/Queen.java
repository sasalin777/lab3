public class Queen extends Piece{

    public Queen(int value, boolean isWhite) {
        super(value, isWhite);
    }

    public Queen(int value) {
        super(9);
    }
    public Queen() {
        super(9,true);
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
        return "Queen{value='" + getValue() +
                "', isWhite='" + isWhite() + '\'' + '}';
    }

    public boolean equals(Object Piece) {
        return isWhite() && Piece.equals(getValue());
    }
}
