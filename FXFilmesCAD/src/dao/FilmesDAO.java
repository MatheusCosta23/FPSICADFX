package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.unibrasil.jbdc.CNXJDBC;
import entidade.Filmes;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;

public class FilmesDAO {

	private ListView<Filmes> lvListar;
	private final String SQL_INSERE_FILME = "INSERT INTO \"PUBLIC\".\"FILMES\"(\"NOME_FILME\", \"DIRETOR\", \"ANO\", \"GENERO\") VALUES (?,?,?,?);";
	private final String SQL_ALTERAR_FILME = "UPDATE FILMES SET NOME_FILME=?, DIRETOR=?, ANO=?, GENERO=? WHERE ID_FILME=?;";
	private final String SQL_EXCLUIR_FILME = "DELETE FROM FILMES WHERE ID_FILME=?";
	private final String SQL_SELECIONAR_FILME = "SELECT * FROM FILMES";
	
	private PreparedStatement pst = null;
	
	///INSERIR
	public boolean inserirFilme(Filmes umFilme)
	{
		boolean ret = false;
		Connection cone = CNXJDBC.Conecta();
		try {
			
			pst = cone.prepareStatement(SQL_INSERE_FILME);
			pst.setString(1, umFilme.getNomeFilme());
			pst.setString(2, umFilme.getDiretor());
			pst.setInt(3, umFilme.getAno());
			pst.setString(4, umFilme.getGenero());
			ret = pst.execute();
			pst.close();
			CNXJDBC.FecharCone();
		} catch (Exception e) {
			System.out.println("Erro ao executar o Statment" +e.toString());
		}
		
		return ret;
		
	}

	//LISTAR
	public ArrayList<Filmes> ListarAllFilmes()
	{
		ArrayList<Filmes> ListFilms = new ArrayList<Filmes>();
		Connection cone = CNXJDBC.Conecta();
		Filmes umFilme;
		
		try {
			pst = cone.prepareStatement(SQL_SELECIONAR_FILME);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				umFilme = new Filmes();
				umFilme.setId(rs.getInt("ID_FILME"));
				umFilme.setNomeFilme(rs.getString("NOME_FILME"));
				umFilme.setDiretor(rs.getString("DIRETOR"));
				umFilme.setAno(rs.getInt("ANO"));
				umFilme.setGenero(rs.getString("GENERO"));
				ListFilms.add(umFilme);
			}
			///Mudei aqui
			lvListar.setItems(FXCollections.observableArrayList(ListFilms));
			//
			rs.close();
			pst.close();
			CNXJDBC.FecharCone();
		} catch (Exception e) {
			System.out.println("Erro ao executar o Statement" + e.toString());
		}
		
		return ListFilms;
	}
}
