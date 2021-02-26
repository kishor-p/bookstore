package github.kishor.bookstore.bookstoreservice.publisher;


import github.kishor.bookstore.bookstoredomain.model.BookPublisher;

import java.util.List;

public interface PublisherService {
    BookPublisher createNewPublisher(BookPublisher publisher);

    BookPublisher findPublisherByName(String name);

    List<BookPublisher> listAllPublishers();

    BookPublisher updatePublisher(BookPublisher publisher);

    boolean removePublisherById(String id);
}
