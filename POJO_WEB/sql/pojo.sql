drop table MEMBER;
drop table MEMBER_DETAIL;
drop table HOUSE;
drop table REGIST_HOUSE;
drop table REPORT;
drop table QUESTION;

  CREATE TABLE "POJO"."MEMBER" 
   (	"MEM_ID" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"MEM_NAME" VARCHAR2(20 BYTE), 
	"MEM_PASSWORD" VARCHAR2(30 BYTE), 
	"MEM_PHONE" NUMBER(20,0), 
	"MEM_EMAIL" VARCHAR2(40 BYTE), 
	"MEM_GENDER" VARCHAR2(10 BYTE), 
	"MEM_IMG" VARCHAR2(200 BYTE), 
	"MEM_INTRO" VARCHAR2(400 BYTE), 
	 CONSTRAINT "MEMBER_PK" PRIMARY KEY ("MEM_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS";

  CREATE TABLE "POJO"."MEMBER_DETAIL" 
   (	"DETAIL_ID" NUMBER(20,0) NOT NULL ENABLE, 
	"DETAIL_GRADE" VARCHAR2(30 BYTE), 
	 CONSTRAINT "MEMBER_DETAIL_PK" PRIMARY KEY ("DETAIL_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
 

  CREATE TABLE "POJO"."REGIST_HOUSE" 
   (	"RH_ID" NUMBER(20,0) NOT NULL ENABLE, 
	"CHECK_IN" DATE, 
	"CHECK_OUT" DATE, 
	 CONSTRAINT "REGIST_HOUSE_PK" PRIMARY KEY ("RH_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;


  CREATE TABLE "POJO"."HOUSE" 
   (	"HOUSE_NO" NUMBER(30,0) NOT NULL ENABLE, 
	"HOUSE_NAME" VARCHAR2(40 BYTE), 
	"HOUSE_ADDRESS" VARCHAR2(200 BYTE), 
	"HOUSE_PRICE" NUMBER(30,0), 
	"HOUSE_SCORE" NUMBER(20,0), 
	"HOUSE_INFO" VARCHAR2(400 BYTE), 
	 CONSTRAINT "HOUSE_PK" PRIMARY KEY ("HOUSE_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;


  CREATE TABLE "POJO"."QUESTION" 
   (	"QUEST_NO" NUMBER(30,0) NOT NULL ENABLE, 
	"QUEST_TITLE" VARCHAR2(40 BYTE), 
	"QUEST_CONTENT" VARCHAR2(400 BYTE), 
	"QUEST_DATE" DATE, 
	 CONSTRAINT "QUESTION_PK" PRIMARY KEY ("QUEST_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;


  CREATE TABLE "POJO"."REPORT" 
   (	"REPORT_NO" NUMBER(30,0) NOT NULL ENABLE, 
	"REPORT_CATEGORY" VARCHAR2(20 BYTE), 
	"REPORT_CONTENT" VARCHAR2(400 BYTE), 
	"REPORT_CUS_ID" VARCHAR2(20 BYTE), 
	"REGIT_DATE" DATE, 
	 CONSTRAINT "REPORT_PK" PRIMARY KEY ("REPORT_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;


insert into MEMBER values ('hong', '홍길동', '1234', 01012345678, 'abc@naver.com', 'male', null, 'hello');
insert into MEMBER values ('jang', '장길산', '5678', 01012345678, 'abc@naver.com', 'male', null, 'hello');
insert into MEMBER values ('admin', '관리자', 'admin', 01012345678, 'abc@naver.com', 'male', null, 'hello');
insert into MEMBER_DETAIL values (1, '최고관리자');
insert into MEMBER_DETAIL values (2, '회원');
insert into HOUSE values (1, '공주빌라', '천안시 서북구 두정동', 350000, 8.5, 'hello');
insert into REGIST_HOUSE values (1, '2016/09/25', '2016/10/7');
insert into QUESTION values (1, '사기당했어요.', '하우스 등록자가 계속 전화를 받지 않습니다.', sysdate);
insert into REPORT values (1, '피해사례', '예약자가 입금을 하지 않습니다.', 'jang', sysdate);