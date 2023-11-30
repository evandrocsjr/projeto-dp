create database projetoASMAR;

use projetoASMAR;

create table Usuario(
	id bigint auto_increment primary key,
	nome varchar(50),
	email varchar(50),
	cargo varchar(30)
);

create table Produtos(
	id bigint auto_increment primary key,
	descricao varchar(30),
	precoDeCusto double,
	estoque int,
	validade date
);

create table EntradaSaidaProdutos(
	id bigint auto_increment primary key,
	idProduto bigint,
	idUsuario bigint,
	motivo varchar(20),
	quantidade int,
	dataEHora date,
	foreign key (idProduto) references Produtos(id),
	foreign key (idUsuario) references Usuario(id)
);