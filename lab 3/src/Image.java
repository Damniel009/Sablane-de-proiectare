import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String imageName;

    public Image(String name){
        this.imageName = name;
    }

    public void print(){
        System.out.print(this.imageName+ "\n");
    }
}
