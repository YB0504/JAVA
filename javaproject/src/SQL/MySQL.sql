show databases;
show tables;

-- 예 1
-- primary key (기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- 보통 한개의 테이블에 한개가 사용된다.
-- auto_increment : 1부터 1씩 증가된 값을 자동으로 입력한다는 의미

select * from customer order by no asc limit 0, 5;
select * from customer order by no desc limit 0, 5;

create table customer( no int(4) auto_increment  primary key, 
		       		   name varchar(20), 
		       		   email varchar(20), 
		       		   tel varchar(20),
		       		   address varchar(50),
		       		   reg_date timestamp);
		       		   
insert into customer(name,email,tel,address,reg_date)
	values('오라클', '오라클@naver.com', '333-3333', '세종시', sysdate());
	
	
drop table board;
select * from board order by no desc limit 0, 10;
select * from board order by no asc limit 2, 3;
desc board;

create table board(
	no int(4) auto_increment primary key,
	writer varchar(20) not null,
    passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp);

insert into board(writer,passwd,subject,content,reg_date)
	values('롯데', '7777', '빼빼로', '아몬드빼빼로', now());
	
--총 데이터 갯수 구하기
select count(*) from board;
