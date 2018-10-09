package com.controllers;

import com.model.Class;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @ApiOperation(
            value = "return list of classes",
            notes = "return all classes in this school")
    @GetMapping
    public List<Class> getAllClasses() {
        return null;
    }

    /**
     * Add some class to the list of school classes.
     */
    @PostMapping
    public void addClass() {
    }

    @GetMapping("/{id}")
    public List<Class> getClassById(@RequestParam("id") String id) {
        return null;
    }

    @PostMapping("/{id}")
    public void editClassById(@RequestParam("id") String id) {
    }

    @GetMapping("/{id_class}/subjects/{id_subject}/journal")
    public String getJournalForClassBySubject() {
        return null;
    }
}
