package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test (expected = OccupiedCellException.class)
    public void moveTestOccupiedCellException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.F4));
        logic.move(Cell.C1, Cell.G5);
    }

    @Test (expected = FigureNotFoundException.class)
    public void moveTestFigureNotFoundException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C2, Cell.G5);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void moveTestImpossibleMoveException()
            throws ImpossibleMoveException, FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C5));
        logic.move(Cell.C5, Cell.B5);
    }
}