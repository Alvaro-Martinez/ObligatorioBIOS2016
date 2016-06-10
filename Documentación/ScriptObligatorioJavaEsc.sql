Drop Database if exists ObligatorioJavaEsc;

Create Database ObligatorioJavaEsc;

use ObligatorioJavaEsc;

Create Table Cliente(
Cedula varchar(8) not null Primary Key,
Nombre varchar(50) not null,
Direccion varchar(100) not null
);


Create Table Vehiculo(
Matricula varchar(7) not null Primary Key,
Modelo varchar(50),
Marca varchar(20),
Peso int not null,
Cedula varchar(8) not null,
Foreign Key (Cedula) references Cliente(Cedula)
);

Create Table Operario(
IDOperario int not null Primary Key,
FechaIngreso datetime,
Nombre varchar(50)
);

Create Table Grua(
NumeroGrua int not null Primary Key,
PesoMax int
);

Create Table SolicitudServicio(
NroSerieSolicitud varchar(8) not null Primary Key AUTO_INCREMENT,
Direccion varchar(100),
FechaHora datetime,
Cancelada boolean default false,
Matricula varchar(7) not null,
IDOperario int,
NumeroGrua int,
Foreign Key (Matricula) references Vehiculo(Matricula),
Foreign Key (IDOperario) references Operario(IDOperario),
Foreign Key (NumeroGrua) references Grua(NumeroGrua)
);

Create Table Servicio(
NroSerieServicio varchar(8) not null Primary Key AUTO_INCREMENT,
Importe int,
NroSerieSolicitud varchar(8) not null,
Foreign Key (NroSerieSolicitud) references SolicitudServicio(NroSerieSolicitud)
);

Create Table AuxilioMecanico(
NroSerieServicio int not null Primary Key AUTO_INCREMENT,
CostoRep int,
Reparacion varchar(200),
Problema varchar(200),
Foreign Key (NroSerieServicio) references Servicio(NroSerieServicio)
);

Create Table Remolque(
NroSerieServicio int not null Primary Key,
KM int,
Foreign Key (NroSerieServicio) references Servicio(NroSerieServicio)
);


Create Table Recibo(
NroSerieRecibo varchar(8) not null Primary Key AUTO_INCREMENT,
Importe int,
Fecha datetime,
NroSerieServicio varchar(8) not null,
Cedula varchar(8) not null,
Foreign Key (NroSerieServicio) references Servicio(NroSerieServicio)
);

Create Table Factura(
Cedula varchar(8) not null,
NroSerieRecibo varchar(8) not null,
Primary Key(Cedula, NroSerieRecibo)
);

/*CLIENTES*/
INSERT INTO Cliente VALUES ('1234567', 'Juan Perez', '8 de Octubre 3030');
INSERT INTO Cliente VALUES ('7654321', 'Rosa Florencia', 'Casablanca 3456');
INSERT INTO Cliente VALUES ('7651234', 'Martin Martinez', 'Av Siempreviva 1234');
INSERT INTO Cliente VALUES ('1234765', 'Isaac Vazquez', '18 de Julio 1015');


/* VEHICULOS JUAN PEREZ*/
INSERT INTO Vehiculo VALUES ('abc1234','Fiesta','Ford','300','1234567'); 
INSERT INTO Vehiculo VALUES ('zbc4567','Mustang','Ford','500','1234567'); 
INSERT INTO Vehiculo VALUES ('dfg6789','Giulietta','Alfa Romeo','450','1234567'); 
INSERT INTO Vehiculo VALUES ('cvg6579','Civic','Honda','300','1234567'); 
/*VEHICULOS ROSA FLORENCIA*/
INSERT INTO Vehiculo VALUES ('vbc6547','Jazz','Honda','567','7654321'); 
INSERT INTO Vehiculo VALUES ('xcw3454','Freemont','Fiat','600','7654321'); 
INSERT INTO Vehiculo VALUES ('asd6789','Tipo','Fiat','560','7654321'); 
/*VEHICULOS MARTIN MARTINEZ*/
INSERT INTO Vehiculo VALUES ('lkj1238','Panda','Citroen','378','7651234'); 
INSERT INTO Vehiculo VALUES ('vbg9375','Nemo','Hyundai','567','7651234'); 
/*VEHICULOS ISAAC VAZQUEZ*/
INSERT INTO Vehiculo VALUES ('avg8884','Berlingo','Citroen','300','1234765'); 


/*OPERARIOS*/
INSERT INTO Operario VALUES(1,'30/03/2000','Michael Jackson'); 
INSERT INTO Operario VALUES(2,'27/02/2009','Jason Derulo'); 
INSERT INTO Operario VALUES(3,'05/06/2010','Rihanna Martinez'); 
INSERT INTO Operario VALUES(4,'29/12/2015','Ash Ketchum'); 
INSERT INTO Operario VALUES(5,'30/04/2016','Silvana Sosa'); 
INSERT INTO Operario VALUES(6,'15/11/2000','Ismael Garcia'); 

/*GRUAS*/
INSERT INTO Grua VALUES(1,600); 
INSERT INTO Grua VALUES(2,540); 
INSERT INTO Grua VALUES(3,1000); 
INSERT INTO Grua VALUES(4,346); 

/*SOLICITUDES DE SERVICIO*/
INSERT INTO SolicitudServicio VALUES('12345678','Mateo Cortes 1020', '10/05/2016', false, 'abc1234'); 
INSERT INTO SolicitudServicio VALUES('56785678','Cochabamba 6767', '03/06/2013', true, 'dfg6789'); 
INSERT INTO SolicitudServicio VALUES('12333333','Bustamante 5678', '10/05/2016', false, 'xcw3454'); 
INSERT INTO SolicitudServicio VALUES('45678965','Joanico 1320', '25/04/2011', true, 'vbg9375'); 

/*SERVICIOS*/
INSERT INTO Servicio VALUES('34562734', 678, '12345678');
INSERT INTO Servicio VALUES('78967587', 1050, '56785678'); 
INSERT INTO Servicio VALUES('45673872', 4560, '12333333');
INSERT INTO Servicio VALUES('46572987', 234, '45678965');

/*AUXILIOS MECANICOS*/
INSERT INTO AuxilioMecanico VALUES('34562734', 678, 'Se agrega pieza al motor', 'Motor roto');
INSERT INTO AuxilioMecanico VALUES('78967587', 1050, 'Se limpian las ruedas', 'No arrancaba el auto por barro acumulado en ruedas'); 

/*REMOLQUES*/
INSERT INTO Servicio VALUES('45673872', 10);
INSERT INTO Servicio VALUES('46572987', 200);

/*RECIBOS*/
INSERT INTO Recibo VALUES('18965435', 678, '10/05/2016', '34562734');
INSERT INTO Recibo VALUES('67589456', 1050, '03/06/2013', '78967587');
INSERT INTO Recibo VALUES('34562134', 4560, '10/05/2016', '45673872');
INSERT INTO Recibo VALUES('99999999', 234, '25/04/2011', '46572987');

INSERT INTO Factura VALUES('1234567','18965435');
INSERT INTO Factura VALUES('1234567','67589456');
INSERT INTO Factura VALUES('7654321','34562134');
INSERT INTO Factura VALUES('7651234','99999999');



