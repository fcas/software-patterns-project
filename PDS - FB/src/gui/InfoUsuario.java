/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author larissa
 */
public class InfoUsuario extends javax.swing.JPanel {
	private static final long serialVersionUID = -1622539031793149659L;
	
	/**
     * Creates new form InfoUsuario
     */
    public InfoUsuario() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        jPanel2 = new javax.swing.JPanel();
        aniversario = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        sobre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uJPanelImagem1 = new componentes.UJPanelImagem();

        setBackground(new java.awt.Color(58, 89, 152));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");

        nome.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Olá, Larissa");

        jPanel1.setBackground(new java.awt.Color(58, 89, 152));
        jPanel1.setBorder(null);
        jPanel1.setForeground(new java.awt.Color(1, 63, 119));

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
            .addComponent(menu_amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_paginas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_paginaspalavra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_amigosinterajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_amigosnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_paginasrecomendadas, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(58, 89, 152));
        jPanel2.setBorder(null);

        aniversario.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        aniversario.setForeground(new java.awt.Color(255, 255, 255));
        aniversario.setText("Larissa Batista Leite");

        cidade.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        cidade.setForeground(new java.awt.Color(255, 255, 255));
        cidade.setText("Nasceu em 12 de julho de 1993");

        sobre.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        sobre.setForeground(new java.awt.Color(255, 255, 255));
        sobre.setText("Mora em Natal");

        jLabel5.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estudante de Engenharia de Software");

        uJPanelImagem1.setImagem(new java.io.File("/home/larissa/Imagens/profile.jpg"));

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(aniversario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cidade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sobre, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(aniversario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cidade)
                        .addGap(18, 18, 18)
                        .addComponent(sobre)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(nome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aniversario;
    public javax.swing.JLabel getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario.setText(aniversario);
	}

	public javax.swing.JLabel getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome.setText(nome);
	}

	public javax.swing.JLabel getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre.setText(sobre);
	}

	private javax.swing.JLabel cidade;
    public javax.swing.JLabel getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade.setText(cidade);
	}

	private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton menu_amigos;
    private javax.swing.JButton menu_amigosinterajo;
    private javax.swing.JButton menu_amigosnome;
    private javax.swing.JButton menu_paginas;
    private javax.swing.JButton menu_paginaspalavra;
    private javax.swing.JButton menu_paginasrecomendadas;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel sobre;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
