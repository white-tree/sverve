package com.ice.funk;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet
{
	private String message;
public void init() throws ServletException
{
	message="Hello World!";
}

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		
response.setContentType("text");
PrintWriter out=response.getWriter();
out.println("<h1>"+message +"</h1>");

}
public void destory()
{
	System.out.println("Exiting, closing open com conections.");
}
}