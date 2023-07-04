desc owner;
insert into owner(name,fone) values ('Scarpa', '(22)9988222');
insert into owner(name,fone) values ('Arboleda', '(14)8983222');
insert into owner(name,fone) values ('Roger Guedes', '(12)8633882');
insert into owner(name,fone) values ('Giorgio Arracaeta', '(21)9876222');
select * from owner;
select count(*) from owner;
desc ground;
insert into ground (
	square_meters,block,batch,sale_value,situation,id_owner,data_register) 
    values(360.0,12,01,133000.00,'FOR_SALE',1,'2022-12-12');
insert into ground (
	square_meters,block,batch,sale_value,situation,id_owner,data_register) 
    values(122.0,100,322,8000.00,'FOR_SALE',2,'2023-01-10');
insert into ground (
	square_meters,block,batch,sale_value,situation,id_owner,data_register) 
    values(244.0,11,122,10000.00,'IN_NEGOCIATION',3,'2023-04-01');
 insert into ground (
	square_meters,block,batch,sale_value,situation,id_owner,data_register) 
    values(134.0,11,122,90000.00,'SOLD',4,'2023-02-01');   
select * from ground;
select count(*) from ground;
desc immobile;
insert into immobile (build_area,is_condominio,block,batch,sale_value,situation,id_owner,data_register)
	value(144.0,false,122,9,450000,'SOLD',1,'2023-01-01');
insert into immobile (build_area,is_condominio,block,batch,sale_value,situation,id_owner,data_register)
	value(100.0,true,112,9,125000,'SOLD',2,'2023-01-01');
select * from immobile;
select count(*) from immobile;