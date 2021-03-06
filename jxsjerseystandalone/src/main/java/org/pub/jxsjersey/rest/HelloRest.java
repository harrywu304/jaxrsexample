package org.pub.jxsjersey.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
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
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({ MediaType.APPLICATION_JSON })
	public Map sayGoodbye(@FormParam("name") String name) {
		Map<String,String> rt = new HashMap<String,String>();
		rt.put("echo", "Goodbye " + name);
		return rt;
	}
	
	
	@POST
	@Path("echo")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON })
	public User echo( User user) {
		user.setName("demo");
		return user;
	}
}
