package app.board.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="BOARD")
public class BoardEntity {

    @Id
    @GeneratedValue
    private Long writeNo;

    private String writer;
    private String title;
    private String content;
    private Date writeTime;
    private int readCount;

    @Override
    public String toString() {
        return "BoardEntity [id=" + writeNo + ", writer=" + writer
                + ", title=" + title + ", content=" + ", writeTime=" + writeTime
                + ", readCount=" + readCount;
    }
}
