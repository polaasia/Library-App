INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (0,0, 'William', 'Shakespeare', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (1,0, 'Eric Arthur', 'Blair', 'George Orwell');
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (2,0, 'J.K.', 'Rowling', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (3,0, 'Kurt', 'Vonnegut', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (4,0, 'Virginia', 'Woolf', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (5,0, 'Ernest', 'Hemingway', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (6,0, 'William', 'Faulkner', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (7,0, 'Ayn', 'Rand', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (8,0, 'James', 'Joyce', null);
INSERT INTO creator (id, CREATOR_TYPE,	FIRST_NAME,	LAST_NAME, 	PEN_NAME ) VALUES (9,0, 'J.D.', 'Salinger', null);

insert into series(id, title) values (0, 'Harry Potter');

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 0, 'english', 'The tragedy of Hamlet', null, null, null, 0, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 1, 'english', 'Macbeth', null, null, null, 0, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 2, 'english', 'Animal Farm', null, null, null, 1, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 3, 'english', '1984', null, null, null, 1, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 4, 'english', 'Harry Potter and the Philosophers Stone', null, null, 0, 2, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 5, 'english', 'Harry Potter and the Chamber of Secrets', null, null, 0, 2, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 6, 'english', 'Harry Potter and the Prisoner of Azkaban', null, null, 0, 2, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 7, 'english', 'Harry Potter and the Goblet of Fire', null, null, 0, 2, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 8, 'english', 'Harry Potter and the Order of Phoenix', null, null, 0, 2, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 9, 'english', 'Harry Potter and the Half-Blood Prince', null, null, 0, 2, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 10, 'english', 'Harry Potter and the Deathly Hallows', null, null, 0, 2, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 11, 'english', 'Slaughterhouse-Five', null, null, null, 3, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 12, 'english', 'To the Lighthouse', null, null, null, 4, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 13, 'english', 'Mrs. Dalloway', null, null, null, 4, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 14, 'english', 'A Room of Ones Own', null, null, null, 4, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 15, 'english', 'The Sun Also Rises', null, null, null, 5, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 16, 'english', 'A Farewell to Arms', null, null, null, 5, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 17, 'english', 'The Sound and the Fury', null, null, null, 6, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 18, 'english', 'As I Lay Dying', null, null, null, 6, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 19, 'english', 'Atlas Shrugged', null, null, null, 7, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 20, 'english', 'The Fountainhead', null, null, null, 7, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 21, 'english', 'Ulysses', null, null, null, 8, null );

insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 22, 'english', 'The Catcher in the Rye', null, null, null, 9, null );
insert into book(DTYPE,	ID,	LANGUAGE, TITLE, FILE_TYPE,	ILLUSTRATOR_ID, SERIES_ID, AUTHOR_ID, PLACE_ID) values ('ebook', 23, 'english', 'Franny and Zoey', null, null, null, 9, null );