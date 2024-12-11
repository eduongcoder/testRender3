package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demo.dto.request.CommentCreationRequest;
import com.example.demo.dto.respone.CommentRespone;
import com.example.demo.entity.Comment;

@Mapper(componentModel = "spring")
public interface ICommentMapper {

	@Mappings({
			@Mapping(target = "chapter", ignore = true),
			@Mapping(target = "idComment", ignore = true),
			@Mapping(target = "user", ignore = true)
	})
	Comment toComment(CommentCreationRequest request);

	@Mappings({
			@Mapping(target = "idChapter", ignore = true),
			@Mapping(target = "idUser", ignore = true)
	})
	CommentRespone toCommentRespone(Comment comment);
}
