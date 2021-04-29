package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.controller.EtudiantController;
import sample.model.Etudiant;

import java.io.IOException;

public class Main extends Application {

    @FXML
    private AnchorPane rootPane;
    @FXML
    public ObservableList<Etudiant> donneesEtudiant = FXCollections.observableArrayList();

    public Main() {
        // Ajout de quelques données
        donneesEtudiant.add(new Etudiant("VIDAL", "Océane", "2000", "L3", null));
        donneesEtudiant.add(new Etudiant("BOUHIER", "Noé", "1999", "L3", null));
        donneesEtudiant.add(new Etudiant("LECLERE", "Amandine", "1999", "M1", "physio"));
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/vue/PrincipalePage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Accueil");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public ObservableList<Etudiant> getDonneesEtudiant() {
        return donneesEtudiant;
    }

    public void addEtudiant(Etudiant etu){
        this.donneesEtudiant.add(etu);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
