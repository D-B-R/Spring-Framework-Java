package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi 

@WebServlet(urlPatterns="/oi")

public class OiMundoServlet extends HttpServlet  {
	
	
	@Override // anota��o para o compilador
	protected void service(HttpServletRequest req, HttpServletResponse resp)  {
	
		
	}
	

}
