package io.gumga.business;


import io.gumga.business.entity.Complexity;
import io.gumga.business.entity.VerifyDTO;
import io.gumga.config.ComplexityVerifyConfigurer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SenhaComplexityMuitoForteTest {
    private ComplexityVerify verify;

    @Before
    public void setUp() {
        verify = new ComplexityVerifyConfigurer().complexityVerify();
    }

    @Test
    public void naoEhMuitoForte() {
        VerifyDTO retorno =  verify.verify("0Fae0$");
        assertNotEquals(Complexity.VERY_STRONG, retorno.getComplexity());
    }

    @Test
    public void muitoForte() {
        VerifyDTO retorno =  verify.verify("abcAa1a*a b(#");
        assertEquals(Complexity.VERY_STRONG, retorno.getComplexity());
    }

}