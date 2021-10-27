public class Bishop extends Piece {

    public Bishop(int value, boolean isWhite) {
        super(value, isWhite);
    }

    public Bishop(int value) {
        super(3);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{value='" + getValue() +
                "', isWhite='" + isWhite() + '\'' + '}';
    }

    public boolean equals(Object Piece) {
        if( isWhite() && Piece.equals(getValue())){
            return true;
        }return false;
    }
}
