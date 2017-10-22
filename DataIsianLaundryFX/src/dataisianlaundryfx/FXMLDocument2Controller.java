/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataisianlaundryfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Rezki
 */
public class FXMLDocument2Controller implements Initializable {

    @FXML
    private TextField idnama;
    @FXML
    private TextField idalamat;
    @FXML
    private TextField idberat;
    @FXML
    private TextField idnomor;
    @FXML
    private RadioButton pkt1;
    @FXML
    private RadioButton pkt2;
    @FXML
    private RadioButton pkt3;
    @FXML
    private TextField idtgl;
    @FXML
    private Button idoke;
    @FXML
    private Button idhps;
    @FXML
    private TextArea TA;
    @FXML
    private ToggleGroup PilihanPaket;
    @FXML
    private TextArea idharga;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String Nama = idnama.getText();
        String Alamat = idalamat.getText();
        String Berat = idberat.getText();
        String Telp = idnomor.getText();
        String Pilihan = "";        
        if (pkt1.isSelected())
            Pilihan = "Cuci Kering";
        else if (pkt2.isSelected())
            Pilihan = "Cuci Kering Setrika";
        else if (pkt3.isSelected())
            Pilihan = "Setrika";
        else
            Pilihan = "";
        String Tanggal = idtgl.getText();
        
        
        TA.setText("Nama Pelanggan : "+Nama+"\nAlamat Pelanggan : "+Alamat+"\nBerat Cucian : "+Berat+"\nNomor Telepon : "+Telp+
                "\nPilihan Paket Laundry : "+Pilihan+"\nTanggal Pengembalian : "+Tanggal);
        
        int harga = 0;
        int hitung = Integer.parseInt(idberat.getText());
        if(pkt1.isSelected());
            harga = hitung*5000;
        if(pkt2.isSelected());
            harga = hitung*8000;
        if(pkt3.isSelected());
            harga = hitung*4000;
        idharga.setText(""+harga);
        
    }

    @FXML
    private void delete(ActionEvent event) {
        TA.setText("");
        idnama.setText("");
        idalamat.setText("");
        idberat.setText("");
        idnomor.setText("");
        pkt1.setSelected(false);
        pkt2.setSelected(false);
        pkt3.setSelected(false);
        idtgl.setText("");
        idharga.setText("");
        
    }
    
}
