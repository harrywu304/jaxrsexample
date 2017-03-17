package org.pub.jxsjersey.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pub.hello.bean.User;

@Path("hello")
public class HelloRest {
	
	@GET
	@Path("sayhello/{name}")
	@Produces({ MediaType.APPLICATION_JSON })
	public String sayHello(@PathParam("name") String name) {
		return "Hello " + name;
	}

	@POST
	@Path("saygoodbye")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	public String sayGoodbye(User user) {
		String name = user.getName();
		return "Goodbye " + name;
	}
}
