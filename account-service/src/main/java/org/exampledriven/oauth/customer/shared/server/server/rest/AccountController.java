package org.exampledriven.oauth.customer.shared.server.server.rest;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@RestController
public class AccountController {

    @GetMapping("/account")
    public OAuth2Authentication getCustomer(OAuth2Authentication principal) {

        return principal;

    }

}