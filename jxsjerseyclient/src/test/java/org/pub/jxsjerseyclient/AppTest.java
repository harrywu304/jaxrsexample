package org.pub.jxsjerseyclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	@Test
    public void testApp()
    {
		Client client = ClientBuilder.newClient();
		
		//for get
		WebTarget target = client.target("http://localhost:9998").path("hello/sayhello/harry");
		String rt = target.request().get(String.class);
		System.out.println(rt);
		
		//for post
//		WebTarget target = client.target("http://localhost:9998").path("hello/saygoodbye");
//		Form form = new Form();
//		form.param("name", "foo");
//		 
//		String rt =
//		target.request(MediaType.APPLICATION_JSON_TYPE)
//		    .post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
//		        String.class);
//		System.out.println(rt);

    }
}
