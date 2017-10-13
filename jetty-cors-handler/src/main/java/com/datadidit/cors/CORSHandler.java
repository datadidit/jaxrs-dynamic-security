package com.datadidit.cors;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

/**
 * Hello world!
 *
 */
public class CORSHandler extends AbstractHandler
{

	@Override
	public void handle(String arg0, Request arg1, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("GOT REQUEST!!!!!!!");
		if(request.getMethod().equals("OPTIONS")){
	        System.out.println("CORSFilter HTTP Request BS: " + request.getMethod());
	 
	        // Authorize (allow) all domains to consume the content
	        response.addHeader("Access-Control-Allow-Origin", "*");
	        response.addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
	        response.addHeader("Access-Control-Allow-Headers","Authorization");

	        // For HTTP OPTIONS verb/method reply with ACCEPTED status code -- per CORS handshake
	        if (request.getMethod().equals("OPTIONS")) {
	        	response.setStatus(HttpServletResponse.SC_ACCEPTED);
	            arg1.setHandled(true);
	        }			
		}
	}

}
