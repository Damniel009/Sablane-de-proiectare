public class DetectionPeople implements detectionStrategy{
    @Override
    public void render(Camera c) {
        System.out.println(c.getName() + " used for detecting people");
    }
}
