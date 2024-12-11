package com.example.demo.exception;

import lombok.Getter;


public enum ErrorCode {
	NOVEL_NOT_EXISTED(1001, "Novel not existed"), NOT_IMAGE(1002, "The file is not image"),
	NOT_PDF(1003, "The file is not pdf"), CATEGORY_NOT_EXISTED(1004, "Category not existed"),
	AUTHOR_NOT_EXISTED(1005, "Author not existed"),

	POV_NOT_EXISTED(1006, "Pov not existed"), AUTHOR_ALREADY_IN(1007, "Author already in"),
	CATEGORY_ALREADY_IN(1008, "Category already in"), POV_ALREADY_IN(1009, "Pov already in"),
	USER_EXISTED(1010,"User already existed"),USER_NOT_EXISTED(1011,"User not existed"),
	PASSWORD_NOT_MATCHED(1012,"Password not matched"), DELETE_CONTRAINT(1013,"Cant delete because it have a contraint forgein key"),
	UPLOAD_FILE_ERROR(1014,"The uploaded file was corrupted"),NO_FILE_UPLOAD(1015,"There no file has been uploaded"),
	CHAPTER_NOT_EXISTED(1016,"Chapter not existed"),NO_ORIGIN_FILE(1017,"There no origin file has been uploaded"),
	ERROR_PUBLICID(1018,"The public id is error"), COMMENT_NOT_EXISTED(1019,"The comment is not exist"),
	NOVEL_DONT_HAVE_CHAPTER(1020,"The novel dont have any chapter"),NEED_TO_DELETE_CHAPTER(1021,"Total chapter update is more than total chapter of novel"),
	UNKNOW_ERROR(9999, "Unknow error");

	private int code;
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;

	private ErrorCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	

}
