package me.dabpessoa.javafx.teste;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class FXMLTelaController {
	
	@FXML
	private TextField tfName;
	@FXML
	private Label lSayHello;

	// Event Listener on Button.onAction
	@FXML
	public void btnSayClicked(ActionEvent event) {
		lSayHello.setText(tfName.getText());
	}
}
