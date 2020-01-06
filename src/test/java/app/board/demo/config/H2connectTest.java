package app.board.demo.config;


import app.board.demo.entity.BoardEntity;
import app.board.demo.repository.BoardRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class H2connectTest {

    @Mock
    BoardRepository boardRepository;

    @Test
    @DisplayName("hibernate connection")
    void h2_connection_test(){
        BoardEntity board = new BoardEntity();
        assertNotNull(board);
        assertNull(boardRepository);
        // findById 메소드를 1L 호출하면 객체 리턴
        when(boardRepository.findById(1L)).thenReturn(Optional.of(board));

        // 생성되어 제목을 가져왓는지 확인
        assertNotNull(board.getTitle());

    }
}
