package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AppController {

    @FXML
    private TextField addDay;

    @FXML
    private TextArea addDescription;

    @FXML
    private TextField addMonth;

    @FXML
    private TextField addTitle;

    @FXML
    private TextField addYear;

    @FXML
    private TableColumn<?, ?> completeList;

    @FXML
    private TableColumn<?, ?> dateList;

    @FXML
    private TableColumn<?, ?> descriptionList;

    @FXML
    private TableView<?> tableList;

    @FXML
    private TableColumn<?, ?> titleList;

    @FXML
    void additem(MouseEvent event) {

    }

    @FXML
    void clearList(MouseEvent event) {

    }

    @FXML
    void editduedate(MouseEvent event) {

    }

    @FXML
    void markcomplete(MouseEvent event) {

    }

    @FXML
    void newdescription(MouseEvent event) {

    }

    @FXML
    void remove(MouseEvent event) {

    }

}
