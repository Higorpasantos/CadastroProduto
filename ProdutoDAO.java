package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO implements GenericoDAO<ProdutoDTO> {

	@Override
	public void inserir(ProdutoDTO ProdutoDTO) throws PersistenciaExcpetion {
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			String sql = "INSERT INTO TB_Produto(NOME, DESCRICAO, VALOR, DISP_VENDA) " +
					"VALUES(?, ?, ?, ?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, ProdutoDTO.getNome());
			statement.setString(2, ProdutoDTO.getDescricao());
			statement.setLong(3, ProdutoDTO.getValor());
			statement.setString(4, String.valueOf(ProdutoDTO.DispVenda()));
			
			statement.execute();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(), e);
		}
	}

	@Override
	public List<ProdutoDTO> listarTodos() throws PersistenciaExcpetion {
		List<ProdutoDTO> listaProdutos = new ArrayList<ProdutoDTO>();
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "SELECT * FROM TB_Produto ORDER BY valor desc";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				ProdutoDTO ProdutoDTO = new ProdutoDTO();			
				ProdutoDTO.setIdProduto(resultSet.getInt("id_Produto"));
				ProdutoDTO.setNome(resultSet.getString("nome"));
				ProdutoDTO.setDescricao(resultSet.getString("descricao"));
				ProdutoDTO.setValor(resultSet.getLong("valor"));
				ProdutoDTO.setDispVenda(resultSet.getString("disp_venda").charAt(0));
				
				listaProdutos.add(ProdutoDTO);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(), e);
		}
		return listaProdutos;
	}
	
}
