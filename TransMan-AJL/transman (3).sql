-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 02-Nov-2018 às 06:30
-- Versão do servidor: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `transman`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `nuit` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `nuit`) VALUES
(2, 'Coca-Cola', '65311'),
(3, 'Fizz', '897523'),
(4, 'CIM', '15648'),
(6, 'Amazon', '314615'),
(7, 'Home Center', '8972412');

-- --------------------------------------------------------

--
-- Estrutura da tabela `documentacao`
--

DROP TABLE IF EXISTS `documentacao`;
CREATE TABLE IF NOT EXISTS `documentacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `DataEmissao` datetime DEFAULT NULL,
  `DataFim` datetime DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `DataAdmissao` datetime DEFAULT NULL,
  `DataNascimento` datetime DEFAULT NULL,
  `funcao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `numBI` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tarifas`
--

DROP TABLE IF EXISTS `tarifas`;
CREATE TABLE IF NOT EXISTS `tarifas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dataAlteracao` datetime DEFAULT NULL,
  `precoAlimentacao` double NOT NULL,
  `precoAlojamento` double NOT NULL,
  `precoAutomovel` double NOT NULL,
  `precoBasculante` double NOT NULL,
  `precoBus` double NOT NULL,
  `precoCombustivel` double NOT NULL,
  `precoEstivador` double NOT NULL,
  `precoKGAberto` double NOT NULL,
  `precoKGFechado` double NOT NULL,
  `precoKGFrigorifico` double NOT NULL,
  `precoKM` double NOT NULL,
  `precoMotorista` double NOT NULL,
  `precoPortaContentor` double NOT NULL,
  `precoTanque` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tarifas`
--

INSERT INTO `tarifas` (`id`, `dataAlteracao`, `precoAlimentacao`, `precoAlojamento`, `precoAutomovel`, `precoBasculante`, `precoBus`, `precoCombustivel`, `precoEstivador`, `precoKGAberto`, `precoKGFechado`, `precoKGFrigorifico`, `precoKM`, `precoMotorista`, `precoPortaContentor`, `precoTanque`) VALUES
(1, '2018-10-22 13:58:42', 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dataUltimoLog` datetime DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `dataUltimoLog`, `nome`, `senha`, `tipo`) VALUES
(1, '2018-10-22 13:57:49', 'arleybebe', 'custodia', 'Gestor'),
(2, '2018-10-22 13:58:06', 'josemanuel', 'zezinhp', 'Gestor'),
(3, '2018-10-29 19:03:48', 'Afonso Majimeja', 'majimeja', 'Utilizador');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
CREATE TABLE IF NOT EXISTS `veiculo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ano` int(11) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `kilometragem` double NOT NULL,
  `lotacao` int(11) NOT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `matricula` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `peso` double NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `volume` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`id`, `ano`, `categoria`, `kilometragem`, `lotacao`, `marca`, `matricula`, `modelo`, `peso`, `status`, `tipo`, `volume`) VALUES
(1, 1998, 'Pesado', 51256, 2, 'Mercedes', 'AAA-257-MC', 'SD', 56452, 'Ocupado', 'Aberto', 10),
(2, 1998, 'Pesado', 6894, 2, 'Volvo', 'MLY-124-MP', 'GF', 1567, 'Disponivel', 'Fechado', 0),
(3, 1997, 'Pesado', 6235, 2, 'FL', 'ABA-450-MP', '12', 52315, 'Disponivel', 'Frigorifico', 0),
(4, 1996, 'Pesado', 2500, 3, 'Volvo', 'AJL-145-MC', 'ZX-500', 6000, 'Disponivel', 'Aberto', 10),
(5, 1997, 'Pesado', 54121, 2, 'Tata', 'ASD-500-MC', 'VI', 5200, 'Ocupado', 'Aberto', 0),
(6, 1996, 'Pesado', 5200, 2, 'Mercedes', 'ASU-125-MC', 'FD', 5000, 'Ocupado', 'Aberto', 0),
(7, 1994, 'Pesado', 8944, 2, 'Freightliner', 'AHJ-654-NP', 'FD', 5200, 'Ocupado', 'Aberto', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `viagem`
--

DROP TABLE IF EXISTS `viagem`;
CREATE TABLE IF NOT EXISTS `viagem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ValorAlimentacao` double NOT NULL,
  `consumoCombustivel` double NOT NULL,
  `dataChegada` datetime DEFAULT NULL,
  `dataPartida` datetime DEFAULT NULL,
  `dataRegisto` datetime DEFAULT NULL,
  `distancia` double NOT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `localDestino` varchar(255) DEFAULT NULL,
  `localPartida` varchar(255) DEFAULT NULL,
  `matriculaVeiculo` varchar(255) DEFAULT NULL,
  `nomeCliente` varchar(255) DEFAULT NULL,
  `nomeUsuario` varchar(255) DEFAULT NULL,
  `numMotoristas` int(11) NOT NULL,
  `precoTotal` double NOT NULL,
  `provinciaDestino` varchar(255) DEFAULT NULL,
  `provinciaPartida` varchar(255) DEFAULT NULL,
  `tempoEstimado` double NOT NULL,
  `valorAlojamento` double NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `viagem`
--

INSERT INTO `viagem` (`id`, `ValorAlimentacao`, `consumoCombustivel`, `dataChegada`, `dataPartida`, `dataRegisto`, `distancia`, `estado`, `localDestino`, `localPartida`, `matriculaVeiculo`, `nomeCliente`, `nomeUsuario`, `numMotoristas`, `precoTotal`, `provinciaDestino`, `provinciaPartida`, `tempoEstimado`, `valorAlojamento`, `tipo`) VALUES
(1, 300000, 840.0000000000001, '2018-10-23 19:58:10', '2018-10-23 19:58:10', '2018-10-22 19:58:21', 3000, 'Terminada', 'KaMpfumo', 'Boane', NULL, 'Coca-Cola', NULL, 4, 601440, 'Maputo Cidade', 'Maputo Cidade', 0, 600, 'Frigorifico'),
(2, 300000, 840.0000000000001, '2018-10-23 21:08:07', '2018-10-23 21:08:07', '2018-10-22 21:08:28', 3000, 'Marcada', 'Boane', 'KaMpfumo', NULL, 'Coca-Cola', NULL, 4, 601440, 'Maputo Província', 'Maputo Cidade', 0, 600, 'Aberto'),
(3, 50000, 140, '2018-10-24 14:13:12', '2018-10-24 14:13:12', '2018-10-23 14:13:37', 500, 'Marcada', 'KaMpfumo', 'Boane', NULL, 'Coca-Cola', NULL, 1, 100240, 'Maputo Cidade', 'Maputo Província', 0, 100, 'Fechado'),
(4, 120000, 336.00000000000006, '2018-10-25 14:18:18', '2018-10-25 14:18:18', '2018-10-23 14:18:43', 1200, 'Marcada', 'Maringué', 'Chicualacuala', NULL, 'CIM', NULL, 2, 240576, 'Sofala', 'Gaza', 0, 240, 'Fechado'),
(5, 100000, 280, '2018-10-29 16:59:05', '2018-10-29 16:59:05', '2018-10-28 16:59:50', 1000, 'Terminada', 'KaMpfumo', 'Boane', 'AAA-257-MC', 'Coca-Cola', NULL, 2, 200480, 'Maputo Cidade', 'Maputo Província', 0, 200, 'Aberto'),
(6, 150000, 420.00000000000006, '2018-10-29 17:47:41', '2018-10-29 17:47:41', '2018-10-28 17:48:10', 1500, 'Marcada', 'Chibuto', 'Boane', 'AAA-257-MC', 'Coca-Cola', NULL, 2, 300720, 'Gaza', 'Maputo Província', 0, 300, 'Tanque'),
(7, 150000, 420.00000000000006, '2018-10-29 18:09:38', '2018-10-29 18:09:38', '2018-10-28 18:10:01', 1500, 'Terminada', 'Bilene', 'Boane', 'AAA-257-MC', 'Coca-Cola', NULL, 2, 300720, 'Gaza', 'Maputo Província', 0, 300, 'Aberto'),
(8, 150000, 420.00000000000006, '2018-10-29 18:32:18', '2018-10-29 18:32:18', '2018-10-28 18:32:36', 1500, 'Marcada', 'Beira', 'Bilene', 'AJL-145-MC', 'CIM', NULL, 2, 300720, 'Sofala', 'Gaza', 0, 300, 'Aberto'),
(9, 200000, 560, '2018-10-31 18:38:10', '2018-10-31 18:38:10', '2018-10-28 18:38:28', 2000, 'Marcada', 'Macate', 'Namaacha', NULL, 'Fizz', NULL, 3, 400960, 'Manica', 'Maputo Província', 0, 400, 'Aberto'),
(10, 150000, 420.00000000000006, '2018-09-03 18:50:54', '2018-09-03 18:50:54', '2018-10-28 18:52:47', 1500, 'Marcada', 'Ancuabe', 'Beira', 'ASD-500-MC', 'Fizz', NULL, 2, 300720, 'Cabo Delgado', 'Sofala', 0, 300, 'Fechado'),
(11, 230000, 644.0000000000001, '2018-11-05 19:02:43', '2018-11-05 19:02:43', '2018-10-28 19:03:18', 2300, 'Marcada', 'Bárue', 'Marracuene', 'ASU-125-MC', 'Amazon', NULL, 3, 461104, 'Manica', 'Maputo Província', 0, 459.99999999999994, 'Aberto'),
(12, 150000, 420.00000000000006, '2018-10-29 19:49:14', '2018-10-29 19:49:14', '2018-10-29 19:49:32', 1500, 'Marcada', 'Bilene', 'Boane', 'AHJ-654-NP', 'Coca-Cola', NULL, 2, 300720, 'Gaza', 'Maputo Província', 0, 300, 'Fechado'),
(13, 150000, 420.00000000000006, '2018-11-02 21:19:53', '2018-11-02 21:19:53', '2018-10-31 21:20:53', 1500, 'Marcada', 'Beira', 'Boane', 'AAA-257-MC', 'Home Center', NULL, 2, 300720, 'Sofala', 'Maputo Província', 0, 400, 'Aberto');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
