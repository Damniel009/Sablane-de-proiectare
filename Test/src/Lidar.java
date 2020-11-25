public class Lidar implements sensors{
    private String name;

    Lidar(String n){
        this.name = n;
    }

    @Override
    public void print() {
        System.out.println("Lidar sensor: " + this.name);
    }
}
