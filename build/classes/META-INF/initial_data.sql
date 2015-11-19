----------------------Env-----------------------------------------

      insert into env (env_id,env_name) values (1,'Prod'),(2,'QA'),(3,'Dev');
---------------------Project-----------------------------

      insert into project (project_id,project_name) values (1,'Store'), (2,'NHLBI'),(3,'NINDS'),(4,'NIMH'),(5,'Pinnacle');
---------------------Host------------------------------------
	insert into host (host_id,host_name,port, env_id) values    (1,'http://store.samhsa.gov/','',1);
	insert into host (host_id,host_name,port, env_id) values    (2,'http://catalog.nhlbi.nih.gov/','',1);
	insert into host (host_id,host_name,port, env_id) values    (3,'https://catalog.ninds.nih.gov/','',1);
	insert into host (host_id,host_name,port, env_id) values    (4,'https://infocenter.nimh.nih.gov/','',1);
	insert into host (host_id,host_name,port, env_id) values    (5,'https://pinnacle.iqsolutions.com/','',1);
    insert into host (host_id,host_name,port, env_id) values    (6,'http://teststore.iqsolutions.com/','80',2);
    insert into host (host_id,host_name,port, env_id) values    (7,'http://testnhlbi.iqsolutions.com/','80',2);
    insert into host (host_id,host_name,port, env_id) values    (8,'http://testninds.iqsolutions.com/','80',2);
    insert into host (host_id,host_name,port, env_id) values    (9,'http://testnimh.iqsolutions.com/','80',2);
    insert into host (host_id,host_name,port, env_id) values    (10,'http://testpinnacle.iqsolutions.com/','80',2);
---------------------Url-----------------------------------------

    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (1,'',1,'2015-11-6',1);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (2,'',2,'2015-11-6',2);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (3,'ninds/home',3,'2015-11-6',3);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (4,'',4,'2015-11-6',4);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (5,'',5,'2015-11-6',5);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (6,'home',1,'2015-11-2',6);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (7,'catalog/home',2,'2015-11-2',7);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (8,'ninds/home',3,'2015-11-2',8);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (9,'',4,'2015-11-2',9);
    insert into url (uri_id,uri_name,project_id, create_date,host_id) values (10,'Pinnacle/login.jsp',5,'2015-11-2',10);
 	
