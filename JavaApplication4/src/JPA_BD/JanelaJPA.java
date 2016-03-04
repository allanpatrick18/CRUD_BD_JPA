/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA_BD;

import Tabelas.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author allan
 */
public class JanelaJPA extends javax.swing.JFrame {

    /**
     * Creates new form JanelaJPA
     */
    EntityManagerFactory emf;
    EntityManager em;

    public JanelaJPA() {
        initComponents();
        emf = Persistence.createEntityManagerFactory("BD_JPAPU");
        em = emf.createEntityManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel_tab = new javax.swing.JTabbedPane();
        tab_gen = new javax.swing.JPanel();
        gen_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        gen_desc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        gen_but_cons = new javax.swing.JButton();
        gen_but_exc = new javax.swing.JButton();
        gen_but_alt = new javax.swing.JButton();
        gen_but_ins = new javax.swing.JButton();
        tab_liv = new javax.swing.JPanel();
        liv_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        liv_but_cons = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        liv_tit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        liv_aut = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        liv_edi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        liv_ano = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        liv_gen = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        liv_des = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        liv_pre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        liv_est = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        liv_res = new javax.swing.JTextField();
        liv_but_rem = new javax.swing.JButton();
        liv_but_alt = new javax.swing.JButton();
        liv_but_ins = new javax.swing.JButton();
        tab_ped = new javax.swing.JPanel();
        ped_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ped_but_cons = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        ped_usu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ped_dat = new javax.swing.JTextField();
        ped_pag = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ped_but_rem = new javax.swing.JButton();
        ped_but_alt = new javax.swing.JButton();
        ped_but_ins = new javax.swing.JButton();
        err_lab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gen_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_idActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel2.setText("Descrição:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gen_desc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gen_but_cons.setText("Consultar");
        gen_but_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_but_consActionPerformed(evt);
            }
        });

        gen_but_exc.setText("Remover");
        gen_but_exc.setEnabled(false);
        gen_but_exc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_but_excActionPerformed(evt);
            }
        });

        gen_but_alt.setText("Alterar");
        gen_but_alt.setEnabled(false);
        gen_but_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_but_altActionPerformed(evt);
            }
        });

        gen_but_ins.setText("Inserir");
        gen_but_ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_but_insActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab_genLayout = new javax.swing.GroupLayout(tab_gen);
        tab_gen.setLayout(tab_genLayout);
        tab_genLayout.setHorizontalGroup(
            tab_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_genLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tab_genLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gen_id, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gen_but_cons)
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_genLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gen_but_ins)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gen_but_alt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gen_but_exc)))
                .addContainerGap())
        );
        tab_genLayout.setVerticalGroup(
            tab_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_genLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen_but_cons)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen_but_alt)
                    .addComponent(gen_but_exc)
                    .addComponent(gen_but_ins))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel_tab.addTab("Gêneros", tab_gen);

        jLabel4.setText("ID:");

        liv_but_cons.setText("Consultar");
        liv_but_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liv_but_consActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel5.setText("Título:");

        jLabel8.setText("Autor:");

        jLabel9.setText("Editora:");

        jLabel10.setText("Ano:");

        jLabel11.setText("Genero ID:");

        jLabel12.setText("Descrição:");

        jLabel13.setText("Preço:");

        jLabel14.setText("Estoque:");

        jLabel17.setText("Reserva:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_tit, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_aut, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_edi, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_ano, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_gen, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_des, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_pre, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_est, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_res, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_tit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_aut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_edi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)))
        );

        liv_but_rem.setText("Remover");
        liv_but_rem.setEnabled(false);

        liv_but_alt.setText("Alterar");
        liv_but_alt.setEnabled(false);

        liv_but_ins.setText("Inserir");
        liv_but_ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liv_but_insActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab_livLayout = new javax.swing.GroupLayout(tab_liv);
        tab_liv.setLayout(tab_livLayout);
        tab_livLayout.setHorizontalGroup(
            tab_livLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_livLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_livLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tab_livLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_id, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(liv_but_cons)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_livLayout.createSequentialGroup()
                        .addGap(0, 180, Short.MAX_VALUE)
                        .addComponent(liv_but_ins)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_but_alt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liv_but_rem)))
                .addContainerGap())
        );
        tab_livLayout.setVerticalGroup(
            tab_livLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_livLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_livLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liv_but_cons)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab_livLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liv_but_alt)
                    .addComponent(liv_but_rem)
                    .addComponent(liv_but_ins))
                .addContainerGap())
        );

        main_panel_tab.addTab("Livros", tab_liv);

        jLabel6.setText("ID:");

        ped_but_cons.setText("Consultar");
        ped_but_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ped_but_consActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel7.setText("ID usuário:");

        jLabel15.setText("Data:");

        jLabel16.setText("Tipo Pag:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ped_usu, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ped_dat, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ped_pag, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ped_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ped_dat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ped_pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ped_but_rem.setText("Remover");
        ped_but_rem.setEnabled(false);

        ped_but_alt.setText("Alterar");
        ped_but_alt.setEnabled(false);

        ped_but_ins.setText("Inserir");

        javax.swing.GroupLayout tab_pedLayout = new javax.swing.GroupLayout(tab_ped);
        tab_ped.setLayout(tab_pedLayout);
        tab_pedLayout.setHorizontalGroup(
            tab_pedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_pedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_pedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tab_pedLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ped_id, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ped_but_cons)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_pedLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ped_but_ins)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ped_but_alt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ped_but_rem)))
                .addContainerGap())
        );
        tab_pedLayout.setVerticalGroup(
            tab_pedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_pedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_pedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ped_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ped_but_cons)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_pedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ped_but_alt)
                    .addComponent(ped_but_rem)
                    .addComponent(ped_but_ins))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        main_panel_tab.addTab("Pedidos", tab_ped);

        err_lab.setText("msg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main_panel_tab)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(err_lab)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel_tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err_lab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gen_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen_idActionPerformed

    private void gen_but_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_but_consActionPerformed
        Generos genero = em.find(Generos.class, Integer.parseInt(gen_id.getText()));
        try {
            gen_desc.setText(genero.getDESCRICAO());
                //habilita botoẽs
            gen_but_alt.setEnabled(true);
            gen_but_exc.setEnabled(true);

        } catch (Exception e) {
        }

       err_lab.setText("Gênero  ");
       

    }//GEN-LAST:event_gen_but_consActionPerformed

    private void liv_but_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liv_but_consActionPerformed
        Livros livro = em.find(Livros.class, Integer.parseInt(liv_id.getText()));
        try {
            liv_des.setText(livro.getDESCRICAO());
            liv_ano.setText(Integer.toString(livro.getANO()));
            liv_aut.setText(livro.getAUTOR());
            liv_edi.setText(livro.getEDITORA());
            liv_est.setText(Integer.toString(livro.getESTOQUE()));
            liv_gen.setText(Integer.toString(livro.getGENERO_ID()));
            liv_id.setText(Integer.toString(livro.getLIVRO_ID()));
            liv_pre.setText(Double.toString(livro.getPRECO()));
            liv_res.setText(Integer.toString(livro.getRESERVA()));
            liv_tit.setText(livro.getTITULO());
            
               // Mensagem Feeds

            err_lab.setText("livro consultado");
            
            //habilita botoẽs
            liv_but_alt.setEnabled(true);
            liv_but_rem.setEnabled(true);
        } catch (Exception e) {
             err_lab.setText("Erro genero");
        }

       
    }//GEN-LAST:event_liv_but_consActionPerformed

    private void ped_but_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ped_but_consActionPerformed
        Pedidos pedido = em.find(Pedidos.class, Integer.parseInt(ped_id.getText()));
        try {
            ped_dat.setText(pedido.getDATA_PEDIDO());
            ped_usu.setText(Integer.toString(pedido.getUSUARIO_ID()));
            ped_pag.setText(pedido.getTIPO_PAG());
            //habilita botoẽs
            ped_but_alt.setEnabled(true);
            ped_but_rem.setEnabled(true);
            // Mensagem Feeds
            err_lab.setText("Pedido consultado");
        } catch (Exception e) {
            System.out.println(e);
            err_lab.setText("Ocorreu um erro ao consulta pedido");
        }


    }//GEN-LAST:event_ped_but_consActionPerformed

    private void gen_but_insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_but_insActionPerformed
        // TODO add your handling code here:
         try {
        Generos genero = new Generos();

            genero.setGENERO_ID(Integer.parseInt(gen_id.getText()));
            genero.setDESCRICAO(gen_desc.getText());

            em.getTransaction().begin();
            em.persist(genero);
            em.getTransaction().commit();
            
            err_lab.setText("Gênero inserido");
        } catch (Exception e) {
            System.out.println(e);
            err_lab.setText("[!] Ocorreu um erro");
        }
    }//GEN-LAST:event_gen_but_insActionPerformed

    private void liv_but_insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liv_but_insActionPerformed
        
        try {
            Livros livro = new Livros();

            livro.setLIVRO_ID(Integer.parseInt(liv_id.getText()));
            livro.setTITULO(liv_tit.getText());
            livro.setAUTOR(liv_aut.getText());
            livro.setEDITORA(liv_edi.getText());
            livro.setANO(Integer.parseInt(liv_ano.getText()));
            livro.setGENERO_ID(Integer.parseInt(liv_gen.getText()));
            livro.setDESCRICAO(liv_des.getText());
            livro.setPRECO(Double.parseDouble(liv_pre.getText()));
            livro.setESTOQUE(Integer.parseInt(liv_est.getText()));
            livro.setRESERVA(Integer.parseInt(liv_res.getText()));

            em.getTransaction().begin();
            em.persist(livro);
            em.getTransaction().commit();

            err_lab.setText("Livro inserido");
            
        } catch (Exception e) {
            System.out.println(e);
            err_lab.setText("[!] Ocorreu um erro");
        }
        
        
    }//GEN-LAST:event_liv_but_insActionPerformed

    private void gen_but_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_but_altActionPerformed
        
        try{
            Generos genero = em.find(Generos.class, Integer.parseInt(gen_id.getText()));
            em.getTransaction().begin();
            gen_desc.setText(genero.getDESCRICAO());
            em.getTransaction().commit();
             
            err_lab.setText("Genero alterado");
            
        } catch (Exception e) {
            System.out.println(e);
            err_lab.setText("[!] Ocorreu um erro");
        }
        
            
            
    }//GEN-LAST:event_gen_but_altActionPerformed

    private void gen_but_excActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_but_excActionPerformed
       try{
        Generos genero = em.find(Generos.class, Integer.parseInt(gen_id.getText()));
            em.getTransaction().begin();
            em.remove(genero);
            em.getTransaction().commit();

           err_lab.setText("Genero excluido");
            
        } catch (Exception e) {
            System.out.println(e);
            err_lab.setText("[!] Ocorreu um erro");
        }
    }//GEN-LAST:event_gen_but_excActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaJPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaJPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaJPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaJPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaJPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel err_lab;
    private javax.swing.JButton gen_but_alt;
    private javax.swing.JButton gen_but_cons;
    private javax.swing.JButton gen_but_exc;
    private javax.swing.JButton gen_but_ins;
    private javax.swing.JTextField gen_desc;
    private javax.swing.JTextField gen_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField liv_ano;
    private javax.swing.JTextField liv_aut;
    private javax.swing.JButton liv_but_alt;
    private javax.swing.JButton liv_but_cons;
    private javax.swing.JButton liv_but_ins;
    private javax.swing.JButton liv_but_rem;
    private javax.swing.JTextField liv_des;
    private javax.swing.JTextField liv_edi;
    private javax.swing.JTextField liv_est;
    private javax.swing.JTextField liv_gen;
    private javax.swing.JTextField liv_id;
    private javax.swing.JTextField liv_pre;
    private javax.swing.JTextField liv_res;
    private javax.swing.JTextField liv_tit;
    private javax.swing.JTabbedPane main_panel_tab;
    private javax.swing.JButton ped_but_alt;
    private javax.swing.JButton ped_but_cons;
    private javax.swing.JButton ped_but_ins;
    private javax.swing.JButton ped_but_rem;
    private javax.swing.JTextField ped_dat;
    private javax.swing.JTextField ped_id;
    private javax.swing.JTextField ped_pag;
    private javax.swing.JTextField ped_usu;
    private javax.swing.JPanel tab_gen;
    private javax.swing.JPanel tab_liv;
    private javax.swing.JPanel tab_ped;
    // End of variables declaration//GEN-END:variables
}
