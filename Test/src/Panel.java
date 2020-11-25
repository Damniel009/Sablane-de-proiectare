import java.util.ArrayList;

public class Panel implements sensors{
    private String name;
    private ArrayList<sensors> sensors = new ArrayList<sensors>();

    Panel(String n){
        this.name = n;
    }

    public void addContent(sensors s){
        sensors.add(s);
    }

    @Override
    public void print() {
        System.out.println("Panel name " + this.name + " and it's sensor:");
        for(sensors i:sensors){
            i.print();
        }
    }
}
