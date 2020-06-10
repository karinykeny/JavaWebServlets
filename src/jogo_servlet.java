

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


@WebServlet("/jogo_servlet")
public class jogo_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public jogo_servlet() {
        super();
    }
    String opcao;
    String jogador2;
    String escolha;
    String vez="";
    String cor;
    String msg;
    String sim;
    int cont = 1;
    String[] tabuleiro = {"1","2","3","4","5","6","7","8","9"};

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		escolha = request.getParameter("escolha");
		vez = opcao;
		sim =request.getParameter("sim");		
		
		if(escolha != null) {
			msg ="";
		
			if (escolha.equals("1") && tabuleiro[0].equals("1")) {
				tabuleiro[0] = vez;
			}else if (escolha.equals("2") && tabuleiro[1].equals("2")) {
				tabuleiro[1] = vez;
			}else if (escolha.equals("3") && tabuleiro[2].equals("3")) {
				tabuleiro[2] = vez;
			}else if (escolha.equals("4") && tabuleiro[3].equals("4")) {
				tabuleiro[3] = vez;
			}else if (escolha.equals("5") && tabuleiro[4].equals("5")) {
				tabuleiro[4] = vez;
			}else if (escolha.equals("6") && tabuleiro[5].equals("6")) {
				tabuleiro[5] = vez;
			}else if (escolha.equals("7") && tabuleiro[6].equals("7")) {
				tabuleiro[6] = vez;
			}else if (escolha.equals("8") && tabuleiro[7].equals("8")) {
				tabuleiro[7] = vez;
			}else if (escolha.equals("9") && tabuleiro[8].equals("9")) {
				tabuleiro[8] = vez;
			}else {
				cont--;
				msg = "Escolha uma opção válida!";
			}
			
			if(tabuleiro[0].equals(tabuleiro[1]) && tabuleiro[1].equals(tabuleiro[2])){
				msg = tabuleiro[0] + " venceu!";
				cont = 2;
			}else if(tabuleiro[3].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[5])) {
				msg = tabuleiro[3] + " venceu!";
				cont = 2;
			}else if(tabuleiro[6].equals(tabuleiro[7]) && tabuleiro[7].equals(tabuleiro[8])) {
				msg = tabuleiro[6] + " venceu!";
				cont = 2;
			}else if(tabuleiro[0].equals(tabuleiro[3]) && tabuleiro[3].equals(tabuleiro[6])) {
				msg = tabuleiro[0] + " venceu!";
				cont = 2;
			}else if(tabuleiro[1].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[7])) {
				msg = tabuleiro[1] + " venceu!";
				cont = 2;
			}else if(tabuleiro[2].equals(tabuleiro[5]) && tabuleiro[5].equals(tabuleiro[8])) {
				msg = tabuleiro[2] + " venceu!";
				cont = 2;
			}else if(tabuleiro[2].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[6])) {
				msg = tabuleiro[2] + " venceu!";
				cont = 2;
			}else if(tabuleiro[0].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[8])) {
				msg = tabuleiro[0] + " venceu!";
				cont = 2;
			}else if(tabuleiro[0] != "1" && tabuleiro[1] != "2" && tabuleiro[2] != "3" &&
					   tabuleiro[3] != "4" && tabuleiro[4] != "5" && tabuleiro[5] != "6" &&
					   tabuleiro[6] != "7" && tabuleiro[7] != "8" && tabuleiro[8] != "9") {
				msg = "Deu velha!";
				cont = 2;
			}else {
				
				if(tabuleiro[0].equals(opcao) && tabuleiro[1].equals(opcao) && tabuleiro[2].equals("3")) {
					tabuleiro[2] = jogador2;
				}else if(tabuleiro[1].equals(opcao) && tabuleiro[2].equals(opcao) && tabuleiro[0].equals("1")) {
					tabuleiro[0] = jogador2;
				}else if(tabuleiro[0].equals(opcao) && tabuleiro[2].equals(opcao) && tabuleiro[1].equals("2")) {
					tabuleiro[1] = jogador2;
				}else if(tabuleiro[3].equals(opcao) && tabuleiro[4].equals(opcao) && tabuleiro[5].equals("6")) {
					tabuleiro[5] = jogador2;
				}else if(tabuleiro[4].equals(opcao) && tabuleiro[5].equals(opcao) && tabuleiro[3].equals("4")) {
					tabuleiro[3] = jogador2;
				}else if(tabuleiro[3].equals(opcao) && tabuleiro[5].equals(opcao) && tabuleiro[4].equals("5")) {
					tabuleiro[4] = jogador2;
				}else if(tabuleiro[6].equals(opcao) && tabuleiro[7].equals(opcao) && tabuleiro[8].equals("9")) {
					tabuleiro[8] = jogador2;
				}else if(tabuleiro[7].equals(opcao) && tabuleiro[8].equals(opcao) && tabuleiro[6].equals("7")) {
					tabuleiro[6] = jogador2;
				}else if(tabuleiro[6].equals(opcao) && tabuleiro[8].equals(opcao) && tabuleiro[7].equals("8")) {
					tabuleiro[7] = jogador2;
				}else if(tabuleiro[0].equals(opcao) && tabuleiro[3].equals(opcao) && tabuleiro[6].equals("7")) {
					tabuleiro[6] = jogador2;
				}else if(tabuleiro[3].equals(opcao) && tabuleiro[6].equals(opcao) && tabuleiro[0].equals("1")) {
					tabuleiro[0] = jogador2;
				}else if(tabuleiro[0].equals(opcao) && tabuleiro[6].equals(opcao) && tabuleiro[3].equals("4")) {
					tabuleiro[3] = jogador2;
				}else if(tabuleiro[1].equals(opcao) && tabuleiro[4].equals(opcao) && tabuleiro[7].equals("8")) {
					tabuleiro[7] = jogador2;
				}else if(tabuleiro[1].equals(opcao) && tabuleiro[7].equals(opcao) && tabuleiro[4].equals("5")) {
					tabuleiro[4] = jogador2;
				}else if(tabuleiro[4].equals(opcao) && tabuleiro[7].equals(opcao) && tabuleiro[1].equals("2")) {
					tabuleiro[1] = jogador2;
				}else if(tabuleiro[2].equals(opcao) && tabuleiro[5].equals(opcao) && tabuleiro[8].equals("9")) {
					tabuleiro[8] = jogador2;
				}else if(tabuleiro[5].equals(opcao) && tabuleiro[8].equals(opcao) && tabuleiro[2].equals("3")) {
					tabuleiro[2] = jogador2;
				}else if(tabuleiro[2].equals(opcao) && tabuleiro[8].equals(opcao) && tabuleiro[5].equals("6")) {
					tabuleiro[5] = jogador2;
				}else if(tabuleiro[2].equals(opcao) && tabuleiro[4].equals(opcao) && tabuleiro[6].equals("7")) {
					tabuleiro[6] = jogador2;
				}else if(tabuleiro[4].equals(opcao) && tabuleiro[6].equals(opcao) && tabuleiro[2].equals("3")) {
					tabuleiro[2] = jogador2;
				}else if(tabuleiro[2].equals(opcao) && tabuleiro[6].equals(opcao) && tabuleiro[4].equals("5")) {
					tabuleiro[4] = jogador2;
				}else if(tabuleiro[0].equals(opcao) && tabuleiro[4].equals(opcao) && tabuleiro[8].equals("9")) {
					tabuleiro[8] = jogador2;
				}else if(tabuleiro[4].equals(opcao) && tabuleiro[8].equals(opcao) && tabuleiro[0].equals("1")) {
					tabuleiro[0] = jogador2;
				}else if(tabuleiro[0].equals(opcao) && tabuleiro[8].equals(opcao) && tabuleiro[4].equals("5")) {
					tabuleiro[4] = jogador2;
				}else if(tabuleiro[4].equals("5")) {
					tabuleiro[4] = jogador2;
				}else if (tabuleiro[1].equals("2")) {
					tabuleiro[1] = jogador2;
				}else if (tabuleiro[7].equals("8")) {
					tabuleiro[7] = jogador2;
				}else if (tabuleiro[3].equals("4")) {
					tabuleiro[3] = jogador2;
				}else if (tabuleiro[5].equals("6")) {
					tabuleiro[5] = jogador2;
				}else if (tabuleiro[8].equals("9")) {
					tabuleiro[8] = jogador2;
				}else if (tabuleiro[6].equals("7")) {
					tabuleiro[6] = jogador2;
				}else if (tabuleiro[0].equals("1")) {
					tabuleiro[0] = jogador2;
				}else if (tabuleiro[2].equals("3")) {
					tabuleiro[2] = jogador2;
				}
			}
		}		
		
		if(cont == 1 && sim == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("tabuleiro.jsp");
			request.setAttribute("um", tabuleiro[0]);
			request.setAttribute("dois", tabuleiro[1]);
			request.setAttribute("tres", tabuleiro[2]);
			request.setAttribute("quatro", tabuleiro[3]);
			request.setAttribute("cinco", tabuleiro[4]);
			request.setAttribute("seis", tabuleiro[5]);
			request.setAttribute("sete", tabuleiro[6]);
			request.setAttribute("oito", tabuleiro[7]);
			request.setAttribute("nove", tabuleiro[8]);
			request.setAttribute("msg", msg);
			request.setAttribute("cor", cor);
			dispatcher.forward(request, response);			
		}else if(cont == 2 && sim == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("venceu.jsp");
			request.setAttribute("um", tabuleiro[0]);
			request.setAttribute("dois", tabuleiro[1]);
			request.setAttribute("tres", tabuleiro[2]);
			request.setAttribute("quatro", tabuleiro[3]);
			request.setAttribute("cinco", tabuleiro[4]);
			request.setAttribute("seis", tabuleiro[5]);
			request.setAttribute("sete", tabuleiro[6]);
			request.setAttribute("oito", tabuleiro[7]);
			request.setAttribute("nove", tabuleiro[8]);
			request.setAttribute("msg", msg);
			request.setAttribute("cor", cor);
			dispatcher.forward(request, response);
		}else if(sim != null || sim == ""){
			response.setContentType( "text/html" );
	        PrintWriter out = response.getWriter();
	        
	        sim = null;
	        cont = 1;
	        tabuleiro[0] = "1"; tabuleiro[1] = "2"; tabuleiro[2] = "3";
	        tabuleiro[3] = "4"; tabuleiro[4] = "5"; tabuleiro[5] = "6";
	        tabuleiro[6] = "7"; tabuleiro[7] = "8"; tabuleiro[8] = "9";	        
	        
			out.println("<form action = \"http://localhost:8080/jogoDaVelhaPJ/jogo_servlet\" method = \"post\">"); 
	        out.println( "<H1>Vamos jogar o jogo da velha!</H1><br />");
	        out.println( "<h3>Escolha 'X' ou 'O':</h3>"); 
	        out.println( "<input type='radio' id='male' name='opcao' value='X'><label for='male'>X</label><br>");
	        out.println( "<input type='radio' id='female' name='opcao' value='O'><label for='female'>O</label><br/><br/>");
	        out.println( "<input type ='submit' value ='Iniciar'/>");
	        out.println( "</form>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		opcao = request.getParameter("opcao");
				
		if(opcao.equals("X")) {
			jogador2 = "O";
		}else {
			jogador2 = "X";
		}		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("tabuleiro.jsp");
		request.setAttribute("um", tabuleiro[0]);
		request.setAttribute("dois", tabuleiro[1]);
		request.setAttribute("tres", tabuleiro[2]);
		request.setAttribute("quatro", tabuleiro[3]);
		request.setAttribute("cinco", tabuleiro[4]);
		request.setAttribute("seis", tabuleiro[5]);
		request.setAttribute("sete", tabuleiro[6]);
		request.setAttribute("oito", tabuleiro[7]);
		request.setAttribute("nove", tabuleiro[8]);
		dispatcher.forward(request, response);			
	}

}
