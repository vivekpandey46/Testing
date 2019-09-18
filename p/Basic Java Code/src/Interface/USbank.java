package Interface;

public interface USbank {
 int min_bal = 100;
 
 public void credit();
 
 public void debit();
 
 public void transferMoney();
 
}


//Only Method Declaration
//no method body only method prototype
//In interface - we can declare the Variable, which are by default static in nature
//Variable value will not be change , its final
//no static and MAin method in Interface
//Object creation in Interface is not possible
