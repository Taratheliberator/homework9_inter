package interfaces;
import roles.Reader;
import roles.User;

public interface Administrator {
    void overdueNotification(User reader);

    void searchingBook(User reader);

    void givingBook(User reader);
}