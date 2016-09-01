package com.dogeatdogenterprises.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by donaldsmallidge on 8/31/16.
 */
@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    //

    @Override
    public String getGreeting() {
        return "Hola Mundo!";
    }
}
