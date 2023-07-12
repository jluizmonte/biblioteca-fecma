-- MySQL dump 10.13  Distrib 8.0.33, for Linux (x86_64)
--
-- Host: 192.168.1.138    Database: livraria
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `tbl_emprestimo`
--

DROP TABLE IF EXISTS `tbl_emprestimo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_emprestimo` (
  `pk_id_emprestimo` int NOT NULL AUTO_INCREMENT,
  `fk_locador` int DEFAULT NULL,
  `fk_locatario` int DEFAULT NULL,
  `fk_livro` int DEFAULT NULL,
  `data_emprestimo` varchar(10) DEFAULT NULL,
  `devolucao_emprestimo` varchar(10) DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  `status_emprestimo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`pk_id_emprestimo`),
  KEY `emprestimo_locador` (`fk_locador`),
  KEY `emprestimo_locatario` (`fk_locatario`),
  KEY `emprestimo_livro` (`fk_livro`),
  CONSTRAINT `emprestimo_livro` FOREIGN KEY (`fk_livro`) REFERENCES `tbl_livro` (`pk_id_livro`),
  CONSTRAINT `emprestimo_locador` FOREIGN KEY (`fk_locador`) REFERENCES `tbl_locador` (`pk_id_locador`),
  CONSTRAINT `emprestimo_locatario` FOREIGN KEY (`fk_locatario`) REFERENCES `tbl_locatario` (`pk_id_locatario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_emprestimo`
--

LOCK TABLES `tbl_emprestimo` WRITE;
/*!40000 ALTER TABLE `tbl_emprestimo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_emprestimo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_livro`
--

DROP TABLE IF EXISTS `tbl_livro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_livro` (
  `pk_id_livro` int NOT NULL AUTO_INCREMENT,
  `titulo_livro` varchar(50) DEFAULT NULL,
  `autor1_livro` varchar(50) DEFAULT NULL,
  `autor2_livro` varchar(50) DEFAULT NULL,
  `genero_livro` varchar(20) DEFAULT NULL,
  `ano_livro` int DEFAULT NULL,
  `data_livro` varchar(10) DEFAULT NULL,
  `quantidade_livro` int DEFAULT NULL,
  `estado_livro` varchar(255) DEFAULT NULL COMMENT 'Estado de conservação do livro.',
  `descricao_livro` varchar(255) DEFAULT NULL COMMENT 'Observações gerais sobre o livro.',
  PRIMARY KEY (`pk_id_livro`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_livro`
--

LOCK TABLES `tbl_livro` WRITE;
/*!40000 ALTER TABLE `tbl_livro` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_livro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_locador`
--

DROP TABLE IF EXISTS `tbl_locador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_locador` (
  `pk_id_locador` int NOT NULL AUTO_INCREMENT,
  `nome_locador` varchar(50) DEFAULT NULL,
  `rua_locador` varchar(50) DEFAULT NULL,
  `numero_locador` varchar(5) DEFAULT NULL,
  `bairro_locador` varchar(50) DEFAULT NULL,
  `cidade_locador` varchar(50) DEFAULT NULL,
  `uf_locador` varchar(2) DEFAULT NULL,
  `cep_locador` varchar(15) DEFAULT NULL,
  `telefone_locador` varchar(20) DEFAULT NULL,
  `email_locador` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`pk_id_locador`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_locador`
--

LOCK TABLES `tbl_locador` WRITE;
/*!40000 ALTER TABLE `tbl_locador` DISABLE KEYS */;
INSERT INTO `tbl_locador` VALUES (16,'JHON DOE DA SILVA','OITO DE NOVEMBRO','1232','SANTO ALEIXO','JABOATÃO DOS GUARARAPES','PE','54.150-600','(00) 0 0000-0000','JHONESILVA@MAIL.COM'),(17,'JOSÉ LUIZ DO MONTE','RUA 8','12','SOCORRO','JABOTAO','PE','51.450-600','(00) 0 0000-0000','LUIZJOSE48@YAHOO.COM.BR');
/*!40000 ALTER TABLE `tbl_locador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_locatario`
--

DROP TABLE IF EXISTS `tbl_locatario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_locatario` (
  `pk_id_locatario` int NOT NULL AUTO_INCREMENT,
  `nome_locatario` varchar(50) DEFAULT NULL,
  `rua_locatario` varchar(50) DEFAULT NULL,
  `numero_locatario` varchar(5) DEFAULT NULL,
  `bairro_locatario` varchar(20) DEFAULT NULL,
  `cidade_locatario` varchar(20) DEFAULT NULL,
  `uf_locatario` varchar(2) DEFAULT NULL,
  `cep_locatario` varchar(15) DEFAULT NULL,
  `telefone_locatario` varchar(20) DEFAULT NULL,
  `email_locatario` varchar(25) DEFAULT NULL,
  `status_locatario` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`pk_id_locatario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_locatario`
--

LOCK TABLES `tbl_locatario` WRITE;
/*!40000 ALTER TABLE `tbl_locatario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_locatario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuario`
--

DROP TABLE IF EXISTS `tbl_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_usuario` (
  `pk_id_usuario` int NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(50) DEFAULT NULL,
  `senha_usuario` varchar(50) DEFAULT NULL,
  `login_usuario` varchar(30) DEFAULT NULL,
  `nivel_usuario` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pk_id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='tabela referente aos usuarios que terão acesso ao sistema.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuario`
--

LOCK TABLES `tbl_usuario` WRITE;
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` VALUES (1,'José Luiz','1994','luiz','ADMINISTRADOR');
/*!40000 ALTER TABLE `tbl_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-12 18:13:30
