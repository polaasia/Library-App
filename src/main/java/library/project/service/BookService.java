package library.project.service;

import library.project.model.Author;
import library.project.model.Book;
import library.project.repository.AuthorRepository;
import library.project.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;


    public List<Book> getBooksByAuthor(long authorId){
        return bookRepository.findBooksByAuthor(authorId);

    }
}
