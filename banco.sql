create database projetoASMAR;

use projetoASMAR;

create table Usuario(
    id int auto_increment primary key,
    nome varchar(30),
    email varchar(30),
    cargo varchar(30)
);

create table Produtos(
    id int auto_increment primary key,
    drescricao varchar(30),
    precoDeCusto int,
    estoque int,
    validade varchar(30)
);

create table EntradaSaidaProdutos(
    id int auto_increment primary key,
    idProduto int,
    usuarioResponsavel int,
    motivoEntradaOuSaida varchar(20)
    quantidade int,
    dataEHora varchar(30),
    foreign key (idProduto) Produtos(id),
    foreign key (usuarioResponsavel) Usuario(id)
);