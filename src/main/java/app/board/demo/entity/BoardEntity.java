package app.board.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter @Setter
@Entity @ToString
@Table(name="BOARD")
public class BoardEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "table_seq")
    @SequenceGenerator(name="table_seq", sequenceName = "board_seq", allocationSize = 1)
    private Long board_num;

    @NotNull
    private String title;
    private String content;

    @NotNull
    private String writer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date write_date;
    private int read_count;


}
