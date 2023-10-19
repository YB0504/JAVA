create table boardex(
num number primary key,
writer varchar2(20) not null,
subject varchar2(20) not null,
email varchar2(30),
content varchar2(2000) not null,
passwd varchar2(50) not null,
ip varchar2(40) not null,
reg_date timestamp not null,
readcount number default 0,
ref number not null,
re_level number not null,
re_step number not null);

create sequence boardex_seq
start with 1
increment by 1
nocache;

select * from tab;
select * from BOARDEX;
select * from seq;

delete from BOARDEX where num = 1;

drop table boardex purge;
drop sequence boardex_seq;

purge recyclebin;