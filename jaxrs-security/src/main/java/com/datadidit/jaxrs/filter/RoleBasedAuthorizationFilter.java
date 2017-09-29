package com.datadidit.jaxrs.filter;

import java.io.IOException;
import java.security.Principal;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

/**
 * Filter for dynamically seeing if a user can access a REST Endpoint
 *
 */
@Provider
@PreMatching
public class RoleBasedAuthorizationFilter implements ContainerRequestFilter{

	public void filter(ContainerRequestContext requestContext) throws IOException {
		SecurityContext sc = requestContext.getSecurityContext();
		Principal principal = sc.getUserPrincipal();
		
		System.out.println("===================================");
		System.out.println("Principal: "+principal);
		System.out.println("Method: "+requestContext.getMethod());
		System.out.println("URI: "+requestContext.getUriInfo().getPath());
		System.out.println("===================================");
	}
}
