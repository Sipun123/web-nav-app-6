package com.monami.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		ServletConfig config = getServletConfig();
		String x = config.getInitParameter("x");
		String y = config.getInitParameter("y");
		String z = config.getInitParameter("z");

		response.setContentType("text/html");
		out.println("First Servlet Working <br/>");

		// servlet context
		ServletContext context = getServletContext();
		ServletContext context1 = getServletConfig().getServletContext();
		String v1 = context.getInitParameter("v1");
		String vv1 = config.getServletContext().getInitParameter("v1");

		out.println("First Servlet Working <br/>");
		out.print("<br/>" + "Servlet Context: " + context);
		out.print("<br/>" + "Servlet Context1: " + context1);
		out.println("<br/>" + "Variable: " + v1);
		out.println("<br/>" + "Variable1: " + vv1);

		// servlet config
		out.print("<br/>"+"Servlet Config: " + config);
		out.println("<br/>" + "a: " + x);
		out.println("<br/>" + "b: " + y);
		out.println("<br/>" + "x: " + z);

		out.close();
	}}



