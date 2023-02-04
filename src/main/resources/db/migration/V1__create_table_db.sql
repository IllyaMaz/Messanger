create table users(
	id serial primary key,
	nick_name varchar(30),
	login varchar(30),
	password varchar(100),
	phone varchar(20)
);

create table chat (
	id serial primary key,
	user_id_first int,
	user_id_second int,
	foreign key (user_id_first) references users(id),
	foreign key (user_id_second) references users(id)
);

create table messages(
	id serial primary key,
	message varchar(4096),
	message_time timestamp,
	user_id int,
	chat_id int,
	foreign key (user_id) references users(id),
	foreign key (chat_id) references chat(id)
);