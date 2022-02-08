package library.project.repository;

import library.project.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Query(" from Book as b where b.writtenBy.id = :authorId")
    List<Book> findBooksByAuthor(@Param("authorId") long authorId);

    List<Book> findByTitle(String title);

    @Query(" from Book as b where b.illustratedBy.id = :illustratorId ")
    List<Book> findBooksByIllustrator(@Param("illustratorId") long illustratorId);

}
