package com.timm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class ScoreApplication extends ResourceConfig {

    public ScoreApplication() {
        packages("com.timm");
    }
//	private Set<Class<?>> empty = new HashSet<Class<?>>();
//
//	@Override
//	public Set<Class<?>> getClasses() {
//		return empty;
//	}
}
