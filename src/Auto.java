public class Auto {
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;


    public void jedz() {
        System.out.println("Jadę!");
    }

    public void hamuj() {
        System.out.println("Hamuję!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("przebieg: " + przebieg);
    }
}
