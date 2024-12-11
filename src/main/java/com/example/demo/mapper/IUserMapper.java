package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demo.dto.request.UserCreationByEmailRequest;
import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.dto.respone.UserRespone;
import com.example.demo.entity.User;

@Mapper(componentModel = "spring")
public interface IUserMapper {
	@Mappings({
			@Mapping(target = "idUser", ignore = true),
			@Mapping(target = "avatarUser", ignore = true),
			@Mapping(target = "dobUser", ignore = true),
			@Mapping(target = "userName", ignore = true),
			@Mapping(target = "comments", ignore = true),
			@Mapping(target = "publicIDUser", ignore = true)
	})

	User toUser(UserCreationRequest request);

	@Mappings({
			@Mapping(target = "idUser", ignore = true),
			@Mapping(target = "avatarUser", ignore = true),
			@Mapping(target = "dobUser", ignore = true),
			@Mapping(target = "password", ignore = true),
			@Mapping(target = "comments", ignore = true),
			@Mapping(target = "publicIDUser", ignore = true)
	})
	User toUser(UserCreationByEmailRequest request);

	@Mapping(target = "historyRead", ignore = true)
	UserRespone toUserRespone(User user);

	@Mappings({
			@Mapping(target = "email", ignore = true),
			@Mapping(target = "idUser", ignore = true),
			@Mapping(target = "password", ignore = true),
			@Mapping(target = "comments", ignore = true),
			@Mapping(target = "publicIDUser", ignore = true),
	})
	User toUser2(UserUpdateRequest request);
}
