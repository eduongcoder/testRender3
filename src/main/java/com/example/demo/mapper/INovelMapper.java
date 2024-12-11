package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.example.demo.dto.request.NovelCreationRequest;
import com.example.demo.dto.request.NovelUpdateRequest;
import com.example.demo.dto.respone.NovelJustIdAndNameRespone;
import com.example.demo.dto.respone.NovelNoChapterRespone;
import com.example.demo.dto.respone.NovelNoImageRespone;
import com.example.demo.dto.respone.NovelRespone;
import com.example.demo.entity.Novel;

@Mapper(componentModel = "spring")
public interface INovelMapper {

	Novel toNovel(NovelCreationRequest request);

	NovelJustIdAndNameRespone toNovelJustIdAndNameRespone(Novel novel);

	NovelNoImageRespone toNovelNoImageRespone(Novel novel);

	NovelNoChapterRespone toNovelNoChapterRespone(Novel novel);

	NovelRespone toNovelRespone(Novel novel);

	void updateNovelFormRequest(NovelUpdateRequest request, @MappingTarget Novel novel);
}
