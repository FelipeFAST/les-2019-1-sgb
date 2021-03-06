package br.edu.les_2019_1.sgb.ws_arqraiz.command;

import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Entidade;
import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Resultado;

/**
 * Comando que encapsula a chamada do método de editar da Facade.
 * @author FelipeFAST
 */
public class EditarCmd implements ICommand {

	public Resultado executar(Entidade entidade) {
		return FACADE.editar(entidade);
	}
	
}
