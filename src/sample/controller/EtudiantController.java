package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Main;
import sample.model.Etudiant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EtudiantController implements Initializable {

    @FXML private TableView<Etudiant> tableEtudiant  = new TableView<>();
    @FXML private TableColumn<Etudiant, String> colonneNom = new TableColumn<>("nom");
    @FXML private TableColumn<Etudiant, String> colonnePrenom = new TableColumn<>("prenom");
    @FXML private TableColumn<Etudiant, String> colonneAnneeNaissance = new TableColumn<>("anneeNaissance");
    @FXML private TableColumn<Etudiant, String> colonnePromotion = new TableColumn<>("promotion");
    @FXML private TableColumn<Etudiant, String> colonneOption = new TableColumn<>("option");

    private ObservableList<Etudiant> data = FXCollections.observableArrayList();
    private Main main = new Main();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        data = this.main.getDonneesEtudiant();
        if (data != null) {
            PropertyValueFactory<Etudiant, String> nomColFactory = new PropertyValueFactory<>(
                    "nom");
            PropertyValueFactory<Etudiant, String> prenomColFactory = new PropertyValueFactory<>(
                    "prenom");
            PropertyValueFactory<Etudiant, String> anneeNaissanceColFactory = new PropertyValueFactory<>(
                    "anneeNaissance");
            PropertyValueFactory<Etudiant, String> promotionColFactory = new PropertyValueFactory<>(
                    "promotion");
            PropertyValueFactory<Etudiant, String> optionColFactory = new PropertyValueFactory<>(
                    "option");
            colonneNom.setCellValueFactory(nomColFactory);
            colonnePrenom.setCellValueFactory(prenomColFactory);
            colonneAnneeNaissance.setCellValueFactory(anneeNaissanceColFactory);
            colonnePromotion.setCellValueFactory(promotionColFactory);
            colonneOption.setCellValueFactory(optionColFactory);
            tableEtudiant.setItems(main.getDonneesEtudiant());

        }
    }
}
