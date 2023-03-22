package br.sistema.crud.jdbc.gui;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.sistema.crud.jdbc.bo.ProdutoBO;
import br.sistema.crud.jdbc.dao.ProdutoDAO;
import br.sistema.crud.jdbc.dto.ProdutoDTO;

import java.awt.Color;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 7973973234717597809L;
	private JTabbedPane mainTabbedPane;
	private JLabel lblDispVenda;
	private JRadioButton rbtSim;
	private JRadioButton rbtNao;
	private JLabel lblValor;
	private JTextField txtValor;
	private JTextField txtNome;
	private JLabel lblNome;
	private JPanel panelListagem;
	private JPanel panelCadastro;
	private ButtonGroup grpDipVenda;
	private JButton btnCadastrar;
	private JPanel panelPrincipalCadastro;
	private JLabel lblIDValor;
	private JLabel lblValorUpdate;
	private JLabel lblDispVendaUpdate;
	private JTextField txtValorUpdate;
	private JRadioButton rbtNaoUpdate;
	private JRadioButton rbtSimUpdate;
	private JLabel lblNomeUpdate;
	private JTextField txtNomeUpdate;
	private JLabel lblDescricaoUpdate;
	private JTextField txtDescricaoUpdate;
	private List<Integer> idsProdutos = new ArrayList<Integer>();
	
	
	private ProdutoDTO ProdutoDTO;
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame inst = new MainFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MainFrame() {
		super();
		getContentPane().setForeground(Color.GREEN);
		getContentPane().setBackground(Color.GREEN);
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Principal");
			this.setPreferredSize(new java.awt.Dimension(1012, 619));
			{
				mainTabbedPane = new JTabbedPane();
				{
					panelCadastro = new JPanel();
					panelCadastro.setBackground(Color.gray);
					GroupLayout panelCadastroLayout = new GroupLayout((JComponent)panelCadastro);
					panelCadastro.setLayout(panelCadastroLayout);
					mainTabbedPane.addTab("Cadastro", null, panelCadastro, null);
					panelCadastro.setPreferredSize(new java.awt.Dimension(403, 255));
					panelCadastroLayout.setHorizontalGroup(panelCadastroLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panelCadastroLayout.createParallelGroup()
						    .addComponent(getPanelPrincipalCadastro(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
						    .addComponent(getPanelDipVenda(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE))
						.addGap(27)
						.addGroup(panelCadastroLayout.createParallelGroup()
						    .addGroup(GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
						        .addGap(260)
						        .addComponent(getBtnCadastrar(), GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)))
						.addContainerGap(37, 37));
					panelCadastroLayout.setVerticalGroup(panelCadastroLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panelCadastroLayout.createParallelGroup()
						    .addGroup(GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
						        .addComponent(getPanelPrincipalCadastro(), GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						        .addGap(18)
						        .addComponent(getPanelDipVenda(), GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
						.addGroup(panelCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(getBtnCadastrar(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(148, 148));
				}
				{
					panelListagem = new JPanel();
					panelListagem.setBackground(Color.gray);
					GroupLayout panelListagemLayout = new GroupLayout((JComponent)panelListagem);
					panelListagem.setLayout(panelListagemLayout);
					mainTabbedPane.addTab("Listagem", null, panelListagem, null);
					panelListagem.setPreferredSize(new java.awt.Dimension(965, 516));
					panelListagemLayout.setHorizontalGroup(panelListagemLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panelListagemLayout.createParallelGroup()
						    .addGroup(panelListagemLayout.createSequentialGroup()
						        .addComponent(getScrollListagem(), GroupLayout.PREFERRED_SIZE, 942, GroupLayout.PREFERRED_SIZE)
						        .addGap(0, 811, Short.MAX_VALUE))
						    .addComponent(getInternalUpdate(), GroupLayout.Alignment.LEADING, 0, 942, Short.MAX_VALUE))
						.addContainerGap());
					panelListagemLayout.setVerticalGroup(panelListagemLayout.createSequentialGroup()
						.addContainerGap());
				}
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(mainTabbedPane, 0, 548, Short.MAX_VALUE)
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(mainTabbedPane, 0, 970, Short.MAX_VALUE)
				.addContainerGap());
			pack();
			this.setSize(1012, 619);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private JRadioButton getRbtMasculino() {
		if(rbtNao == null) {
			rbtNao = new JRadioButton();
			rbtNao.setText("Não");
			rbtNao.setSelected(true);
			getGrpDispVenda().add(rbtNao);
		}
		return rbtNao;
	}
	
	private JRadioButton getJRadioButton1() {
		if(rbtSim == null) {
			rbtSim = new JRadioButton();
			rbtSim.setText("Sim");
			getGrpDispVenda().add(rbtSim);
		}
		return rbtSim;
	}
	
	private JLabel getJLabel1() {
		if(lblSexo == null) {
			lblSexo = new JLabel();
			lblSexo.setText("Disponivel Venda:");
		}
		return lblSexo;
	}
	
	private ButtonGroup getGrpSexo() {
		if(grpSexo == null) {
			grpSexo = new ButtonGroup();
		}
		return grpSexo;
	}
	
		
	private JButton getBtnCadastrar() {
		if(btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("Cadastrar");
			btnCadastrar.setMnemonic(java.awt.event.KeyEvent.VK_C);
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					ProdutoDTO ProdutoDTO = new ProdutoDTO();
					EnderecoDTO enderecoDTO = new EnderecoDTO();
					ProdutoBO ProdutoBO = new ProdutoBO();
					try {
						String nome = txtNome.getText();
						String descricao = txtDescricao.getText();
						String valor = txtValor.getText();

						
						ProdutoDTO.setNome(nome);
						ProdutoDTO.setDescricao(descricao);
						ProdutoDTO.setValor(Long.parseLong(valor));
						
						char venda = rbtNao.isSelected() ? '0' : '1';
						ProdutoDTO.setSexo(venda);
						
												
						ProdutoDTO.setEnderecoDTO(enderecoDTO);
						ProdutoBO.cadastrar(ProdutoDTO);
						MensagensUtil.addMsg(MainFrame.this, "Cadastro efetuado com sucesso!");
						MainFrame.this.dispose();
						main(null);
					} catch (Exception e) {
						e.printStackTrace();
						MensagensUtil.addMsg(MainFrame.this, e.getMessage());
					}
				}
			});
		}
		return btnCadastrar;
	}
	
	private JTable getTableListagem() {
		final ProdutoBO ProdutoBO = new ProdutoBO();
		try {
			String[][] lista = ProdutoBO.listagem(idsProdutos);
			if(tableListagem == null) {
				tableListagem = new JTable();
			}
			TableModel tableListagemModel = 
					new DefaultTableModel(
							lista,
							new String[] { "Id", "Nome", "Descricao", "Valor", "Disp Venda"});
			tableListagem.setModel(tableListagemModel);
			
		} catch (NegocioException e) {
			e.printStackTrace();
		}
		return tableListagem;
	}
	
	
	private JScrollPane getScrollListagem() {
		if(scrollListagem == null) {
			scrollListagem = new JScrollPane();
			scrollListagem.setViewportView(getTableListagem());
		}
		return scrollListagem;
	}
	
	private JPanel getPanelTabelaList() {
		if(panelTabelaList == null) {
			panelTabelaList = new JPanel();
			panelTabelaList.setBackground(Color.gray);
			GroupLayout panelTabelaListLayout = new GroupLayout((JComponent)panelTabelaList);
			panelTabelaList.setLayout(panelTabelaListLayout);
			panelTabelaList.setBorder(BorderFactory.createTitledBorder("Listagem"));
			panelTabelaListLayout.setHorizontalGroup(panelTabelaListLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getScrollListConsulta(), 0, 912, Short.MAX_VALUE)
				.addContainerGap());
			panelTabelaListLayout.setVerticalGroup(panelTabelaListLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getScrollListConsulta(), 0, 155, Short.MAX_VALUE)
				.addContainerGap());
		}
		return panelTabelaList;
	}
	
	private JPanel getPanelPrincipalCadastro() {
		if(panelPrincipalCadastro == null) {
			panelPrincipalCadastro = new JPanel();
			panelPrincipalCadastro.setBackground(Color.gray);
			GroupLayout panelPrincipalCadastroLayout = new GroupLayout((JComponent)panelPrincipalCadastro);
			panelPrincipalCadastro.setLayout(panelPrincipalCadastroLayout);
			panelPrincipalCadastro.setBorder(BorderFactory.createTitledBorder("Produto"));
			{
				lblNome = new JLabel();
				lblNome.setText("Nome:");
			}
			{
				txtNome = new JTextField();
			}
			{
				lblDescricao = new JLabel();
				lblDescricao.setText("Descricao:");
			}
			{
				txtDescricao = new JTextField();
			}
			{
				lblValor = new JLabel();
				lblValor.setText("Valor:");
			}
			{
				txtValor = new JTextField();
			}
			panelPrincipalCadastroLayout.setVerticalGroup(panelPrincipalCadastroLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(panelPrincipalCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(txtNome, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblNome, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(panelPrincipalCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(txtDescricao, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblDescricao, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(txtValor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblValor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, GroupLayout.PREFERRED_SIZE)
				.addGroup(panelPrincipalCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJTextField1(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel1x(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(20, 20));
			panelPrincipalCadastroLayout.linkSize(SwingConstants.VERTICAL, new Component[] {lblCpf, lblNome});
			panelPrincipalCadastroLayout.linkSize(SwingConstants.VERTICAL, new Component[] {txtCpf, txtNome});
			panelPrincipalCadastroLayout.setHorizontalGroup(panelPrincipalCadastroLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(panelPrincipalCadastroLayout.createParallelGroup()
				    .addComponent(lblNome, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblCpf, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel1x(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(panelPrincipalCadastroLayout.createParallelGroup()
				    .addGroup(panelPrincipalCadastroLayout.createSequentialGroup()
				        .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
				    .addGroup(panelPrincipalCadastroLayout.createSequentialGroup()
				        .addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
				        .addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, panelPrincipalCadastroLayout.createSequentialGroup()
				        .addComponent(getJTextField1(), GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(49, Short.MAX_VALUE));
			panelPrincipalCadastroLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNome, lblDescricao, lblValor});
			panelPrincipalCadastroLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtNome, txtDescricao, txtValor});
		}
		return panelPrincipalCadastro;
	}
	
	private JPanel getPanelDipVenda() {
		if(panelDipVenda == null) {
			panelDipVenda = new JPanel();
			panelDipVenda.setBackground(Color.gray);
			GroupLayout panelDipVendaLayout = new GroupLayout((JComponent)panelDipVenda);
			panelDipVenda.setLayout(panelDipVendaLayout);
			panelDipVenda.setBorder(BorderFactory.createTitledBorder("Disponivel Venda"));
			panelDipVendaLayout.setHorizontalGroup(panelDipVendaLayout.createSequentialGroup()
				.addContainerGap(24, Short.MAX_VALUE)
				.addComponent(getJLabel1(), GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getRbtMasculino(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addComponent(getJRadioButton1(), GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(97, 97));
			panelDipVendaLayout.setVerticalGroup(panelDipVendaLayout.createSequentialGroup()
				.addContainerGap(20, 20)
				.addGroup(panelDipVendaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getRbtMasculino(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel1(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJRadioButton1(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(26, 26));
		}
		return panelDipVenda;
	}	

	public ProdutoDTO getProdutoDTO() {
		return ProdutoDTO;
	}	
}
