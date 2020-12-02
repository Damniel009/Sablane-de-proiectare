package Models;

public class Table implements Element{
    private String tableName;

    public Table(String name){
        this.tableName = name;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public void print(){
        System.out.print("The table is "+ this.tableName+ "\n");
    }
}
