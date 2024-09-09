package com.noticestudy.board.repository;

import com.noticestudy.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sql;

    public void save(BoardDTO boardDTO) {
        sql.insert("Board.save", boardDTO); //mapper의 namespace.id - 2개 이상의 파라미터 넘겨야 할 경우 해쉬맵
    }
}
