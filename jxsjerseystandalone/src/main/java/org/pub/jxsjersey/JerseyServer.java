package org.pub.jxsjersey;
import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.pub.jxsjersey.rest.HelloRest;


public class JerseyServer {

	public static void main(String[] args) {
		URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
		ResourceConfig config = new ResourceConfig(HelloRest.class);
		
		//http connector  with jetty
		Server server = JettyHttpContainerFactory.createServer(baseUri, config);
		
		//http connector  with netty
		//Channel server = NettyHttpContainerProvider.createServer(baseUri, config, false);
	}

}
