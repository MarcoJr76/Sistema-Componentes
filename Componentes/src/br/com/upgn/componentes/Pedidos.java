/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.upgn.componentes;

import br.com.upgn.componentes.dao.ComponentesDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Desenvolvido por Marco Antonio Nascimento Jr (2018)
 */
public class Pedidos extends javax.swing.JFrame {

    public Pedidos() {
        initComponents();
        readJTable();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldConsultaNome = new javax.swing.JTextField();
        jTextFieldConsultaComp = new javax.swing.JTextField();
        jButtonConsultaNome = new javax.swing.JButton();
        jButtonConsultaComp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelPipe = new javax.swing.JLabel();
        jTextFieldPipe = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabelComp = new javax.swing.JLabel();
        jComboBoxComp = new javax.swing.JComboBox<>();
        jLabelSpec = new javax.swing.JLabel();
        jComboBoxSpec = new javax.swing.JComboBox<>();
        jLabelClasse = new javax.swing.JLabel();
        jComboBoxClasse = new javax.swing.JComboBox<>();
        jLabelDiam1 = new javax.swing.JLabel();
        jComboBoxDiam1 = new javax.swing.JComboBox<>();
        jLabelDiam2 = new javax.swing.JLabel();
        jComboBoxDiam2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);

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
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setPreferredSize(new java.awt.Dimension(1180, 10000));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldConsultaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultaComp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultaNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldConsultaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultaComp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jLabelPipe.setText("Pipe:");

        jTextFieldPipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPipeActionPerformed(evt);
            }
        });

        jLabelData.setText("Data:");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelComp.setText("Comp:");

        jComboBoxComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "BICO ASPERSOR", "BOCA DE LOBO", "BOCA DE LOBO C/REFORÇO", "BOCA DE LOBO C/REFORÇO INTEGRAL", "BUCHA DE REDUCAO", "BUJAO", "CAP", "CAP C/DERIV", "CARRETEL", "COLAR DE ENC.", "COLAR DE TOPO", "COLAR ROSC.", "CONECTOR FEMEA", "CONECTOR MACHO", "CURVA  45", "CURVA 90", "DEFLETOR DE JATO", "DFU 2 VIAS", "DFU 4 VIAS", "ENGATE RÁPIDO", "FE", "FO", "FIGURA 8", "FILTRO CESTO", "FILTRO T", "FILTRO TEMPORARIO", "FILTRO Y", "FLANGE CEGO", "FLANGE CEGO C/DERIV", "FLANGE DE ENCAIXE", "FLANGE DE ORIFÍCIO", "FLANGE DE PESCOÇO", "FLANGE NORSOK", "FLANGE PSV", "FLANGE ROSCADO", "FLANGE SOBREPOSTO", "FT", "JUNTA", "LG", "LIT", "LUVA", "LUVA ES x RO", "LUVA DE REDUCAO", "MANIFOLD", "MEDIDOR ULTRA.", "MEIA LUVA", "NIPLE DE RED. CONC.", "NIPLE DE RED. EXC.", "NIPLE RETO", "ORIFICIO DE RESTRIÇÃO", "PDIT", "PG", "PI", "PIT", "PLACA DE ORIFICIO", "PSV", "PSY", "PURGADOR BOIA", "PURGADOR TERM / FILTRO", "PURGADOR TIPO TERM PARA VAPOR", "RAQUETE", "REDUÇÃO CONC.", "REDUÇÃO CONC. C/DERIV", "REDUÇÃO EXC.", "REDUÇÃO EXC. C/DERIV", "RO", "SENSOR DE TEMPERATURA", "TÊ", "TÊ DE 45", "TÊ DE RED.", "TG", "THI", "TI", "TIT", "TUBO", "UNIÃO", "VALV. ANGULAR", "VALV. BORBOLETA", "VALV. BORBOLETA INSTRUMENTADA", "VALV 3 VIAS", "VALV. SOLENÓIDE 3 VIAS", "VALV. DILÚVIO", "VALV. ESFERA", "VALV. ESFERA  INSTRUMENTADA", "VALV. GAVETA", "VALV. GLOBO", "VALV. GLOBO  INSTRUMENTADA", "VALV. MACHO", "VALV. OBTURADOR DESLIZANTE", "VALV. RETENÇÃO", "VALV. TRIPLICE AÇÃO", "VISOR DE FLUXO", "VORTEX", " ", " " }));
        jComboBoxComp.setToolTipText("");
        jComboBoxComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompActionPerformed(evt);
            }
        });

        jLabelSpec.setText("Spec:");

        jComboBoxSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "/A10_KM8", "/B20_KM8", "/B31_KM8", "/B32_KM8", "/B32(KM8)_KM8", "/B35_KM8", "/B35(KM8)_KM8", "/B36_KM8", "/B36(KM8)_KM8", "/B37_KM8", "/B37(KM8)_KM8", "/B38_KM8", "/B38(KM8)_KM8", "/C20_KM8", "/C30_KM8", "/C32_KM8", "/C34_KM8", "/C35_KM8", "/C35(KM8)_KM8", "/C36_KM8", "/C36(KM8)_KM8", "/C37_KM8", "/C38_KM8", "/C38(KM8)_KM8", "/E20_KM8", "/E21_KM8", "/E22_KM8", "/E30_KM8", "/E30(KM8)_KM8", "/E31_KM8", "/E32_KM8", "/E35(KM8)_KM8", "/E35_KM8", "/E38_KM8", "/E40(KM8)_KM8", "/E40_KM8", "/E40(KM8)_KM8", "/E41_KM8", "/E41(KM8)_KM8", "/F20_KM8", "/F21_KM8", "/F21(KM8)_KM8", "/F22_KM8", "/F30_KM8", "/F31_KM8", "/F40_KM8", "/F40(KM8)_KM8", "/G40_KM8", "/L10_KM8", "/L12_KM8", "/M10_KM8", "/M11_KM8", "/O10_KM8", "/O11_KM8", "/O12_KM8", "/P11_KM8", "/P12_KM8", "/Q11_KM8", "/X10_KM8", "/Xa_KM8", " " }));
        jComboBoxSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSpecActionPerformed(evt);
            }
        });

        jLabelClasse.setText("Classe:");

        jComboBoxClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "125#FF", "150#FR", "200#RO", "300#FR", "600#FR", "600#RTJ", "800#SW", "900#FR", "900#RTJ", "1500#RTJ", "1500#ST", "1500#SW", "2500#RTJ", " " }));
        jComboBoxClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClasseActionPerformed(evt);
            }
        });

        jLabelDiam1.setText("Diam1:");

        jComboBoxDiam1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1/2\"", "3/4\"", "1\"", "1.1/4\"", "1.1/2\"", "2\"", "2.1/2\"", "3\"", "4\"", "5\"", "6\"", "8\"", "10\"", "12\"", "14\"", "16\"", "18\"", "20\"", "22\"", "24\"", "26\"", "28\"", "30\"", "32\"", "34\"", "36\"", "38\"", "40\"", "42\"", "44\"", "46\"", "48\"", "52\"", "56\"", "60\"", "64\"", "68\"", "72\"", "76\"", "80\"", "84\"", " " }));
        jComboBoxDiam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiam1ActionPerformed(evt);
            }
        });

        jLabelDiam2.setText("Diam2:");

        jComboBoxDiam2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1/2\"", "3/4\"", "1\"", "1.1/4\"", "1.1/2\"", "2\"", "2.1/2\"", "3\"", "4\"", "5\"", "6\"", "8\"", "10\"", "12\"", "14\"", "16\"", "18\"", "20\"", "22\"", "24\"", "26\"", "28\"", "30\"", "32\"", "34\"", "36\"", "38\"", "40\"", "42\"", "44\"", "46\"", "48\"", "52\"", "56\"", "60\"", "64\"", "68\"", "72\"", "76\"", "80\"", "84\"" }));
        jComboBoxDiam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiam2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPipe, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelComp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxComp, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSpec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDiam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDiam1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDiam2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDiam2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPipe)
                    .addComponent(jTextFieldPipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelData)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComp)
                    .addComponent(jLabelSpec)
                    .addComponent(jComboBoxSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDiam1)
                        .addComponent(jComboBoxDiam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDiam2)
                        .addComponent(jComboBoxDiam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelClasse))))
        );

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Desenvolvido por Marco Antonio Nascimento Jr (2018)");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldPipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPipeActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        readJTable();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        ComponentesDAO cdao = new ComponentesDAO();
        Componentes c = new Componentes();
           
        c.setNome(jTextFieldNome.getText());
        c.setPipe(jTextFieldPipe.getText());
        c.setData(jFormattedTextFieldData.getText());
        c.setComp(jComboBoxComp.getSelectedItem().toString());
        c.setSpec(jComboBoxSpec.getSelectedItem().toString());
        c.setClasse(jComboBoxClasse.getSelectedItem().toString());
        c.setDiam1(jComboBoxDiam1.getSelectedItem().toString());
        c.setDiam2(jComboBoxDiam2.getSelectedItem().toString());

        cdao.create(c);
        readJTable();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1KeyPressed

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

    private void jComboBoxSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSpecActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jComboBoxSpecActionPerformed

    private void jComboBoxCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jComboBoxCompActionPerformed

    private void jComboBoxClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClasseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxClasseActionPerformed

    private void jComboBoxDiam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiam1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxDiam1ActionPerformed

    private void jComboBoxDiam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiam2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxDiam2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxClasse;
    private javax.swing.JComboBox<String> jComboBoxComp;
    private javax.swing.JComboBox<String> jComboBoxDiam1;
    private javax.swing.JComboBox<String> jComboBoxDiam2;
    private javax.swing.JComboBox<String> jComboBoxSpec;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelClasse;
    private javax.swing.JLabel jLabelComp;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDiam1;
    private javax.swing.JLabel jLabelDiam2;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPipe;
    private javax.swing.JLabel jLabelSpec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldConsultaComp;
    private javax.swing.JTextField jTextFieldConsultaNome;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPipe;
    // End of variables declaration//GEN-END:variables
}
