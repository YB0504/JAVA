-- 댓글 게시판
select * from tab;
select * from seq;

select * from reboard;

create table reboard( num number primary key,
writer varchar2(20) not null,
email varchar2(30),
subject varchar2(50) not null,
passwd varchar2(20) not null,
reg_date timestamp not null,
readcount number default 0,
ref number not null,		-- 원문 글과 댓글을 묶어주는 컬럼(num컬럼과 같은 값을 가진다.)
re_step number not null,	-- 댓글, 답글의 출력순서를 저장(오름차순 정렬한다.), update,in sert SQL을 실행해야 한다.
re_level number not null,	-- 댓글, 답글의 깊이를 저장하는 컬럼(내림차순)
content varchar2(2000) not null,
ip varchar2(20) not null );

create sequence reboard_seq
start with 1
increment by 1
nocache;	-- 캐시 메모리를 사용하면 번호값이 점핑되는 경우가 있다.