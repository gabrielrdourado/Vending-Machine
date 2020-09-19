/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.text.DecimalFormat;

/**
 *
 * @author doura
 */
public class AdmMachine extends javax.swing.JFrame {
    
    DecimalFormat df = new DecimalFormat("0.00");

    Caixa caixa;
    
    Produto CocaCola;
    Produto Kuat;
    Produto Pepsi;
    Produto Fanta;
    Produto Guarana;
    Produto Sprite;
            
    public AdmMachine(Caixa auxCaixa, Produto auxCocaCola, Produto auxKuat, Produto auxPepsi, Produto auxFanta, Produto auxGuarana, Produto auxSprite) {
        this.caixa = auxCaixa;
        
        this.CocaCola = auxCocaCola;
        this.Kuat = auxKuat;
        this.Pepsi = auxPepsi;
        this.Fanta = auxFanta;
        this.Guarana = auxGuarana;
        this.Sprite = auxSprite;
        
        initComponents();
    }
    
    public void attTudo(){
        //att Moedas
        qntM1.setText(Integer.toString(caixa.getMoeda1()));
        qntM50.setText(Integer.toString(caixa.getMoeda50()));
        qntM25.setText(Integer.toString(caixa.getMoeda25()));
        qntM10.setText(Integer.toString(caixa.getMoeda10()));
        qntM5.setText(Integer.toString(caixa.getMoeda5()));
        
        //att valor caixa
        totalCaixa.setText("R$ " + df.format(caixa.getValorCaixa()));
        
        //att Produtos
        qntCocaCola.setText(Integer.toString(CocaCola.getQuant()));
        qntKuat.setText(Integer.toString(Kuat.getQuant()));
        qntPepsi.setText(Integer.toString(Pepsi.getQuant()));
        qntFanta.setText(Integer.toString(Fanta.getQuant()));
        qntGuarana.setText(Integer.toString(Guarana.getQuant()));
        qntSprite.setText(Integer.toString(Sprite.getQuant()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qntM5 = new javax.swing.JTextField();
        maisM5Btn = new javax.swing.JButton();
        menosM5Btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        totalCaixa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        maisM1Btn = new javax.swing.JButton();
        qntM1 = new javax.swing.JTextField();
        menosM1Btn = new javax.swing.JButton();
        maisM50Btn = new javax.swing.JButton();
        qntM50 = new javax.swing.JTextField();
        menosM50Btn = new javax.swing.JButton();
        maisM25Btn = new javax.swing.JButton();
        qntM25 = new javax.swing.JTextField();
        menosM25Btn = new javax.swing.JButton();
        maisM10Btn = new javax.swing.JButton();
        qntM10 = new javax.swing.JTextField();
        menosM10Btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maisCocaColaBtn = new javax.swing.JButton();
        qntCocaCola = new javax.swing.JTextField();
        menosCocaColaBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        maisKuatBtn = new javax.swing.JButton();
        qntKuat = new javax.swing.JTextField();
        menosKuatBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        maisPepsiBtn = new javax.swing.JButton();
        qntPepsi = new javax.swing.JTextField();
        menosPepsiBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        maisFantaBtn = new javax.swing.JButton();
        qntFanta = new javax.swing.JTextField();
        menosFantaBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        maisSpriteBtn = new javax.swing.JButton();
        qntSprite = new javax.swing.JTextField();
        menosSpriteBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        maisGuaranaBtn = new javax.swing.JButton();
        qntGuarana = new javax.swing.JTextField();
        menosGuaranaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administração do VendingMachine");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Caixa:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Estoque:");

        qntM5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        maisM5Btn.setText("+");
        maisM5Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisM5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisM5BtnActionPerformed(evt);
            }
        });

        menosM5Btn.setText("-");
        menosM5Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosM5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosM5BtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Total no Caixa:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("R$ 1.00");

        maisM1Btn.setText("+");
        maisM1Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisM1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisM1BtnActionPerformed(evt);
            }
        });

        qntM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosM1Btn.setText("-");
        menosM1Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosM1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosM1BtnActionPerformed(evt);
            }
        });

        maisM50Btn.setText("+");
        maisM50Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisM50Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisM50BtnActionPerformed(evt);
            }
        });

        qntM50.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosM50Btn.setText("-");
        menosM50Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosM50Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosM50BtnActionPerformed(evt);
            }
        });

        maisM25Btn.setText("+");
        maisM25Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisM25Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisM25BtnActionPerformed(evt);
            }
        });

        qntM25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosM25Btn.setText("-");
        menosM25Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosM25Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosM25BtnActionPerformed(evt);
            }
        });

        maisM10Btn.setText("+");
        maisM10Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisM10Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisM10BtnActionPerformed(evt);
            }
        });

        qntM10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosM10Btn.setText("-");
        menosM10Btn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosM10Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosM10BtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Moedas");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("R$ 0.50");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("R$ 0.25");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("R$ 0.10");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("R$ 0.05");

        jLabel6.setText("Coca-Cola");

        maisCocaColaBtn.setText("+");
        maisCocaColaBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisCocaColaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisCocaColaBtnActionPerformed(evt);
            }
        });

        qntCocaCola.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosCocaColaBtn.setText("-");
        menosCocaColaBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosCocaColaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosCocaColaBtnActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Kuat");

        maisKuatBtn.setText("+");
        maisKuatBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisKuatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisKuatBtnActionPerformed(evt);
            }
        });

        qntKuat.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosKuatBtn.setText("-");
        menosKuatBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosKuatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosKuatBtnActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Pepsi");

        maisPepsiBtn.setText("+");
        maisPepsiBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisPepsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisPepsiBtnActionPerformed(evt);
            }
        });

        qntPepsi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosPepsiBtn.setText("-");
        menosPepsiBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosPepsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosPepsiBtnActionPerformed(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fanta");

        maisFantaBtn.setText("+");
        maisFantaBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisFantaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisFantaBtnActionPerformed(evt);
            }
        });

        qntFanta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosFantaBtn.setText("-");
        menosFantaBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosFantaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosFantaBtnActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Sprite");

        maisSpriteBtn.setText("+");
        maisSpriteBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisSpriteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisSpriteBtnActionPerformed(evt);
            }
        });

        qntSprite.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosSpriteBtn.setText("-");
        menosSpriteBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosSpriteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosSpriteBtnActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Guaraná");

        maisGuaranaBtn.setText("+");
        maisGuaranaBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        maisGuaranaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisGuaranaBtnActionPerformed(evt);
            }
        });

        qntGuarana.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menosGuaranaBtn.setText("-");
        menosGuaranaBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        menosGuaranaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosGuaranaBtnActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(menosCocaColaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qntCocaCola, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(maisCocaColaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maisFantaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qntFanta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(menosFantaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(maisKuatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qntKuat)
                                .addComponent(menosKuatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(maisGuaranaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qntGuarana)
                                .addComponent(menosGuaranaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(maisSpriteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qntSprite)
                                .addComponent(menosSpriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(maisPepsiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qntPepsi)
                                .addComponent(menosPepsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(maisM1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qntM1)
                                            .addComponent(menosM1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(maisM50Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qntM50)
                                            .addComponent(menosM50Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(maisM25Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qntM25)
                                            .addComponent(menosM25Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(maisM10Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qntM10)
                                            .addComponent(menosM10Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(maisM5Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qntM5)
                                            .addComponent(menosM5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maisM1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosM1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maisM25Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntM25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosM25Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maisM10Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosM10Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maisM5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosM5Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(maisM50Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntM50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosM50Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maisCocaColaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qntCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menosCocaColaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(maisKuatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qntKuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menosKuatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maisGuaranaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qntGuarana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menosGuaranaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maisFantaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qntFanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menosFantaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maisPepsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosPepsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maisSpriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntSprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosSpriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        attTudo();
    }//GEN-LAST:event_formWindowActivated

    private void maisM5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisM5BtnActionPerformed
        caixa.setMoeda5(caixa.getMoeda5()+1);
        attTudo();
    }//GEN-LAST:event_maisM5BtnActionPerformed

    private void menosM5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosM5BtnActionPerformed
        caixa.setMoeda5(caixa.getMoeda5()-1);
        attTudo();
    }//GEN-LAST:event_menosM5BtnActionPerformed

    private void maisM1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisM1BtnActionPerformed
        caixa.setMoeda1(caixa.getMoeda1()+1);
        attTudo();
    }//GEN-LAST:event_maisM1BtnActionPerformed

    private void menosM1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosM1BtnActionPerformed
        caixa.setMoeda1(caixa.getMoeda1()-1);
        attTudo();
    }//GEN-LAST:event_menosM1BtnActionPerformed

    private void maisM50BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisM50BtnActionPerformed
        caixa.setMoeda50(caixa.getMoeda50()+1);
        attTudo();
    }//GEN-LAST:event_maisM50BtnActionPerformed

    private void menosM50BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosM50BtnActionPerformed
        caixa.setMoeda50(caixa.getMoeda50()-1);
        attTudo();
    }//GEN-LAST:event_menosM50BtnActionPerformed

    private void maisM25BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisM25BtnActionPerformed
        caixa.setMoeda25(caixa.getMoeda25()+1);
        attTudo();
    }//GEN-LAST:event_maisM25BtnActionPerformed

    private void menosM25BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosM25BtnActionPerformed
        caixa.setMoeda25(caixa.getMoeda25()-1);
        attTudo();
    }//GEN-LAST:event_menosM25BtnActionPerformed

    private void maisM10BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisM10BtnActionPerformed
        caixa.setMoeda10(caixa.getMoeda10()+1);
        attTudo();
    }//GEN-LAST:event_maisM10BtnActionPerformed

    private void menosM10BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosM10BtnActionPerformed
        caixa.setMoeda10(caixa.getMoeda10()-1);
        attTudo();
    }//GEN-LAST:event_menosM10BtnActionPerformed

    private void maisCocaColaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisCocaColaBtnActionPerformed
        CocaCola.setQuant(+1);
        attTudo();
    }//GEN-LAST:event_maisCocaColaBtnActionPerformed

    private void menosCocaColaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosCocaColaBtnActionPerformed
        CocaCola.setQuant(-1);
        attTudo();
    }//GEN-LAST:event_menosCocaColaBtnActionPerformed

    private void maisKuatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisKuatBtnActionPerformed
        Kuat.setQuant(+1);
        attTudo();
    }//GEN-LAST:event_maisKuatBtnActionPerformed

    private void menosKuatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosKuatBtnActionPerformed
        Kuat.setQuant(-1);
        attTudo();
    }//GEN-LAST:event_menosKuatBtnActionPerformed

    private void maisPepsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisPepsiBtnActionPerformed
        Pepsi.setQuant(+1);
        attTudo();
    }//GEN-LAST:event_maisPepsiBtnActionPerformed

    private void menosPepsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosPepsiBtnActionPerformed
        Pepsi.setQuant(-1);
        attTudo();
    }//GEN-LAST:event_menosPepsiBtnActionPerformed

    private void maisFantaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisFantaBtnActionPerformed
        Fanta.setQuant(+1);
        attTudo();
    }//GEN-LAST:event_maisFantaBtnActionPerformed

    private void menosFantaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosFantaBtnActionPerformed
        Fanta.setQuant(-1);
        attTudo();
    }//GEN-LAST:event_menosFantaBtnActionPerformed

    private void maisSpriteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisSpriteBtnActionPerformed
        Sprite.setQuant(+1);
        attTudo();
    }//GEN-LAST:event_maisSpriteBtnActionPerformed

    private void menosSpriteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosSpriteBtnActionPerformed
        Sprite.setQuant(-1);
        attTudo();
    }//GEN-LAST:event_menosSpriteBtnActionPerformed

    private void maisGuaranaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisGuaranaBtnActionPerformed
        Guarana.setQuant(+1);
        attTudo();
    }//GEN-LAST:event_maisGuaranaBtnActionPerformed

    private void menosGuaranaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosGuaranaBtnActionPerformed
        Guarana.setQuant(-1);
        attTudo();
    }//GEN-LAST:event_menosGuaranaBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton maisCocaColaBtn;
    private javax.swing.JButton maisFantaBtn;
    private javax.swing.JButton maisGuaranaBtn;
    private javax.swing.JButton maisKuatBtn;
    private javax.swing.JButton maisM10Btn;
    private javax.swing.JButton maisM1Btn;
    private javax.swing.JButton maisM25Btn;
    private javax.swing.JButton maisM50Btn;
    private javax.swing.JButton maisM5Btn;
    private javax.swing.JButton maisPepsiBtn;
    private javax.swing.JButton maisSpriteBtn;
    private javax.swing.JButton menosCocaColaBtn;
    private javax.swing.JButton menosFantaBtn;
    private javax.swing.JButton menosGuaranaBtn;
    private javax.swing.JButton menosKuatBtn;
    private javax.swing.JButton menosM10Btn;
    private javax.swing.JButton menosM1Btn;
    private javax.swing.JButton menosM25Btn;
    private javax.swing.JButton menosM50Btn;
    private javax.swing.JButton menosM5Btn;
    private javax.swing.JButton menosPepsiBtn;
    private javax.swing.JButton menosSpriteBtn;
    private javax.swing.JTextField qntCocaCola;
    private javax.swing.JTextField qntFanta;
    private javax.swing.JTextField qntGuarana;
    private javax.swing.JTextField qntKuat;
    private javax.swing.JTextField qntM1;
    private javax.swing.JTextField qntM10;
    private javax.swing.JTextField qntM25;
    private javax.swing.JTextField qntM5;
    private javax.swing.JTextField qntM50;
    private javax.swing.JTextField qntPepsi;
    private javax.swing.JTextField qntSprite;
    private javax.swing.JTextField totalCaixa;
    // End of variables declaration//GEN-END:variables
}
