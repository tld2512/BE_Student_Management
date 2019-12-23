package codegym.repository;

import codegym.model.Objective;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ObjectiveRepository extends PagingAndSortingRepository<Objective, Long> {
}
