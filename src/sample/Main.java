package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.model.Etudiant;

public class Main extends Application {

    private ObservableList<Etudiant> donneesEtudiant = FXCollections.observableArrayList();

    public Main() {
        // Ajout de quelques données
        donneesEtudiant.add(new Etudiant("VIDAL", "Océane", "2000", "L3", null));
        donneesEtudiant.add(new Etudiant("BOUHIER", "Noé", "1999", "L3", null));
        donneesEtudiant.add(new Etudiant("LECLERE", "Amandine", "1999", "M1", "physio"));
    }

    public ObservableList<Etudiant> getDonneesEtudiant() {
        return donneesEtudiant;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/vue/PrincipalePage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Accueil");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
