create table board (
    id bigint not null,
    name varchar(100),
    user bigint,
    primary key (id)
);

create table user (
    id bigint not null,
    name varchar(100)
);

alter table board add constraint board_user foreign key (user) references (id);

insert into user (id, name) values (1, 'user1');
insert into user (id, name) values (2, 'user2');