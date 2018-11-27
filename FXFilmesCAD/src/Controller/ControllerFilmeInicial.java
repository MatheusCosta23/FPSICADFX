package Controller;


import javafx.fxml.Initializable;
import java.awt.TextField;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import application.Principal;
import entidade.Filmes;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerFilmeInicial implements Initializable {

	




	    @FXML
	    private Button btnSair;
	    
		@FXML
		private Button btnAdicionar;
		@FXML
		private TextField txtNomemFilme;
		@FXML
		private TextField txtDiretor;
		@FXML
		private TextField txtAno;
		@FXML
		private TextField txtGenero;
		@FXML
		private ListView<Filmes> lvListar;
		


	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		/*btnSair.setOnMouseClicked((MouseEvent e) -> {
			sair();
		});
		btnSair.setOnKeyPressed((KeyEvent e) -> {
			if (e.getCode() == KeyCode.ENTER)
				sair();
		});*/
		
		 btnSair.setOnMouseClicked((MouseEvent e) -> {

	            Fechar();
	        });
	        btnSair.setOnKeyPressed((KeyEvent e) -> {
	            if (e.getCode() == KeyCode.ENTER) {
	                Fechar();
	            }
	        });
	}


    public void Fechar() {
        Principal.getStage().close();
    }
	
}
