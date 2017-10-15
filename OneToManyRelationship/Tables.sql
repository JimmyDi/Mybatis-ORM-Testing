use hmkcode;

CREATE TABLE person(
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(18)
);
INSERT INTO person(name) VALUES('sb');
INSERT INTO person(name) VALUES('2b');
INSERT INTO person(name) VALUES('xb');

CREATE TABLE ticket(
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
    code VARCHAR(18),
    c_id INT(11),
    FOREIGN KEY (c_id) REFERENCES person(id)
 );
 
 INSERT INTO ticket(code,c_id) VALUES('beijing to dali',1);
 INSERT INTO ticket(code,c_id) VALUES('ottawa to montreal',1);
 INSERT INTO ticket(code,c_id) VALUES('Boston to New York',1);