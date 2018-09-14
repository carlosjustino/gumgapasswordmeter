package io.gumga.web.controller;

import io.gumga.business.entity.VerifyDTO;
import io.gumga.web.service.impl.VerifyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <b>API Page Entry</b><br>
 *
 * @author Carlos Eduardo Justino
 */
@RestController
public class ApiController {

    @Autowired
    private VerifyServiceImpl service;

    @PostMapping("/verify")
    public VerifyDTO verify(@RequestBody Map<String, String> body) {
        return service.verify(body.get("snh"));
    }
}
