
package project_cal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 *
 * @author Advisor
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField First_Digit;
    @FXML
    private TextField Second_Digit;
    @FXML
    private Circle Exit;
    
    
    private double xOffset=0;
    private double yOffset=0;  
    
    @FXML
    private Text t_text;
    @FXML
    private Button T_add;
    @FXML
    private Button T_multi;
    @FXML
    private Button T_divide;
    @FXML
    private Button T_subtract;
    @FXML
    private Circle max;
    @FXML
    private Circle mini1;
    @FXML
    private AnchorPane anchorPane;
    
  
    private void makestageDragable(){
        anchorPane.setOnMousePressed((event) -> {
            xOffset=event.getSceneX();
            yOffset=event.getSceneY();
        });
        anchorPane.setOnMouseDragged((event) -> {
           Project_cal.stage.setX(event.getScreenX()-xOffset);
           Project_cal.stage.setY(event.getScreenY()-yOffset);
           Project_cal.stage.setOpacity(0.8f);
        });
        anchorPane.setOnDragDone((event) -> {
            Project_cal.stage.setOpacity(1.0f);
        });
          anchorPane.setOnMouseReleased((event) -> {
            Project_cal.stage.setOpacity(1.0f);
        });
        
        
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        makestageDragable();
    }    

     
      @FXML
    private void B_exit (MouseEvent event)
    {
        //System.exit(0);
        Project_cal.stage.close();
    
    }
    @FXML
    private void F_Add(ActionEvent event) {
        float first,second,sum;
        first=Float.parseFloat(First_Digit.getText());
         second=Float.parseFloat(Second_Digit.getText());
        sum=first+second;
         t_text.setText(String.valueOf(sum));
        
    }

    @FXML
    private void F_Multi(ActionEvent event) {
        
        
        
     float first,second,mul;
        first=Float.parseFloat(First_Digit.getText());
         second=Float.parseFloat(Second_Digit.getText());
        mul=first*second;
         t_text.setText(String.valueOf(mul));
        
        
    }
    

    @FXML
    private void F_Divide(ActionEvent event) {
        
        
 float first,second,div;
        first=Float.parseFloat(First_Digit.getText());
         second=Float.parseFloat(Second_Digit.getText());
        div=first/second;
         t_text.setText(String.valueOf(div));
        
    }
  


    @FXML
    private void F_Subtract(ActionEvent event) {


float first,second,sub;
        first=Float.parseFloat(First_Digit.getText());
         second=Float.parseFloat(Second_Digit.getText());
        sub=first-second;
        t_text.setText(String.valueOf(sub));
        
    } 

   @FXML
    private void M_exit(MouseEvent event) {
      Project_cal.stage.setIconified(true);
        
    }

    @FXML
    private void maximize(MouseEvent event) {
        Project_cal.stage.setFullScreen(true);
        
    }
   
  
}