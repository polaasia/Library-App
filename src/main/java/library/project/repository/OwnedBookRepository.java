package library.project.repository;

import library.project.model.BorrowedBook;
import org.springframework.data.repository.CrudRepository;

public interface OwnedBookRepository extends CrudRepository<BorrowedBook, Long> {


}
