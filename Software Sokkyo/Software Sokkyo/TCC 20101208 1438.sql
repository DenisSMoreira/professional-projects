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
-- Create schema softwaresokkyo
--

CREATE DATABASE IF NOT EXISTS softwaresokkyo;
USE softwaresokkyo;

--
-- Definition of table `cadastro_cliente`
--

DROP TABLE IF EXISTS `cadastro_cliente`;
CREATE TABLE `cadastro_cliente` (
  `codigo_cliente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cadastro_nome` varchar(55) NOT NULL,
  `cadastro_endereco` varchar(75) NOT NULL,
  `cadastro_cep` varchar(75) NOT NULL,
  `cadastro_n` varchar(75) NOT NULL,
  `cadastro_tel` varchar(75) NOT NULL,
  `cadastro_estado` varchar(5) NOT NULL,
  `cadastro_rg` varchar(75) NOT NULL,
  `cadastro_cpf` varchar(75) NOT NULL,
  `cadastro_data` varchar(22) NOT NULL,
  `cadastro_dataReg` varchar(97) NOT NULL,
  `cadastro_bairro` varchar(45) NOT NULL,
  `cadastro_cidade` varchar(45) NOT NULL,
  `cadastro_celu` varchar(45) NOT NULL,
  `estado_civil` varchar(45) NOT NULL,
  `residencia` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `site` varchar(45) NOT NULL,
  `foto` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cadastro_cliente`
--

/*!40000 ALTER TABLE `cadastro_cliente` DISABLE KEYS */;
INSERT INTO `cadastro_cliente` (`codigo_cliente`,`cadastro_nome`,`cadastro_endereco`,`cadastro_cep`,`cadastro_n`,`cadastro_tel`,`cadastro_estado`,`cadastro_rg`,`cadastro_cpf`,`cadastro_data`,`cadastro_dataReg`,`cadastro_bairro`,`cadastro_cidade`,`cadastro_celu`,`estado_civil`,`residencia`,`email`,`site`,`foto`,`sexo`) VALUES 
 (1,'Denis Soares Moreira','Rua 3 n 148 jd.inocoop','13.502-022','148','(019) 3523-6656','SP','47.921.979-5','589.789.414-53','15/12/1991','21/12/10','inocoop','Rio Claro','9897-9564','Solteiro(a)','Propria','denis_50cent.rpi@hotmail.com','www.nokys.com.br','G:/imganes software/bart-simpson.jpg','Masculino'),
 (2,'fdsfs','Rua 3 n 148 jd.inocoop','13.502-022','148','(019) 3523-6656','SP','47.921.979-5','589.789.414-53','15/12/1991','21/12/10','inocoop','Rio Claro','9897-9564','Solteiro(a)','Propria','denis_50cent.rpi@hotmail.com','www.nokys.com.br','G:/imganes software/bart-simpson.jpg','Masculino');
/*!40000 ALTER TABLE `cadastro_cliente` ENABLE KEYS */;


--
-- Definition of table `cadastro_fornecedor`
--

DROP TABLE IF EXISTS `cadastro_fornecedor`;
CREATE TABLE `cadastro_fornecedor` (
  `cadastroFor_codig` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cadastroFor_nome` varchar(54) NOT NULL,
  `cadastroFor_end` varchar(54) NOT NULL,
  `cadastroFor_numero` varchar(54) NOT NULL,
  `cadastroFor_est` varchar(54) NOT NULL,
  `cadastroFor_tel` varchar(54) NOT NULL,
  `cadastroFor_cep` varchar(54) NOT NULL,
  `cadastro_bairro` varchar(45) NOT NULL,
  `cadastro_cnpj` varchar(45) NOT NULL,
  `cadastro_inscricao` varchar(45) NOT NULL,
  `cadastro_email` varchar(45) NOT NULL,
  `cadastro_web` varchar(55) NOT NULL,
  PRIMARY KEY (`cadastroFor_codig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cadastro_fornecedor`
--

/*!40000 ALTER TABLE `cadastro_fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastro_fornecedor` ENABLE KEYS */;


--
-- Definition of table `cadastro_funcionario`
--

DROP TABLE IF EXISTS `cadastro_funcionario`;
CREATE TABLE `cadastro_funcionario` (
  `cadastroFunc_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cadastroFunc_nome` varchar(54) NOT NULL,
  `cadastroFunc_end` varchar(64) NOT NULL,
  `cadastroFunc_tel` varchar(54) NOT NULL,
  `cadastroFunc_cep` varchar(40) NOT NULL,
  `cadastroFunc_rg` varchar(54) NOT NULL,
  `cadastroFunc_nCar` varchar(54) NOT NULL,
  `cadastroFunc_cpf` varchar(54) NOT NULL,
  `cadastroFunc_func` varchar(45) NOT NULL,
  `cadastroFunc_sal` varchar(54) NOT NULL,
  `cadastroFunc_data` varchar(45) NOT NULL,
  `cadastroFunc_ddd` varchar(5) NOT NULL,
  `cadastroFunc_Ent` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `numero` varchar(45) NOT NULL,
  `residencia` varchar(45) NOT NULL,
  `estado_civil` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `foto` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  PRIMARY KEY (`cadastroFunc_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cadastro_funcionario`
--

/*!40000 ALTER TABLE `cadastro_funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastro_funcionario` ENABLE KEYS */;


--
-- Definition of table `cadastro_orcamento`
--

DROP TABLE IF EXISTS `cadastro_orcamento`;
CREATE TABLE `cadastro_orcamento` (
  `codigoOrcamento` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(45) NOT NULL,
  `cod_cliente` varchar(45) NOT NULL,
  `peca` varchar(45) NOT NULL,
  `cod_peca` varchar(45) NOT NULL,
  `qtd` varchar(45) NOT NULL,
  `valor` varchar(45) NOT NULL,
  `vendedor` varchar(45) NOT NULL,
  `valor_peca` varchar(45) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `data` varchar(45) NOT NULL,
  `valorOrcamento` varchar(45) NOT NULL,
  `previsao` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `valor_or` varchar(45) NOT NULL,
  `valor_peca_unidade` varchar(45) NOT NULL,
  `placa` varchar(45) NOT NULL,
  `total` varchar(45) NOT NULL,
  PRIMARY KEY (`codigoOrcamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cadastro_orcamento`
--

/*!40000 ALTER TABLE `cadastro_orcamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastro_orcamento` ENABLE KEYS */;


--
-- Definition of table `cadastro_peca`
--

DROP TABLE IF EXISTS `cadastro_peca`;
CREATE TABLE `cadastro_peca` (
  `cadastroProd` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cadastroProdnome` varchar(55) NOT NULL,
  `cadastroProd_qtd` varchar(55) NOT NULL,
  `cadastroProd_preco` varchar(85) NOT NULL,
  `cadastroProd_local` varchar(55) NOT NULL,
  `cadastroProd_fornecedor` varchar(55) NOT NULL,
  `cadastroProd_descri` varchar(250) NOT NULL,
  `cadastro_cf` varchar(55) NOT NULL,
  `porcentagemVenda` varchar(50) NOT NULL,
  `valorVenda` varchar(55) NOT NULL,
  `estoqueMinimo` varchar(50) NOT NULL,
  PRIMARY KEY (`cadastroProd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cadastro_peca`
--

/*!40000 ALTER TABLE `cadastro_peca` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastro_peca` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Senha` varchar(65) NOT NULL,
  `login` varchar(65) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `tipo` varchar(55) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`codigo`,`Senha`,`login`,`nome`,`cpf`,`tipo`,`email`) VALUES 
 (1,'admin','admin','Administrador','589.796.578-93','admin','admin@admin.com.br'),
 (2,'vendedor','vendedor','Vendedor','589.854.869-69','vendedor','vendedor@vendedor.com.br'),
 (4,'mecanico','mecanico','mecanico','454.645.454-54','mecanico','mecanico@hotmail.com.br');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `veiculos`
--

DROP TABLE IF EXISTS `veiculos`;
CREATE TABLE `veiculos` (
  `idveiculos` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `cliente` varchar(45) NOT NULL,
  `anoFab` varchar(45) NOT NULL,
  `anoMod` varchar(45) NOT NULL,
  `placa` varchar(45) NOT NULL,
  `km` varchar(45) NOT NULL,
  `vistoria` varchar(45) NOT NULL,
  `foto` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `portas` varchar(45) NOT NULL,
  `combustivel` varchar(45) NOT NULL,
  `chassi` varchar(45) NOT NULL,
  PRIMARY KEY (`idveiculos`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `veiculos`
--

/*!40000 ALTER TABLE `veiculos` DISABLE KEYS */;
INSERT INTO `veiculos` (`idveiculos`,`marca`,`modelo`,`cliente`,`anoFab`,`anoMod`,`placa`,`km`,`vistoria`,`foto`,`estado`,`portas`,`combustivel`,`chassi`) VALUES 
 (1,'Honda','Civic','fdsfs','2010','2010','DER4444','125.000km','10/10/10','G:/imganes software/10287joaninha.jpg','Semi - Novo','4','Gasolina','ASDA55185DASDA');
/*!40000 ALTER TABLE `veiculos` ENABLE KEYS */;


--
-- Definition of table `venda_prodserv`
--

DROP TABLE IF EXISTS `venda_prodserv`;
CREATE TABLE `venda_prodserv` (
  `codigo_VendaServProd` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(45) NOT NULL,
  `cod_cliente` varchar(45) NOT NULL,
  `peca` varchar(45) NOT NULL,
  `cod_peca` varchar(45) NOT NULL,
  `qtd` varchar(45) NOT NULL,
  `vendedor` varchar(45) NOT NULL,
  `valor_peca` varchar(45) NOT NULL,
  `data` varchar(45) NOT NULL,
  `previsao` varchar(45) NOT NULL,
  `placa` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `valor_or` varchar(45) NOT NULL,
  `total` varchar(45) NOT NULL,
  `valor_peca_unidade` varchar(45) NOT NULL,
  `descricao` varchar(245) NOT NULL,
  PRIMARY KEY (`codigo_VendaServProd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `venda_prodserv`
--

/*!40000 ALTER TABLE `venda_prodserv` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda_prodserv` ENABLE KEYS */;


--
-- Definition of table `venda_produto`
--

DROP TABLE IF EXISTS `venda_produto`;
CREATE TABLE `venda_produto` (
  `venda_codVenda` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `venda_nome` varchar(45) DEFAULT NULL,
  `venda_codpe` varchar(45) NOT NULL,
  `venda_codcli` varchar(45) DEFAULT NULL,
  `venda_qtd` varchar(45) NOT NULL,
  `venda_valor` varchar(45) NOT NULL,
  `venda_toal` varchar(45) NOT NULL,
  `venda_nomePeca` varchar(45) NOT NULL,
  `dataVenda` varchar(45) NOT NULL,
  `vendedor` varchar(45) NOT NULL,
  PRIMARY KEY (`venda_codVenda`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `venda_produto`
--

/*!40000 ALTER TABLE `venda_produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda_produto` ENABLE KEYS */;


--
-- Definition of table `venda_servico`
--

DROP TABLE IF EXISTS `venda_servico`;
CREATE TABLE `venda_servico` (
  `venda_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `codicli` varchar(45) NOT NULL,
  `preco` varchar(45) NOT NULL,
  `data` varchar(45) NOT NULL,
  `descri` varchar(445) NOT NULL,
  `dias` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `placa` varchar(45) NOT NULL,
  PRIMARY KEY (`venda_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `venda_servico`
--

/*!40000 ALTER TABLE `venda_servico` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda_servico` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
