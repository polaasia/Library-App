package library.project.repository;

import library.project.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author, Long> {
}
