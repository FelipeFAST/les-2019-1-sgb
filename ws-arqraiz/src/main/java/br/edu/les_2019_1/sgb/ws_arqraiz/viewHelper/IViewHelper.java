package br.edu.les_2019_1.sgb.ws_arqraiz.viewHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Entidade;
import br.edu.les_2019_1.sgb.ws_arqraiz.entidade.Resultado;

/**
 * Sabe particularidades sobre a tela e ajuda a controlar a mesma, tanto recebendo, quanto formatando e devolvendo dados.
 * É usada no projeto para "montar" uma Entidade específica e determinar a Tela correta no final de uma operação.
 * @author FelipeFAST
 */
public interface IViewHelper {
    
    Entidade getEntidade(HttpServletRequest request);
    
    void setTela(Resultado resultado, HttpServletRequest request, HttpServletResponse response);
    
}
