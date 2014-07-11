package br.ufrn.cerescaico.bsi.sigest.bo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.ufrn.cerescaico.bsi.sigest.dao.CursoJpaController;
import br.ufrn.cerescaico.bsi.sigest.dao.exceptions.PreexistingEntityException;
import br.ufrn.cerescaico.bsi.sigest.dao.util.JPAUtil;
import br.ufrn.cerescaico.bsi.sigest.model.Curso;

/**
 * Classe que representa a Entidade de Negócio para Curso.
 * @author taciano
 */
public class CursoBO extends AbstractBO {

    /**
     * Logger.
     */
    private static final Logger logger = Logger.getLogger(CursoBO.class.getName());

    private CursoJpaController dao;

    public CursoBO() {
        this.dao = new CursoJpaController(JPAUtil.EMF);
    }

    /**
     * Insere um novo curso.
     * @param curso O novo curos.
     * @return O curso inserido com a chave primária preenchida.
     * @throws NegocioException Caso ocorra erro na inserção.
     */
    public Curso inserir(Curso curso) throws NegocioException {
        try {
            return dao.create(curso);
        }
        catch (PreexistingEntityException ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            throw new NegocioException("erro.curso.bo.inserir.PreexistingEntityException",ex);
        }
        catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            throw new NegocioException("erro.curso.bo.inserir.exception",ex);
        }
    }

    public void excluir(Integer codigo) throws NegocioException {
        try {
            dao.destroy(codigo);
        }catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            throw new NegocioException("erro.curso.bo.excluir.exception", ex);
        }
    }

    public List<Curso> listar() throws NegocioException {
        try {
            return dao.findCursoEntities();
        }
        catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            throw new NegocioException("erro.curso.bo.listar", ex);
        }
    }

    /**
     * Busca a entidade pela chave primária.
     * @param id Chave primária da entidade.
     * @return A entidade encontrada ou <code>null</code>, caso contrário.
     * @throws NegocioException Caso ocorra algum problema ao acessar os dados.
     */
    public Curso buscarCurso(Integer id) throws NegocioException {
        try {
            return dao.findCurso(id);
        }
        catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            throw new NegocioException("erro.curso.bo.buscarCurso", ex);
        }
    }

    public Curso buscarCursoPorNome(String nome) throws NegocioException{
        try{
            return dao.buscarPorNome(nome);
        }catch (Exception ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
            throw new NegocioException("erro.curso.bo.buscarCurso", ex);
        }
    }
}
