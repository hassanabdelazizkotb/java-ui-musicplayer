package com.taun.component;

import com.taun.model.Model_Profile;
import javax.swing.ImageIcon;

public class Profile extends javax.swing.JPanel {

    public Profile() {
        initComponents();
        init();
    }

    private void init() {
        list.addItem(new Model_Profile("Amr Diab", "Maadi El Nas", new ImageIcon(getClass().getResource("/com/taun/icon/test/Amr_Diab.jpeg"))));
        list.addItem(new Model_Profile("Tamer Hosny", "Lena Maad", new ImageIcon(getClass().getResource("/com/taun/icon/test/tamer_hosny.jpg"))));
        list.addItem(new Model_Profile("Nancy Ajram", "Nancy Ajram", new ImageIcon(getClass().getResource("/com/taun/icon/test/nancy_ajram.jpg"))));
        list.addItem(new Model_Profile("Wegz", "Dork Gy", new ImageIcon(getClass().getResource("/com/taun/icon/test/Wegz.jpg"))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        list = new com.taun.component.ListProfile<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Listen this weekend");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addComponent(list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.taun.component.ListProfile<String> list;
    // End of variables declaration//GEN-END:variables
}
