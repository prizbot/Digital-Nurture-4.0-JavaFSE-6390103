public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("First display call for image1:");
        image1.display();

        System.out.println("\nSecond display call for image1:");
        image1.display();

        System.out.println("\nFirst display call for image2:");
        image2.display();
    }
}
