public class Camera implements sensors{
    private String name;
    private detectionStrategy detectionStrategy;

    Camera(String n){
        this.name = n;
    }

    public void setDetectionStrategy(detectionStrategy ds){
        this.detectionStrategy = ds;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        if(detectionStrategy==null) {
            System.out.println("Camera sensor: " + this.name);
        }else{
            detectionStrategy.render(this);
        }
    }
}
