package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.model.Etudiant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EtudiantController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML private TableView<Etudiant> tableEtudiant  = new TableView<Etudiant>();
    @FXML private TableColumn<Etudiant, String> colonneNom = new TableColumn<Etudiant, String>("nom");
    @FXML private TableColumn<Etudiant, String> colonnePrenom = new TableColumn<Etudiant, String>("prenom");;
    @FXML private TableColumn<Etudiant, String> colonneAnneeNaissance = new TableColumn<Etudiant, String>("anneeNaissance");
    @FXML private TableColumn<Etudiant, String> colonnePromotion = new TableColumn<Etudiant, String>("promotion");
    @FXML private TableColumn<Etudiant, String> colonneOption = new TableColumn<Etudiant, String>("option");;
    @FXML public ObservableList<Etudiant> donneesEtudiant = FXCollections.observableArrayList();

    public EtudiantController() throws IOException {
        donnees();
    }

    @FXML
    public void openListeEtudiant() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/vue/ListeEtudiant.fxml"));
        afficheEtudiant();
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void openAjoutEtudiant(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/vue/AjoutEtudiant.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void openModifEtudiant(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/vue/ModifEtudiant.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    @FXML
    public void donnees() throws IOException {
        // Ajout de quelques données
        donneesEtudiant.add(new Etudiant("VIDAL", "Océane", "2000", "L3", null));
        donneesEtudiant.add(new Etudiant("BOUHIER", "Noé", "1999", "L3", null));
        donneesEtudiant.add(new Etudiant("LECLERE", "Amandine", "1999", "M1", "physio"));
    }


    @FXML
    public void afficheEtudiant() {

        if (donneesEtudiant != null) {
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
            tableEtudiant.setItems(donneesEtudiant);
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
