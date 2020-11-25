public class Temperature implements sensors{
    private String name;

    Temperature(String n){
        this.name = n;
    }

    @Override
    public void print() {
        System.out.println("Temperature sensor: " + this.name);
    }
}
