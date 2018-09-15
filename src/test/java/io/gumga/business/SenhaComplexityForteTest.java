package io.gumga.business;


import io.gumga.business.entity.Complexity;
import io.gumga.business.entity.VerifyDTO;
import io.gumga.config.ComplexityVerifyConfigurer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SenhaComplexityForteTest {
    private ComplexityVerify verify;

    @Before
    public void setUp() {
        verify = new ComplexityVerifyConfigurer().complexityVerify();
    }

    @Test
    public void naoEhForte() {
        VerifyDTO retorno =  verify.verify("*a b");
        assertNotEquals(Complexity.STRONG, retorno.getComplexity());
    }

    @Test
    public void forte() {
        VerifyDTO retorno =  verify.verify("!(Faha1");
        assertEquals(Complexity.STRONG, retorno.getComplexity());
    }

}