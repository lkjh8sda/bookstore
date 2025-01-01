CREATE TABLE book(
    id uuid NOT NULL PRIMARY KEY ,
    title varchar NOT NULL ,
    description VARCHAR NOT NULL ,
    release_year int NOT NULL

);

insert into book(id, title, description, release_year) values ('f37e6521-6540-495b-9454-ef5dc7dc19f8','Ikigai','The Japanese secret to long and happy life', 2018);