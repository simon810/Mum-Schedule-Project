-- =============================course=======================

INSERT INTO course (id,course_code,title) VALUES (1,'CS544','EA');
INSERT INTO course (id,course_code,title) VALUES (2,'CS422','Database');
INSERT INTO course (id,course_code,title) VALUES (3,'CS574','MWA');
INSERT INTO course (id,course_code,title) VALUES (4,'CS472','WAP');
INSERT INTO course (id,course_code,title) VALUES (5,'CS411','Algorithm');
INSERT INTO course (id,course_code,title) VALUES (6,'CS522','WAA');
INSERT INTO course (id,course_code,title) VALUES (7,'CS574','Machine Learning');
INSERT INTO course (id,course_code,title) VALUES (8,'CS486','Software Engineering');
INSERT INTO course (id,course_code,title) VALUES (9,'CS442','Big Data');
INSERT INTO course (id,course_code,title) VALUES (10,'CS490','Big Data Technology');
INSERT INTO course (id,course_code,title) VALUES (11,'CS390','FPP');
INSERT INTO course (id,course_code,title) VALUES (12,'CS401','MPP');


-- =============================block=======================

INSERT INTO block (id,block_name,end_date,start_date) VALUES (1,'JANUARY','2020-01-30','2020-01-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (2,'FEBRUARY','2020-02-27','2020-02-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (3,'MARCH','2020-03-30','2020-03-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (4,'APRIL','2020-04-30','2020-04-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (5,'MAY','2020-05-30','2020-05-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (6,'JUNE','2020-06-30','2020-06-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (7,'JULY','2020-07-30','2020-07-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (8,'AUGUST','2020-08-30','2020-08-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (9,'SEPTEMBER','2020-09-30','2020-09-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (10,'OCTOBER','2020-10-30','2020-10-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (11,'NOVEMBER','2020-11-30','2020-11-01');
INSERT INTO block (id,block_name,end_date,start_date) VALUES (12,'DECEMBER','2020-12-30','2020-12-01');


-- =============================faculty=======================

INSERT INTO faculty (id,full_name) VALUES (1,'Salek');
INSERT INTO faculty (id,full_name) VALUES (2,'Brun');
INSERT INTO faculty (id,full_name) VALUES (3,'Kalu');
INSERT INTO faculty (id,full_name) VALUES (4,'Michael');
INSERT INTO faculty (id,full_name) VALUES (5,'John');
INSERT INTO faculty (id,full_name) VALUES (6,'Tina');
INSERT INTO faculty (id,full_name) VALUES (7,'Jetli');
INSERT INTO faculty (id,full_name) VALUES (8,'Kuraza');
INSERT INTO faculty (id,full_name) VALUES (9,'Gatri');
INSERT INTO faculty (id,full_name) VALUES (10,'Asad');


-- =============================entry=======================

INSERT INTO entry (id,entry_type) VALUES (1,'FEBRUARY');
INSERT INTO entry (id,entry_type) VALUES (2,'MAY');
INSERT INTO entry (id,entry_type) VALUES (3,'AUGUST');
INSERT INTO entry (id,entry_type) VALUES (4,'NOVEMBER');


-- =============================student=======================

INSERT INTO student (id,entry_id) VALUES (1,1);
INSERT INTO student (id,entry_id) VALUES (2,1);
INSERT INTO student (id,entry_id) VALUES (3,1);
INSERT INTO student (id,entry_id) VALUES (4,1);
INSERT INTO student (id,entry_id) VALUES (5,1);
INSERT INTO student (id,entry_id) VALUES (6,1);

INSERT INTO student (id,entry_id) VALUES (7,2);
INSERT INTO student (id,entry_id) VALUES (8,2);
INSERT INTO student (id,entry_id) VALUES (9,2);
INSERT INTO student (id,entry_id) VALUES (10,2);
INSERT INTO student (id,entry_id) VALUES (11,2);
INSERT INTO student (id,entry_id) VALUES (12,2);

INSERT INTO student (id,entry_id) VALUES (13,3);
INSERT INTO student (id,entry_id) VALUES (14,3);
INSERT INTO student (id,entry_id) VALUES (15,3);
INSERT INTO student (id,entry_id) VALUES (16,3);
INSERT INTO student (id,entry_id) VALUES (17,3);
INSERT INTO student (id,entry_id) VALUES (18,3);

INSERT INTO student (id,entry_id) VALUES (19,4);
INSERT INTO student (id,entry_id) VALUES (20,4);
INSERT INTO student (id,entry_id) VALUES (21,4);
INSERT INTO student (id,entry_id) VALUES (22,4);
INSERT INTO student (id,entry_id) VALUES (23,4);
INSERT INTO student (id,entry_id) VALUES (24,4);


-- =============================block_faculties=======================
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,1);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,2);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,3);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,4);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,5);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,6);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,7);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,8);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,9);
INSERT INTO block_faculties (block_id,faculty_id) VALUES (1,10);

-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,1);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,2);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,3);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,4);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,5);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,6);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,7);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,8);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,9);
-- INSERT INTO block_faculties (block_id,faculty_id) VALUES (2,10);


-- =============================block_courses=======================

INSERT INTO block_courses (block_id,course_id) VALUES (1,1);
INSERT INTO block_courses (block_id,course_id) VALUES (1,2);
INSERT INTO block_courses (block_id,course_id) VALUES (1,3);
INSERT INTO block_courses (block_id,course_id) VALUES (1,4);
INSERT INTO block_courses (block_id,course_id) VALUES (1,5);
INSERT INTO block_courses (block_id,course_id) VALUES (1,6);
INSERT INTO block_courses (block_id,course_id) VALUES (1,7);
INSERT INTO block_courses (block_id,course_id) VALUES (1,8);
INSERT INTO block_courses (block_id,course_id) VALUES (1,9);
INSERT INTO block_courses (block_id,course_id) VALUES (1,10);
INSERT INTO block_courses (block_id,course_id) VALUES (1,11);
INSERT INTO block_courses (block_id,course_id) VALUES (1,12);

-- =============================schedule=======================

INSERT INTO schedule (id) VALUES (1);
INSERT INTO schedule (id) VALUES (2);
INSERT INTO schedule (id) VALUES (3);
INSERT INTO schedule (id) VALUES (4);
INSERT INTO schedule (id) VALUES (5);
INSERT INTO schedule (id) VALUES (6);
INSERT INTO schedule (id) VALUES (7);
INSERT INTO schedule (id) VALUES (8);
INSERT INTO schedule (id) VALUES (9);
INSERT INTO schedule (id) VALUES (10);
INSERT INTO schedule (id) VALUES (11);
INSERT INTO schedule (id) VALUES (12);

-- *******************************schedule_blocks**************

INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,1);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,2);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,3);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,4);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,5);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,6);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,7);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,8);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,9);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,10);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,11);
INSERT INTO schedule_blocks (schedule_id,block_id) VALUES (1,12);


-- INSERT INTO block_courses (block_id,course_id) VALUES (2,1);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,2);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,3);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,4);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,5);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,6);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,7);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,8);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,9);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,10);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,11);
-- INSERT INTO block_courses (block_id,course_id) VALUES (2,12);
--
--
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,1);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,2);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,3);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,4);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,5);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,6);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,7);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,8);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,9);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,10);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,11);
-- INSERT INTO block_courses (block_id,course_id) VALUES (3,12);

















