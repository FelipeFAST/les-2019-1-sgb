package br.edu.les_2019_1.sgb.ws_arqraiz.strategy;

import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Entidade;
import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Resultado;

/**
 * Trecho de código "terceirizado", geralmente utilizado para implementar diversas lógicas para uma mesma funcionadidade.
 * É usada no projeto para implementar as Regras de Negócio e Requisitos Não Funcionais, específicas para cada Entidade.
 * @author FelipeFAST
 * @param <T> Subclasse de Entidade, tornará as estratégias específicas para cada Entidade.
 */
public interface IStrategy<T extends Entidade> {
    
    Resultado processar(T entidade);
    
}
