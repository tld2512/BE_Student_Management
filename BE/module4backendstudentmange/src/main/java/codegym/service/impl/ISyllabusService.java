package codegym.service.impl;

import codegym.model.Syllabus;
import codegym.repository.SyllabusRepository;
import codegym.service.SyllabusService;
import org.springframework.beans.factory.annotation.Autowired;

public class ISyllabusService implements SyllabusService {
    @Autowired
    SyllabusRepository syllabusRepository;
    @Override
    public Iterable<Syllabus> findAll() {
        return syllabusRepository.findAll();
    }

    @Override
    public Syllabus findbyId(Long id) {
        return syllabusRepository.findById(id).get();
    }

    @Override
    public void save(Syllabus syllabus) {
       syllabusRepository.save(syllabus);
    }

    @Override
    public void delete(Long id) {
       syllabusRepository.deleteById(id);
    }


}
