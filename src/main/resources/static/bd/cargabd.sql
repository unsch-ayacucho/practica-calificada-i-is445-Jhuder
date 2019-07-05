-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cargabd
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `docente` (
  `idDocente` int(11) NOT NULL,
  `nombreDocente` varchar(45) NOT NULL,
  `tipoDocente` varchar(45) NOT NULL,
  PRIMARY KEY (`idDocente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` VALUES (1,'Fredy Barrientos','Nombrado');
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semestre`
--

DROP TABLE IF EXISTS `semestre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `semestre` (
  `idSemestre` int(11) NOT NULL,
  `NombreSemestre` varchar(45) NOT NULL,
  `HorasSemanales` varchar(45) NOT NULL,
  `Docente_idDocente` int(11) NOT NULL,
  PRIMARY KEY (`idSemestre`,`Docente_idDocente`),
  KEY `fk_Semestre_Docente_idx` (`Docente_idDocente`),
  CONSTRAINT `fk_Semestre_Docente` FOREIGN KEY (`Docente_idDocente`) REFERENCES `docente` (`idDocente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semestre`
--

LOCK TABLES `semestre` WRITE;
/*!40000 ALTER TABLE `semestre` DISABLE KEYS */;
/*!40000 ALTER TABLE `semestre` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-05  2:46:11
