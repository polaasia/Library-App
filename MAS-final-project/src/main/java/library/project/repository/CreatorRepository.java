package library.project.repository;

import library.project.model.Creator;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CreatorRepository extends CrudRepository<Creator, Long> {


}
