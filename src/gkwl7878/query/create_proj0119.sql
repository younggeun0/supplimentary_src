CREATE TABLE simple_login(
    id VARCHAR2(15) CONSTRAINT pk_simple_login PRIMARY KEY,  
    name varchar2(20) NOT NULL,
    password VARCHAR2(10) NOT NULL,
    tel CHAR(13) NOT NULL,
    email VARCHAR2(30) NOT NULL,
    address VARCHAR2(200) NOT NULL,
    ssn CHAR(14) CONSTRAINT uk_simple_login UNIQUE,
    question CHAR(1) NOT NULL,
    answer VARCHAR2(30) NOT NULL
);


insert into simple_login(ID, NAME, PASSWORD,TEL,EMAIL, ADDRESS, SSN, QUESTION, ANSWER)
values('gkwl','������','1234','010-2222-2222','gggg@naver.com','����� ��õ�� ����7��','666666-6666666','2','������������');
insert into simple_login(ID, NAME, PASSWORD,TEL,EMAIL, ADDRESS, SSN, QUESTION, ANSWER)
values('test','�׽�Ʈ','1234','010-2262-2222','test@naver.com','����� ������ ���ε�','226466-6666666','4','������');
select * from SIMPLE_LOGIN  ;
commit;
