package app.board.demo.repository;

import app.board.demo.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
