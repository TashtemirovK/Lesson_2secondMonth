import javax.lang.model.element.Name;

public class Main {
    public static void main(String[] args) {


        Printable[] printables = {createObject("Hyundai"),createObject("Toyota"),createObject("Lexus")};
        for (Printable printable: printables) {
            printable.print();
        }

    }
    public static Printable createObject(String className) {
        switch (className) {
            case "Hyundai":
                return new Hyundai();
            case "Toyota":
                return new Toyota();
            case "Lexus":
                return new Lexus();
            default:
        }
        return null;
    }
}