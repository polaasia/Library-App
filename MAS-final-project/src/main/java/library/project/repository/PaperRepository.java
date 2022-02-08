package library.project.repository;

import library.project.model.Paper;
import org.springframework.data.repository.CrudRepository;

public interface PaperRepository extends CrudRepository<Paper, Long> {
}
