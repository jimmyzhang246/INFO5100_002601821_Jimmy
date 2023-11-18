import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
    private TextField display;
    private double firstNum = 0;
    private String operator = "";
    private boolean startNew = true;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Calculator");
        display = new TextField();
        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(5);
        grid.add(display, 0, 0, 5, 1);
        char[] buttons = {
                '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9',
                '+', '-', '*', '/', '='
        };
        for (int i = 0; i < buttons.length; i++) {
            Button btn = new Button(String.valueOf(buttons[i]));
            btn.setPrefSize(50, 50);
            int col = i % 5;
            int row = 1 + i / 5;
            grid.add(btn, col, row);
            char btnChar = buttons[i];
            btn.setOnAction(e -> processInput(btnChar));
        }
        Scene scene = new Scene(grid, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    private void processInput(char value) {
        if (Character.isDigit(value)) {
            if (startNew) {
                display.setText("");
                startNew = false;
            }
            display.setText(display.getText() + value);
        } else if (value == '+' || value == '-' || value == '*' || value == '/') {
            firstNum = Double.parseDouble(display.getText());
            operator = String.valueOf(value);
            startNew = true;
        } else if (value == '=') {
            double secondNum = Double.parseDouble(display.getText());
            double result = 0;
            switch (operator) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = firstNum / secondNum;
                    break;
            }
            display.setText(String.valueOf(result));
            startNew = true;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
