package com.taun.component;

import com.taun.model.Model_Music;

public class Music extends javax.swing.JPanel {

    public Music() {
        initComponents();
        init();
    }

    private void init() {
        list.addItem(new Model_Music("1", "Maadi El Nas", "03:00"));
        list.addItem(new Model_Music("2", "Rasmaha", "04:37"));
        list.addItem(new Model_Music("3", "Lena Maad", "02:37"));
        list.addItem(new Model_Music("4", "Akhasmk Ahh", "03:25"));
        list.addItem(new Model_Music("5", "Ma Balash", "03:03"));
        list.addItem(new Model_Music("6", "Enta El Hob", "50:51"));
        list.addItem(new Model_Music("7", "El Fan", "20:59"));
        list.addItem(new Model_Music("8", "Zy El Hawa", "09:07"));
        list.addItem(new Model_Music("9", "Dork Gy", "03:14"));
        list.addItem(new Model_Music("10", "Lola El Malama", "02:51"));
        list.addItem(new Model_Music("11", "Fakarouni", "59:58"));
        list.addItem(new Model_Music("12", "Zahed El Donia", "04:07"));
        list.addItem(new Model_Music("13", "Human", "03:53"));
        list.addItem(new Model_Music("14", "Hey Mamabo", "04:15"));
        list.addItem(new Model_Music("15", "Bella Ciao", "03:28"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        list = new com.taun.component.ListMusic<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Most Trending Music");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.taun.component.ListMusic<String> list;
    // End of variables declaration//GEN-END:variables
}
