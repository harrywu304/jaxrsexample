package org.pub.wbjaxrsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.pub.hello.HelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Client client = ClientBuilder.newClient().register(HelloService.class);
    }
}
