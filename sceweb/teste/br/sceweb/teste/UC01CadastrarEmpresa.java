package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	
	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			empresaDAO = new EmpresaDAO();
			empresa = new Empresa();
			empresa.setNomeDaEmpresa("empresa x");
			empresa.setCnpj("89424232000180");
			empresa.setNomeFantasia("empresa x");
			empresa.setEndereco("rua taquari");
			empresa.setTelefone("2222");
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("37821733000105");
	}
	
	@Test
	public void CT01UC01FBCadastra_com_sucesso(){
		assertEquals(1,empresaDAO.adiciona(empresa));
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}


}
