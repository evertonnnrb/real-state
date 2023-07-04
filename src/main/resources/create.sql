drop database realstate;
create database if not exists realstate;
use realstate;
create table owner(
	id int primary key auto_increment,
    name varchar(128),
    fone varchar(28)
);
create table ground(
	id int primary key auto_increment,
    square_meters decimal not null,
	block int not null,
    batch varchar(128) not null,
    sale_value decimal(10,2) not null,
    situation enum('FOR_SALE','IN_NEGOCIATION','SOLD') not null,
    id_owner int,
    data_register date
);
create table immobile(
	id int primary key auto_increment,
    build_area decimal(8,2),
    is_condominio bool,
    block int not null,
    batch varchar(128) not null,
    sale_value decimal(10,2) not null,
    situation enum('FOR_SALE','IN_NEGOCIATION','SOLD') not null,
    id_owner int,
    data_register date
);
alter table ground add constraint fk_owner_ground foreign key (id_owner)
		references owner(id);

 alter table immobile add constraint fk_owner_immobile foreign key (id_owner)
	references owner(id);


