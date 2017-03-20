INSERT INTO People Values ('P1', 'Sheldon', 'Cooper', '2500 Sacremento, Apt 903, Santa Cruz, CA- 90021','Male','26', TO_DATE('1984-05-26','yyyy-mm-dd'),'y','n','9189198989','sheldon_cooper@gmail.com');

INSERT INTO People Values ('P2', 'Leonard', 'Hofstader', '2500 Sacremento, Apt 904, Santa Cruz, CA- 90021','Male','21', TO_DATE('1989-04-19','yyyy-mm-dd'),'y','y','9189198989','leonard_hofstader@gmail.com');

INSERT INTO People Values ('P3', 'Penny', 'Hofstader', '2500 Sacremento, Apt 905, Santa Cruz, CA- 90021','Female','20',TO_DATE('1990-12-25','yyyy-mm-dd'),'y','y','9189198989','penny_hofstader@gmail.com');

INSERT INTO People Values ('P4', 'Amy', 'Farrahfowler', '2500 Sacremento, Apt 905, Santa Cruz, CA- 90021','Female','26',TO_DATE('1984-06-15','yyyy-mm-dd'),'y','y','9189198989','sheldon_cooper@gmail.com');


Insert into Login Values ('P1', 'cooper');

Insert into Login Values ('P2', 'leonard');

Insert into Login Values ('P3', 'penny');

Insert into Login Values ('P4', 'amy');

Insert into Patient VALUES ('P1','Y' );

Insert into Patient VALUES ('P2','Y');

Insert into Patient VALUES ('P3', 'N' );

Insert into Patient VALUES ('P4', 'N' );

Insert into Sick_patient values ('P1', 'P2', 'P4', TO_DATE('2016-10-22','yyyy-mm-dd') );

Insert into Sick_patient values ('P2', 'P3', null, TO_DATE('2016-10-10','yyyy-mm-dd'));

Insert into Well_patient values ('P3', 'P4', null );

Insert into Well_patient values ('P4', null, null );

insert into Health_supporter values ('P4', TO_DATE('2016-10-21','yyyy-mm-dd'), 'P3');

insert into Health_supporter values ('P3', TO_DATE('2016-10-09','yyyy-mm-dd'), 'P2');

insert into Health_supporter values ('P2', TO_DATE('2016-10-21','yyyy-mm-dd'), 'P1');

insert into Health_supporter values ('P4', TO_DATE('2016-10-21','yyyy-mm-dd'), 'P1');


Insert into Disease values ('Heart', 'weight', '7', '200', '120');

Insert into Disease values ('Heart', 'BP_s', '1', '159', '140');

Insert into Disease values ('Heart', 'BP_d','1', '99', '90');

Insert into Disease values ('Heart', 'Oxygen', null, null , null);

Insert into Disease values ('Heart', 'Pain', null, null, null);

Insert into Disease values ('Heart', 'Mood', '7', '5', null);

Insert into Disease values ('Heart', 'Temperature', null, null, null);



Insert into Disease values ('HIV', 'weight', '7', '200', '120');

Insert into Disease values ('HIV', 'BP_s', '1', null, null);

Insert into Disease values ('HIV', 'BP_d','1', null, null);

Insert into Disease values ('HIV', 'Oxygen', null, null , null);

Insert into Disease values ('HIV', 'Pain', '1', '5', null);

Insert into Disease values ('HIV', 'Mood', null, null, null);

Insert into Disease values ('HIV', 'Temperature',null , null, null);


Insert into Disease values ('COPD', 'weight', null, null, null);

Insert into Disease values ('COPD', 'BP_s', null, null, null);

Insert into Disease values ('COPD', 'BP_d', null, null, null);

Insert into Disease values ('COPD', 'Oxygen', '1', '99' , '90');

Insert into Disease values ('COPD', 'Pain', null, null, null);

Insert into Disease values ('COPD', 'Mood', null, null, null);

Insert into Disease values ('COPD', 'Temperature', '1' , '100', '99');



Insert into Disease values ('Well', 'weight', '7', '200', '120');

Insert into Disease values ('Well', 'BP_s', null, null, null);

Insert into Disease values ('Well', 'BP_d', null, null, null);

Insert into Disease values ('Well', 'Oxygen', null, null, null);

Insert into Disease values ('Well', 'Pain', null, null, null);

Insert into Disease values ('Well', 'Mood', null, null, null);

Insert into Disease values ('Well', 'Temperature', null, null, null);


Insert into Diagnosis values ('Heart', 'P1');

Insert into Diagnosis values ('HIV', 'P2');


Insert into SpecificRec values ('P2', 'weight', '7', '190', '120');

Insert into SpecificRec values ('P2', 'BP_s', '1', null, null);

Insert into SpecificRec values ('P2', 'BP_d','1', '99', '90');

Insert into SpecificRec values ('P2', 'Oxygen', null, null , null);

Insert into SpecificRec values ('P2', 'Pain', '1', '5', null);

Insert into SpecificRec values ('P2', 'Mood', null, null, null);

Insert into SpecificRec values ('P2', 'Temperature',null , null, null);


Insert into Observation values ('P2', 'weight', TO_DATE('2016-10-11 15:00:00', 'YYYY-MM-DD HH24:MI:SS'), '180',  TO_DATE('2016-10-10 15:00:00', 'YYYY-MM-DD HH24:MI:SS'));

Insert into Observation values ('P2', 'weight', TO_DATE('2016-10-17 15:00:00', 'YYYY-MM-DD HH24:MI:SS'), '195',  TO_DATE('2016-10-17 15:00:00', 'YYYY-MM-DD HH24:MI:SS'));

