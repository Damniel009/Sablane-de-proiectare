package Models;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String chapterName;
    private List<Subchapter> subchapterList = new ArrayList<Subchapter>();


    public Chapter(String name) {
        this.chapterName = name;
    }

    public int createSubChapter(String s) {
        Subchapter sCH = new Subchapter(s);
        subchapterList.add(sCH);
        return subchapterList.indexOf(sCH);
    }

    public Subchapter getSubChapter(int indexOfSubChapter) {
        return subchapterList.get(indexOfSubChapter);
    }

    public void print(){
        System.out.print("The chapter is "+ this.chapterName);
    }

}
