package ma.pkg.local.services;

import ma.pkg.local.Dtos.StudentDto;
import ma.pkg.local.Mappers.StudentMapper;
import ma.pkg.local.controllers.StudentController;
import ma.pkg.local.repositories.StudentRepositoryIml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServicesIml implements StudentServices{
    public StudentRepositoryIml studentReposritory;
    public StudentMapper studentMapper;

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    public StudentServicesIml(StudentRepositoryIml studentReposritory, StudentMapper studentMapper) {
        this.studentReposritory = studentReposritory;
        this.studentMapper = studentMapper;
    }
    @Override
    public StudentDto create(StudentDto dto) {
        LOGGER.debug("start methode create");
        StudentDto result=studentMapper.convertEntityToDto(studentReposritory.create(studentMapper.convertToEntity(dto)));
        LOGGER.debug("end methode create");
        return result;
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOGGER.debug("start methode update");
        StudentDto result=studentMapper.convertEntityToDto(studentReposritory.update(studentMapper.convertToEntity(dto)));;
        LOGGER.debug("end methode update");
        return result;
    }


    @Override
    public boolean delete(long id) {
        LOGGER.debug("start methode delete");
        boolean result=studentReposritory.delete(id);
        LOGGER.debug("end methode delete");
        return result;
    }

    @Override
    public List<StudentDto> readAll() {
        LOGGER.debug("start methode readAll");
        List<StudentDto> lst=studentMapper.convertToDtos(studentReposritory.readAll());
        LOGGER.debug("end methode readAll");
        return lst;
    }
}
