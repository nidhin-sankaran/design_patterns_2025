module com.offer24.adhost.prototype {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.offer24.adhost.prototype to javafx.fxml;
    exports com.offer24.adhost.prototype;
}