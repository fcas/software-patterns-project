/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Desktop;
import java.awt.Font;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.IPagina;
import model.IUsuario;

/**
 * @author larissa
 */
public class PaginaPalavraChave extends javax.swing.JPanel {
	private static final long serialVersionUID = -3327558656300620633L;
	
    private List<String> linksPaginas;
    
    private Facade facade;
    
    /**
     * Creates new form PaginaPalavraChave
     */
    public PaginaPalavraChave() {
        initComponents();
        facade = ControllerUI.getFacade();
        menu_paginaspalavra.setFont(menu_amigosinterajo.getFont().deriveFont(Font.BOLD));
        cliqueCelula();
    }

    @SuppressWarnings("unused")
    private void cliqueCelula() {
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row = jTable2.rowAtPoint(e.getPoint());
				int col = jTable2.columnAtPoint(e.getPoint());
                
                //System.out.println(linksPaginas.get(row).toString());//abrir em navegador
                
                Desktop d = Desktop.getDesktop(); 
                try {
                	d.browse(new URI(linksPaginas.get(row).toString())); 
                } catch ( IOException e1 ) { 
                	System.out.println(e1);
                } catch ( URISyntaxException e2 ) { 
                	System.out.println(e2);
                }
                
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "serial" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu_amigos = new javax.swing.JButton();
        menu_amigosnome = new javax.swing.JButton();
        menu_amigosinterajo = new javax.swing.JButton();
        menu_paginas = new javax.swing.JButton();
        menu_paginaspalavra = new javax.swing.JButton();
        menu_paginasrecomendadas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        palavra = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(58, 89, 152));

        jPanel1.setBackground(new java.awt.Color(58, 89, 152));
        jPanel1.setBorder(null);
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        menu_amigos.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigos.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        menu_amigos.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigos.setText("Amigos");
        menu_amigos.setBorderPainted(false);
        menu_amigos.setContentAreaFilled(false);
        menu_amigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        menu_amigosnome.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigosnome.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_amigosnome.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigosnome.setText("Buscar por nome");
        menu_amigosnome.setBorderPainted(false);
        menu_amigosnome.setContentAreaFilled(false);
        menu_amigosnome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_amigosnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_amigosnomeActionPerformed(evt);
            }
        });

        menu_amigosinterajo.setBackground(new java.awt.Color(255, 255, 255));
        menu_amigosinterajo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_amigosinterajo.setForeground(new java.awt.Color(255, 255, 255));
        menu_amigosinterajo.setText("Amigos que mais interajo");
        menu_amigosinterajo.setBorderPainted(false);
        menu_amigosinterajo.setContentAreaFilled(false);
        menu_amigosinterajo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_amigosinterajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_amigosinterajoActionPerformed(evt);
            }
        });

        menu_paginas.setBackground(new java.awt.Color(255, 255, 255));
        menu_paginas.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        menu_paginas.setForeground(new java.awt.Color(255, 255, 255));
        menu_paginas.setText("Páginas");
        menu_paginas.setBorderPainted(false);
        menu_paginas.setContentAreaFilled(false);
        menu_paginas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        menu_paginaspalavra.setBackground(new java.awt.Color(255, 255, 255));
        menu_paginaspalavra.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_paginaspalavra.setForeground(new java.awt.Color(255, 255, 255));
        menu_paginaspalavra.setText("Buscar por palavra-chave");
        menu_paginaspalavra.setBorderPainted(false);
        menu_paginaspalavra.setContentAreaFilled(false);
        menu_paginaspalavra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_paginaspalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_paginaspalavraActionPerformed(evt);
            }
        });

        menu_paginasrecomendadas.setBackground(new java.awt.Color(255, 255, 255));
        menu_paginasrecomendadas.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        menu_paginasrecomendadas.setForeground(new java.awt.Color(255, 255, 255));
        menu_paginasrecomendadas.setText("Páginas recomendadas para mim");
        menu_paginasrecomendadas.setBorderPainted(false);
        menu_paginasrecomendadas.setContentAreaFilled(false);
        menu_paginasrecomendadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_paginasrecomendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_paginasrecomendadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(menu_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_paginaspalavra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_amigosinterajo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_amigosnome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_paginasrecomendadas))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_amigosnome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_amigosinterajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu_paginas)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_paginaspalavra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_paginasrecomendadas)
                .addGap(57, 57, 57))
        );

        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar página por palavra-chave");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");

        jPanel3.setBackground(new java.awt.Color(58, 89, 152));

        jLabel4.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Digite a palavra:");

        buscar.setBackground(new java.awt.Color(1, 63, 119));
        buscar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selecione páginas abaixo para ver detalhes");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Categoria"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            @SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu_amigosnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_amigosnomeActionPerformed
        ControllerUI.AmigosNome();
    }//GEN-LAST:event_menu_amigosnomeActionPerformed

    private void menu_amigosinterajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_amigosinterajoActionPerformed
        ControllerUI.AmigosInterajo();
    }//GEN-LAST:event_menu_amigosinterajoActionPerformed

    private void menu_paginaspalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_paginaspalavraActionPerformed
        ControllerUI.PaginaPalavraChave();
    }//GEN-LAST:event_menu_paginaspalavraActionPerformed

    private void menu_paginasrecomendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_paginasrecomendadasActionPerformed
        ControllerUI.PaginasRecomendadas();
    }//GEN-LAST:event_menu_paginasrecomendadasActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
    	if (palavra.getText().equals("")) {
        } else {
            preencherTabela(facade.buscarPaginasPalavraChave(palavra.getText())); 
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void preencherTabela(List<IPagina> listaPaginas) {

        limparTabela();
        linksPaginas = new ArrayList<String>();
        if (listaPaginas.isEmpty() || listaPaginas == null) {
           JOptionPane.showMessageDialog(this, "Nenhuma página encontrada!");
        } else {
            for (int i=0; i< listaPaginas.size(); i++) {
                    jTable2.setValueAt(listaPaginas.get(i).getNome(), i, 0);
                    jTable2.setValueAt(listaPaginas.get(i).getCategoria(), i, 1);
                    linksPaginas.add(listaPaginas.get(i).getLink());
            }
        }
    }
        
    private void limparTabela() {
        for (int i=0; i<jTable2.getRowCount(); i++) {
            jTable2.setValueAt("", i, 0);
            jTable2.setValueAt("", i, 1);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton menu_amigos;
    private javax.swing.JButton menu_amigosinterajo;
    private javax.swing.JButton menu_amigosnome;
    private javax.swing.JButton menu_paginas;
    private javax.swing.JButton menu_paginaspalavra;
    private javax.swing.JButton menu_paginasrecomendadas;
    private javax.swing.JTextField palavra;
    // End of variables declaration//GEN-END:variables
}
