--liquibase formatted sql

--changeset User1:2
CREATE TABLE Publisher (
  idpublisher int PRIMARY KEY NOT NULL,
  name varchar(45) DEFAULT NULL
) ENGINE=InnoDB;

--changeset User1:add2
INSERT INTO Publisher VALUES (1,'first Publisher'),(2,'second Publisher');