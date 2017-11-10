package swwg.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * The context initializer used to collect the words from the database
 * and store it into the {@link ServletContext} for the current session.
 *
 * @author Luka Cupic
 */
@WebListener
public class InitializationServlet implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		String path = servletContextEvent.getServletContext().getRealPath("/WEB-INF/data.txt");

		List<String> data = null;
		try {
			data = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		servletContextEvent.getServletContext().setAttribute("data", data);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
	}
}