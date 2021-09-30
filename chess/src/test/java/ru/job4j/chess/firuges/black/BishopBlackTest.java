package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest extends TestCase {

    @Test
    public void testPosition() {
        Figure posit = new BishopBlack(Cell.F8);
        assertThat(posit.position(), is(Cell.F8));
    }

    @Test
    public void testCopy() {
        Figure copy = new BishopBlack(Cell.F8);
        assertThat(copy.copy(Cell.F8).position(), is(Cell.F8));
    }

    @Test
    public void testWay() {
        Figure way = new BishopBlack(Cell.C1);
        assertThat(way.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}