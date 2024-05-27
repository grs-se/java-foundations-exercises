package com.grswebservices.java.foundations.exercises.section8_more_oop.ex8;

public class ChessPieceTest {
    protected boolean isMoveFoundInArray(Coordinates[] moves, Coordinates expectedMove) {
        for (Coordinates curCoords : moves) {
            if (curCoords.equals(expectedMove)) return true;
        }
        return false;
    }
}
