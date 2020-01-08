-- create sequence hibernate_sequence start with 10 increment by 1;

create table member (
  id bigint not null,
  name varchar(100),
  address_post varchar(10),
  address_detail varchar(250),
  phone_number varchar(30),
  PRIMARY KEY (id)
);

create table board (
  id varchar(50) not null,
  name varchar(100),
  description varchar(255),
  articleType integer,
  creator_id bigint,
  creator_name varchar(100),
  create_date timestamp,
  modifier_id bigint,
  modifier_name varchar(100),
  modify_date timestamp,
  primary key (id)
);

create table category (
  id BIGINT not null,
  board_id varchar(50),
  name varchar(100),
  primary key (id)
);

create table article (
  id bigint not null,
  DTYPE varchar(50),
  board_id varchar(50),
  category_id bigint,
  status varchar(20),
  subject varchar(255),
  body varchar(255),
  writer_id bigint,
  writer_name varchar(100),
  write_date timestamp,
  modifier_id bigint,
  modifier_name varchar(100),
  modify_date timestamp,
  primary key (id)
);

create table comment_alert (
    id varchar(255) not null,
    created timestamp,
    read timestamp,
    type varchar(255),
    article_id bigint,
    target_id bigint,
    writer_id bigint,
    primary key (id)
);

create table article_comments (
  article_id bigint not null,
  comment varchar(255),
  writer_id bigint,
  writer_name varchar(100),
  write_date timestamp,
);

create table article_bookmark (
  article_id bigint not null,
  member_id bigint not null,
  created timestamp,
  UNIQUE (article_id, member_id)
);

create table article_likes (
  article_id bigint not null,
  member_id bigint not null,
  created timestamp,
  UNIQUE (article_id, member_id)
);

alter table category add constraint FK_CATEGORY_BOARD foreign key (board_id) references board;

alter table article add constraint FK_ARTICLE_BOARD foreign key (board_id) references board;
alter table article add constraint FK_ARTICLE_CATEGORY foreign key (category_id) references category;

alter table article_comments add constraint FK_ARTICLE_COMMENTS_ARTICLE foreign key (article_id) references article;

alter table article_bookmark add constraint FK_ARTICLE_BOOKMARK_ARTICLE foreign key (article_id) references article;
alter table article_bookmark add constraint FK_ARTICLE_BOOKMARK_MEMBER foreign key (member_id) references member;

alter table article_likes add constraint FK_ARTICLE_LIKES_ARTICLE foreign key (article_id) references article;
alter table article_likes add constraint FK_ARTICLE_LIKES_MEMBER foreign key (member_id) references member;