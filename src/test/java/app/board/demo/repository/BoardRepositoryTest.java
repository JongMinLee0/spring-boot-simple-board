package app.board.demo.repository;

import app.board.demo.entity.BoardEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    @DisplayName("Hibernate연결 테스트")
    void hibernateConnectinoTest(){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle("hibernate title");
        boardEntity.setWriter("이종민");
        boardEntity.setContent("hiberneta connection success!!!!!!!!");
        boardEntity.setWrite_date(new Date());
        assertNotNull(boardEntity, "BoardEntity가 null 입니다.");
        boardRepository.save(boardEntity);
        boardRepository.flush();
    }
}
