package tryout;

import eu.ggnet.articleeditor.ProductEditorController;
import eu.ggnet.dwoss.uniqueunit.assist.gen.ProductGenerator;
import eu.ggnet.dwoss.uniqueunit.entity.Product;
import eu.ggnet.saft.Ui;
import eu.ggnet.saft.UiCore;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JLabel;

public class ProductEditorTryout extends Application {

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/articleEditor.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");

//        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        launch(args);

        UiCore.startSwing(() -> new JLabel("Mainapplicakt"));

// Neue                Ui.fxml().eval(ProductEditorController.class).ifPresent(System.out::println);
// Alt
        ProductGenerator gen = new ProductGenerator();
        final Product makeProduct = gen.makeProduct();
        System.out.println(makeProduct);
        Ui.fxml().eval(() -> makeProduct, ProductEditorController.class).ifPresent(System.out::println);
    }

}
