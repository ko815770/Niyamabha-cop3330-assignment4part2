package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable{

    ObservableList<List> backtab = FXCollections.observableArrayList();

    @FXML
    private TextArea addDescription;


    @FXML
    private TextField addTitle;

    @FXML
    private TextField addYear;

    @FXML
    private TableColumn<List, String> completeList;

    @FXML
    private TableColumn<List, String> dateList;

    @FXML
    private TableColumn<List, String> descriptionList;

    @FXML
    private TableView<List> tableList;


    @FXML
    private TableColumn<List, String> titleList;


    @FXML
    void additem(MouseEvent event) {
        List list = new List();
        list.setTitle(addTitle.getText());
        list.setDate(addYear.getText());
        list.setDes(addDescription.getText());
        tableList.getItems().add(list);
        this.backtab.add(list);
        addTitle.clear();
        addYear.clear();
        addDescription.clear();
    }

    @FXML
    void clearList(MouseEvent event) {
        tableList.getItems().clear();
        this.backtab.clear();
    }


    @FXML
    void markcomplete(MouseEvent event) {
        List list = tableList.getSelectionModel().getSelectedItem();
        if (list.getComplete().equals("Incomplete"))
        {
            list.setComplete("Completed");
            tableList.refresh();
        }
        else
        {
            list.setComplete("Incomplete");
            tableList.refresh();
        }
    }


    @FXML
    void remove(MouseEvent event) {
    ObservableList<List> listSelected, allList;
    int i;
    allList = tableList.getItems();
    listSelected = tableList.getSelectionModel().getSelectedItems();
    i = tableList.getSelectionModel().selectedIndexProperty().get();
    listSelected.forEach(allList::remove);
    this.backtab.remove(i);

    }

    @FXML
    void filtercompleted(MouseEvent event) {
        ObservableList<List> filterlist = FXCollections.observableArrayList();
        for (List list : tableList.getItems())
        {
            if (list.getComplete().equals("Completed"))
            {
                filterlist.add(list);
            }
        }
        tableList.setItems(filterlist);
    }

    @FXML
    void filterincomplete(MouseEvent event) {
        ObservableList<List> filterlist = FXCollections.observableArrayList();
        for (List list : tableList.getItems())
        {
            if (list.getComplete().equals("Incomplete"))
            {
                filterlist.add(list);
            }
        }
        tableList.setItems(filterlist);
    }

    @FXML
    void displayall(MouseEvent event) {
        ObservableList<List> temp = this.backtab;
        tableList.setItems(temp);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableList.setEditable(true);
        titleList.setCellValueFactory(new PropertyValueFactory<List, String>("title"));
        dateList.setCellValueFactory(new PropertyValueFactory<List, String>("date"));
        dateList.setCellFactory(TextFieldTableCell.forTableColumn());
        dateList.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<List, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<List, String> event) {
                List list = event.getRowValue();
                list.setDate(event.getNewValue());
            }
        });
        descriptionList.setCellValueFactory(new PropertyValueFactory<List, String>("des"));
        descriptionList.setCellFactory(TextFieldTableCell.forTableColumn());
        descriptionList.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<List, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<List, String> event) {
                List list = event.getRowValue();
                list.setDes(event.getNewValue());
            }
        });
        completeList.setCellValueFactory(new PropertyValueFactory<List, String>("complete"));
    }

}
