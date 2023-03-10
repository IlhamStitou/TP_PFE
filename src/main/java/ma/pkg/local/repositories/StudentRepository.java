package ma.pkg.local.repositories;

import ma.pkg.local.Entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    Long create (StudentEntity e);
    boolean update (StudentEntity e);
    boolean delete (long id );
    List<StudentEntity> readAll();
}
