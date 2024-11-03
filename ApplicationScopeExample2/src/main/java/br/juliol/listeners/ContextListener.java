package br.juliol.listeners;

import java.sql.Connection;

import br.juliok.db.DbConnection;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("olá, aplicação encerrou.");
		
		boolean  isClosed = DbConnection.closeConnection();
		
		System.out.println("Db connection is closed: " + isClosed);
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//System.out.println("olá, aplicação iniciou."); 
		
		/**
		*
		*Este código executa apenas uma vez na aplicação inteira
		*garantindo que podemos abrir uma conexao apenas no banco como exemplo
		*por se tratar de um Listener q executa assim q inicia o tomcat e o ciclo de vids das servlets
		*a listener foi adicionada no web.xml
		*
		*um listener tem sua vida definida pelo lado do servidor/tomcat
			
		
		**/
		
		
		ServletContext servletcontext = sce.getServletContext();
		
		Connection con = DbConnection.openConnection();
		
		
		servletcontext.setAttribute("db-connection", con);
		
		System.out.println("Conexão está iniciada.");
		
		
		
		
	}
	
	

}
