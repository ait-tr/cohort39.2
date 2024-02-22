package application2.service.util;

import application2.core.dto.ToDoDto;
import application2.core.entity.ToDoEntity;

public class Converter {

    public static ToDoEntity convertFromDtoToEntity(ToDoDto dto){
        ToDoEntity entity = new ToDoEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        return entity;
    }

    public static ToDoDto converterFromEntityToDto(ToDoEntity entity){
        return new ToDoDto(entity.getName(), entity.getDescription());
    }
}
