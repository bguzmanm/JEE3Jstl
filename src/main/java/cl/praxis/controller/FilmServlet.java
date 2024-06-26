package cl.praxis.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.Film;

@WebServlet("/films")
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FilmServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Film> films = new ArrayList<Film>();
		
		films.add(new Film(1, "Gladiador", "Erase una vez un gladiador enamorado de otro gladiador. Una historia tormentosa...", 2004));
		films.add(new Film(2, "Interestelar", "Erase una vez un astronauta que abandona a su hija y le rompe el corazón", 2015));
		films.add(new Film(3, "IntelliJ vs Eclipse: The clash of the IDEs", "¿Cual reunirá más fanaticos?", 2024));
		
		request.setAttribute("films", films);
		getServletContext().getRequestDispatcher("/films.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
