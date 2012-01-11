create table Pessoa(
id bigint primary key auto_increment unique not null,
usuario varchar(20) unique,
senha varchar(20)
);

create table Apartamento(
id bigint primary key auto_increment unique not null,
rua varchar(50) not null,
numero varchar(10),
complemento varchar(10),
valorDiaria float(10.2)
);
