package io.gumga.business;


import io.gumga.business.entity.Complexity;
import io.gumga.business.entity.VerifyDTO;
import io.gumga.config.ComplexityVerifyConfigurer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SenhaComplexityBoaTest {
    private ComplexityVerify verify;

    @Before
    public void setUp() {
        verify = new ComplexityVerifyConfigurer().complexityVerify();
    }

    @Test
    public void naoEhBoa() {
        VerifyDTO retorno =  verify.verify("aof*a b");
        assertNotEquals(Complexity.GOOD, retorno.getComplexity());
    }

    @Test
    public void boa() {
        VerifyDTO retorno =  verify.verify("8agyea3#");
        assertEquals(Complexity.GOOD, retorno.getComplexity());
    }

}