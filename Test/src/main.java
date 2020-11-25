public class main {
    public static void main(String[] args) {
            Panel p = new Panel("panel1");

            Camera c1 = new Camera("camera1");
            c1.setDetectionStrategy(new DetectionPeople());

            Camera c2 = new Camera("camera2");
            c2.setDetectionStrategy(new DetectionRoad());

            Camera c3 = new Camera("camera3");

            Lidar l = new Lidar("lidar1");
            Proximity pr = new Proximity("proximity1");
            Temperature t = new Temperature("temperature1");

            p.addContent(c1);
            p.addContent(c2);
            p.addContent(c3);
            p.addContent(l);
            p.addContent(pr);
            p.addContent(t);

            p.print();

    }
}
