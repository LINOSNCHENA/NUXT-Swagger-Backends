Drop Table note;
CREATE TABLE if not exists note (
  id SERIAL PRIMARY KEY,
  title TEXT,
  content TEXT
);

INSERT INTO note (id, title, content) 
values( 1 ,'Linos', 'Presly' ),
( 2 ,'Nikolas', 'Linos' ),
( 3 ,'Lorena', 'Marvin' ),
( 4 ,'Leon', 'Nchena' ),
( 5 ,'Getrude', 'Louis' );

select * from note;