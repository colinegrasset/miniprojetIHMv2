package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalePageController implements Initializable {

    @FXML
    private AnchorPane rootPane;

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
