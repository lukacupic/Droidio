package hr.fer.zemris.java.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@WebListener
public class InitializationServlet implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		String filepath = servletContextEvent.getServletContext().getRealPath("/WEB-INF/data.txt");

		List<String> data = null;
		try {
			data = Files.readAllLines(Paths.get(filepath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		servletContextEvent.getServletContext().setAttribute("data", data);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
	}
}