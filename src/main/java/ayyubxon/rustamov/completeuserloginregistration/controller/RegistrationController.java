package ayyubxon.rustamov.completeuserloginregistration.controller;

import ayyubxon.rustamov.completeuserloginregistration.request.RegistrationRequest;
import ayyubxon.rustamov.completeuserloginregistration.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }
}
