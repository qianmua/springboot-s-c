use sc_admin;
drop table if exists `t_dept`;
create table `t_dept`(
                         dept_no BIGINT PRIMARY KEY AUTO_INCREMENT,
                         d_name varchar(100),
                         db_name varchar(100)
);


insert into t_dept(d_name, db_name) values('部门一',DATABASE());
insert into t_dept(d_name, db_name) values('部门二',DATABASE());
insert into t_dept(d_name, db_name) values('部门三',DATABASE());
insert into t_dept(d_name, db_name) values('部门四',DATABASE());

select * from t_dept;