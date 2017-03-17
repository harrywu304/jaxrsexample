package org.pub.jxsjersey.context;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * jersey config file, can be instead with web.xml
 * @author Administrator
 *
 */
//@ApplicationPath("rs")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("org.pub.rest;org.bar.rest");
    }
}