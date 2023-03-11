package ma.pkg.local.services;

import ma.pkg.local.Dtos.StudentDto;
import ma.pkg.local.Entities.StudentEntity;

import java.util.List;

public interface StudentServices {
    StudentDto create (StudentDto dto);
    StudentDto update (StudentDto dto);
    boolean delete (long id );
    List<StudentDto> readAll();

}


