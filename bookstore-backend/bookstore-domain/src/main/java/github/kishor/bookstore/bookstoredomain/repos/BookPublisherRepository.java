package github.kishor.bookstore.bookstoredomain.repos;

import github.kishor.bookstore.bookstoredomain.model.BookPublisher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  BookPublisherRepository extends MongoRepository<BookPublisher, String> {
}
