package io.gumga.web.service.impl;


import io.gumga.business.ComplexityVerify;
import io.gumga.business.entity.VerifyDTO;
import io.gumga.web.service.Verify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyServiceImpl implements Verify {

    @Autowired
    private ComplexityVerify complexityVerify;

    public VerifyDTO verify(String pass) {
        return complexityVerify.verify(pass);
    }
}
