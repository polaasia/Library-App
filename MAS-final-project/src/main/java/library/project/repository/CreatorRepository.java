package library.project.repository;

import library.project.model.Creator;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreatorRepository extends CrudRepository<Creator, Long> {

    @Override
    List<Creator> findAll();

}
