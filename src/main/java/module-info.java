module com.example.countryflags {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.countryflags to javafx.fxml;
    exports com.example.countryflags;
}