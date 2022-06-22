package interfaces;

import roles.User;

public interface Reader  {
    
    void takeBook(User administrator);
    
    void returnBook(User administrator);
}