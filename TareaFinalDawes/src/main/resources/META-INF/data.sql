insert into proveedores (apellidos, dni, fecha, nombre) values ('Perez', '11111111A', '2020/1/1', 'Pepe');
insert into proveedores (apellidos, dni, fecha, nombre) values ('Mendez', '22222222A', '2020/2/1', 'Ana');
insert into proveedores (apellidos, dni, fecha, nombre) values ('Suarez', '33333333A', '2020/3/1', 'Jose');

insert into roles (ROLE_NAME) values ('ROLE_ADMIN'); 
insert into roles (ROLE_NAME) values ('ROLE_USER');
insert into roles (ROLE_NAME) values ('ROLE_PUBLIC');

insert into usuarios(username,password) values ('dbuser1', '$2a$10$9DIGx1gtTlRQAcb8Zod6YOs.IBVIyHtgjpy0Pi95El8FTp2YPc3fi');
insert into usuarios(username,password) values ('dbadmin1', '$2a$10$9DIGx1gtTlRQAcb8Zod6YOs.IBVIyHtgjpy0Pi95El8FTp2YPc3fi');

insert into usuariorol (USER_ID, ROLE_ID) values (1, 2); 
insert into usuariorol (USER_ID, ROLE_ID) values (2, 1);