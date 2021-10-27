public class Pawn extends Piece{
    boolean promoted;
    Piece newPiece;

    public Pawn(int value,boolean isWhite, boolean promoted, Piece newPiece) {
        super(value, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public Pawn(int value) {
        super(1);

    }

    public void promote(Piece newPiece) {
        this.promoted = true;
        this.newPiece = newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value='" + getValue() +
                "', isWhite='" + isWhite() + '\'' + '}';
    }

    @Override
    public boolean equals(Object Piece){
        if(Piece.equals(promoted) && Piece.equals(Piece)){
            return false;
        }else if (!(Piece.equals(promoted))){
            return false;
        }
        return true;
    }
}
