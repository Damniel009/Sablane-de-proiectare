public class Proximity implements sensors{
    private String name;

    Proximity(String n){
        this.name = n;
    }

    @Override
    public void print() {
        System.out.println("Proximity sensor: " + this.name);
    }
}
