package ma.pkg.local.controllers;

import ma.pkg.local.Dtos.StudentDto;
import ma.pkg.local.services.StudentServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    private StudentServices service;
    StudentController(StudentServices service)
    {
        this.service = service ;
    }
    @PostMapping ("/save")
    public  Long create  (@RequestBody StudentDto dto){
        LOGGER.debug("start");
        Long result = service.create(dto);
        LOGGER.debug("end");
        return result;
    }
    @PutMapping
    public  boolean update (@RequestBody StudentDto dto){
        LOGGER.debug("start");
        boolean result = service.update(dto);
        LOGGER.debug("end");
        return result;
    }
    @DeleteMapping
    public  boolean delete (@PathVariable("id")Long id){
        LOGGER.debug("start");
        boolean result = service.delete(id);
        LOGGER.debug("end");
        return result;

    }
    @GetMapping
    public List<StudentDto> readAll(){
        /* LOGGER.debug("start");
        List<StudentDTo> aa=service.redAll();
        LOGGER.debug("end");
        return aa;*/
        return  service.readAll();
    }
}
