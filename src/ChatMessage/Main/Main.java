package ChatMessage.Main;

import java.awt.*;
import java.lang.Exception;

import ChatMessage.Login.DragUtil;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 获取屏幕大小
        Dimension sceenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Parent root = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
        primaryStage.setTitle("群聊");


        Scene scene = new Scene(root,sceenSize.width * 0.8,sceenSize.height*0.8);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        DragUtil.addDragListener(primaryStage, root);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
