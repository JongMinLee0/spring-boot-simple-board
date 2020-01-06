package app.board.demo;

import app.board.demo.entity.BoardEntity;
import app.board.demo.repository.BoardRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.logging.Logger;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Autowired
    BoardRepository boardRepository;

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Optional<BoardEntity> boardEntity = boardRepository.findById(1L);

        logger.info("board if 1 -> " + boardEntity.get());
    }
}
