package com.example.wypozyczalnia.mappers;

import com.example.wypozyczalnia.DTO.CarDto;
import com.example.wypozyczalnia.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    static CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToDto(Car car);
    Car dtoToCar(CarDto carDTO);
}
