use scai;
insert into pessoa (login, senha) values ('admin', 'senha');

drop table if exists Aluguel
drop table if exists Apartamento
drop table if exists Despesa
drop table if exists Endereco
drop table if exists Pessoa
create table Aluguel (idAluguel bigint not null auto_increment, comentário varchar(255), dataEntrada date, dataSaida date, desconto double precision, valorDiaria double precision, pessoa_idPessoa bigint, apartamento_idApartamento bigint, primary key (idAluguel))
create table Apartamento (idApartamento bigint not null auto_increment, statusApartamento varchar(255), endereco_idApartamento bigint, primary key (idApartamento))
create table Despesa (idDespesa bigint not null auto_increment, ano integer, comentario varchar(255), contaAgua double precision, contaCondominio double precision, contaGas double precision, contaLuz double precision, gastoExtra double precision, mes varchar(255), apartamento_idApartamento bigint, primary key (idDespesa))
create table Endereco (idApartamento bigint not null auto_increment, cidade varchar(255), complemento varchar(255), estado varchar(255), numero varchar(255), pais varchar(255), rua varchar(255), primary key (idApartamento))
create table Pessoa (idPessoa bigint not null auto_increment, cpf varchar(255), dataNascimento date, email varchar(255), login varchar(255), nome varchar(255), senha varchar(255), sexo varchar(255), endereco_idApartamento bigint, primary key (idPessoa))
alter table Aluguel add index FK2D61C29F4F295507 (apartamento_idApartamento), add constraint FK2D61C29F4F295507 foreign key (apartamento_idApartamento) references Apartamento (idApartamento)
alter table Aluguel add index FK2D61C29F9E98924C (pessoa_idPessoa), add constraint FK2D61C29F9E98924C foreign key (pessoa_idPessoa) references Pessoa (idPessoa)
alter table Apartamento add index FKC26F6FC468ADFB87 (endereco_idApartamento), add constraint FKC26F6FC468ADFB87 foreign key (endereco_idApartamento) references Endereco (idApartamento)
alter table Despesa add index FKC00A35F54F295507 (apartamento_idApartamento), add constraint FKC00A35F54F295507 foreign key (apartamento_idApartamento) references Apartamento (idApartamento)
alter table Pessoa add index FK8E48FBC768ADFB87 (endereco_idApartamento), add constraint FK8E48FBC768ADFB87 foreign key (endereco_idApartamento) references Endereco (idApartamento)