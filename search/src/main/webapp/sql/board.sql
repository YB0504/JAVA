select * from tab;
select * from board;

create table board(
num number primary key,
writer varchar2(20) not null,
email varchar2(30),
subject varchar2(50) not null,
passwd varchar2(20) not null,
reg_date timestamp not null,
readcount number default 0,
content varchar2(2000) not null,
ip varchar2(20) not null);

-- list.jsp 연습을 위한 데이터 입력
insert into board values(board_seq.nextval, '홍길동', 'test@naver.com',
'게시판 제목', '1234', sysdate, 0, '게시판 내용', '222.183.0.1');
insert into board values(board_seq.nextval, 'tn길동', 'test@naver.com',
'게시판 제목', '1234', sysdate, 0, '게시판 내용', '222.183.0.1');

select count(*) from board;

-- sequence 생성
select * from seq;

create sequence board_seq
start with 1
increment by 1
nocache;

select * from board where num = 543;