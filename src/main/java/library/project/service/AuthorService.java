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
public class AuthorService {
    private final AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        Iterable<Author> allAuthors = authorRepository.findAll();
        List<Author> res = new ArrayList<>();
        allAuthors.forEach(res :: add);
        return res;
    }

}
