public class DetectionRoad implements detectionStrategy{
    @Override
    public void render(Camera c) {
        System.out.println(c.getName() + " used for detecting a road");
    }
}
