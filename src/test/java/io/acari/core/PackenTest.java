package io.acari.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class PackenTest {
    private final Packen shesPacken = new Packen();
    @Test
    public void arrayPackingOne() {
        assertEquals(21784,
                shesPacken.arrayPacking(
                        new int[]{24, 85,0}
                ));
    }
    @Test
    public void arrayPackingTwo() {
        assertEquals(2567447,
                shesPacken.arrayPacking(
                        new int[]{23,45,39}
                ));
    }
}