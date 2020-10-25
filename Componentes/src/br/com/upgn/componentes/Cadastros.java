/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.upgn.componentes;

import br.com.upgn.componentes.dao.ComponentesDAO;
import br.com.upgn.componentes.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Desenvolvido por Marco Antonio Nascimento Jr (2018)
 */
public class Cadastros extends javax.swing.JFrame {

    public Cadastros() {
        initComponents();
        readJTable();
        jLabelValorTotal.setText(String.valueOf(contTotal()));
        jLabelTotalCriados.setText(String.valueOf(contCriados()));
        jLabelTotalCancelados.setText(String.valueOf(contCancelados()));
        jLabelTotalErrado.setText(String.valueOf(contErrado()));
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ComponentesDAO cdao = new ComponentesDAO();
        for (Componentes c : cdao.read()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getPipe(),
                c.getData(),
                c.getComp(),
                c.getSpec(),
                c.getClasse(),
                c.getDiam1(),
                c.getDiam2(),
                c.getStatus(),});
        }
    }

    public void readTableNome(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ComponentesDAO cdao = new ComponentesDAO();
        for (Componentes c : cdao.readFornome(nome)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getPipe(),
                c.getData(),
                c.getComp(),
                c.getSpec(),
                c.getClasse(),
                c.getDiam1(),
                c.getDiam2(),
                c.getStatus(),});
        }
    }

    public void readTableComp(String comp) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ComponentesDAO cdao = new ComponentesDAO();
        for (Componentes c : cdao.readForcomp(comp)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getPipe(),
                c.getData(),
                c.getComp(),
                c.getSpec(),
                c.getClasse(),
                c.getDiam1(),
                c.getDiam2(),
                c.getStatus(),});
        }
    }

    public void readTableSpec(String spec) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ComponentesDAO cdao = new ComponentesDAO();
        for (Componentes c : cdao.readForspec(spec)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getPipe(),
                c.getData(),
                c.getComp(),
                c.getSpec(),
                c.getClasse(),
                c.getDiam1(),
                c.getDiam2(),
                c.getStatus(),});
        }
    }

    public void readTableStatus(String status) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ComponentesDAO cdao = new ComponentesDAO();
        for (Componentes c : cdao.readForStatus(status)) {
            modelo.addRow(new Object[]{
                c.getId(),
                //c.getNome(),
                //c.getPipe(),
                //c.getData(),
                //c.getComp(),
                //c.getSpec(),
                //c.getClasse(),
                //c.getDiam1(),
                //c.getDiam2(),
                c.getStatus(),});
        }
    }

    public int contTotal() {
        Connection con = ConnectionFactory.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(nome)AS total FROM componentes");
            rs.next();
            int count = rs.getInt("total");
            return count;
        } catch (SQLException ex) {
            //Logger.getLogger(ContCriado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contTotal();
    }
    
    public int contCriados() {
        Connection con = ConnectionFactory.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery ("SELECT COUNT(nome) AS criados FROM componentes where status = 'criado'");
            rs.next();
            int count = rs.getInt("criados");
            return count;
        } catch (SQLException ex) {
            //Logger.getLogger(ContCriado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contCriados();
    }
    
    public int contCancelados() {
        Connection con = ConnectionFactory.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery ("SELECT COUNT(nome) AS cancelados FROM componentes where status = 'cancelado'");
            rs.next();
            int count = rs.getInt("cancelados");
            return count;
        } catch (SQLException ex) {
            //Logger.getLogger(ContCriado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contCancelados();
    }

    
    public int contErrado() {
        Connection con = ConnectionFactory.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery ("SELECT COUNT(nome) AS errados FROM componentes where status = 'Pedido Errado'");
            rs.next();
            int count = rs.getInt("errados");
            return count;
        } catch (SQLException ex) {
            //Logger.getLogger(ContCriado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contErrado();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldConsultaNome = new javax.swing.JTextField();
        jTextFieldConsultaComp = new javax.swing.JTextField();
        jButtonConsultaNome = new javax.swing.JButton();
        jButtonConsultaComp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldConsultaSpec = new javax.swing.JTextField();
        jButtonConsultaSpec = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonSalvarStatus = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSalvarStatus = new javax.swing.JComboBox<>();
        jLabelId = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelPipe = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelComp = new javax.swing.JLabel();
        jLabelSpec = new javax.swing.JLabel();
        jLabelClasse = new javax.swing.JLabel();
        jLabelDiam1 = new javax.swing.JLabel();
        jLabelDiam2 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabelCriados = new javax.swing.JLabel();
        jLabelTotalCriados = new javax.swing.JLabel();
        jLabelCancelados = new javax.swing.JLabel();
        jLabelTotalCancelados = new javax.swing.JLabel();
        jLabelErrado = new javax.swing.JLabel();
        jLabelTotalErrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);
        setSize(new java.awt.Dimension(1166, 584));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Pipe", "data", "Componente", "Spec", "Classe", "Diam 1", "Diam 2", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(1180, 592));
        jTable1.setMinimumSize(new java.awt.Dimension(1180, 592));
        jTable1.setPreferredSize(new java.awt.Dimension(1180, 10000));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(5).setMinWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(6).setMinWidth(60);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(7).setMinWidth(60);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(8).setMinWidth(60);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(9).setMinWidth(150);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(9).setMaxWidth(150);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Comp:");

        jButtonConsultaNome.setText("Consulta");
        jButtonConsultaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaNomeActionPerformed(evt);
            }
        });

        jButtonConsultaComp.setText("Consulta");
        jButtonConsultaComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaCompActionPerformed(evt);
            }
        });

        jLabel3.setText("Spec:");

        jButtonConsultaSpec.setText("Consulta");
        jButtonConsultaSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaSpecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultaNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldConsultaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonConsultaComp))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldConsultaSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConsultaSpec)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultaNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldConsultaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultaComp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldConsultaSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultaSpec))
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));

        jButtonSalvarStatus.setText("Salvar");
        jButtonSalvarStatus.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonSalvarStatus.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonSalvarStatus.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonSalvarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarStatusActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabel4.setText("Status:");

        jComboBoxSalvarStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STATUS", "Criado", "Excluido", "Aguardando Dados", "Cancelado", "Pedido Errado" }));

        jLabelId.setText("-");

        jLabelNome.setText("-");

        jLabelPipe.setText("-");

        jLabelData.setText("-");

        jLabelComp.setText("-");

        jLabelSpec.setText("-");

        jLabelClasse.setText("-");

        jLabelDiam1.setText("-");

        jLabelDiam2.setText("-");

        jLabelStatus.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSalvarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSalvarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelData))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelComp)
                                    .addComponent(jLabelPipe)
                                    .addComponent(jLabelNome))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelDiam1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                        .addComponent(jLabelDiam2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelSpec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelClasse)))
                                .addGap(114, 114, 114)))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxSalvarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelComp)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalvarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSpec)
                            .addComponent(jLabelClasse))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDiam1)
                            .addComponent(jLabelDiam2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelStatus))))
        );

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Desenvolvido por Marco Antonio Nascimento Jr (2018)");
        jLabel5.setOpaque(true);

        jLabelTotal.setText("Total :");

        jLabelValorTotal.setText("-");

        jLabelCriados.setText("Criados:");

        jLabelTotalCriados.setText("-");

        jLabelCancelados.setText("Cancel:");

        jLabelTotalCancelados.setText("-");

        jLabelErrado.setText("Errado:");

        jLabelTotalErrado.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTotal)
                .addGap(18, 18, 18)
                .addComponent(jLabelValorTotal)
                .addGap(72, 72, 72)
                .addComponent(jLabelCriados)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotalCriados)
                .addGap(75, 75, 75)
                .addComponent(jLabelCancelados)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotalCancelados)
                .addGap(62, 62, 62)
                .addComponent(jLabelErrado)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotalErrado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jLabelTotal)
                    .addComponent(jLabelTotalCriados)
                    .addComponent(jLabelCriados)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTotalCancelados)
                        .addComponent(jLabelErrado)
                        .addComponent(jLabelTotalErrado))
                    .addComponent(jLabelCancelados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        //ContStatus cs = new ContStatus();
         jLabelValorTotal.setText(String.valueOf(contTotal()));
         jLabelTotalCriados.setText(String.valueOf(contCriados()));
         jLabelTotalCancelados.setText(String.valueOf(contCancelados()));
        readJTable();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSalvarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarStatusActionPerformed
        // TODO add your handling code here:
        ComponentesDAO cdao = new ComponentesDAO();
        Componentes c = new Componentes();
        c.setId(Integer.parseInt(jLabelId.getText()));
        c.setNome(jLabelNome.getText());
        c.setPipe(jLabelPipe.getText());
        c.setData(jLabelData.getText());
        c.setComp(jLabelComp.getText());
        c.setSpec(jLabelSpec.getText());
        c.setClasse(jLabelClasse.getText());
        c.setDiam1(jLabelDiam1.getText());
        c.setDiam2(jLabelDiam2.getText());
        c.setStatus(jComboBoxSalvarStatus.getSelectedItem().toString());
        jLabelId.setText("-");
        jLabelNome.setText("-");
        jLabelPipe.setText("-");
        jLabelData.setText("-");
        jLabelComp.setText("-");
        jLabelSpec.setText("-");
        jLabelClasse.setText("-");
        jLabelDiam1.setText("-");
        jLabelDiam2.setText("-");
        jLabelStatus.setText("-");
        jComboBoxSalvarStatus.setSelectedItem("STATUS");

        cdao.update(c);

        readJTable();


    }//GEN-LAST:event_jButtonSalvarStatusActionPerformed

    private void jButtonConsultaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaNomeActionPerformed
        // TODO add your handling code here:
        ComponentesDAO cdao = new ComponentesDAO();
        Componentes c = new Componentes();
        readTableNome(jTextFieldConsultaNome.getText());
        jTextFieldConsultaNome.setText("");


    }//GEN-LAST:event_jButtonConsultaNomeActionPerformed

    private void jButtonConsultaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaCompActionPerformed
        // TODO add your handling code here:
        ComponentesDAO cdao = new ComponentesDAO();
        Componentes c = new Componentes();
        readTableComp(jTextFieldConsultaComp.getText());
        jTextFieldConsultaComp.setText("");


    }//GEN-LAST:event_jButtonConsultaCompActionPerformed

    private void jButtonConsultaSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaSpecActionPerformed
        // TODO add your handling code here:

        ComponentesDAO cdao = new ComponentesDAO();
        Componentes c = new Componentes();
        readTableSpec(jTextFieldConsultaSpec.getText());
        jTextFieldConsultaSpec.setText("");

    }//GEN-LAST:event_jButtonConsultaSpecActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //jTable1.setSelectionBackground(Color.DARK_GRAY);
        //jLabelId.setText("-");
        //jLabelNome.setText("-");
        //jLabelPipe.setText("-");
        //jLabelData.setText("-");
        //jLabelComp.setText("-");
        //jLabelSpec.setText("-");
        //jLabelClasse.setText("-");
        //jLabelDiam1.setText("-");
        //jLabelDiam2.setText("-");
        //jLabelStatus.setText("-");
        int linha = jTable1.getSelectedRow();
        jLabelId.setText(jTable1.getValueAt(linha, 0).toString());
        jLabelNome.setText(jTable1.getValueAt(linha, 1).toString());
        jLabelPipe.setText(jTable1.getValueAt(linha, 2).toString());
        jLabelData.setText(jTable1.getValueAt(linha, 3).toString());
        jLabelComp.setText(jTable1.getValueAt(linha, 4).toString());
        jLabelSpec.setText(jTable1.getValueAt(linha, 5).toString());
        jLabelClasse.setText(jTable1.getValueAt(linha, 6).toString());
        jLabelDiam1.setText(jTable1.getValueAt(linha, 7).toString());
        jLabelDiam2.setText(jTable1.getValueAt(linha, 8).toString());
        jLabelStatus.setText(jTable1.getValueAt(linha, 9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonConsultaComp;
    private javax.swing.JButton jButtonConsultaNome;
    private javax.swing.JButton jButtonConsultaSpec;
    private javax.swing.JButton jButtonSalvarStatus;
    private javax.swing.JComboBox<String> jComboBoxSalvarStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCancelados;
    private javax.swing.JLabel jLabelClasse;
    private javax.swing.JLabel jLabelComp;
    private javax.swing.JLabel jLabelCriados;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDiam1;
    private javax.swing.JLabel jLabelDiam2;
    private javax.swing.JLabel jLabelErrado;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPipe;
    private javax.swing.JLabel jLabelSpec;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotalCancelados;
    private javax.swing.JLabel jLabelTotalCriados;
    private javax.swing.JLabel jLabelTotalErrado;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldConsultaComp;
    private javax.swing.JTextField jTextFieldConsultaNome;
    private javax.swing.JTextField jTextFieldConsultaSpec;
    // End of variables declaration//GEN-END:variables
}
