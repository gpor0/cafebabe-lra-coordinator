package com.github.gpor0.lraCoordinator;

import io.narayana.lra.coordinator.api.Coordinator;
import io.narayana.lra.coordinator.api.CoordinatorContainerFilter;
import io.narayana.lra.coordinator.api.RecoveryCoordinator;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;


/**
 *
 */
@ApplicationPath("/")
public class CoordinatorApplication extends ResourceConfig {

    public CoordinatorApplication() {
        register(JacksonFeature.class);
        register(UriBodyWriter.class);
        register(RecoveryCoordinator.class);
        register(Coordinator.class);
        register(CoordinatorContainerFilter.class);
    }
}
