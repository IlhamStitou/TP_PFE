package ma.pkg.local.services;

import ma.pkg.local.Dtos.StudentDto;
import ma.pkg.local.controllers.StudentController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServicesIml implements StudentServices{
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Override
    public Long create(StudentDto dto) {
        return null;
    }

    @Override
    public boolean update(StudentDto dto) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentDto> readAll() {
        return null;
    }
}
