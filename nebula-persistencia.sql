-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: nebula
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `noticias`
--
CREATE DATABASE nebula;

USE nebula;

DROP TABLE IF EXISTS `noticias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `noticias` (
  `id_noticia` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(2000) NOT NULL,
  `fecha_registro` datetime NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `url_imagen` varchar(2048) NOT NULL,
  PRIMARY KEY (`id_noticia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `noticias`
--

LOCK TABLES `noticias` WRITE;
/*!40000 ALTER TABLE `noticias` DISABLE KEYS */;
INSERT INTO `noticias` VALUES (1,'El nuevo disco de Taylor, \"The life of a showgirl\" saldrá a la venta el 3 de octubre','2025-10-20 00:00:00','Taylor Swift en su nueva era','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfGRivZ1CFL4jhQXNbF9phy9h-CASW3TM9UQ&s'),(2,'Revelan el setlist completo de la banda','2025-08-02 00:00:00','Oasis','https://media.gq.com.mx/photos/66cdf89fe21e890818a07d6d/4:3/w_2248,h_1686,c_limit/Oasis.jpg'),(3,'Un éxito el tributo en Ciudad Obregón donde nos deleitaron durante 2 horas en el LordPub','2025-06-01 00:00:00','Los Reztos tocan tributo a Marea','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRU2wpHalZ_btJnPiNpMLziQ2Pcu0BDxxJBVA&s');
/*!40000 ALTER TABLE `noticias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` bigint NOT NULL AUTO_INCREMENT,
  `correo` varchar(200) NOT NULL,
  `fecha_registro` datetime NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `pseudonimo` varchar(50) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (2,'john.wick@gmail.com','2025-09-11 00:00:00','John Wick','johny.kill','BASICA','SF4c4VH/BRwk5A+sH4qv1Q==:Qu5KD5XN2YscI9lEdVVIw9fb7GN/j8bL39SngpwIaXc='),(3,'steve.rogers@gmail.com','2025-08-09 00:00:00','Steve Rogers','capitan123','PREMIUM','7M1stfmN52yylTGDwbifKQ==:djcXOL0BNW2yOxcPTjy73lsefY4yhr87c0bTq6kMN74='),(4,'black.widow@gmail.com','2025-01-25 00:00:00','Natasha Romanoff','naty.black','BASICA','Pu7rZvIz4kOw7iYpkgO7nw==:pftJxp1C7B/ChRfYlGyxxONROxYzZuooktd9P79ANlY='),(5,'batman@gmail.com','2025-02-28 00:00:00','Bruce Wayne','the_batman','PREMIUM','WUjOdjR7cFlk7M6kodzsqg==:3DHV39sUNId9VM+zGsxHG1zy6BZ3ogVNWUwqLA6Z6Oo='),(6,'tony.stark@gmail.com','2025-01-01 00:00:00','Tony Stark','iron.man','PREMIUM','sTGrzRxuiuqqibnXmQ7+mw==:muyMx15ghchXCGPEM+2g9hjneoIv6LLqIOCl/3ygkOo='),(7,'dead.pool@hotmail.com','2025-03-20 00:00:00','Steve Pool','dead.pool','ESTANDAR','uNk86d7qiJZ40XIv511Khw==:pDzoIvS75HEw/lKyZI0zCSh2+sXNjoE9gIFKnCH6ZBg=');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-04 19:51:28
