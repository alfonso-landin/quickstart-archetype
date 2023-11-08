package ${package}.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SealedTest {

    @Test
    public void testUno() {
        var uno = new Sealed.Uno(4);
        assertEquals(Sealed.which(uno), 1);
        assertEquals(uno.w(), 1);
    }

    @Test
    void testDos() {
        var dos = new Sealed.Dos(4.0);
        assertEquals(Sealed.which(dos), 2);
        assertEquals(dos.w(), 2);
    }
}
