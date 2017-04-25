package org.exampledriven.oauth.customer.shared.server.server.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Peter_Szanto on 4/24/2017.
 */
@RestController
public class AccountRelayController {

    @Autowired
    private OAuth2RestOperations restTemplate;

    @Autowired
    UserInfoRestTemplateFactory userInfoRestTemplateFactory;

    @RequestMapping("/account-relay")
    public String getAccount() {

        String account = restTemplate.getForEntity("http://localhost:9099/account", String.class).getBody();
        return account;

    }

}
