package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import sample.Main;
import sample.model.Etudiant;

import java.net.URL;
import java.util.ResourceBundle;

public class AjoutController implements Initializable {

    @FXML private TextField txtNom = new TextField();
    @FXML private TextField txtPrenom = new TextField();
    @FXML private ComboBox<String> comAnnee = new ComboBox<>();
    @FXML private ComboBox<String>comPromo = new ComboBox<>();
    @FXML private ComboBox<String> comOption= new ComboBox<>();
    private ObservableList<String> annee = FXCollections.observableArrayList();
    private ObservableList<String> promo = FXCollections.observableArrayList("L3", "M1", "M2");
    private ObservableList<String> option = FXCollections.observableArrayList("Physio", "Biotech", "Imagerie");

    private ObservableList<Etudiant> data = FXCollections.observableArrayList();
    private Main main = new Main();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        data = this.main.getDonneesEtudiant();
        int i;
        for (i=1970; i<2021; i++) {
            annee.add(String.valueOf(i));
        }
        comAnnee.setItems(annee);
        comPromo.setItems(promo);
        comOption.setItems(option);
    }

    @FXML
    public void ajouterEtudiant() {
        this.main.addEtudiant(new Etudiant("Boris", "Boris", "2002", "M1", "physio" ));
//        String nom = txtNom.getText();
//        String prenom = txtNom.getText();
//
//        Etudiant etu = new Etudiant();
//        etu.setNom(nom);
//        etu.setPrenom(prenom);
//        etu.setAnneeNaissance(comAnnee.getValue());
//        etu.setPromotion(comPromo.getValue());
//        etu.setOption(comOption.getValue());
//        if (comPromo.getValue() == "L3") {
//            etu.setOption(null);
//        }
//        data.add(etu);
//
//        this.main.getDonneesEtudiant().add(etu);
    }
}
