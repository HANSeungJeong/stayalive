package com.stay.alive.file;

import lombok.Data;

@Data
public class ImageFile {
	private int imageFileNo; // 이미지 파일 번호(PK)
	private String memberId; // 회원 아이디
	private int imageFileCategoryNo; // 파일 등록 테이블 번호(FK)
	private String imageFileCategoryName; // 테이블명
	private String imageFilePath; // 이미지 파일 경로
	private String imageFileRealName; // 이미지 파일 이름
	private String imageFileStoredName; // 이미지 파일 이름
	private String imageFileExt; // 이미지 파일 확장자
	private String imageFileType; // 이미지 파일 형식
	private long imageFileSize; // 이미지 파일 크기
	private String imageFileRegisterDate; // 이미지 파일 등록일
	
}
