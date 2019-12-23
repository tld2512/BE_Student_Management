package codegym.service;

import codegym.model.Syllabus;

public interface SyllabusService {
    Iterable<Syllabus> findAll();
    Syllabus findbyId(Long id);
    void save (Syllabus syllabus);
    void delete(Long id);
}
