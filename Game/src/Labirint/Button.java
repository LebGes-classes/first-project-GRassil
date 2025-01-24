package Labirint;

public class Button{
    private String name;
    private int operationID=0;

    public Button(String name, int operationID){
        this.name = name;
        this.operationID = operationID;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getOperationID(){
        return operationID;
    }
    public String printButton(){
        return name + " " + operationID;
    }
}