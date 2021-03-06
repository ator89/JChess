package com.chess.engine.pieces;

import chess.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.Tile;
import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {

    private final static int[] CANDIDATE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17};

    public Knight(int piecePosition, Alliance pieceAllience) {
        super(piecePosition, pieceAllience);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        int candidateDestinationCoordinate;
        final List<Move> legalMoves = new ArrayList<>();

        for (final int currentCandidate : CANDIDATE_MOVE_COORDINATES) {

            candidateDestinationCoordinate = this.piecePosition + currentCandidate;

            if (true /* valid tile coodinate*/) {
                final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

                if (candidateDestinationTile.isTileOccupied()) {
                    legalMoves.add(new Move());
                } else {
                    final Piece pieceAtDestination = candidateDestinationTile.getPiece();
                    final Alliance pieceAllience = pieceAtDestination.getPieceAllience();

                    if (this.pieceAllience != pieceAllience) {
                        legalMoves.add(new Move());
                    }
                }
            }
        }

        return null;
    }

}
