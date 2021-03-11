package github.kishor.bookstore.bookstoreservice.publisher;

import github.kishor.bookstore.bookstoredomain.model.BookPublisher;
import github.kishor.bookstore.bookstoredomain.repos.BookPublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements  PublisherService{

    @Autowired
    BookPublisherRepository publisherRepo;

    @Override
    public BookPublisher createNewPublisher(BookPublisher publisher) {
        return publisherRepo.save(publisher);
    }

    @Override
    public BookPublisher findPublisherByName(String name) {
        return null;
    }

    @Override
    public List<BookPublisher> listAllPublishers() {
        return publisherRepo.findAll();
    }

    @Override
    public BookPublisher updatePublisher(BookPublisher publisher) {
        return publisherRepo.save(publisher);
    }

    @Override
    public boolean removePublisherById(String id) {
        publisherRepo.deleteById(id);
        return true;
    }
}
