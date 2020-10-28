import java.awt.*;

public class ImageProxy implements Element{
    private String url;
    private Dimension dim;
    private Image realImage;

    ImageProxy(String u){
        this.url = u;
    }

    private Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    public void print(){
        loadImage();
        realImage.print();
    }
}
