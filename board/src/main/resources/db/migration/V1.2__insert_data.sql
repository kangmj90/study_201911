-- 사용자
insert into member(id, name, address_post, address_detail, phone_number)
  values(1, '관리자', '', '', '');

insert into member(id, name, address_post, address_detail, phone_number)
  values(2, '네이버', '13561', '경기도 성남시 분당구 불정로 6 (정자동, NAVER그린팩토리)', '1588-3830');

insert into member(id, name, address_post, address_detail, phone_number)
  values(3, '구글 코리아', '06236', '서울시 강남구 테헤란로 152 역삼동, 강남파이낸스센터 22층', '02-531-9000');

insert into member(id, name, address_post, address_detail, phone_number)
  values(4, '구글 코리아', '63309', '제주특별자치도 제주시 첨단로 242', '1577-3321');


-- 공지사항 등록
insert into board(id, name, description, creator_id, creator_name, create_date, modifier_id, modifier_name, modify_date)
  values ('SNS', 'SNS', 'SNS 게시판', 1, '관리자', current_timestamp(), 1, '관리자', current_timestamp());

insert into board(id, name, description, creator_id, creator_name, create_date, modifier_id, modifier_name, modify_date)
  values ('NOTICE', '공지사항', '사용자들에게 알려줄 공지사항', 1, '관리자', current_timestamp(), 1, '관리자', current_timestamp());

insert into board(id, name, description, creator_id, creator_name, create_date, modifier_id, modifier_name, modify_date)
  values ('MARKETPLACE', '사고/팝니다', '사용자들이 자유롭게 사고 파는 ', 1, '관리자', current_timestamp(), 1, '관리자', current_timestamp());

-- 카테고리 등록
-- insert into category(id, board_id, name) VALUES (1, 'SNS', '칭찬');
-- insert into category(id, board_id, name) VALUES (2, 'SNS', '자랑');
-- insert into category(id, board_id, name) VALUES (3, 'SNS', '일상');
-- insert into category(id, board_id, name) VALUES (4, 'NOTICE', '공지사항');
-- insert into category(id, board_id, name) VALUES (5, 'MARKETPLACE', '삽니다');
-- insert into category(id, board_id, name) VALUES (6, 'MARKETPLACE', '팝니다');
--
-- -- 게시글 등록
-- insert into article(id, DTYPE, board_id, category_id, status, subject, body, writer_id, writer_name, write_date, modifier_id, modifier_name, modify_date)
--     values(5, 'NORMAL', 'SNS', 1, 'POST', '제목', '내용', 1, '관리자', current_timestamp(), 1, '관리자', current_timestamp());
--
-- -- 게시글 댓글 등록
-- insert into article_comments(article_id, comment, writer_id, writer_name, write_date)
--   values (5, '내용', 1, '관리자', current_timestamp());
--
-- -- 게시글 북마크 등록
-- insert into article_bookmark(article_id, member_id, created) VALUES (5, 1, current_timestamp());
--
-- -- 게시글 좋아요 등록
-- insert into article_likes(article_id, member_id, created) VALUES (5, 1, current_timestamp());
