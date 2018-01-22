package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlantsGrowYoTest {
    private final PlantsGrowYo plantsGrowYo = new PlantsGrowYo();

    @Test
    public void growingPlant() throws Exception {
        assertEquals(10, plantsGrowYo.growingPlant(100, 10, 910));
    }

    @Test
    public void growingPlantTwo() throws Exception {
        assertEquals(1, plantsGrowYo.growingPlant(10, 9, 4));
    }

}