//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("pic1.jpg");
        Image image2 = new ProxyImage("pic2.jpg");
        Image image3 = new ProxyImage("pic1.jpg");

        image1.display();
        image2.display();
        image3.display();

    }
}