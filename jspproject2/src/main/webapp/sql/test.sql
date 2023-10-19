create table test(
	num number,
	name varchar2(10),
	primary key(num) );
	
drop table test purge;

purge recyclebin;

select * from tab;