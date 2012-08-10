-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.50-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema lilipipas
--

CREATE DATABASE IF NOT EXISTS lilipipas;
USE lilipipas;

--
-- Definition of table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE `categorias` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categorias`
--

/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;


--
-- Definition of table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `numero` varchar(5) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `telefone` varchar(19) NOT NULL,
  `celular` varchar(9) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `datacadastro` varchar(50) NOT NULL,
  `datanascimento` varchar(50) NOT NULL,
  `cep` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`codigo`,`nome`,`rg`,`cpf`,`endereco`,`numero`,`bairro`,`cidade`,`estado`,`telefone`,`celular`,`sexo`,`email`,`datacadastro`,`datanascimento`,`cep`) VALUES 
 (1,'Denis Soares Moreira','47929798','3213123','Rua 3 n 148 jd inocoop','148','inocoop','Rio Claro','MG','(019) 3522-4422','976855655','Feminino','denis@.com','15/15/1202','21/11/1984','13502012'),
 (2,'Denis Soares Moreira','5464645645','3213123','Rua 3 n 148 jd inocoop','148','inocoop','Rio Claro','MG','(019) 3522-4422','976855655','Masculino','denis@.com','15/15/1202','21/11/1984','13502012'),
 (3,'Denis Soares Moreira','47929798','3213123','Rua 3 n 148 jd inocoop','148','inocoop','Rio Claro','MG','(019) 3522-4422','976855655','Feminino','denis@.com','15/15/1202','21/11/1984','13502012'),
 (4,'Joao almeida','47929798','3213123','Rua 3 n 148 jd inocoop','148','inocoop','Rio Claro','MG','(019) 3522-4422','976855655','Feminino','denis@.com','15/15/1202','21/11/1984','13502012'),
 (5,'Denis Soares Moreira','47929798','3213123','Rua 3 n 148 jd inocoop','148','inocoop','Rio Claro','MG','(019) 3522-4422','976855655','Feminino','denis@.com','15/15/1202','21/11/1984','13502012'),
 (6,'Denis Soares Moreira','47929798','3213123','Rua 3 n 148 jd inocoop','148','inocoop','Rio Claro','MG','(019) 3522-4422','976855655','Feminino','denis@.com','15/15/1202','21/11/1984','13502012');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


--
-- Definition of table `configuracoes`
--

DROP TABLE IF EXISTS `configuracoes`;
CREATE TABLE `configuracoes` (
  `ImagemFundo` text NOT NULL,
  `Look` varchar(45) NOT NULL,
  `UltimoCaminho` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `configuracoes`
--

/*!40000 ALTER TABLE `configuracoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `configuracoes` ENABLE KEYS */;


--
-- Definition of table `detalhesvenda`
--

DROP TABLE IF EXISTS `detalhesvenda`;
CREATE TABLE `detalhesvenda` (
  `codigovenda` int(10) unsigned NOT NULL,
  `produto` int(10) unsigned NOT NULL,
  `quantidade` int(10) unsigned NOT NULL,
  `valor` double NOT NULL,
  `valortotal` double NOT NULL,
  KEY `venda2` (`codigovenda`),
  CONSTRAINT `venda1` FOREIGN KEY (`codigovenda`) REFERENCES `pagamentosprazo` (`codigovenda`),
  CONSTRAINT `venda2` FOREIGN KEY (`codigovenda`) REFERENCES `pagamentosvista` (`codigovenda`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detalhesvenda`
--

/*!40000 ALTER TABLE `detalhesvenda` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalhesvenda` ENABLE KEYS */;


--
-- Definition of table `pagamentosprazo`
--

DROP TABLE IF EXISTS `pagamentosprazo`;
CREATE TABLE `pagamentosprazo` (
  `codigovenda` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cliente` int(10) unsigned NOT NULL,
  `parcelas` int(10) unsigned NOT NULL,
  `tipopagamento` varchar(45) NOT NULL,
  `data` datetime NOT NULL,
  `vendedor` varchar(10) NOT NULL,
  PRIMARY KEY (`codigovenda`) USING BTREE,
  KEY `cliente` (`cliente`),
  CONSTRAINT `cliente` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pagamentosprazo`
--

/*!40000 ALTER TABLE `pagamentosprazo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagamentosprazo` ENABLE KEYS */;


--
-- Definition of table `pagamentosvista`
--

DROP TABLE IF EXISTS `pagamentosvista`;
CREATE TABLE `pagamentosvista` (
  `codigovenda` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `totalvendas` double NOT NULL,
  `datacompra` datetime NOT NULL,
  `tipopagamento` varchar(45) NOT NULL,
  `vendedor` varchar(10) NOT NULL,
  PRIMARY KEY (`codigovenda`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pagamentosvista`
--

/*!40000 ALTER TABLE `pagamentosvista` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagamentosvista` ENABLE KEYS */;


--
-- Definition of table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
CREATE TABLE `produtos` (
  `codigo` int(10) unsigned NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `precofornecedor` double NOT NULL,
  `precovenda` double NOT NULL,
  `porcentagem` double NOT NULL,
  `estoque` int(10) unsigned NOT NULL,
  `estoqueminimo` int(10) unsigned NOT NULL,
  `categoria` varchar(40) NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produtos`
--

/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` (`codigo`,`descricao`,`precofornecedor`,`precovenda`,`porcentagem`,`estoque`,`estoqueminimo`,`categoria`,`nome`) VALUES 
 (453434,'atesadadas',25.5,27.03,6,12,1,'Cosmetico','gdagsfgsdfsd'),
 (546456,'atesadadas',25.5,213.72,4,10,50,'Cosmetico','asjjalsdsadasd'),
 (565656,'atesadadas',25.5,27.03,6,51,50,'Cosmetico','nome'),
 (5615412,'atesadadas',25.5,1900,90,10,5,'Cosmetico','bbbbbbbbbbb');
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;


--
-- Definition of table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(10) NOT NULL,
  `senha` varchar(8) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`codigo`,`nome`,`senha`) VALUES 
 (1,'admin','admin'),
 (2,'denis','123'),
 (3,'denis','123'),
 (4,'denis',''),
 (5,'','');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
