module studentManagementSystem {
  requires java.sql;
  requires javafx.fxml;
  requires javafx.controls;

  opens studentmanagementsystem to javafx.fxml;
  exports studentmanagementsystem;
}