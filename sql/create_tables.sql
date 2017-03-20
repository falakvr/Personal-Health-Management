Create Table People (user_id varchar2(4) not null, Firstname varchar2(30),Lastname varchar2(30), address varchar2(100), gender varchar2(6), age number(3), DoB date, is_patient CHAR(1), is_hs CHAR(1), phone number(10), email varchar2(50),Constraint people_pk Primary Key (user_id) );
                    
Create Table Patient (user_id varchar2(4) not null, is_sick CHAR(1) not null,CONSTRAINT pat_pk PRIMARY KEY (user_id),CONSTRAINT patient_fk FOREIGN KEY (user_id) REFERENCES People (user_id));
            
Create Table Well_patient (user_id varchar2(4), hs_id1 varchar2(4), hs_id2 varchar2(4),CONSTRAINT wpat_pk PRIMARY KEY (user_id),CONSTRAINT well_patient_fk Foreign Key (user_id) REFERENCES People (user_id));
                        
            
Create Table Sick_patient (user_id varchar2(4), hs_id1 varchar2(4) not null, hs_id2 varchar2(4), sick_date date, CONSTRAINT spat_pk PRIMARY KEY (user_id),CONSTRAINT sick_patient_fk Foreign Key (user_id) REFERENCES People (user_id));
                        
Create Table Health_Supporter (user_id varchar2(4), auth_date date, patient_id varchar2(4),CONSTRAINT hsp_pk PRIMARY KEY (user_id,patient_id),CONSTRAINT hs_fk Foreign Key (user_id) REFERENCES People (user_id),CONSTRAINT hsp_fk Foreign Key (patient_id) REFERENCES Patient (user_id)); 
            
            
            
Create Table Disease (dname varchar2(30) not null, obs_type varchar2(30) not null,frequency number(3), upper_limit number(10), lower_limit number(10));

Create Table Mood(id number(2), name varchar2(10));

Create Table Diagnosis (dname varchar2(30) not null, patient_id varchar2(4) not null,CONSTRAINT diag_pk PRIMARY KEY (dname,patient_id), CONSTRAINT disp_fk Foreign Key (patient_id) REFERENCES Patient (user_id));
                
Create Table SpecificRec (patient_id varchar2(4) not null, obs_type varchar2(30) not null, frequency number(3), obs_high varchar2(10), obs_low varchar2(10), CONSTRAINT sperec_pk PRIMARY KEY (patient_id,obs_type), CONSTRAINT sperecp_fk Foreign Key(patient_id) REFERENCES Patient(user_id)  );
                        
            
Create Table Login(user_id varchar2(4) not null, password varchar2(20) not null);
            
Create Table Alerts(patient_id varchar2(4), alert_id number(10), alert_type varchar2(50), obs_type varchar2(30), timestamp_alert date, action_taken CHAR(1), viewed CHAR(1), CONSTRAINT alert_pk PRIMARY KEY(patient_id,alert_id, obs_type), CONSTRAINT alert_fk FOReiGN KEY(patient_id) REFERENCES Patient(user_id));
            
Create Table Observation(patient_id varchar2(4),obs_type varchar2(30),timestamp1 TIMESTAMP, obs_value varchar2(10),obs_time TIMESTAMP, CONSTRAINT obs_pk PRIMARY KEY(patient_id,obs_type,timestamp1), CONSTRAINT obs_fk FOReiGN KEY(patient_id) REFERENCES Patient(user_id));