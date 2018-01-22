package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Forged in the flames of battle by alex.
 */
public class VarNameCheckerTest {
    private VarNameChecker varNameChecker = new VarNameChecker();

    @Test
    public void variableNameOne() throws Exception {
        assertTrue(varNameChecker.variableName("var_1__Int"));
    }

    @Test
    public void variableNameTwo() throws Exception {
        assertFalse(varNameChecker.variableName("qq-q"));
    }

    @Test
    public void variableNameThree() throws Exception {
        assertFalse(varNameChecker.variableName("2w2"));
    }

    @Test
    public void variableNameFour() throws Exception {
        assertFalse(varNameChecker.variableName(" variable"));
    }

    @Test
    public void variableNameFive() throws Exception {
        assertFalse(varNameChecker.variableName("va[riable0"));
    }

}