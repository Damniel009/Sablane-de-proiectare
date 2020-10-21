public class Table implements Element{
    private String tableName;

    public Table(String name){
        this.tableName = name;
    }

    public void print(){
        System.out.print("The table is "+ this.tableName+ "\n");
    }
}
