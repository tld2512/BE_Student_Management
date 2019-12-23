package codegym.service.impl;

import codegym.model.Objective;
import codegym.repository.ObjectiveRepository;
import codegym.service.ObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;

public class IObjectiveService implements ObjectiveService {
    @Autowired
    ObjectiveRepository objectiveRepository;

    @Override
    public Iterable<Objective> findAll() {
        return objectiveRepository.findAll();
    }

    @Override
    public Objective findById(Long id) {
        return objectiveRepository.findById(id).get();
    }

    @Override
    public void save(Objective objective) {
        objectiveRepository.save(objective);
    }

    @Override
    public void delete(Long id) {
        objectiveRepository.deleteById(id);
    }
}
