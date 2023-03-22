package br.sistema.crud.jdbc.bo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.sistema.crud.jdbc.dao.ProdutoDAO;
import br.sistema.crud.jdbc.dto.EnderecoDTO;
import br.sistema.crud.jdbc.dto.ProdutoDTO;
import br.sistema.crud.jdbc.exception.NegocioException;
import br.sistema.crud.jdbc.exception.ValidacaoException;

public class ProdutoBO {

	private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public void cadastrar(ProdutoDTO ProdutoDTO) throws NegocioException {
		try {
			ProdutoDAO ProdutoDAO = new ProdutoDAO();
			ProdutoDAO.inserir(ProdutoDTO);
		} catch(Exception exception) {
			exception.printStackTrace();
			throw new NegocioException(exception.getMessage());
		}
	}
	
	public String[][] listagem(List<Integer> idsProdutos) throws NegocioException {
		int numCols = 10;
		String[][] listaRetorno = null;
		try {
			ProdutoDAO ProdutoDAO = new ProdutoDAO();
			
			List<ProdutoDTO> lista = ProdutoDAO.listarTodos();
			listaRetorno = new String[lista.size()][numCols];
			
			for (int i = 0; i < lista.size(); i++) {
				ProdutoDTO Produto = lista.get(i);
				listaRetorno[i][0] = Produto.getIdProduto().toString();
				idsProdutos.add(Produto.getIdProduto());
				listaRetorno[i][1] = Produto.getNome();
				listaRetorno[i][2] = Produto.getDescricao();
				listaRetorno[i][3] = Produto.getValor().toString();
				listaRetorno[i][4] = Produto.getDisp_Venda();
			}
		} catch(Exception exception) {
			throw new NegocioException(exception.getMessage());
		}
		return listaRetorno;
	}	
}
