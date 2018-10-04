--liquibase formatted sql

--changeset User1:1
CREATE TABLE Book(
  idbook int PRIMARY KEY NOT NULL,
  name varchar(45) DEFAULT NULL
) ENGINE=InnoDB;

INSERT INTO Book VALUES (1,'first book'),(2,'second book');