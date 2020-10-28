import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String url;
    private ImageContent content;

    public Image(String name){
        this.url = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void print(){
        System.out.print("name of img: " + this.url+ "\n");
    }
}

