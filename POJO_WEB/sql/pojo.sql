drop table MEMBER;
drop table MEMBER_DETAIL;
drop table HOUSE;
drop table REGIST_HOUSE;
drop table REPORT;
drop table QUESTION;
drop table REPLY;

  CREATE TABLE "POJO"."MEMBER" 
   (	"MEM_ID" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"MEM_NAME" VARCHAR2(20 BYTE), 
	"MEM_PASSWORD" VARCHAR2(30 BYTE), 
	"MEM_PHONE" VARCHAR2(40 BYTE), 
	"MEM_EMAIL" VARCHAR2(40 BYTE), 
	"MEM_GENDER" VARCHAR2(10 BYTE), 
	"MEM_IMG" VARCHAR2(200 BYTE), 
	"MEM_INTRO" VARCHAR2(400 BYTE), 
	"DETAIL_ID" NUMBER(20,0), 
	"DETAIL_GRADE" VARCHAR2(30 BYTE), 
	 CONSTRAINT "MEMBER_PK" PRIMARY KEY ("MEM_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;


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
	"HOUSE_NO" NUMBER(30,0), 
	"MEMBER_ID" VARCHAR2(30 BYTE), 
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
	"MEMBER_ID" VARCHAR2(30 BYTE), 
	"DETAIL_ID" NUMBER(20,0), 
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
	"MEMBER_ID" VARCHAR2(30 BYTE), 
	"DETAIL_ID" NUMBER(20,0), 
  "QUEST_REPLY_NO" NUMBER(30,0),
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
  	"REPORT_SUBJECT" VARCHAR2(40 BYTE), 
	"REPORT_CONTENT" VARCHAR2(400 BYTE), 
	"REGIT_DATE" DATE, 
	"MEMBER_ID" VARCHAR2(30 BYTE), 
	"DETAIL_ID" NUMBER(20,0),	
  "REPORT_REPLY_NO" NUMBER(30,0),
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

  
  CREATE TABLE "POJO"."REPLY" 
   (	"REPLY_NO" NUMBER(30,0) NOT NULL ENABLE, 
	"REPLY_CONTENT" VARCHAR2(400 BYTE), 
	"REPLY_DATE" DATE, 
	"MEMBER_ID" VARCHAR2(30 BYTE), 
	"DETAIL_ID" NUMBER(20,0), 
	 CONSTRAINT "REPLY_PK" PRIMARY KEY ("REPLY_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;


insert into MEMBER values ('hong', '홍길동', '1234', '01012345678', 'abc@naver.com', 'male', null, 'hello', 2, '회원');
insert into MEMBER values ('jang', '장길산', '5678', '01012345678', 'abc@naver.com', 'male', null, 'hello', 2, '회원');
insert into MEMBER values ('admin', '관리자', 'admin', '01012345678', 'abc@naver.com', 'male', null, 'hello', 1, '최고관지자');
insert into MEMBER_DETAIL values (1, '최고관리자');
insert into MEMBER_DETAIL values (2, '회원');
insert into HOUSE values (1, '공주빌라', '천안시 서북구 두정동', 350000, 8.5, 'hello', 'hong', 2);
insert into REGIST_HOUSE values (1, '2016/09/25', '2016/10/7', 1, 'hong');
insert into QUESTION values (1, '사기당했어요.', '하우스 등록자가 계속 전화를 받지 않습니다.', sysdate, 'jang', 2, null);
insert into REPORT values (1, '피해사례', '이 사람 신고합니다.', '예약자가 입금을 하지 않습니다.', sysdate, 'jang', 2, 1);
insert into REPLY values (1, '집을 이용했는데 정말 좋았어요', sysdate, 'hong', 2);

commit;