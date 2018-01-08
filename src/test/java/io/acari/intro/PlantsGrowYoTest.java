package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlantsGrowYoTest {
    private final PlantsGrowYo plantsGrowYo = new PlantsGrowYo();
    @Test
    public void growingPlant() throws Exception {
        assertEquals(10, plantsGrowYo.growingPlant(10, 10, 910));
    }

}