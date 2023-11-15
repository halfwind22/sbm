package com.amigos.learn.sbm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SBActuatorInfoContributor implements InfoContributor {

    /*
     *In SpringBoot3, we can provide info for the INFO endpoint by creating a bean that implements the InfoContributor interface
     * */

    @Autowired
    private Environment environment;

    @Override
    public void contribute(Info.Builder builder) {
        builder
                .withDetail("name", environment.getProperty("info.app.name"))
                .withDetail("description", environment.getProperty("info.app.description"))
                .withDetail("version", environment.getProperty("info.app.version"))
                .build();

    }
}
