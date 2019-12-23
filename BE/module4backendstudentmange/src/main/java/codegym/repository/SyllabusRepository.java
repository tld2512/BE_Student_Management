package codegym.repository;

import codegym.model.Syllabus;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SyllabusRepository extends PagingAndSortingRepository<Syllabus,Long> {
}
