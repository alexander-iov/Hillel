package patterns.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();

    }

    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {
        return switch (specialty) {
            case "java" -> new JavaDeveloperFactory();
            case "c++" -> new CppDeveloperFactory();
            default -> throw new RuntimeException(specialty + " is unknown specialty");
        };
    }
}
