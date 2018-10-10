
package com.chess.engine.pieces;
import chess.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import java.util.List;

public abstract class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAllience;

    Piece(final int piecePosition, final Alliance pieceAllience){
        this.piecePosition = piecePosition;
        this.pieceAllience = pieceAllience;
    }
    
    public Alliance getPieceAllience(){
        return this.pieceAllience;
    }
    
    public abstract List<Move> calculateLegalMoves(final Board board);
}
