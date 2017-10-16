use hmkcode;

create table ss_article(
	article_id INT primary key AUTO_INCREMENT,
    name VARCHAR(18),
    price varchar(18)
);

create table ss_order(
	order_id INT primary key auto_increment,
    code VARCHAR(18),
    total VARCHAR(18)
);

CREATE TABLE ss_item(
	order_id INT(11),
	article_id INT(11),
    amount INT(11),
    FOREIGN key (order_id) references ss_order(order_id),
    FOREIGN key (article_id) references ss_article(article_id),
    UNIQUE(order_id,article_id)
);




nsert into ss_article(name,price) values('flowerDictionary',998);
insert into ss_article(name,price) values('nineShadow',250);
insert into ss_article(name,price) values('Java',666);
insert into ss_article(name,price) values('DataStructure',111);


insert into ss_item(order_id,article_id,amount) values(1,1,1);
insert into ss_item(order_id,article_id,amount) values(1,2,1);
insert into ss_item(order_id,article_id,amount) values(1,3,2);
insert into ss_item(order_id,article_id,amount) values(2,4,2);
insert into ss_item(order_id,article_id,amount) values(2,1,1);

insert into ss_order(code, total) values(’329480238’,2);
insert into ss_order(code, total) values(’123123122’,2);
insert into ss_order(code, total) values(’342342343’,1);
insert into ss_order(code, total) values(’234234234’,3);



