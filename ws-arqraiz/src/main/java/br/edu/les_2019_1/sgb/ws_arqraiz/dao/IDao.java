package br.edu.les_2019_1.sgb.ws_arqraiz.dao;

import java.util.List;

import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Entidade;

/**
 * Modulariza e detém toda a lógica de operacionalização com o Banco de Dados.
 * É usado no projeto para realizar as chamadas SQL ao Banco de Dados.
 * @author FelipeFAST
 * @param <T> Subclasse de Entidade, tornará os Dao específicos para cada Entidade.
 */
public interface IDao<T extends Entidade> {
    
    void salvar(T entidade);
    
    List<T> listar(T entidade);
    
    void editar(T entidade);
    
    void excluir(T entidade);
    
}
