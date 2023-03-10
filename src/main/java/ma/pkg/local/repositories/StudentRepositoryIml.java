package ma.pkg.local.repositories;

import ma.pkg.local.Entities.StudentEntity;
import ma.pkg.local.controllers.StudentController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository

public class StudentRepositoryIml implements StudentRepository {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Override
    public Long create(StudentEntity e) {

        return null;
    }

    @Override
    public boolean update(StudentEntity e) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return null;
    }
}
