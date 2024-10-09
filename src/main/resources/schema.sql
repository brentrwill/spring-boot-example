DROP SCHEMA IF EXISTS spring_example;
CREATE SCHEMA spring_example;
USE spring_example;

CREATE TABLE example (
  example_id bigint NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (example_id)
);