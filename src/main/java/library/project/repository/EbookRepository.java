package library.project.repository;

import library.project.model.Ebook;
import org.springframework.data.repository.CrudRepository;

public interface EbookRepository extends CrudRepository<Ebook, Long> {
}
