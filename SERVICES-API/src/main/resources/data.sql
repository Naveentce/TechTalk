INSERT INTO VERSION(ID, START_DATE, END_DATE, IS_CURRENT) VALUES(1, '2019-01-01', null, true);

INSERT INTO TECHTALK_TEAMS(TEAM_NAME, VERSION_ID) VALUES ('UNSTOPPABLE', 1);
INSERT INTO TECHTALK_TEAMS(TEAM_NAME, VERSION_ID) VALUES ('AVENGERS', 1);

INSERT INTO TEAM_MEMBER_DETAILS(ID,EMPID, EMPNAME, DESIGNATION, TEAM_ID, BU, EMAIL) VALUES (1,'IS3987','VIGNESH','DEVELOPER',1, 'HDS','vignesh@innovasolutions.com');
INSERT INTO TEAM_MEMBER_DETAILS(ID,EMPID, EMPNAME, DESIGNATION, TEAM_ID, BU, EMAIL) VALUES (2,'IS3988','Naveen','manager', 1, 'HDS','naveen@innovasolutions.com');
INSERT INTO TEAM_MEMBER_DETAILS(ID,EMPID, EMPNAME, DESIGNATION, TEAM_ID, BU, EMAIL) VALUES (3,'IS3989','chandrasekar','DEVELOPER', 2, 'HDS','chandra@innovasolutions.com');
INSERT INTO TEAM_MEMBER_DETAILS(ID,EMPID, EMPNAME, DESIGNATION, TEAM_ID, BU, EMAIL) VALUES (4,'IS4215','Sundar','DEVELOPER', 2, 'HDS','sundar@innovasolutions.com');



INSERT INTO TOPICS (ID,TITLE, ATTACHEMENT, PRESENTED_BY, PRESENTED_ON) VALUES (1,'SAFE', null, 1, '2019-01-01');
INSERT INTO TOPICS (ID,TITLE, ATTACHEMENT, PRESENTED_BY, PRESENTED_ON) VALUES (2,'CYPRESS', null, 2, '2019-01-04');
--
--
--
--
--INSERT INTO TEAM_MEMBER_DETAILS VALUES (4,'IS3999','VIGNESH','DEVELOPER','HDS','123',1);
--INSERT INTO TEAM_MEMBER_DETAILS VALUES (5,'IS3234','Naveen','manager','HDS','123',1);
--INSERT INTO TEAM_MEMBER_DETAILS VALUES (6,'IS3453','chandrasekar','DEVELOPER','HDS','123',1);
--INSERT INTO TEAM_MEMBER_DETAILS VALUES (7,'IS3233','VIGNESH','DEVELOPER','HDS','123',1);
--INSERT INTO TEAM_MEMBER_DETAILS VALUES (8,'IS3432','Naveen','manager','HDS','123',1);
--INSERT INTO TEAM_MEMBER_DETAILS VALUES (9,'IS3435','chandrasekar','DEVELOPER','HDS','123',1);

--
--
INSERT INTO RATINGS(ID,FEED1, FEED2,FEED3,FEED4,FEED5,FEED6, TOPIC_ID,TEAM_MEMBER_ID) VALUES (1,10, 9, 8, 7, 6, 5, 1, 1);
INSERT INTO RATINGS(ID,FEED1, FEED2,FEED3,FEED4,FEED5,FEED6, TOPIC_ID,TEAM_MEMBER_ID) VALUES (2,10, 9, 8, 7, 6, 5, 2, 2);
--
--
----INSERT INTO SCOREBOARD VALUES (1,1,1,10,1);
--
