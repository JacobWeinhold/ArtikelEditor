package eu.ggnet.articleeditor;

import eu.ggnet.dwoss.uniqueunit.entity.Product;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class FXMLController implements Initializable {

    private Label label;
    @FXML
    private HBox titleHBox;
    @FXML
    private TextArea titleText;
    @FXML
    private HBox artikelHeaderHBox;
    @FXML
    private TextArea nameHeader;
    @FXML
    private TextArea idHeader;
    @FXML
    private TextArea partNoHeader;
    @FXML
    private TextArea groupHeader;
    @FXML
    private TextArea tradeNameHeader;
    @FXML
    private TextArea eolHeader;
    @FXML
    private TextArea gtinHeader;
    @FXML
    private TextArea descriptionHeader;
    @FXML
    private TextArea additionalPartNoHeader;
    @FXML
    private TextArea priceHeader;
    @FXML
    private TextArea imageIdHeader;
    @FXML
    private HBox editingHBox;

    private Product product;
    @FXML
    private HBox pricesHBox;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }
}
