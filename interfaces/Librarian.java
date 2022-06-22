package interfaces;

import roles.Reader;

import roles.User;

public interface Librarian {

    void bookOrdering(User supplier);

    void searchingBook(User reader);
}