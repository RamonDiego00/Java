import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlLoader.load(); 
        Scene tela = new Scene(root);

        primaryStage.setTitle("Academia dos Devs"); 
        primaryStage.setScene(tela);
        primaryStage.show();
    }

}
//         primaryStage.setTitle("Ramonzastes");
//         Button botao = new Button("Clique aqui");
//         botao.setOnAction(new EventHandler<ActionEvent>(){

//             @Override
//             public void handle(ActionEvent event) {
//                 System.out.println("Clicou no Botão!");
//             }
//         });

//         StackPane root = new StackPane();
//         root.getChildren().addAll(botao); 
//         primaryStage.setScene(new Scene(root, 300, 250)); 
//         primaryStage.show();

//     }
// }