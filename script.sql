create database GLBank;

use GLBank;

create table Employees (idemp INTEGER AUTO_INCREMENT, 
                         firstname VARCHAR(20) NOT NULL,
						 lastname VARCHAR(20) NOT NULL,
						 email VARCHAR(30) NOT NULL UNIQUE,
						 position CHAR(1) NOT NULL DEFAULT 'C',
						 PRIMARY KEY (idemp) );
						 
create table LoginEmployee (id INTEGER AUTO_INCREMENT,
						idemp INTEGER,
						login varchar(15),
						password varchar(60),
						PRIMARY KEY (id),
						FOREIGN KEY (idemp) REFERENCES Employees(idemp)
						ON DELETE CASCADE
						ON UPDATE RESTRICT);
						
create table HistoryLoginEmployee ( id INTEGER AUTO_INCREMENT,
						idemp INTEGER ,
						logindate DATETIME,
						PRIMARY KEY(id),
						FOREIGN KEY (idemp) REFERENCES Employees(idemp)
						ON DELETE CASCADE
						ON UPDATE RESTRICT);
						
insert into Employees VALUES(1,'Jan','Kollar','kollar@pobox.sk','C');
insert into Employees VALUES(2,'Daniel','Molnar','molnar@pobox.sk','C');
insert into loginemployee values(1,1,'kollar','kollar');
insert into loginemployee values(2,2,'molnar','molnar');



create table Clients  (idc INTEGER AUTO_INCREMENT,
                        FIRSTNAME VARCHAR(20) NOT NULL,
						LASTNAME VARCHAR(20) NOT NULL,
						DOB DATE NOT NULL,
						EMAIL VARCHAR(30),
						DISABLE CHAR(1) DEFAULT 'F',
						PRIMARY KEY (idc));
						
create table ClientDetails(idcp integer AUTO_INCREMENT,
                            idc integer NOT NULL,
							STREET VARCHAR(20) NOT NULL,
                            HouseNumber INTEGER NOT NULL,
                            postcode CHAR(5) NOT NULL,
							dob date NOT NULL,
							email varchar(30),
							primary key(idcp),
							foreign key(idc) 
							REFERENCES Client(idc)
							ON DELETE CASCADE 
							ON UPDATE RESTRICT
							);
							
							
create table LoginClient (idlc INTEGER AUTO_INCREMENT,
			idc integer not null,
            login varchar(20) not null unique,
            password varchar(60) not null,
            blocked char(1) default 'F',
            primary key (idlc),
            foreign key (idc)
            references Clients (idc)
            on delete cascade
            on update restrict
            );