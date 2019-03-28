package br.edu.les_2019_1.sgb.ws_arqraiz.facade;

import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Entidade;
import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Resultado;

/**
 * Abstrai a complexidade das operações para as camadas anteriores e orquestra a execução da operação em sua totalidade.
 * É usada no projeto para executar as operações do CRUD, 
 * processando todas as Regras de Negócios necessárias para aquela operação daquela Entidade específica e, posteriormente,
 * delegar ao Dao específico que faça a operação que foi solicitada.
 * @author FelipeFAST
 */
public interface IFacade {
 
    Resultado salvar(Entidade entidade);
    
    Resultado listar(Entidade entidade);
    
    Resultado editar(Entidade entidade);
    
    Resultado excluir(Entidade entidade);
    
}
