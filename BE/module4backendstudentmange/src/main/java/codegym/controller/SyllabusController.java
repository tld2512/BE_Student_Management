package codegym.controller;

import codegym.model.Syllabus;
import codegym.service.SyllabusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class SyllabusController {
    @Autowired
    SyllabusService syllabusService;
    @GetMapping("/api/syllabus")
    public ResponseEntity<List<Syllabus>> getList(){
        List<Syllabus> syllabusList = (List<Syllabus>) syllabusService.findAll();
        return  new ResponseEntity<>(syllabusList, HttpStatus.OK);
    }

    @PostMapping("/api/syllabus")
    public ResponseEntity<Void> addSyllabus(@RequestBody Syllabus syllabus){
        syllabusService.save(syllabus);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/api/syllabus/{id}")
    public ResponseEntity<Void> deleteSyllabus(@PathVariable Long id){
        syllabusService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/api/syllabus/")
    public ResponseEntity<Syllabus> updateSyllabus(@RequestBody Syllabus product){
        syllabusService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
