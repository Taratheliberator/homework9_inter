package roles;

public class Administrator extends User implements interfaces.Administrator {

    private String name;

    public Administrator(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void overdueNotification(User reader) {
        System.out.println("Администратор " + name + " уведомляет:" + " читатель " + reader.getName() + " задолжал книгу");
    }


    public void searchingBook(User reader) {
        System.out.println("Администратор " + name + " ищет книгу" + " для читателя " + reader.getName());

    }

    @Override
    public void givingBook(User reader) {
        System.out.println("Администратор " + name + " выдал книгу читателю " + reader.getName());
    }
}
