package com.example.calculatricegraphique;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;


public class CalculatriceController {

    Operation operation = new Operation();

    @FXML
    private Button btnAddition;
    @FXML
    private Button btnCinq;
    @FXML
    private Button btnDeux;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnEffacer;
    @FXML
    private Button btnHuite;
    @FXML
    private Button btnNeuf;
    @FXML
    private Button btnParentheseDroite;
    @FXML
    private Button btnParentheseGauche;
    @FXML
    private Button btnQuatre;
    @FXML
    private Button btnResultat;
    @FXML
    private Button btnSept;
    @FXML
    private Button btnSix;
    @FXML
    private Button btnSoustraction;
    @FXML
    private Button btnSupprimer;
    @FXML
    private Button btnTrois;
    @FXML
    private Button btnUn;
    @FXML
    private Button btnZero;
    @FXML
    private Button btnPoint;
    @FXML
    private TextField txtFieldResultat;

    String valeurActuelle;

    @FXML
    void onBtnPointAction(ActionEvent event) {

        valeurActuelle = txtFieldResultat.getText() + ".";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnZeroAction(ActionEvent event) {

        valeurActuelle = txtFieldResultat.getText() + "0";
        txtFieldResultat.setText(valeurActuelle);

    }


    @FXML
    void onBtnAdditionAction(ActionEvent event) {

        valeurActuelle = txtFieldResultat.getText() + "+";
        txtFieldResultat.setText(valeurActuelle);


    }

    @FXML
    void onBtnCinqAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "5";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnDeuxAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "2";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnDivisionAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "/";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnEffacerAction(ActionEvent event) {
        txtFieldResultat.setText("");
    }

    @FXML
    void onBtnHuiteAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "8";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnMultiplicationAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "*";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnNeufAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "9";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnParentheseDroite(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + ")";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnParentheseGauche(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "(";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnQuatreAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "4";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnResultatAction(ActionEvent event) {
        double resultat = operation.eval(txtFieldResultat.getText());
        txtFieldResultat.setText(String.valueOf(resultat));
    }

    @FXML
    void onBtnSeptAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "7";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnSixAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "6";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnSoustractionAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "-";
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnSupprimerAction(ActionEvent event) {

        valeurActuelle = valeurActuelle.substring(0, valeurActuelle.length() - 1);
        txtFieldResultat.setText(valeurActuelle);

    }

    @FXML
    void onBtnTroisAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "3";
        txtFieldResultat.setText(valeurActuelle);
    }

    @FXML
    void onBtnUnAction(ActionEvent event) {
        valeurActuelle = txtFieldResultat.getText() + "1";
        txtFieldResultat.setText(valeurActuelle);
    }



}
