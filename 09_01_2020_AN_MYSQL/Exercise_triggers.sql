CREATE database Exercise_triggers;

use Exercise_triggers;

Create table ticket (
 fname varchar(20),
 city varchar(10),
 ticketno int primary key
 );
 
SHOW tables;

select * from ticket;

INSERT into ticket(fname,city,ticketno) values ('omdev','morbi',21);
INSERT into ticket(fname,city,ticketno) values ('yash','kolkata',22);
INSERT into ticket(fname,city,ticketno) values ('rahul','Delhi',24);

Create table ticket_approval (
   ticket_no int primary key,
   fname varchar(20) NOT NULL
   );
   
DELIMITER $$

CREATE TRIGGER ticket_vw_approve
BEFORE INSERT
ON ticket
FOR EACH ROW
BEGIN
	insert into ticket_approval(ticket_no,fname) values(NEW.ticketno,NEW.fname);
    
END$$

DELIMITER ;

INSERT INTO ticket VALUES ('msdhoni','ranchi','36');
select * from ticket_approval;

DELIMITER $$

CREATE TRIGGER ticket_vw_approve1
BEFORE UPDATE
ON ticket
FOR EACH ROW
BEGIN
	INSERT INTO ticket_approval(ticket_no,fname) VALUES (new.ticketno+10,new.fname);
END$$

DELIMITER ;
DROP TRIGGER ticket_vw_approve1;
UPDATE ticket SET city="Morbi" where ticketno=36;
select * from ticket_approval;

DELIMITER $$

CREATE TRIGGER ticket_vw_approve2
BEFORE DELETE
ON ticket
FOR EACH ROW
BEGIN
	UPDATE ticket_approval SET Cancel_ticket="Cancelled" where ticket_no=old.ticketno or fname=old.fname;
END$$

DELIMITER ;

ALTER TABLE ticket_approval ADD Cancel_ticket varchar(30);
DELETE FROM ticket where ticketno=21;
select * from ticket_approval;