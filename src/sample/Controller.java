package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    float data =0f;
    int operation= -1;
    @FXML
    private TextField display;
    @FXML
    private Button one;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button equal;

    @FXML
    private Button zero;

    @FXML
    private Button clear;

    @FXML
    private Button add;

    @FXML
    private Button substract;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    void handleButtonAction(ActionEvent event){
        if (event.getSource()==one){
            display.setText(display.getText()+"1");
        }else if (event.getSource()==two){
            display.setText(display.getText()+"2");
        }else if (event.getSource()==three){
            display.setText(display.getText()+"3");
        }else if (event.getSource()==four){
            display.setText(display.getText()+"4");
        }else if (event.getSource()==five){
            display.setText(display.getText()+"5");
        }else if (event.getSource()==six){
            display.setText(display.getText()+"6");
        }else if (event.getSource()==seven){
            display.setText(display.getText()+"7");
        }else if (event.getSource()==eight){
            display.setText(display.getText()+"8");
        }else if (event.getSource()==nine){
            display.setText(display.getText()+"9");
        }else if (event.getSource()==zero){
            display.setText(display.getText()+"0");
        }else if (event.getSource()==clear){
            display.setText("");
        }else if (event.getSource()==add){
            data=Float.parseFloat(display.getText());
            operation=1; // addition
            display.setText("");
        }else if (event.getSource()==substract){
            data=Float.parseFloat(display.getText());
            operation=2; // subtraction
            display.setText("");
        }else if (event.getSource()==multiply){
            data=Float.parseFloat(display.getText());
            operation=3; // multiplication
            display.setText("");
        }else if (event.getSource()==divide){
            data=Float.parseFloat(display.getText());
            operation=4; // division
            display.setText("");
        }else if (event.getSource()==equal){
            Float secondOperation =Float.parseFloat(display.getText());
            switch (operation){
                case 1:// addition
                    Float ans=data+secondOperation;
                    display.setText(String.valueOf(ans));
                    break;
                case 2://subtraction
                    ans=data-secondOperation;
                    display.setText(String.valueOf(ans));
                    break;
                case 3://multiplication
                    ans=data*secondOperation;
                    display.setText(String.valueOf(ans));
                    break;
                case 4:// division
                    ans=0f;
                    try{
                        ans=data/secondOperation;
                    }catch (Exception e){display.setText("Error");}
                    display.setText(String.valueOf(ans));
                    break;
            }
        }
    }
}
