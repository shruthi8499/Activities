package com.hello;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyServlet  extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		out.println("Hello from servlet");
	}

}
