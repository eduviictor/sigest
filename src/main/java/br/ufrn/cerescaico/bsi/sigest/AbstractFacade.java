package br.ufrn.cerescaico.bsi.sigest;

import br.ufrn.cerescaico.bsi.sigest.bo.AvaliacaoBO;
import br.ufrn.cerescaico.bsi.sigest.bo.CursoBO;
import br.ufrn.cerescaico.bsi.sigest.bo.EstagiarioBO;
import br.ufrn.cerescaico.bsi.sigest.bo.EstagioBO;
import br.ufrn.cerescaico.bsi.sigest.bo.EmpresaBO;
import br.ufrn.cerescaico.bsi.sigest.bo.ProfessorBO;

/**
 * Classe Abstrata para a Fachada do sistema Sigest.
 *
 * @author Taciano de Morais Silva - tacianosilva@gmail.com
 * @version 25/10/2012, Taciano de Morais Silva - tacianosilva@gmail.com
 * @since 25/10/2012
 */
class AbstractFacade {

    /**
     * @return
     */
    protected CursoBO createCursoBO() {
        return new CursoBO();
    }

    /**
     * @return
     */
    protected EstagiarioBO createEstagiarioBO() {
        return new EstagiarioBO();
    }

    /**
     * @return
     */
    protected EstagioBO createEstagioBO() {
        return new EstagioBO();
    }

    /**
     * @return
     */
    protected EmpresaBO createEmpresaBO() {
        return new EmpresaBO();
    }

    protected ProfessorBO createProfessorBO(){
        return new ProfessorBO();
    }

    protected AvaliacaoBO createAvaliacaoBO(){
        return new AvaliacaoBO();
    }
}
