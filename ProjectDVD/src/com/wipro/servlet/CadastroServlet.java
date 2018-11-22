package com.wipro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}
	
	protected void doAction(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String diretor = req.getParameter("diretor");
		String ano = req.getParameter("ano");
		String sinopse = req.getParameter("sinopse");
		
		DVD dvd = new DVD();
		dvd.setNome();
		dvd.setDiretor();
		dvd.setAnoDePublicacao();
		dvd.setSinopse();
		
		saveAllDVD(dvd);
		
	}

}
