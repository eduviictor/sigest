package br.ufrn.cerescaico.bsi.sigest;

import br.ufrn.cerescaico.bsi.sigest.bo.CursoBO;
import br.ufrn.cerescaico.bsi.sigest.bo.EmpresaBO;

/**
 * Classe Abstrata para a Fachada do sistema Sigest.
 * 
 * @author Taciano de Morais Silva - tacianosilva@gmail.com
 * @version 25/10/2012, Taciano de Morais Silva - tacianosilva@gmail.com
 * @since 25/10/2012
 */
class AbstractFacade {

	protected CursoBO createCursoBO() {
		return new CursoBO();
	}
	
	protected EmpresaBO createEmpresaBO(){
		return new EmpresaBO();
	}
}
