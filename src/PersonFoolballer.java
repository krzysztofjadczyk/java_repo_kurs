public class PersonFoolballer extends Person{

    public String footballClub;

    public PersonFoolballer(String name, int age, String footballClub) {
        super(name, age); //super musi być pierwsze
        System.out.println("Jestem w konstruktorze footballer");
        this.footballClub = footballClub;
    }

    public void eat() {
        System.out.println("I like healthy food");
    }
    public void playFootball(){
        System.out.println("I am playing football in club " + footballClub);
    }


}
