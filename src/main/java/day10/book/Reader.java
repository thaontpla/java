package day10.book;

public class Reader extends Person {
    private static int AUTO_ID = 10000;
    int id;
    TypesReader types;
    public Reader(int id) {
        this.id = id;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public TypesReader getTypes() {
        return types;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTypes(TypesReader types) {
        this.types = types;
    }
}
