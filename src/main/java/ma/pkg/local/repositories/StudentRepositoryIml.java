package ma.pkg.local.repositories;

import ma.pkg.local.Entities.StudentEntity;
import ma.pkg.local.controllers.StudentController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository

public class StudentRepositoryIml implements StudentRepository {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Override
    public StudentEntity create(StudentEntity e) {

        LOGGER.debug("start methode create");
        LOGGER.debug("end methode create");
        return e;
    }

    @Override
    public StudentEntity update(StudentEntity e) {
        LOGGER.debug("start methode update");
        LOGGER.debug("end methode update");
        return new StudentEntity();
    }

    @Override
    public  boolean delete(long id) {
        LOGGER.debug("start methode delete");
        LOGGER.debug("end methode delete");
        return true;
    }

    @Override
    public List<StudentEntity> readAll() {
        LOGGER.debug("start methode readAll");

        LOGGER.debug("end methode readAll");
        return new ArrayList<StudentEntity>();
    }
}
