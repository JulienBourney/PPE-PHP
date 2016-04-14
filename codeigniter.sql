-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Jeu 14 Avril 2016 à 15:31
-- Version du serveur: 5.5.46-0ubuntu0.14.04.2
-- Version de PHP: 5.5.9-1ubuntu4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `codeigniter`
--

-- --------------------------------------------------------

--
-- Structure de la table `attribuer_heberg`
--

CREATE TABLE IF NOT EXISTS `attribuer_heberg` (
  `idHeberg` int(2) NOT NULL,
  `idReserv` int(2) NOT NULL,
  `date_attribution` date NOT NULL,
  PRIMARY KEY (`idHeberg`,`idReserv`),
  KEY `idReserv` (`idReserv`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `hebergement`
--

CREATE TABLE IF NOT EXISTS `hebergement` (
  `idHeberg` int(2) NOT NULL AUTO_INCREMENT,
  `typeHeberg` varchar(15) NOT NULL,
  `emplacement` varchar(60) NOT NULL,
  `etage` int(2) NOT NULL,
  `remarques` varchar(200) NOT NULL,
  PRIMARY KEY (`idHeberg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `reservations`
--

CREATE TABLE IF NOT EXISTS `reservations` (
  `idReserv` int(5) NOT NULL AUTO_INCREMENT,
  `Date_Arrivee` date NOT NULL,
  `Date_Depart` date NOT NULL,
  `Nb_Personnes` int(2) NOT NULL,
  `Menage` tinyint(1) NOT NULL,
  `EtatReservation` varchar(30) NOT NULL,
  `idUtil` int(5) NOT NULL,
  PRIMARY KEY (`idReserv`),
  KEY `idUtil` (`idUtil`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `reservations`
--

INSERT INTO `reservations` (`idReserv`, `Date_Arrivee`, `Date_Depart`, `Nb_Personnes`, `Menage`, `EtatReservation`, `idUtil`) VALUES
(1, '2015-09-17', '2015-09-21', 3, 1, 'Pay&eacute;', 27),
(2, '2015-09-02', '2015-09-11', 7, 0, 'En Cours', 41),
(3, '2015-09-24', '2015-09-26', 2, 1, 'En cours', 27),
(4, '2015-08-18', '2015-08-21', 2, 1, 'En cours', 41),
(5, '2014-09-15', '2014-09-19', 3, 0, 'En cours', 41),
(6, '2013-11-10', '2013-11-13', 3, 1, 'En cours', 41),
(7, '2016-12-15', '2016-12-19', 2, 1, 'En cours', 41);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `idUtil` int(5) NOT NULL AUTO_INCREMENT,
  `Login` varchar(15) NOT NULL,
  `MdP` varchar(15) NOT NULL,
  `Nom` text NOT NULL,
  `Prenom` text NOT NULL,
  `Admin` int(1) NOT NULL,
  PRIMARY KEY (`idUtil`),
  UNIQUE KEY `Login` (`Login`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=65 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`idUtil`, `Login`, `MdP`, `Nom`, `Prenom`, `Admin`) VALUES
(1, 'test1', 'test', 'Lefotre', 'Pierre', 1),
(27, 'test2', 'test', 'Ekta', 'Pierrick\r\n', 0),
(41, 'test3', 'test', 'David', 'Faiko', 0),
(42, 'test4', 'test', 'toto', 'tutu', 0),
(43, 'test5', 'test', 'tata', 'toto', 0),
(64, 'test', 'test', 'test', 'test', 0);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `attribuer_heberg`
--
ALTER TABLE `attribuer_heberg`
  ADD CONSTRAINT `attribuer_heberg_ibfk_1` FOREIGN KEY (`idHeberg`) REFERENCES `hebergement` (`idHeberg`),
  ADD CONSTRAINT `attribuer_heberg_ibfk_2` FOREIGN KEY (`idReserv`) REFERENCES `reservations` (`idReserv`);

--
-- Contraintes pour la table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`idUtil`) REFERENCES `utilisateur` (`idUtil`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
