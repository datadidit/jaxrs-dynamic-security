package com.datadidit.basic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Hello world!
 *
 */
@Path("hello")
public class BasicResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "hello";
	}

	@Path("/world")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String world() {
		return "world";
	}
}
