/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kesehatan;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLKesehatanController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton laki;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton perempuan;
    @FXML
    private JFXTextField editNama;
    @FXML
    private JFXTextField editBb;
    @FXML
    private JFXTextField editTb;
    @FXML
    private JFXTextField ideals;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private Button proses;
    @FXML
    private Button reset;
    @FXML
    private JFXTextField analisa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prosess(ActionEvent event) {
            int a = 50;
            String nama = editNama.getText();
            int berat = Integer.parseInt(editBb.getText());
            String Saran = "";
            int tinggi = Integer.parseInt(editTb.getText());
            int ideal = 0;
            String analis = null;
            String kelamin="";
                if (laki.isSelected()){
                    kelamin = "Laki - laki";
                    ideal = tinggi - 110;
                    if(ideal == berat){
                        analis = "Ideal";
                        Saran = "Saran : \n1. Ok Mantap :v";
                    }else if(ideal > berat){
                        analis = "UnderWeight";
                        Saran = "Saran : \n1. Makan yang banyak \n2. Minum Susu \n3. Sering Olahraga";
                    }else{
                        analis = "OverWight";
                        Saran ="Saran : \n1. Makan Secukupnya \n2. Perbanyak Olahraga \n3. Jangan minum Susu";
                    }
                }else if(perempuan.isSelected()){
                    kelamin = "Perempuan";
                    ideal = tinggi - 100;
                    if(ideal == berat){
                        analis = "Ideal";
                        Saran = "Saran : \n1. Ok Mantap :v";
                    }else if(ideal > berat){
                        analis = "UnderWeight";
                        Saran = "Saran : \n1. Makan yang banyak \n2. Minum Susu \n3. Sering Olahraga";
                    }else{
                        analis = "OverWight";
                        Saran ="Saran : \n1. Makan Secukupnya \n2. Perbanyak Olahraga \n3. Jangan minum Susu";
                    }
                }    

            ideals.setText(""+ideal);
            analisa.setText(""+analis);
            hasil.setText("Nama : "+nama+"\nBerat Badan : "+berat+"\nTinggi Badan : "+tinggi+"\nJenis Kelamin : "+kelamin);
            saran.setText("Saran : "+Saran);
    }

    @FXML
    private void resett(ActionEvent event) {
        editNama.setText("");
        editBb.setText("");
        editTb.setText("");
        ideals.setText("");
        hasil.setText("");
        saran.setText("");
        laki.setSelected(false);
        perempuan.setSelected(false);
        analisa.setText("");
    }  
}
