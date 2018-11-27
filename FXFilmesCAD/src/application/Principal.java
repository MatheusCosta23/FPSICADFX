package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Principal extends Application{
	/*private static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) throws IOException{
		
			Pane root = FXMLLoader.load(getClass().getResource("/view/FXMLFilmeInicial.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Adicionar");
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void setPrimaryStage(Stage primaryStage) {
		Principal.primaryStage = primaryStage;
	}
*/
	
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/PrincipalFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Cadastro");
        stage.setScene(scene);
        stage.show();
        setStage(stage);
        
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Principal.stage = stage;
    }
    
	
}
