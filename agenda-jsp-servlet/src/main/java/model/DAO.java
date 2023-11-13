package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	/* Módulo de Conexão */
	/** The driver. */
	// Parâmetros de Conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://localhost:3306/agendajava?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "12345";
	
	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	// Método de Conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Teste conexao.
	 */
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * CRUD MÉTODOS.
	 *
	 * @param contato the contato
	 */
	
	// crud create
	public void inserirContato(JavaBeans contato) {
		String create = "INSERT INTO contatos (nome, fone, email) VALUES (?, ?, ?)";
		
		try {
			// abrir conexão com bd
			Connection con = conectar();
			// Preparar a query para execucao no bd
			PreparedStatement pst = con.prepareStatement(create);
			// Substituir '?' pelo conteúdo das variáveis
			pst.setString(1, contato.getName());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			// Executar a query
			pst.executeUpdate();
			// Encerrar conexão com o bd
			con.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Listar contatos.
	 *
	 * @return the array list
	 */
	// crud read
	public ArrayList<JavaBeans> listarContatos() {
		String read = "SELECT * FROM contatos";
		ArrayList<JavaBeans> contatos = new ArrayList<>();
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			
			// enquanto houver linhas executa
			while(rs.next()) {
				// variaveis que recebem as variveis do bd
				String idcon = rs.getString(1);
				String nome = rs.getString(2);
				String fone = rs.getString(3);
				String email = rs.getString(4);
				
				// add ao array
				contatos.add(new JavaBeans(idcon, nome, fone, email));	
			}
			con.close();
			
			return contatos;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Selecionar contato.
	 *
	 * @param contato the contato
	 */
	// crud update
	public void selecionarContato(JavaBeans contato) {
		String read2 = "SELECT * FROM contatos WHERE idcon = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, contato.getIdcon());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				contato.setIdcon(rs.getString(1));
				contato.setName(rs.getString(2));
				contato.setFone(rs.getString(3));
				contato.setEmail(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Alterar contato.
	 *
	 * @param contato the contato
	 */
	// editar o contato
	public void alterarContato(JavaBeans contato) {
		String update = "UPDATE contatos SET nome=?, fone=?, email=? WHERE idcon=?";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, contato.getName());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getIdcon());
			pst.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Deletar contato.
	 *
	 * @param contato the contato
	 */
	// crud delete
	public void deletarContato(JavaBeans contato) {
		String delete = "DELETE FROM contatos WHERE idcon=?";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, contato.getIdcon());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
