--liquibase formatted sql

--changeset User1:1
CREATE TABLE Book(
  idbook int PRIMARY KEY NOT NULL,
  name varchar(45) DEFAULT NULL
) ENGINE=InnoDB;


--changeset User1:add1
INSERT INTO Book VALUES (1,'first book'),(2,'second book');

--changeset User1:add1.1
INSERT INTO Book VALUES (3,'Third book');