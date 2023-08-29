-- 실행하고자 하는 블록을 잡고 실행

select * from tab; -- 테이블 목록
select * from seq; -- 시퀀스 목록
select * from customer;
select count(*) from customer
select * from member;
select * from mem02;

-- 임시 테이블 삭제
purge recyclebin;

-- 예1.
-- primary key (기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- 보통 한개의 테이블에 한개가 사용된다.
-- where조건절에 설정된값이 들어간다.
-- number는 숫자 9999까지 작성가능하다.
-- MySql은 varchar를 쓴다.
-- varchar2는 문자열
create table customer( no number(4)  primary key, 
		       		   name varchar2(20), 
		       		   email varchar2(20), 
		       		   tel varchar2(20));
		       		   		       		   
-- 예2
alter table customer add(address varchar2(50));

alter table customer add(reg_date timestamp);

-- 시퀀스 : no(번호)를 1부터 1씩 자동으로 증가 시켜서 처리해주는 역할
create sequence customer_no_seq
		start with 1
		increment by 1;
		
-- 예4
create table member(name varchar2(20),
		     gender varchar2(10),
		     jumin1 varchar2(6),
             jumin2 varchar2(7),
		     address varchar2(100),
		     buseo  varchar2(20),
             sports varchar2(20),
             music varchar2(20),
             movie varchar2(20),
		     computer varchar2(20),
		     intro varchar2(1000)
		  );

-- 예5
create  table  mem02(id  varchar2(20)  primary key,
		  	   passwd  varchar2(20),
		  	   name  varchar2(20),
		  	   reg_date  date);
		  	   
-- 게시판

select * from tab; -- 테이블 목록
select * from seq; -- 시퀀스 목록
select * from board;

-- primary key (기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- not null : null값을 허용하지 않는다.
--			  반드시 값을 입력해야 한다.

create table board(
	no number primary key,
	writer varchar2(20) not null,
    passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );

create sequence board_seq
		start with 1
		increment by 1;
		
-- 글작성 : InsertBoard.java
-- 글목록 : SelectBoard.java
-- 글수정 : UpdateBoard.java
-- 글삭제 : DeleteBoard.java		
		
		
		
		