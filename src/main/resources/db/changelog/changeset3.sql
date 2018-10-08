--liquibase formatted sql

--changeset User1:3
CREATE TABLE book_publisher (
  idbook int NOT NULL,
  idpublisher int NOT NULL,
  PRIMARY KEY (idbook, idpublisher),
  FOREIGN KEY (idbook) REFERENCES Book (idbook),
  FOREIGN KEY (idpublisher) REFERENCES Publisher (idpublisher)
) ENGINE=InnoDB;

--changeset User1:add3
INSERT INTO book_publisher VALUES (1,1),(2,2),(2,1),(1,2);

--changeset User1:add3.1
INSERT INTO book_publisher VALUES (3,1);