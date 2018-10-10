/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Amaya
 * Created: 08-30-2018
 */

create database Academia;

use Academia;



create table Alumnos
(
id_alumno int primary key auto_increment,
nombre varchar(255),
apellido varchar(255),
edad int,
fecha_nacimiento varchar(12),
ins_clase varchar(255),
horario varchar(255),
ciudad_municipio varchar(255),
cel_compania varchar(15),
numero_cel varchar(12),
tel_casa varchar(12),
info_ocupacion varchar(255),
tel_ocupacion varchar(12),
direccion varchar(1024),
email varchar(255)
);

insert into Alumnos 
(nombre, apellido, edad, fecha_nacimiento, ins_clase, 
horario, ciudad_municipio, cel_compania, numero_cel, tel_casa, 
info_ocupacion, tel_ocupacion,direccion,email) values
('ASAF', 'AMAYA', '15','12/12/2012','PIANO','8:00-9:00 AM','SANTA ANA', 'Claro','5555-5555',
'2526-3214', 'UNICAES', '2369-8745', 'ALLA POR LA ESQUINA','asaf@invento.com');

CREATE TABLE `academia`.`tipo_usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
  insert into academia.tipo_usuario (nombre) values ('Administrador');
  insert into academia.tipo_usuario (nombre) values ('Usuario');



create table academia.Articulos(
ID_Articulo int primary key auto_increment,
Articulo varchar(255),
Modelo varchar(255),
Marca varchar(255),
Precio real,
Descripcion varchar(1024)
);

insert into academia.Articulos (Articulo, Modelo,Marca,Precio, Descripcion)
values
('MICROFONO INALAMBRICO', 'BLX', 'SHURE',225.50, 'APTO PARA VOCES.'),
('MICROFONO INALAMBRICO', 'PGX-D', 'SHURE', 299.99,'APTO PARA SOPRANOS.'),
('MICROFONO INALAMBRICO DE OIDO', 'SLX', 'SHURE', 195.99,'APTO PARA CONDUCTOR DE EVENTO.'),
('MICROFONO PARA VIOLIN', 'BETA 98H/C', 'SHURE', 150.99,'MICROFONO EN MINIATURA');


