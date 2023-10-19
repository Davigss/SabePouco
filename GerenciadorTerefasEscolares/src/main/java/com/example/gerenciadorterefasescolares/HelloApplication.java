package com.example.gerenciadorterefasescolares;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Agora vai!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() throws Exception {
        usuario u = new usuario("Fernando", "13157");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(u);
        transaction.commit();

        usuario user= session.get(usuario.class, 1);

        System.out.printf(user.toString());
    }

    public static void main(String[] args) {
        launch();
    }
}