package ma.pkg.local.repositories;

import ma.pkg.local.Entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    StudentEntity create (StudentEntity e);
    StudentEntity update (StudentEntity e);
    boolean delete (long id );
    List<StudentEntity> readAll();
}
