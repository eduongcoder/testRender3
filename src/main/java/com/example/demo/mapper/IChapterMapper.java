// package com.example.demo.mapper;

// import org.mapstruct.Mapper;
// import org.mapstruct.Mapping;
// import org.mapstruct.MappingTarget;
// import org.mapstruct.Mappings;

// import com.example.demo.dto.request.ChapterCreationRequest;
// import com.example.demo.dto.request.ChaptersUpdateRequest;
// import com.example.demo.dto.respone.ChapterNoContentRespone;
// import com.example.demo.dto.respone.ChapterRespone;
// import com.example.demo.entity.Chapter;

// @Mapper(componentModel = "spring")
// public interface IChapterMapper {

// 	Chapter toChapter(ChapterCreationRequest request);

// 	ChapterRespone toChapterRespone(Chapter chapter);

// 	ChapterNoContentRespone toChapterNoContentRespone(Chapter chapter, String idNovel);

// 	void updateChapterRequest(ChaptersUpdateRequest request, @MappingTarget Chapter chapter);

// }
