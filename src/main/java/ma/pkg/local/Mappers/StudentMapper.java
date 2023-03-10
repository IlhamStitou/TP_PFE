package ma.pkg.local.Mappers;

import ma.pkg.local.Dtos.StudentDto;
import ma.pkg.local.Entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component

public class StudentMapper {

     StudentDto convertEntityToDto(StudentEntity entity){
       StudentDto  studentDto= new StudentDto();
       studentDto.setId(entity.getId());
       studentDto.setName(entity.getName());
       return studentDto;
    }
    public StudentEntity convertToEntity (StudentDto dto){
        StudentEntity  entity= new StudentEntity();
        entity.setId(entity.getId());
        entity.setName(entity.getName());
        return entity;
    }
    public List<StudentEntity> convertToEntities (List<StudentDto> dtos){
        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }
    public List<StudentDto> convertToDtos(List<StudentEntity>entities){
        return entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
    }
}
