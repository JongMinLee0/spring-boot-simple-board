DROP TABLE IF EXISTS TBL_BOARD;

CREATE TABLE TBL_BOARD(
    wirteId INT AUTO_INCREMENT primary key,
    title varchar2(200) NOT NULL,
    content varchar2(400) NOT NULL,
    writeTime date DEFAULT SYSDATE,
    readCount int DEFAULT 0
)