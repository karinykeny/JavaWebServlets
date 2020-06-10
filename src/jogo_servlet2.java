

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modal.Jogador;


@WebServlet("/jogo_servlet2")
public class jogo_servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public jogo_servlet2() {
        super();
    }
    String opcao;
    String jogador2;
    List<Jogador> lista = new ArrayList<>();
    String um= opcao,dois="2",tres="3",quatro="4",cinco="5",seis="6",sete="7",oito="8",nove="10";


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("tabuleiro.jsp");
//		request.setAttribute("opcao", opcao);
//		request.setAttribute("jogador2", jogador2);
		request.setAttribute("um", um);
		request.setAttribute("dois", dois);
		request.setAttribute("tres", tres);
		request.setAttribute("quatro", quatro);
		request.setAttribute("cinco", cinco);
		request.setAttribute("seis", seis);
		request.setAttribute("sete", sete);
		request.setAttribute("oito", oito);
		request.setAttribute("nove", nove);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("1")) {
			um = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("2")) {
			dois = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("3")) {
			tres = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("4")) {
			quatro = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("5")) {
			cinco = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("6")) {
			seis = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("7")) {
			sete = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("8")) {
			oito = "X";
		}else if (request.getParameter("escolha").isEmpty() && request.getParameter("escolha").equals("9")) {
			nove = "X";
		}
		
		response.sendRedirect("jogo_servlet2");				
	}

}
