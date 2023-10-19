module com.example.gerenciadorterefasescolares {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;


    opens com.example.gerenciadorterefasescolares to javafx.fxml;
    opens com.example.gerenciadorterefasescolares.model to org.hibernate.orm.core;
    exports com.example.gerenciadorterefasescolares;
}