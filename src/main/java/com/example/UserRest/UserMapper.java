package com.example.UserRest;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

UserMapper INSANCE = Mappers.getMapper(UserMapper.class);

@Mapping( source = "id", target = "identification")
Customer userToCustomer(User user);

}
