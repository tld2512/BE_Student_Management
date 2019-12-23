package codegym.service;

import codegym.model.Objective;

public interface ObjectiveService {
    Iterable<Objective> findAll();
    Objective findById(Long id);
    void save (Objective objective);
    void delete (Long id);
}
