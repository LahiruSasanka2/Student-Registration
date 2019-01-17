drop database StudentRegistration;
create database StudentRegistration;
use StudentRegistration;

CREATE TABLE Student (
    SID VARCHAR(15) NOT NULL PRIMARY KEY,
    name varchar(255) NOT NULL,
    tell varchar(15),
    city varchar(55),
    nic varchar(20)
);

CREATE TABLE Course (
    CID VARCHAR(15) NOT NULL PRIMARY KEY,
    name varchar(255) NOT NULL,
    duration varchar(15),
    price double(65,2),
    discountAmount VARCHAR(20),
    subject varchar(1000)
);

CREATE TABLE Payment (
    PID VARCHAR(15) NOT NULL PRIMARY KEY,
    date varchar(15) NOT NULL,
    time varchar(15),
    price double(65,2),
    payAmount double(65,2),
    FullAmount double(65,2)
);

CREATE TABLE Registration (
    RID VARCHAR NOT NULL PRIMARY KEY,
    CID varchar(255) NOT NULL,
    PID varchar(15),
    date varchar(15),
    time varchar(15),
    FOREIGN KEY (CID) REFERENCES Course(CID),
    FOREIGN KEY (PID) REFERENCES Payment(PID)
);

CREATE TABLE Registration_Details (
    SID VARCHAR(30),
    PID varchar(25),
    date varchar(15),
    FOREIGN KEY (SID) REFERENCES Student(SID),
    FOREIGN KEY (PID) REFERENCES Payment(PID)
);