package swwg.servlets;

import swwg.util.RandUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * The servlet used for generating and returning a random word from the
 * context of the servlet.
 *
 * @author Luka Čupić
 */
@WebServlet("/servlets/generator")
public class GeneratorServlet extends HttpServlet {

	@Override
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> data = (List<String>) req.getServletContext().getAttribute("data");
		int rand = RandUtil.getRandomInt(0, data.size() - 1);

		resp.getWriter().write(data.get(rand));
	}
}