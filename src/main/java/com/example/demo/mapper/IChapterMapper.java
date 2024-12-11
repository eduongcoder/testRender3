package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.example.demo.dto.request.ChapterCreationRequest;
import com.example.demo.dto.request.ChaptersUpdateRequest;
import com.example.demo.dto.respone.ChapterNoContentRespone;
import com.example.demo.dto.respone.ChapterRespone;
import com.example.demo.entity.Chapter;

@Mapper(componentModel = "spring")
public interface IChapterMapper {

	@Mappings({
			@Mapping(target = "idChapter", ignore = true),
			@Mapping(target = "comment", ignore = true),
			@Mapping(target = "viewChapter", ignore = true),
			@Mapping(target = "totalPageChapter", ignore = true)
	})
	Chapter toChapter(ChapterCreationRequest request);

	ChapterRespone toChapterRespone(Chapter chapter);

	@Mappings({
			@Mapping(target = "idNovel", source = "idNovel"),
			@Mapping(target = "historyReads", ignore = true)
	})
	ChapterNoContentRespone toChapterNoContentRespone(Chapter chapter, String idNovel);

	@Mappings({
			@Mapping(target = "comment", ignore = true),
			@Mapping(target = "novel", ignore = true),
			@Mapping(target = "totalPageChapter", ignore = true)
	})
	void updateChapterRequest(ChaptersUpdateRequest request, @MappingTarget Chapter chapter);

}
