package br.edu.les_2019_1.sgb.ws_arqraiz.command;

import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Entidade;
import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Resultado;
import br.edu.les_2019_1.sgb.ws_arqraiz.facade.Facade;
import br.edu.les_2019_1.sgb.ws_arqraiz.facade.IFacade;

/**
 * Encapsula a chamada de um método que realiza algo desejado.
 * É usado no projeto para encapsular as chamadas ao métodos da Facade.
 * @author FelipeFAST
 */
public interface ICommand {
    
    /*
    * Atributos em Interfaces são por default "static final".
    */
	IFacade FACADE = new Facade();
	
    Resultado executar(Entidade entidade);
    
}
