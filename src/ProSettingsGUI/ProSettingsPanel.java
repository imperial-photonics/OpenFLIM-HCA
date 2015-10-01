/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProSettingsGUI;

import GeneralClasses.Arduino;
import GeneralClasses.Variable;
import SequencingClasses.GUIComponents.XYSequencing;

/**
 *
 * @author Frederik
 */
public class ProSettingsPanel extends javax.swing.JPanel {
    
    private Variable var_;
    private Arduino arduino_;
    private XYSequencing xYSeq_;        
    
    /**
     * Creates new form ProSettingsGUI
     */
    
    public ProSettingsPanel() {
        initComponents();
        var_ = Variable.getInstance();
        arduino_ = Arduino.getInstance();
        xYSeq_ = XYSequencing.getInstance();
        var_.motorizedMicroscopeTabelWhich = motorizedMicroscopeTableComboBox.getSelectedItem().toString();
        var_.autofocusWhich = AutoFocusSelectComboBox.getSelectedItem().toString();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arduinoPanel = new javax.swing.JPanel();
        thresholdA0Field = new javax.swing.JTextField();
        thresholdA1Field = new javax.swing.JTextField();
        thresholdA0Label = new javax.swing.JLabel();
        thresholdA1Label = new javax.swing.JLabel();
        laserIntensityField = new javax.swing.JTextField();
        laserIntensityLabel = new javax.swing.JLabel();
        updateLaserIntensityButton = new javax.swing.JButton();
        shutterResponseLabel = new javax.swing.JLabel();
        shutterResponseField = new javax.swing.JTextField();
        enableLightCheckButton = new javax.swing.JRadioButton();
        warningPanel = new javax.swing.JPanel();
        importantInfo = new javax.swing.JScrollPane();
        warningTextArea = new javax.swing.JTextArea();
        fOVPanel = new javax.swing.JPanel();
        xOffsetRingField = new javax.swing.JTextField();
        xOffsetRingLabel = new javax.swing.JLabel();
        yOffsetRingField = new javax.swing.JTextField();
        yOffsetRingLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dougPanel = new javax.swing.JPanel();
        unknownFolderCheckBox = new javax.swing.JCheckBox();
        AcquisitionSavingMode_combo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Hardware = new javax.swing.JPanel();
        AutoFocusSelectComboBox = new javax.swing.JComboBox();
        AutoFocusLabel = new javax.swing.JLabel();
        motorizedMicroscopeTableComboBox = new javax.swing.JComboBox();
        MotorizedMicroscopeTableLabel = new javax.swing.JLabel();

        arduinoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Arduino"));

        thresholdA0Field.setText("0.5");

        thresholdA1Field.setText("0.5");

        thresholdA0Label.setText("Threshold for photodiode A0 (0-3.3V)");

        thresholdA1Label.setText("Threshold for photodiode A1 (0-3.3V)");

        laserIntensityField.setText("0");

        laserIntensityLabel.setText("Laser intensity");

        updateLaserIntensityButton.setText("Update");
        updateLaserIntensityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLaserIntensityButtonActionPerformed(evt);
            }
        });

        shutterResponseLabel.setText("Time between shutter and snapFlimImage");

        shutterResponseField.setText("0");

        enableLightCheckButton.setText("Enable light check (make sure HRI is turned off)");
        enableLightCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableLightCheckButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout arduinoPanelLayout = new javax.swing.GroupLayout(arduinoPanel);
        arduinoPanel.setLayout(arduinoPanelLayout);
        arduinoPanelLayout.setHorizontalGroup(
            arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arduinoPanelLayout.createSequentialGroup()
                .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arduinoPanelLayout.createSequentialGroup()
                        .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(thresholdA0Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(thresholdA1Field)
                            .addComponent(laserIntensityField)
                            .addComponent(shutterResponseField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(arduinoPanelLayout.createSequentialGroup()
                                .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thresholdA1Label)
                                    .addComponent(thresholdA0Label, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateLaserIntensityButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(laserIntensityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(arduinoPanelLayout.createSequentialGroup()
                                .addComponent(shutterResponseLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(arduinoPanelLayout.createSequentialGroup()
                        .addComponent(enableLightCheckButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        arduinoPanelLayout.setVerticalGroup(
            arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arduinoPanelLayout.createSequentialGroup()
                .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thresholdA0Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thresholdA0Label)
                    .addComponent(updateLaserIntensityButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thresholdA1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thresholdA1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laserIntensityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laserIntensityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(arduinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shutterResponseLabel)
                    .addComponent(shutterResponseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enableLightCheckButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        warningPanel.setBackground(new java.awt.Color(255, 0, 51));
        warningPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Important Inforamtion"));

        warningTextArea.setEditable(false);
        warningTextArea.setBackground(new java.awt.Color(255, 0, 51));
        warningTextArea.setColumns(20);
        warningTextArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        warningTextArea.setRows(5);
        warningTextArea.setText("Don't change anything on this page! \nChanging these values can damage the HRI \nand/or changes the behavior of the setup,\nso it might not work anymore.");
        warningTextArea.setBorder(null);
        importantInfo.setViewportView(warningTextArea);

        javax.swing.GroupLayout warningPanelLayout = new javax.swing.GroupLayout(warningPanel);
        warningPanel.setLayout(warningPanelLayout);
        warningPanelLayout.setHorizontalGroup(
            warningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningPanelLayout.createSequentialGroup()
                .addComponent(importantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        warningPanelLayout.setVerticalGroup(
            warningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warningPanelLayout.createSequentialGroup()
                .addComponent(importantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fOVPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("FOV"));

        xOffsetRingField.setText("0");
        xOffsetRingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xOffsetRingFieldActionPerformed(evt);
            }
        });

        xOffsetRingLabel.setText("xOffset for centration of ring acquisition");

        yOffsetRingField.setText("0");
        yOffsetRingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yOffsetRingFieldActionPerformed(evt);
            }
        });

        yOffsetRingLabel.setText("yOffset for centration of ring acquisition");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fOVPanelLayout = new javax.swing.GroupLayout(fOVPanel);
        fOVPanel.setLayout(fOVPanelLayout);
        fOVPanelLayout.setHorizontalGroup(
            fOVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fOVPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fOVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xOffsetRingField, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(yOffsetRingField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fOVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fOVPanelLayout.createSequentialGroup()
                        .addComponent(xOffsetRingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(yOffsetRingLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fOVPanelLayout.setVerticalGroup(
            fOVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fOVPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fOVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xOffsetRingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xOffsetRingLabel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fOVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yOffsetRingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yOffsetRingLabel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        dougPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Doug Magic"));

        unknownFolderCheckBox.setText("Disable \"Unknown\" folder");
        unknownFolderCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unknownFolderCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dougPanelLayout = new javax.swing.GroupLayout(dougPanel);
        dougPanel.setLayout(dougPanelLayout);
        dougPanelLayout.setHorizontalGroup(
            dougPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dougPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unknownFolderCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dougPanelLayout.setVerticalGroup(
            dougPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dougPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unknownFolderCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AcquisitionSavingMode_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "separate OME.tiff for every FOV", "single SWP OME.tiff" }));
        AcquisitionSavingMode_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcquisitionSavingMode_comboActionPerformed(evt);
            }
        });

        jLabel1.setText("Acquisition saving mode");

        Hardware.setBorder(javax.swing.BorderFactory.createTitledBorder("Hardware"));

        AutoFocusSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ZDC Olympus", "Definite focus Zeiss" }));
        AutoFocusSelectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoFocusSelectComboBoxActionPerformed(evt);
            }
        });

        AutoFocusLabel.setText("Auto focus");

        motorizedMicroscopeTableComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Corvus Stage", "WS PiezoDrive 08" }));
        motorizedMicroscopeTableComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorizedMicroscopeTableComboBoxActionPerformed(evt);
            }
        });

        MotorizedMicroscopeTableLabel.setText("Motorized microscope table");

        javax.swing.GroupLayout HardwareLayout = new javax.swing.GroupLayout(Hardware);
        Hardware.setLayout(HardwareLayout);
        HardwareLayout.setHorizontalGroup(
            HardwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HardwareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HardwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AutoFocusLabel)
                    .addComponent(MotorizedMicroscopeTableLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HardwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motorizedMicroscopeTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AutoFocusSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HardwareLayout.setVerticalGroup(
            HardwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HardwareLayout.createSequentialGroup()
                .addGroup(HardwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AutoFocusSelectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AutoFocusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HardwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorizedMicroscopeTableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotorizedMicroscopeTableLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arduinoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(warningPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fOVPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dougPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AcquisitionSavingMode_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Hardware, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(warningPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arduinoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fOVPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dougPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Hardware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcquisitionSavingMode_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        Hardware.getAccessibleContext().setAccessibleName("Hardware");
    }// </editor-fold>//GEN-END:initComponents

    
    private void updateLaserIntensityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLaserIntensityButtonActionPerformed
        double intensity=arduino_.getLaserIntensity();
        intensity = Math.round(100.0 * intensity) / 100.0;
        String intensityy=Double.toString(intensity);
        laserIntensityField.setText(intensityy);
        var_.th2=Double.parseDouble(thresholdA1Field.getText());
        var_.th1=Double.parseDouble(thresholdA0Field.getText());
        var_.shutterResponse=Integer.parseInt(shutterResponseField.getText());
    }//GEN-LAST:event_updateLaserIntensityButtonActionPerformed

    private void enableLightCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableLightCheckButtonActionPerformed
        if (enableLightCheckButton.isSelected()){
            var_.safetyOff=true;
        } else {
            var_.safetyOff=false;
        }
    }//GEN-LAST:event_enableLightCheckButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String test=xOffsetRingField.getText();
        System.out.println(test);
     //   int xOff;
      //  xOff= new Integer(xOffsetRingField.getText());
        double xOffsetRing=Double.parseDouble(xOffsetRingField.getText( ));
        System.out.println(xOffsetRing);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void xOffsetRingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xOffsetRingFieldActionPerformed
        double xOffsetRing=Double.parseDouble(xOffsetRingField.getText( ));
        var_.xOffset=xOffsetRing;
    }//GEN-LAST:event_xOffsetRingFieldActionPerformed

    private void yOffsetRingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yOffsetRingFieldActionPerformed
        double yOffsetRing=Double.parseDouble(yOffsetRingField.getText( ));
        var_.yOffset=yOffsetRing;
    }//GEN-LAST:event_yOffsetRingFieldActionPerformed

    private void unknownFolderCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unknownFolderCheckBoxActionPerformed
        if (unknownFolderCheckBox.isSelected()){
            var_.check2=true;
        } else {
            var_.check2=false;
        }
    }//GEN-LAST:event_unknownFolderCheckBoxActionPerformed

    private void AcquisitionSavingMode_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcquisitionSavingMode_comboActionPerformed
        var_.AcquisitionSavingMode = AcquisitionSavingMode_combo.getSelectedItem().toString(); 
    }//GEN-LAST:event_AcquisitionSavingMode_comboActionPerformed

    private void AutoFocusSelectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoFocusSelectComboBoxActionPerformed
        var_.autofocusWhich = AutoFocusSelectComboBox.getSelectedItem().toString();
    }//GEN-LAST:event_AutoFocusSelectComboBoxActionPerformed

    private void motorizedMicroscopeTableComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorizedMicroscopeTableComboBoxActionPerformed
        var_.motorizedMicroscopeTabelWhich = motorizedMicroscopeTableComboBox.getSelectedItem().toString();
    }//GEN-LAST:event_motorizedMicroscopeTableComboBoxActionPerformed

    public void updatePanel(){
       // do something when ProSettingsPanel is selected
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AcquisitionSavingMode_combo;
    private javax.swing.JLabel AutoFocusLabel;
    private javax.swing.JComboBox AutoFocusSelectComboBox;
    private javax.swing.JPanel Hardware;
    private javax.swing.JLabel MotorizedMicroscopeTableLabel;
    private javax.swing.JPanel arduinoPanel;
    private javax.swing.JPanel dougPanel;
    private javax.swing.JRadioButton enableLightCheckButton;
    private javax.swing.JPanel fOVPanel;
    private javax.swing.JScrollPane importantInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField laserIntensityField;
    private javax.swing.JLabel laserIntensityLabel;
    private javax.swing.JComboBox motorizedMicroscopeTableComboBox;
    private javax.swing.JTextField shutterResponseField;
    private javax.swing.JLabel shutterResponseLabel;
    private javax.swing.JTextField thresholdA0Field;
    private javax.swing.JLabel thresholdA0Label;
    private javax.swing.JTextField thresholdA1Field;
    private javax.swing.JLabel thresholdA1Label;
    private javax.swing.JCheckBox unknownFolderCheckBox;
    private javax.swing.JButton updateLaserIntensityButton;
    private javax.swing.JPanel warningPanel;
    private javax.swing.JTextArea warningTextArea;
    private javax.swing.JTextField xOffsetRingField;
    private javax.swing.JLabel xOffsetRingLabel;
    private javax.swing.JTextField yOffsetRingField;
    private javax.swing.JLabel yOffsetRingLabel;
    // End of variables declaration//GEN-END:variables
}
