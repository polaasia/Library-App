package library.project.repository;

import library.project.model.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository <Guest, Long> {
}
