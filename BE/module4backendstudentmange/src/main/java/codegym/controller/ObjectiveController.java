package codegym.controller;

import codegym.model.Objective;
import codegym.model.Syllabus;
import codegym.service.ObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ObjectiveController {

    @Autowired
    ObjectiveService objectiveService;

    @GetMapping("/api/objective")
    public ResponseEntity<List<Objective>> getList(){
        List<Objective> objectives = (List<Objective>) objectiveService.findAll();
        return  new ResponseEntity<>(objectives, HttpStatus.OK);
    }

    @PostMapping("/api/objective")
    public ResponseEntity<Void> addObjective(@RequestBody Objective objective){
        objectiveService.save(objective);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/api/objective/{id}")
    public ResponseEntity<Void> deleteObjective(@PathVariable Long id){
        objectiveService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/api/objective/")
    public ResponseEntity<Syllabus> updateObjective(@RequestBody Objective objective){
        objectiveService.save(objective);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
