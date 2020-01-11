CREATE Database Pagination;

USE PAgination;

create table daata(
fname varchar(30),
lname varchar(30),
country varchar(30),
age int,
hobby varchar(30));

select * from daata;

insert into daata(fname,lname,country,age,hobby) values ("Virat","Kohli","India",28,"Travelling");
insert into daata(fname,lname,country,age,hobby) values ("Ricky","Ponting","Australia",39,"Reading");
insert into daata(fname,lname,country,age,hobby) values ("Shane","Whatson","Australis",48,"Jugguling");
insert into daata(fname,lname,country,age,hobby) values ("Chirs","gayle","West Indies",30,"Fighting");
insert into daata(fname,lname,country,age,hobby) values ("Ab","Deviliers","South Africa",42,"Swimming");
insert into daata(fname,lname,country,age,hobby) values ("Eoin","Morgan","England",35,"Eating");
insert into daata(fname,lname,country,age,hobby) values ("Mathew","Angela","Sri Lanka",38,"Travelling");
insert into daata(fname,lname,country,age,hobby) values ("Imran","Tahir","South Africa",41,"Running");
insert into daata(fname,lname,country,age,hobby) values ("Mitchel","Marsh","Newzealand",28,"Travelling");
insert into daata(fname,lname,country,age,hobby) values ("MS","Dhoni","India",38,"Travelling");
insert into daata(fname,lname,country,age,hobby) values ("Sachin","Tendulkar","India",48,"Cricket");
insert into daata(fname,lname,country,age,hobby) values ("Vivian","Tichards","West Indies",37,"Clubbing");
insert into daata(fname,lname,country,age,hobby) values ("Saun","Pollock","England",33,"Travelling");
insert into daata(fname,lname,country,age,hobby) values ("Breet","Lee","Australia",44,"Jumping");
insert into daata(fname,lname,country,age,hobby) values ("Danial","Vitory","Newzeland",42,"Travelling");

call values_page_no(4,5);