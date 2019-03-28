package br.edu.les_2019_1.sgb.ws_arqraiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.les_2019_1.sgb.ws_arqraiz.command.EditarCmd;
import br.edu.les_2019_1.sgb.ws_arqraiz.command.ExcluirCmd;
import br.edu.les_2019_1.sgb.ws_arqraiz.command.ICommand;
import br.edu.les_2019_1.sgb.ws_arqraiz.command.ListarCmd;
import br.edu.les_2019_1.sgb.ws_arqraiz.command.SalvarCmd;
import br.edu.les_2019_1.sgb.ws_arqraiz.utilidade.Utilidades;

/**
 *
 * @author FelipeFAST
 */
@WebServlet(name = "Servlet", urlPatterns = {"/servlet"})
public class Servlet extends HttpServlet {

    Map<String, ICommand> commands;
    
    public Servlet() {
        commands = new HashMap<String, ICommand>();
        
        commands.put(Utilidades.SALVAR, new SalvarCmd());
        commands.put(Utilidades.LISTAR, new ListarCmd());
        commands.put(Utilidades.EDITAR, new EditarCmd());
        commands.put(Utilidades.EXCLUIR, new ExcluirCmd());
    }
    
	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
