package io.gumga.business;


import io.gumga.business.entity.Complexity;
import io.gumga.business.entity.Metric;
import io.gumga.business.entity.VerifyDTO;
import io.gumga.config.ComplexityVerifyConfigurer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SenhaComplexityMuitoFracaTest {
    private ComplexityVerify verify;

    @Before
    public void setUp() {
        verify = new ComplexityVerifyConfigurer().complexityVerify();
    }

    @Test
    public void naoEhMuitoFraco() {
        VerifyDTO retorno =  verify.verify("abcAa1a*a b(#");
        assertNotEquals(Complexity.VERY_WEAK, retorno.getComplexity());
    }

    @Test
    public void muitoFraca() {
        VerifyDTO retorno =  verify.verify("abcdfg");
        assertEquals(Complexity.VERY_WEAK, retorno.getComplexity());
    }

}