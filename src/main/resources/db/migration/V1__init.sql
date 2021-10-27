CREATE TABLE products(
  id serial,
  description VARCHAR(45) NOT NULL,
  details VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );

CREATE TABLE client(
  id serial,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );
