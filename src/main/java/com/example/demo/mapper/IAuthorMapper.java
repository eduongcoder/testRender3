package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.example.demo.dto.request.AuthorCreationRequest;
import com.example.demo.dto.request.AuthorUpdateRequest;
import com.example.demo.dto.respone.AuthorRespone;
import com.example.demo.entity.Author;

@Mapper(componentModel = "spring")
public interface IAuthorMapper {

	@Mappings({
			@Mapping(target = "idAuthor", ignore = true),
			@Mapping(target = "imageAuthor", ignore = true),
			@Mapping(target = "publicIDAuthor", ignore = true)
	})
	Author toAuthor(AuthorCreationRequest request);

	@Mappings({
			@Mapping(target = "imageAuthor", ignore = true),
			@Mapping(target = "publicIDAuthor", ignore = true)
	})
	Author toAuthor(AuthorUpdateRequest request);

	@Mappings({
			@Mapping(target = "dobAuthor", ignore = true),
			@Mapping(target = "dodAuthor", ignore = true),
			@Mapping(target = "publicIDAuthor", ignore = true)
	})
	AuthorRespone toAuthorRespone(Author author);
}
