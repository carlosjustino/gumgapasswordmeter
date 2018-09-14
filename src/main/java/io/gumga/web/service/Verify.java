package io.gumga.web.service;

import io.gumga.business.entity.VerifyDTO;

public interface Verify {

    VerifyDTO verify(String senha);
}
