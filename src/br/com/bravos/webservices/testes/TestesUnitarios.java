package br.com.bravos.webservices.testes;

import br.com.bravos.webservices.dao.ConexaoDAO;
import br.com.bravos.webservices.dao.UsuarioDAO;
import br.com.bravos.webservices.dao.PerfilUsuarioDAO;

/**
 * @author JamessonSena
 *
 */
public class TestesUnitarios {
	
	static int idOperacao = 1,idUsuario = 5,idPropriedade = 4,idPerfil = 1;
	static String email = "a@aaa", nome = "jamesson Sales de Sena", login = "jamesson9", senha = "admin";
	static boolean ativo = false;
	

	public static void main(String[] args) {
		usuarioRetornarEspecificoTest();
	}
	
	
	//Teste de conex�o com o sqlServer 2014
	public static void conexaoTest(){new ConexaoDAO().dbConnect();}
	
	//Teste execUsuarioConsultar
	private static void usuarioCadastrarTest(){
		UsuarioDAO loginDAO = new UsuarioDAO(new ConexaoDAO().dbConnect());
		loginDAO.execUsuarioCadastrar(idUsuario, login, senha, idPropriedade, ativo, email, nome, idPerfil);
	}
	//Teste usuarioRetornarTodos
	private static void usuarioRetornarTodosTest(){
		UsuarioDAO loginDAO = new UsuarioDAO(new ConexaoDAO().dbConnect());
		loginDAO.execUsuarioRetornarTodos();
	}
	//Teste execUsuarioRetornarEspecifico
	private static void usuarioRetornarEspecificoTest(){
		UsuarioDAO loginDAO = new UsuarioDAO(new ConexaoDAO().dbConnect());
		loginDAO.execUsuarioRetornarEspecifico(idOperacao, idUsuario, login, senha, idPropriedade, ativo, email, nome, idPerfil);
	}
	//Teste de conex�o com a procedure
	private static void procedurePerfilUsuarioTest(){
		PerfilUsuarioDAO perfilUsuarioDAO = new PerfilUsuarioDAO(new ConexaoDAO().dbConnect());
		perfilUsuarioDAO.execPerfilUsuario();
	}

}
