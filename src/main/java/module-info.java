module com.example.nuovoprog {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.nuovoprog to javafx.fxml;
    exports com.example.nuovoprog;
}