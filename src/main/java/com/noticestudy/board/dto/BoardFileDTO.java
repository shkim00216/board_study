package com.noticestudy.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardFileDTO {
    private Long id;
    private Long boardId; //어떤 게시물에 포함된 파일인지
    private String originalFileName; //원본 파일
    private String storedFileName; //데이터 추가한 파일
}
