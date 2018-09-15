package io.gumga.business;


import io.gumga.business.entity.Complexity;
import io.gumga.business.entity.VerifyDTO;
import io.gumga.config.ComplexityVerifyConfigurer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SenhaComplexityFracaTest {
    private ComplexityVerify verify;

    @Before
    public void setUp() {
        verify = new ComplexityVerifyConfigurer().complexityVerify();
    }

    @Test
    public void naoEhFraca() {
        VerifyDTO retorno =  verify.verify("8agy");
        assertNotEquals(Complexity.WEAK, retorno.getComplexity());
    }

    @Test
    public void fraca() {
        VerifyDTO retorno =  verify.verify("8agye");
        assertEquals(Complexity.WEAK, retorno.getComplexity());
    }

}