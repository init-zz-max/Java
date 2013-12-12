package main.gof.structural.composite.objects;

/**
 * Simple image
 */
public class Image implements AbstractFile {
    private String imageName;

    public Image(String name) {
        imageName = name;
    }

    public void ls() {
        System.out.println("image ->" + imageName);
    }
}