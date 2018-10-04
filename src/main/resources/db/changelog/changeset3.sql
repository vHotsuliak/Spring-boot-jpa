--liquibase formatted sql

--changeset User1:3
CREATE TABLE book_publisher (
  idbook int NOT NULL,
  idpublisher int NOT NULL,
  PRIMARY KEY (idbook, idpublisher),
  CONSTRAINT 'fk_book_publisher_1' FOREIGN KEY (idbook) REFERENCES Book (idbook),
  CONSTRAINT 'fk_book_publisher_2' FOREIGN KEY (idpublisher) REFERENCES Publisher (idpublisher)
) ENGINE=InnoDB;

INSERT INTO book_publisher VALUES (1,1),(2,2),(2,1),(1,2);