// initializing administration records

INSERT INTO Admin(id, password, password_Date, student_Access, site_Access, volunteer_Access, admin_Access, referal_access, change_Date, change_Id)  VALUES('ToddisGod', 'godaccess', '03/30/2017', 'C', 'C', 'C', 'C', 'C', '03/30/2017', 'ToddisGod')
INSERT INTO Admin(id, password, password_Date, student_Access, site_Access, volunteer_Access, admin_Access, referal_access, change_Date, change_Id)  VALUES('ToddisNotGod', 'toddaccess', '03/31/2017', 'V', 'V', 'V', 'V', 'V', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, password_Date, student_Access, site_Access, volunteer_Access, admin_Access, referal_access, change_Date, change_Id)  VALUES('ToddisSite', 'siteaccess', '03/31/2017', '', 'C', 'C', '', '', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, password_Date, student_Access, site_Access, volunteer_Access, admin_Access, referal_access, change_Date, change_Id)  VALUES('ToddisStudent', 'studentaccess', '03/31/2017', 'C', '', '', '', '', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, password_Date, student_Access, site_Access, volunteer_Access, admin_Access, referal_access, change_Date, change_Id)  VALUES('ToddisVolunteer', 'volunteeraccess', '03/31/2017', '', '', 'C', '', '', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, password_Date, student_Access, site_Access, volunteer_Access, admin_Access, referal_access, change_Date, change_Id)  VALUES('ToddisAdmin', 'adminaccess', '03/31/2017', '', '', '', 'C', '', '03/31/2017', 'ToddisGod')
INSERT INTO Admin(id, password, password_Date, student_Access, site_Access, volunteer_Access, admin_Access, referal_access, change_Date, change_Id)  VALUES('EricisDemiGod', 'DemiGod', '04/17/1989', 'C', '', '', 'C', '', '03/31/2017', 'ToddisGod')


// Foodsite SQL

INSERT INTO FOODSITE(ID, PROGRAM_NAME, SITE_COORDINATOR_FIRST_NAME, SITE_COORDINATOR_LAST_NAME, PHONE_NUMBER, E_MAIL, EXECUTIVE_DIRECTOR_FIRST, EXECUTIVE_DIRECTOR_LAST, COUNTY_OF_PROGRAM, SCHOOL_DISTRICT, MID_OHIO_PRIMARY_CONTACT_FIRST, MID_OHIO_PRIMARY_CONTACT_LAST, ADDRESS, ACTIVE, START_DATE, CALENDER_ID, NUMBER_OF_KIDS_SERVED, NUMBER_OF_VOLUNTEERS_ENLISTED, SITE_WITH_ALLERGIES, DROP_OFF_AREA_DESCRIPTION, DISTRIBUTION_AREA_DESCRIPTION) VALUES(1, 'Westerville North', 'Jill', 'Thompson', '614-888-8828', 'wecouldcodeot@gmail.com', 'Phil', 'Stevenson', 'Franklin County', 'Westerville School District','Reuben', 'Redman','123 Fake St.', true, '3/28/2017', 5, 12, 5, false, 'Drop of area is near the gymnasisum doors in the back of the building', 'We will pack the food in the office room next to the nurses office and hand them out there')
INSERT INTO FOODSITE(ID, PROGRAM_NAME, SITE_COORDINATOR_FIRST_NAME, SITE_COORDINATOR_LAST_NAME, PHONE_NUMBER, E_MAIL, EXECUTIVE_DIRECTOR_FIRST, EXECUTIVE_DIRECTOR_LAST, COUNTY_OF_PROGRAM, SCHOOL_DISTRICT, MID_OHIO_PRIMARY_CONTACT_FIRST, MID_OHIO_PRIMARY_CONTACT_LAST, ADDRESS, ACTIVE, START_DATE, CALENDER_ID, NUMBER_OF_KIDS_SERVED, NUMBER_OF_VOLUNTEERS_ENLISTED, SITE_WITH_ALLERGIES, DROP_OFF_AREA_DESCRIPTION, DISTRIBUTION_AREA_DESCRIPTION) VALUES(2, 'Westerville South', 'Bill', 'Stevens', '614-222-8828', 'microsoft@gmail.com', 'Lil', 'Clarkson', 'Delaware County' , 'Westerville School District', 'Chester', 'Smith', '321 Real St.', false, '1/2/2011', 2, 1, 2, true, 'Drop off is near the principals office in the front', 'Food will be packed and distributed at the front office')

//Student SQL

INSERT INTO STUDENT(student_number, first_name, last_name, age, grade, teacher_name, ppl_in_house, age_zero_to_five, age_six_to_eleven, age_twelve_to_seventeen, age_eighteen_to_fifty_nine, age_sixtyplus, allergies, frl, parent_permission, status, parent_first_name, parent_last_name, addl_notes) VALUES(1,'John', 'Smith', 7, 2, 'Mrs. Clark', 4, 1, 1, 0, 2, 0, 'peanut', 'yes', 'yes', 'enrolled', 'john', 'doe', 'addl notes')
INSERT INTO STUDENT(student_number, first_name, last_name, age, grade, teacher_name, ppl_in_house, age_zero_to_five, age_six_to_eleven, age_twelve_to_seventeen, age_eighteen_to_fifty_nine, age_sixtyplus, allergies, frl, parent_permission, status, parent_first_name, parent_last_name, addl_notes) VALUES(2,'Jane', 'Smith', 7, 2, 'Mrs. Clark', 4, 1, 1, 0, 2, 0, 'peanut', 'yes', 'yes', 'enrolled', 'john', 'doe', 'addl notes')
INSERT INTO STUDENT(student_number, first_name, last_name, age, grade, teacher_name, ppl_in_house, age_zero_to_five, age_six_to_eleven, age_twelve_to_seventeen, age_eighteen_to_fifty_nine, age_sixtyplus, allergies, frl, parent_permission, status, parent_first_name, parent_last_name, addl_notes) VALUES(3,'Jimmy', 'Smith', 7, 2, 'Mrs. Clark', 4, 1, 1, 0, 2, 0, 'peanut', 'yes', 'yes', 'enrolled', 'john', 'doe', 'addl notes')
INSERT INTO STUDENT(student_number, first_name, last_name, age, grade, teacher_name, ppl_in_house, age_zero_to_five, age_six_to_eleven, age_twelve_to_seventeen, age_eighteen_to_fifty_nine, age_sixtyplus, allergies, frl, parent_permission, status, parent_first_name, parent_last_name, addl_notes) VALUES(4,'Joey', 'Smith', 7, 2, 'Mrs. Clark', 4, 1, 1, 0, 2, 0, 'peanut', 'yes', 'yes', 'enrolled', 'john', 'doe', 'addl notes')

//Volunteer SQL
INSERT INTO VOLUNTEER (ID,FIRST_NAME,LAST_NAME,AGE,GENDER,STREET_ADDRESS,CITY,STATE,ZIP,PHONE_NUM,EMAIL,food_site_id) VALUES ('1','Tom', 'King', '21','Male','12 main st','columbus','OH','43213','614-537-0000','Tom@yahoo.com','1');
INSERT INTO VOLUNTEER (ID,FIRST_NAME,LAST_NAME,AGE,GENDER,STREET_ADDRESS,CITY,STATE,ZIP,PHONE_NUM,EMAIL,food_site_id) VALUES ('2','Mary', 'love', '61','Female','199 main st','columbus','OH','43213','614-337-0000','Tom@yahoo.com','2');
INSERT INTO VOLUNTEER (ID,FIRST_NAME,LAST_NAME,AGE,GENDER,STREET_ADDRESS,CITY,STATE,ZIP,PHONE_NUM,EMAIL,food_site_id) VALUES ('3','Tina', 'Nathan','45','Female','1450 South Hamilton Rd','columbus','OH','43227','614-200-4676','Nathan123@yahoo.com','2');
INSERT INTO VOLUNTEER (ID,FIRST_NAME,LAST_NAME,AGE,GENDER,STREET_ADDRESS,CITY,STATE,ZIP,PHONE_NUM,EMAIL,food_site_id) VALUES ('4','Jasmin', 'Robert', '45','Female','6655 East Broad st','columbus','OH','43213','614-222-2222','robertTom@yahoo.com','1');
INSERT INTO VOLUNTEER (ID,FIRST_NAME,LAST_NAME,AGE,GENDER,STREET_ADDRESS,CITY,STATE,ZIP,PHONE_NUM,EMAIL,food_site_id) VALUES ('5','Tom', 'King', '21','Male','12 main st','columbus','OH','43213','614-537-0000','Tom@yahoo.com','1');

//StudentReferral SQL 

INSERT INTO STUDENT_REFERRAL (age, first_name, last_name, grade, student_id, teacher_name, add_notes) VALUES ('5', 'Jim', 'Smith', '3', '12345', 'Mrs. Jones', 'add notes')
INSERT INTO STUDENT_REFERRAL (age, first_name, last_name, grade, student_id, teacher_name, add_notes) VALUES ('5', 'Fred', 'Smith', '3', '12345', 'Mrs. Jones', 'add notes')
INSERT INTO STUDENT_REFERRAL (age, first_name, last_name, grade, student_id, teacher_name, add_notes) VALUES ('5', 'Janis', 'Smith', '3', '12345', 'Mrs. Jones', 'add notes')
