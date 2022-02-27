create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 clave varchar(45) not null,
 fecha_creacion datetime null,
 primary key (id)
);

-- DATA TEST
--insert into usuario(id, nombre,clave,fecha_creacion) values(1,'test','1234',now());
--insert into usuario(id, nombre,clave,fecha_creacion) values(2,'test','1234',now());
--insert into usuario(id, nombre,clave,fecha_creacion) values(3,'test','1234',now());
--insert into usuario(id, nombre,clave,fecha_creacion) values(4,'test','1234',now());