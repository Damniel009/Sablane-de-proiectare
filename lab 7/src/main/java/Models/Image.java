package Models;

import Services.ImageLoaderFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String url;
    private ImageContent content;

    public Image(String name){
        this.url = name;
        try {
            TimeUnit.SECONDS.sleep(1);
            //ImageLoaderFactory.create(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void accept(Visitor v){
        v.visit(this);
    }


    public void print(){
        System.out.print("name of img: " + this.url+ "\n");
    }
}
