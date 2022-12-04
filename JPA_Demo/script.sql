CREATE TABLE szerzok(
	id NUMBER(10,0) NOT NULL,
	nev VARCHAR(250) NOT NULL,
	
	CONSTRAINT PK_szerzok PRIMARY KEY(id)
)

select * from szerzok