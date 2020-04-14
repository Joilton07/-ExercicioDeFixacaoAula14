module br.com.joilton.EdFAula14 {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens br.com.joilton.EdFAula14 to javafx.fxml;
    opens br.com.joilton.Util to javafx.fxml;
    exports br.com.joilton.EdFAula14;
    exports br.com.joilton.Util;
    exports br.com.joilton.Model;
}