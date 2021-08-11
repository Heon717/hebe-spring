SELECT * FROM todo;

create TABLE user_day(
	user_id CHAR(20) NOT NULL,
	regdt DATE NOT NULL DEFAULT CURDATE() UNIQUE
);

CREATE TABLE todo(
	t_board INT NOT NULL,
	t_text CHAR(100) NOT NULL,
	done BOOLEAN,
	regdt DATE NOT NULL DEFAULT CURDATE(),
	FOREIGN KEY (regdt) REFERENCES user_day(regdt),
	PRIMARY KEY (t_board)
);

DROP TABLE user_day;
DROP TABLE todo;

INSERT INTO user_day
(user_id,regdt)
VALUES
("hi","2021-08-3");

INSERT INTO todo
(t_board,t_text,done,regdt)
VALUES
(33,"ㅡㅡ고",true,"2021-07-29");

SELECT * FROM todo WHERE regdt = "2021-07-29";
SELECT * FROM todo WHERE regdt = "2021-08-05"; 

CREATE TABLE todo(
	t_board INT NOT NULL,
	t_text CHAR(100) NOT NULL,
	done BOOLEAN,
	regdt DATE NOT NULL DEFAULT CURDATE(),
	PRIMARY KEY (t_board)
);

SELECT EXISTS (SELECT * FROM todo WHERE regdt="2021-08-10" LIMIT 1) as success;

SELECT * FROM todo WHERE EXISTS (SELECT * FROM todo WHERE regdt="2021-08-09");

SELECT * FROM todo;

CREATE TABLE todo_day(
	i_user INT AUTO_INCREMENT,
	id CHAR(20) NOT NULL
	regdt DATE NOT NULL DEFAULT CURDATE(),
	FOREIGN KEY (regdt) REFERENCES todo(regdt),
	PRIMARY KEY (i_user,regdt);
);

SELECT regdt FROM todo;

SELECT DISTINCT regdt from todo;
 
SELECT distinct MONTH(regdt), DAY(regdt) FROM todo;

SELECT DISTINCT regdt AS month from todo WHERE MONTH(regdt)=8;
