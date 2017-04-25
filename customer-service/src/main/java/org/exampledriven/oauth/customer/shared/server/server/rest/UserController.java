package org.exampledriven.oauth.customer.shared.server.server.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Peter_Szanto on 4/21/2017.
 */
@RestController
@PreAuthorize("hasRole('ROLE_WRITER')")
public class UserController {
    @RequestMapping({ "/user", "/me" })
    public Principal user(Principal principal) {
        return principal;
    }

    @PreAuthorize("hasRole('ROLE_READER')")
    @RequestMapping({ "/reader" })
    public String reader() {
        return "READER";
    }

    @PreAuthorize("hasRole('ROLE_WRITER')")
    @RequestMapping({ "/writer" })
    public String writer() {
        return "WRITER";
    }

}
