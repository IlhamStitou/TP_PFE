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
    public  StudentDto create  (@RequestBody StudentDto dto){
        LOGGER.debug("start save dto : {}",dto);
         StudentDto result = service.create(dto);
        LOGGER.debug("end");
        return result;
    }
    @PutMapping
    public  StudentDto update (@RequestBody StudentDto dto){
        LOGGER.debug("start update dto : {}",dto);
        StudentDto result = service.update(dto);
        LOGGER.debug("end");
        return result;
    }
    @DeleteMapping("/{id}")
    public  boolean delete (@PathVariable("id")Long id){
        LOGGER.debug("start delete id : "+ id);
        boolean result = service.delete(id);
        LOGGER.debug("end");
        return result;

    }
    @GetMapping("/read")
    public List<StudentDto> readAll(){
         LOGGER.debug("start");
        List<StudentDto> aa=service.readAll();
        LOGGER.debug("end");
        return aa;

    }
}
