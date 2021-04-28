package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import sample.Main;
import sample.model.Etudiant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalePageController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TableView<Etudiant> tableEtudiant;
    @FXML
    private TableColumn<Etudiant, String> colonneNom;
    @FXML
    private TableColumn<Etudiant, String> colonnePrenom;
    @FXML
    private TableColumn<Etudiant, String> colonneAnneeNaissance;
    @FXML
    private TableColumn<Etudiant, String> colonnePromotion;
    @FXML
    private TableColumn<Etudiant, String> colonneOption;

    @FXML
    private Label labelNom;
    @FXML
    private Label labelPrenom;
    @FXML
    private Label labelAnneeNaissance;
    @FXML
    private Label labelPromotion;
    @FXML
    private Label labelOption;

    private Main main;

    public PrincipalePageController() {
    }

    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        colonneNom.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
        colonnePrenom.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());
        colonneAnneeNaissance.setCellValueFactory(cellData -> cellData.getValue().anneeNaissanceProperty());
        colonnePromotion.setCellValueFactory(cellData -> cellData.getValue().promotionProperty());
        colonneOption.setCellValueFactory(cellData -> cellData.getValue().optionProperty());
    }

    public void setMain(Main main) {
        this.main = main;

        // Add observable list data to the table
        tableEtudiant.setItems(main.getDonneesEtudiant());
    }


    @FXML
    public void openListeEtudiant(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/vue/ListeEtudiant.fxml"));
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
