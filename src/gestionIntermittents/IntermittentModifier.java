package gestionIntermittents;

import classesMetier.Intermittent;
import nezdames.serialisation.NezDamesSerialisation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gaellecastel
 */
public class IntermittentModifier extends javax.swing.JFrame {
    
    private int lIndexDeLIntermittent;

    public IntermittentModifier(int laLigneSelectionnee) {
        initComponents();
        
        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //chargement des éléments de la fiche de cet intermittent
            
            txtNom.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getNomIntermittent())));
            txtPrenom.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getPrenomIntermittent())));
            txtRue.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getAdresseRue())));
            txtCodePostal.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getCodePostal())));
            txtVille.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getAdresseVille())));
            txtTelephone.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getTelIntermittent())));
            txtMail.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getMailIntermittent())));
            txtDateNaissance.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getPrenomIntermittent())));
            txtVilleNaissance.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getDateNaissance())));
            txtNationalite.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getNationalite())));
            txtNumeroCongeSpectacle.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getNumeroCongeSpectacle())));
            txtNumeroSecuriteSociale.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getNumeroInsee())));
            txtVilleNaissance.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getVilleNaissance())));
            jTextAreaRemarques.setText(String.valueOf((((Intermittent) NezDamesSerialisation.lesIntermittents.get(laLigneSelectionnee)).getRemarques())));
            lIndexDeLIntermittent = laLigneSelectionnee;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtVille = new javax.swing.JTextField();
        btnAnnuler = new javax.swing.JButton();
        lblNom = new javax.swing.JLabel();
        lblVille = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtRue = new javax.swing.JTextField();
        lblRue = new javax.swing.JLabel();
        lblCodePostal = new javax.swing.JLabel();
        txtCodePostal = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        lblPrenom = new javax.swing.JLabel();
        txtVilleNaissance = new javax.swing.JTextField();
        lblNationalite = new javax.swing.JLabel();
        txtNationalite = new javax.swing.JTextField();
        lblNumeroCongeSpectacle = new javax.swing.JLabel();
        txtNumeroCongeSpectacle = new javax.swing.JTextField();
        lblRemarques = new javax.swing.JLabel();
        lblNumeroSecuriteSociale = new javax.swing.JLabel();
        txtNumeroSecuriteSociale = new javax.swing.JTextField();
        jTextAreaRemarques = new javax.swing.JTextArea();
        lblDateNaissance = new javax.swing.JLabel();
        txtDateNaissance = new javax.swing.JTextField();
        lblTitre1 = new javax.swing.JLabel();
        btnEnvoyer = new javax.swing.JButton();
        lblImageOlivier = new javax.swing.JLabel();
        lblImageManu = new javax.swing.JLabel();
        lblVilleNaissance = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 153, 51));

        txtVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVilleActionPerformed(evt);
            }
        });

        btnAnnuler.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        lblNom.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNom.setForeground(new java.awt.Color(255, 153, 51));
        lblNom.setText("Nom");

        lblVille.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVille.setForeground(new java.awt.Color(255, 153, 51));
        lblVille.setText("Ville");

        lblMail.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 153, 51));
        lblMail.setText("Mail");

        txtRue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRueActionPerformed(evt);
            }
        });

        lblRue.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblRue.setForeground(new java.awt.Color(255, 153, 51));
        lblRue.setText("Adresse (Numéro et rue)");

        lblCodePostal.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblCodePostal.setForeground(new java.awt.Color(255, 153, 51));
        lblCodePostal.setText("Code postal");

        txtCodePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodePostalActionPerformed(evt);
            }
        });

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        lblTelephone.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblTelephone.setForeground(new java.awt.Color(255, 153, 51));
        lblTelephone.setText("Téléphone");

        txtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneActionPerformed(evt);
            }
        });

        lblPrenom.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblPrenom.setForeground(new java.awt.Color(255, 153, 51));
        lblPrenom.setText("Prénom");

        txtVilleNaissance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVilleNaissanceActionPerformed(evt);
            }
        });

        lblNationalite.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNationalite.setForeground(new java.awt.Color(255, 153, 51));
        lblNationalite.setText("Nationalité");

        txtNationalite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationaliteActionPerformed(evt);
            }
        });

        lblNumeroCongeSpectacle.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNumeroCongeSpectacle.setForeground(new java.awt.Color(255, 153, 51));
        lblNumeroCongeSpectacle.setText("Numéro de congé spectacle");

        txtNumeroCongeSpectacle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCongeSpectacleActionPerformed(evt);
            }
        });

        lblRemarques.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblRemarques.setForeground(new java.awt.Color(255, 153, 51));
        lblRemarques.setText("Remarques");

        lblNumeroSecuriteSociale.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNumeroSecuriteSociale.setForeground(new java.awt.Color(255, 153, 51));
        lblNumeroSecuriteSociale.setText("Numéro de sécurité sociale");

        txtNumeroSecuriteSociale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroSecuriteSocialeActionPerformed(evt);
            }
        });

        jTextAreaRemarques.setColumns(20);
        jTextAreaRemarques.setRows(5);

        lblDateNaissance.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblDateNaissance.setForeground(new java.awt.Color(255, 153, 51));
        lblDateNaissance.setText("Date de naissance");

        txtDateNaissance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateNaissanceActionPerformed(evt);
            }
        });

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("MODIFIER UN INTERMITTENT");

        btnEnvoyer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnEnvoyer.setText("Valider");
        btnEnvoyer.setToolTipText("");
        btnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoyerActionPerformed(evt);
            }
        });

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        lblVilleNaissance.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVilleNaissance.setForeground(new java.awt.Color(255, 153, 51));
        lblVilleNaissance.setText("Ville de naissance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNationalite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNationalite, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblCodePostal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblVille)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(527, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblDateNaissance)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49)
                                            .addComponent(lblVilleNaissance)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtVilleNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblMail)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblTelephone)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblRue)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtRue, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblNom)
                                            .addGap(30, 30, 30)
                                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblPrenom)
                                            .addGap(30, 30, 30)
                                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(462, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblImageManu)
                                .addGap(101, 101, 101)
                                .addComponent(lblTitre1)
                                .addGap(74, 74, 74)
                                .addComponent(lblImageOlivier))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblNumeroCongeSpectacle)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumeroCongeSpectacle, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblNumeroSecuriteSociale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumeroSecuriteSociale, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(lblRemarques)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEnvoyer)
                        .addGap(36, 36, 36)
                        .addComponent(btnAnnuler))
                    .addComponent(jTextAreaRemarques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(736, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTitre1)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImageOlivier)
                        .addComponent(lblImageManu)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRue)
                    .addComponent(txtRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodePostal)
                    .addComponent(lblVille)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVilleNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVilleNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNationalite, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNationalite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCongeSpectacle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCongeSpectacle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroSecuriteSociale, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroSecuriteSociale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAreaRemarques, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRemarques, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnuler)
                    .addComponent(btnEnvoyer))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(704, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVilleActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // fermeture de la fenêtre 
        this.dispose();
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void txtRueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRueActionPerformed

    private void txtCodePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodePostalActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneActionPerformed

    private void txtVilleNaissanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVilleNaissanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVilleNaissanceActionPerformed

    private void txtNationaliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNationaliteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNationaliteActionPerformed

    private void txtNumeroCongeSpectacleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCongeSpectacleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCongeSpectacleActionPerformed

    private void txtNumeroSecuriteSocialeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroSecuriteSocialeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroSecuriteSocialeActionPerformed

    private void txtDateNaissanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateNaissanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateNaissanceActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // fermeture de la fenêtre 
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerActionPerformed
        // test qui vérifie que les champs sont remplis

        if (txtNom.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Il faut saisir le nom de l'intermittent");
        } else {
            if (txtPrenom.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(null, "Il faut saisir le prénom de l'intermittent");
            } else {
                if (txtRue.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Il faut saisir la rue de l'intermittent");
                } else {
                    if (txtCodePostal.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir le code postal de l'intermittent");
                    } else {
                        if (txtVille.getText().compareTo("") == 0) {
                            JOptionPane.showMessageDialog(null, "Il faut saisir la ville de l'intermittent");
                        } else {
                            if (txtMail.getText().compareTo("") == 0) {
                                JOptionPane.showMessageDialog(null, "Il faut saisir le mail de l'intermittent");
                            } else {
                                if (txtTelephone.getText().compareTo("") == 0) {
                                    JOptionPane.showMessageDialog(null, "Il faut saisir le téléphone de l'intermittent");
                                } else {
                                    if (txtVilleNaissance.getText().compareTo("") == 0) {
                                        JOptionPane.showMessageDialog(null, "Il faut saisir la ville de naissance de l'intermittent");
                                    } else {
                                        if (txtDateNaissance.getText().compareTo("") == 0) {
                                            JOptionPane.showMessageDialog(null, "Il faut saisir la date de naissance de l'intermittent");
                                        } else {
                                            if (txtNationalite.getText().compareTo("") == 0) {
                                                JOptionPane.showMessageDialog(null, "Il faut saisir la nationalité de l'intermittent");
                                            } else {
                                                if (txtNumeroCongeSpectacle.getText().compareTo("") == 0) {
                                                    JOptionPane.showMessageDialog(null, "Il faut saisir le numéro de congé spectacle de l'intermittent");
                                                } else {
                                                    if (txtNumeroSecuriteSociale.getText().compareTo("") == 0) {
                                                        JOptionPane.showMessageDialog(null, "Il faut saisir le numéro de Sécurité sociale de l'intermittent");
                                                    } else {
                                                        // modification de l'intermittent dans la collection lesIntermittents
                                                        NezDamesSerialisation.lesIntermittents.get(lIndexDeLIntermittent).modifier(txtNom.getText(), txtPrenom.getText(), txtRue.getText(), txtVille.getText(), Integer.parseInt(txtCodePostal.getText()), txtMail.getText(), txtTelephone.getText(), txtDateNaissance.getText(), txtVilleNaissance.getText(), txtNationalite.getText(), txtNumeroCongeSpectacle.getText(), txtNumeroSecuriteSociale.getText(), jTextAreaRemarques.getText());
                                                        JOptionPane.showMessageDialog(null, "Intermittent modifié");

                                                        this.dispose();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEnvoyerActionPerformed

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
            java.util.logging.Logger.getLogger(IntermittentModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntermittentModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntermittentModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntermittentModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListerIntermittentsDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextAreaRemarques;
    private javax.swing.JLabel lblCodePostal;
    private javax.swing.JLabel lblDateNaissance;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNationalite;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNumeroCongeSpectacle;
    private javax.swing.JLabel lblNumeroSecuriteSociale;
    private javax.swing.JLabel lblPrenom;
    private javax.swing.JLabel lblRemarques;
    private javax.swing.JLabel lblRue;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JLabel lblVille;
    private javax.swing.JLabel lblVilleNaissance;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtDateNaissance;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNationalite;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumeroCongeSpectacle;
    private javax.swing.JTextField txtNumeroSecuriteSociale;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtRue;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtVille;
    private javax.swing.JTextField txtVilleNaissance;
    // End of variables declaration//GEN-END:variables
}