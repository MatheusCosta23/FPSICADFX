package Controller;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import br.unibrasil.jbdc.CNXJDBC;
import dao.FilmesDAO;
import entidade.Filmes;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

	public class ControllerCadFilme {
		
		

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

	    @FXML
	    private Button btnListar;

	    @FXML
	    private Button btnSair;

	    
	/*    private static final String Classe_Drive = "org.hsqldb.jdbcDriver";
	    
	    private final FilmesDAO filmdao = new FilmesDAO();
	    
	    private final Connection cone = CNXJDBC.Conecta();*/
	    
	    private Stage dialogStage;
	    private boolean btnConfirma = false;
	    private Filmes film;
	    
	    

	    
	 /*   
	    public void initialize(URL url, ResourceBundle rb) {
	        // TODO

	        btnSair.setOnMouseClicked((MouseEvent e) -> {

	            Fechar();
	        });
	        btnSair.setOnKeyPressed((KeyEvent e) -> {
	            if (e.getCode() == KeyCode.ENTER) {
	                Fechar();
	            }
	        });
	        
	        btnAdicionar.setOnMouseClicked((MouseEvent e) -> {

	        	handlebtn();
	        });
	    }*/
	    
	    
	    @FXML
	    public void handlebtn()
	    {
	    	film.setNomeFilme(txtNomemFilme.getText());
	    	film.setDiretor(txtDiretor.getText());
	    	film.setGenero(txtGenero.getText());
	    
	    }
	    
	    @FXML
	    public void Fechar() {
	    	application.Principal.getStage().close();
	    }
	    
	    /*@FXML
	    public void handleButtonInserir() throws IOException {
	        Filmes film = new Filmes();
	        boolean buttonConfirmarClicked = start(film);
	        if (buttonConfirmarClicked) {
	            FilmesDAO.inserirFilme(film);
	            carregarTableViewCliente();
	        }
	    }*/
	    
	
	}

	
