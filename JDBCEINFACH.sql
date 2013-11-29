-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 29. Nov 2013 um 01:15
-- Server Version: 5.5.32
-- PHP-Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `jdbceinfach`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `l_lehrer`
--

CREATE TABLE IF NOT EXISTS `l_lehrer` (
  `l_nummer` int(11) NOT NULL,
  `l_vorname` varchar(32) DEFAULT NULL,
  `l_nachname` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`l_nummer`),
  UNIQUE KEY `l_nummer` (`l_nummer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `l_lehrer`
--

INSERT INTO `l_lehrer` (`l_nummer`, `l_vorname`, `l_nachname`) VALUES
(1, 'Tschernko', 'Thomas'),
(2, 'Maier', 'Proffesor'),
(3, 'Birgitt', 'Schmoll'),
(4, 'Vukovic', 'Elke'),
(5, 'Thanew', 'Guy');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
