public class ReadOnly {

    private String name = "Bartek";

    public String getName() { // getter
        name = name + "jest ok";
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }
}
