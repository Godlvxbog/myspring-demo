CREATE DATABASE  IF NOT EXISTS `gp` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `gp`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gp
-- ------------------------------------------------------
-- Server version	5.7.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nums` int(11) NOT NULL,
  `name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_numbs` (`nums`)
) ENGINE=InnoDB AUTO_INCREMENT=4229 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES (1,1,'2'),(2,12,'name-test'),(3,12,'name-test'),(4,12,'A'),(5,12,'A'),(6,12,'A'),(7,12,'A'),(8,12,'A'),(9,12,'A'),(10,12,'0'),(11,12,'0'),(12,0,'0'),(13,1,'0'),(14,2,'0'),(15,3,'0'),(16,4,'0'),(17,5,'0'),(18,6,'0'),(19,7,'0'),(20,8,'0'),(21,9,'0'),(22,0,'0'),(23,1,'0'),(24,2,'0'),(25,3,'0'),(26,4,'0'),(27,5,'0'),(28,6,'0'),(29,7,'0'),(30,8,'0'),(31,9,'0'),(32,0,'0'),(33,1,'0'),(34,2,'0'),(35,3,'0'),(36,4,'0'),(37,5,'0'),(38,6,'0'),(39,7,'0'),(40,8,'0'),(41,9,'0'),(42,0,'0'),(43,1,'0'),(44,2,'0'),(45,3,'0'),(46,4,'0'),(47,5,'0'),(48,6,'0'),(49,7,'0'),(50,8,'0'),(51,9,'0'),(52,0,'0'),(53,1,'0'),(54,2,'0'),(55,3,'0'),(56,4,'0'),(57,5,'0'),(58,6,'0'),(59,7,'0'),(60,8,'0'),(61,9,'0'),(62,10,'0'),(63,11,'0'),(64,12,'0'),(65,13,'0'),(66,14,'0'),(67,15,'0'),(68,16,'0'),(69,17,'0'),(70,18,'0'),(71,19,'0'),(72,20,'0'),(73,21,'0'),(74,22,'0'),(75,23,'0'),(76,24,'0'),(77,25,'0'),(78,26,'0'),(79,27,'0'),(80,28,'0'),(81,29,'0'),(82,30,'0'),(83,31,'0'),(84,32,'0'),(85,33,'0'),(86,34,'0'),(87,35,'0'),(88,36,'0'),(89,37,'0'),(90,38,'0'),(91,39,'0'),(92,40,'0'),(93,41,'0'),(94,42,'0'),(95,43,'0'),(96,44,'0'),(97,45,'0'),(98,46,'0'),(99,47,'0'),(100,48,'0'),(101,49,'0'),(102,0,'0'),(103,1,'0'),(104,2,'0'),(105,3,'0'),(106,4,'0'),(107,5,'0'),(108,6,'0'),(109,7,'0'),(110,8,'0'),(111,9,'0'),(112,10,'0'),(113,11,'0'),(114,12,'0'),(115,13,'0'),(116,14,'0'),(117,15,'0'),(118,16,'0'),(119,17,'0'),(120,18,'0'),(121,19,'0'),(122,20,'0'),(123,21,'0'),(124,22,'0'),(125,23,'0'),(126,24,'0'),(127,25,'0'),(128,0,'0'),(129,1,'0'),(130,2,'0'),(131,3,'0'),(132,4,'0'),(133,5,'0'),(134,6,'0'),(135,7,'0'),(136,8,'0'),(137,9,'0'),(138,10,'0'),(139,0,'0'),(140,1,'0'),(141,2,'0'),(142,3,'0'),(143,4,'0'),(144,5,'0'),(145,6,'0'),(146,7,'0'),(147,8,'0'),(148,9,'0'),(149,10,'0'),(150,0,'0'),(151,1,'0'),(152,2,'0'),(153,3,'0'),(154,4,'0'),(155,5,'0'),(156,6,'0'),(157,7,'0'),(158,8,'0'),(159,9,'0'),(160,10,'0'),(161,11,'0'),(162,12,'0'),(163,13,'0'),(164,14,'0'),(165,15,'0'),(166,16,'0'),(167,17,'0'),(168,18,'0'),(169,19,'0'),(170,20,'0'),(171,21,'0'),(172,22,'0'),(173,23,'0'),(174,24,'0'),(175,25,'0'),(176,26,'0'),(177,27,'0'),(178,28,'0'),(179,29,'0'),(180,30,'0'),(181,31,'0'),(182,32,'0'),(183,33,'0'),(184,34,'0'),(185,35,'0'),(186,36,'0'),(187,37,'0'),(188,38,'0'),(189,39,'0'),(190,40,'0'),(191,41,'0'),(192,42,'0'),(193,43,'0'),(194,44,'0'),(195,45,'0'),(196,46,'0'),(197,47,'0'),(198,48,'0'),(199,49,'0'),(200,0,'0'),(201,1,'0'),(202,2,'0'),(203,3,'0'),(204,4,'0'),(205,5,'0'),(206,6,'0'),(207,7,'0'),(208,8,'0'),(209,9,'0'),(210,10,'0'),(211,0,'0'),(212,1,'0'),(213,2,'0'),(214,3,'0'),(215,4,'0'),(216,5,'0'),(217,6,'0'),(218,7,'0'),(219,8,'0'),(220,9,'0'),(221,10,'0'),(222,11,'0'),(223,12,'0'),(224,13,'0'),(225,14,'0'),(226,15,'0'),(227,16,'0'),(228,17,'0'),(229,18,'0'),(230,19,'0'),(231,20,'0'),(232,21,'0'),(233,22,'0'),(234,23,'0'),(235,24,'0'),(236,25,'0'),(237,26,'0'),(238,27,'0'),(239,28,'0'),(240,29,'0'),(241,30,'0'),(242,31,'0'),(243,32,'0'),(244,33,'0'),(245,34,'0'),(246,35,'0'),(247,36,'0'),(248,37,'0'),(249,38,'0'),(250,39,'0'),(251,40,'0'),(252,41,'0'),(253,42,'0'),(254,43,'0'),(255,44,'0'),(256,45,'0'),(257,46,'0'),(258,47,'0'),(259,48,'0'),(260,49,'0'),(261,0,'0'),(262,1,'0'),(263,2,'0'),(264,3,'0'),(265,4,'0'),(266,5,'0'),(267,6,'0'),(268,7,'0'),(269,8,'0'),(270,9,'0'),(271,10,'0'),(272,11,'0'),(273,12,'0'),(274,13,'0'),(275,14,'0'),(276,15,'0'),(277,16,'0'),(278,17,'0'),(279,18,'0'),(280,19,'0'),(281,20,'0'),(282,21,'0'),(283,22,'0'),(284,23,'0'),(285,24,'0'),(286,25,'0'),(287,26,'0'),(288,27,'0'),(289,28,'0'),(290,29,'0'),(291,30,'0'),(292,31,'0'),(293,32,'0'),(294,33,'0'),(295,34,'0'),(296,35,'0'),(297,36,'0'),(298,37,'0'),(299,38,'0'),(300,39,'0'),(301,40,'0'),(302,41,'0'),(303,42,'0'),(304,43,'0'),(305,44,'0'),(306,45,'0'),(307,46,'0'),(308,47,'0'),(309,48,'0'),(310,49,'0'),(311,50,'0'),(312,51,'0'),(313,52,'0'),(314,53,'0'),(315,54,'0'),(316,55,'0'),(317,56,'0'),(318,57,'0'),(319,58,'0'),(320,59,'0'),(321,60,'0'),(322,61,'0'),(323,62,'0'),(324,63,'0'),(325,64,'0'),(326,65,'0'),(327,66,'0'),(328,67,'0'),(329,68,'0'),(330,69,'0'),(331,70,'0'),(332,71,'0'),(333,72,'0'),(334,73,'0'),(335,74,'0'),(336,75,'0'),(337,76,'0'),(338,77,'0'),(339,78,'0'),(340,79,'0'),(341,80,'0'),(342,81,'0'),(343,82,'0'),(344,83,'0'),(345,84,'0'),(346,85,'0'),(347,86,'0'),(348,87,'0'),(349,88,'0'),(350,89,'0'),(351,90,'0'),(352,91,'0'),(353,92,'0'),(354,93,'0'),(355,94,'0'),(356,95,'0'),(357,96,'0'),(358,97,'0'),(359,98,'0'),(360,99,'0'),(361,100,'0'),(362,101,'0'),(363,102,'0'),(364,103,'0'),(365,104,'0'),(366,105,'0'),(367,106,'0'),(368,107,'0'),(369,108,'0'),(370,109,'0'),(371,110,'0'),(372,111,'0'),(373,112,'0'),(374,113,'0'),(375,114,'0'),(376,115,'0'),(377,116,'0'),(378,117,'0'),(379,118,'0'),(380,119,'0'),(381,120,'0'),(382,121,'0'),(383,122,'0'),(384,123,'0'),(385,124,'0'),(386,125,'0'),(387,126,'0'),(388,127,'0'),(389,128,'0'),(390,129,'0'),(391,130,'0'),(392,131,'0'),(393,132,'0'),(394,133,'0'),(395,134,'0'),(396,135,'0'),(397,136,'0'),(398,137,'0'),(399,138,'0'),(400,139,'0'),(401,140,'0'),(402,141,'0'),(403,142,'0'),(404,143,'0'),(405,144,'0'),(406,145,'0'),(407,146,'0'),(408,147,'0'),(409,148,'0'),(410,149,'0'),(411,150,'0'),(412,151,'0'),(413,152,'0'),(414,153,'0'),(415,154,'0'),(416,155,'0'),(417,156,'0'),(418,157,'0'),(419,158,'0'),(420,159,'0'),(421,160,'0'),(422,161,'0'),(423,162,'0'),(424,163,'0'),(425,164,'0'),(426,165,'0'),(427,166,'0'),(428,167,'0'),(429,168,'0'),(430,169,'0'),(431,170,'0'),(432,171,'0'),(433,172,'0'),(434,173,'0'),(435,174,'0'),(436,175,'0'),(437,176,'0'),(438,177,'0'),(439,178,'0'),(440,179,'0'),(441,180,'0'),(442,181,'0'),(443,182,'0'),(444,183,'0'),(445,184,'0'),(446,185,'0'),(447,186,'0'),(448,187,'0'),(449,188,'0'),(450,189,'0'),(451,190,'0'),(452,191,'0'),(453,192,'0'),(454,193,'0'),(455,194,'0'),(456,195,'0'),(457,196,'0'),(458,197,'0'),(459,198,'0'),(460,199,'0'),(461,200,'0'),(462,201,'0'),(463,202,'0'),(464,203,'0'),(465,204,'0'),(466,205,'0'),(467,206,'0'),(468,207,'0'),(469,208,'0'),(470,209,'0'),(471,210,'0'),(472,211,'0'),(473,212,'0'),(474,213,'0'),(475,214,'0'),(476,215,'0'),(477,216,'0'),(478,217,'0'),(479,218,'0'),(480,219,'0'),(481,220,'0'),(482,221,'0'),(483,222,'0'),(484,223,'0'),(485,224,'0'),(486,225,'0'),(487,226,'0'),(488,227,'0'),(489,228,'0'),(490,229,'0'),(491,230,'0'),(492,231,'0'),(493,232,'0'),(494,233,'0'),(495,234,'0'),(496,235,'0'),(497,236,'0'),(498,237,'0'),(499,238,'0'),(500,239,'0'),(501,240,'0'),(502,241,'0'),(503,242,'0'),(504,243,'0'),(505,244,'0'),(506,245,'0'),(507,246,'0'),(508,247,'0'),(509,248,'0'),(510,249,'0'),(511,250,'0'),(512,251,'0'),(513,252,'0'),(514,253,'0'),(515,254,'0'),(516,255,'0'),(517,256,'0'),(518,257,'0'),(519,258,'0'),(520,259,'0'),(521,260,'0'),(522,261,'0'),(523,262,'0'),(524,263,'0'),(525,264,'0'),(526,265,'0'),(527,266,'0'),(528,267,'0'),(529,268,'0'),(530,269,'0'),(531,270,'0'),(532,271,'0'),(533,272,'0'),(534,273,'0'),(535,274,'0'),(536,275,'0'),(537,276,'0'),(538,277,'0'),(539,278,'0'),(540,279,'0'),(541,280,'0'),(542,281,'0'),(543,282,'0'),(544,283,'0'),(545,284,'0'),(546,285,'0'),(547,286,'0'),(548,287,'0'),(549,288,'0'),(550,289,'0'),(551,290,'0'),(552,291,'0'),(553,292,'0'),(554,293,'0'),(555,294,'0'),(556,295,'0'),(557,296,'0'),(558,297,'0'),(559,298,'0'),(560,299,'0'),(561,300,'0'),(562,301,'0'),(563,302,'0'),(564,303,'0'),(565,304,'0'),(566,305,'0'),(567,306,'0'),(568,307,'0'),(569,308,'0'),(570,309,'0'),(571,310,'0'),(572,311,'0'),(573,312,'0'),(574,313,'0'),(575,314,'0'),(576,315,'0'),(577,316,'0'),(578,317,'0'),(579,318,'0'),(580,319,'0'),(581,320,'0'),(582,321,'0'),(583,322,'0'),(584,323,'0'),(585,324,'0'),(586,325,'0'),(587,326,'0'),(588,327,'0'),(589,328,'0'),(590,329,'0'),(591,330,'0'),(592,331,'0'),(593,332,'0'),(594,333,'0'),(595,334,'0'),(596,335,'0'),(597,336,'0'),(598,337,'0'),(599,338,'0'),(600,339,'0'),(601,340,'0'),(602,341,'0'),(603,342,'0'),(604,343,'0'),(605,344,'0'),(606,345,'0'),(607,346,'0'),(608,347,'0'),(609,348,'0'),(610,349,'0'),(611,350,'0'),(612,351,'0'),(613,352,'0'),(614,353,'0'),(615,354,'0'),(616,355,'0'),(617,356,'0'),(618,357,'0'),(619,358,'0'),(620,359,'0'),(621,360,'0'),(622,361,'0'),(623,362,'0'),(624,363,'0'),(625,364,'0'),(626,365,'0'),(627,366,'0'),(628,367,'0'),(629,368,'0'),(630,369,'0'),(631,370,'0'),(632,371,'0'),(633,372,'0'),(634,373,'0'),(635,374,'0'),(636,375,'0'),(637,376,'0'),(638,377,'0'),(639,378,'0'),(640,379,'0'),(641,380,'0'),(642,381,'0'),(643,382,'0'),(644,383,'0'),(645,384,'0'),(646,385,'0'),(647,386,'0'),(648,387,'0'),(649,388,'0'),(650,389,'0'),(651,390,'0'),(652,391,'0'),(653,392,'0'),(654,393,'0'),(655,394,'0'),(656,395,'0'),(657,396,'0'),(658,397,'0'),(659,398,'0'),(660,399,'0'),(661,400,'0'),(662,401,'0'),(663,402,'0'),(664,403,'0'),(665,404,'0'),(666,405,'0'),(667,406,'0'),(668,407,'0'),(669,408,'0'),(670,409,'0'),(671,410,'0'),(672,411,'0'),(673,412,'0'),(674,413,'0'),(675,414,'0'),(676,415,'0'),(677,416,'0'),(678,417,'0'),(679,418,'0'),(680,419,'0'),(681,420,'0'),(682,421,'0'),(683,422,'0'),(684,423,'0'),(685,424,'0'),(686,425,'0'),(687,426,'0'),(688,427,'0'),(689,428,'0'),(690,429,'0'),(691,430,'0'),(692,431,'0'),(693,432,'0'),(694,433,'0'),(695,434,'0'),(696,435,'0'),(697,436,'0'),(698,437,'0'),(699,438,'0'),(700,439,'0'),(701,440,'0'),(702,441,'0'),(703,442,'0'),(704,443,'0'),(705,444,'0'),(706,445,'0'),(707,446,'0'),(708,447,'0'),(709,448,'0'),(710,449,'0'),(711,450,'0'),(712,451,'0'),(713,452,'0'),(714,453,'0'),(715,454,'0'),(716,455,'0'),(717,456,'0'),(718,457,'0'),(719,458,'0'),(720,459,'0'),(721,460,'0'),(722,461,'0'),(723,462,'0'),(724,463,'0'),(725,464,'0'),(726,465,'0'),(727,466,'0'),(728,467,'0'),(729,468,'0'),(730,469,'0'),(731,470,'0'),(732,471,'0'),(733,472,'0'),(734,473,'0'),(735,474,'0'),(736,475,'0'),(737,476,'0'),(738,477,'0'),(739,478,'0'),(740,479,'0'),(741,480,'0'),(742,481,'0'),(743,482,'0'),(744,483,'0'),(745,484,'0'),(746,485,'0'),(747,486,'0'),(748,487,'0'),(749,488,'0'),(750,489,'0'),(751,490,'0'),(752,491,'0'),(753,492,'0'),(754,493,'0'),(755,494,'0'),(756,495,'0'),(757,496,'0'),(758,497,'0'),(759,498,'0'),(760,499,'0'),(761,500,'0'),(762,501,'0'),(763,502,'0'),(764,503,'0'),(765,504,'0'),(766,505,'0'),(767,506,'0'),(768,507,'0'),(769,508,'0'),(770,509,'0'),(771,510,'0'),(772,511,'0'),(773,512,'0'),(774,513,'0'),(775,514,'0'),(776,515,'0'),(777,516,'0'),(778,517,'0'),(779,518,'0'),(780,519,'0'),(781,520,'0'),(782,521,'0'),(783,522,'0'),(784,523,'0'),(785,524,'0'),(786,525,'0'),(787,526,'0'),(788,527,'0'),(789,528,'0'),(790,529,'0'),(791,530,'0'),(792,531,'0'),(793,532,'0'),(794,533,'0'),(795,534,'0'),(796,535,'0'),(797,536,'0'),(798,537,'0'),(799,538,'0'),(800,539,'0'),(801,540,'0'),(802,541,'0'),(803,542,'0'),(804,543,'0'),(805,544,'0'),(806,545,'0'),(807,546,'0'),(808,547,'0'),(809,548,'0'),(810,549,'0'),(811,550,'0'),(812,551,'0'),(813,552,'0'),(814,553,'0'),(815,554,'0'),(816,555,'0'),(817,556,'0'),(818,557,'0'),(819,558,'0'),(820,559,'0'),(821,560,'0'),(822,561,'0'),(823,562,'0'),(824,563,'0'),(825,564,'0'),(826,565,'0'),(827,566,'0'),(828,567,'0'),(829,568,'0'),(830,569,'0'),(831,570,'0'),(832,571,'0'),(833,572,'0'),(834,573,'0'),(835,574,'0'),(836,575,'0'),(837,576,'0'),(838,577,'0'),(839,578,'0'),(840,579,'0'),(841,580,'0'),(842,581,'0'),(843,582,'0'),(844,583,'0'),(845,584,'0'),(846,585,'0'),(847,586,'0'),(848,587,'0'),(849,588,'0'),(850,589,'0'),(851,590,'0'),(852,591,'0'),(853,592,'0'),(854,593,'0'),(855,594,'0'),(856,595,'0'),(857,596,'0'),(858,597,'0'),(859,598,'0'),(860,599,'0'),(861,600,'0'),(862,601,'0'),(863,602,'0'),(864,603,'0'),(865,604,'0'),(866,605,'0'),(867,606,'0'),(868,607,'0'),(869,608,'0'),(870,609,'0'),(871,610,'0'),(872,611,'0'),(873,612,'0'),(874,613,'0'),(875,614,'0'),(876,615,'0'),(877,616,'0'),(878,617,'0'),(879,618,'0'),(880,619,'0'),(881,620,'0'),(882,621,'0'),(883,622,'0'),(884,623,'0'),(885,624,'0'),(886,625,'0'),(887,626,'0'),(888,627,'0'),(889,628,'0'),(890,629,'0'),(891,630,'0'),(892,631,'0'),(893,632,'0'),(894,633,'0'),(895,634,'0'),(896,635,'0'),(897,636,'0'),(898,637,'0'),(899,638,'0'),(900,639,'0'),(901,640,'0'),(902,641,'0'),(903,642,'0'),(904,643,'0'),(905,644,'0'),(906,645,'0'),(907,646,'0'),(908,647,'0'),(909,648,'0'),(910,649,'0'),(911,650,'0'),(912,651,'0'),(913,652,'0'),(914,653,'0'),(915,654,'0'),(916,655,'0'),(917,656,'0'),(918,657,'0'),(919,658,'0'),(920,659,'0'),(921,660,'0'),(922,661,'0'),(923,662,'0'),(924,663,'0'),(925,664,'0'),(926,665,'0'),(927,666,'0'),(928,667,'0'),(929,668,'0'),(930,669,'0'),(931,670,'0'),(932,671,'0'),(933,672,'0'),(934,673,'0'),(935,674,'0'),(936,675,'0'),(937,676,'0'),(938,677,'0'),(939,678,'0'),(940,679,'0'),(941,680,'0'),(942,681,'0'),(943,682,'0'),(944,683,'0'),(945,684,'0'),(946,685,'0'),(947,686,'0'),(948,687,'0'),(949,688,'0'),(950,689,'0'),(951,690,'0'),(952,691,'0'),(953,692,'0'),(954,693,'0'),(955,694,'0'),(956,695,'0'),(957,696,'0'),(958,697,'0'),(959,698,'0'),(960,699,'0'),(961,700,'0'),(962,701,'0'),(963,702,'0'),(964,703,'0'),(965,704,'0'),(966,705,'0'),(967,706,'0'),(968,707,'0'),(969,708,'0'),(970,709,'0'),(971,710,'0'),(972,711,'0'),(973,712,'0'),(974,713,'0'),(975,714,'0'),(976,715,'0'),(977,716,'0'),(978,717,'0'),(979,718,'0'),(980,719,'0'),(981,720,'0'),(982,721,'0'),(983,722,'0'),(984,723,'0'),(985,724,'0'),(986,725,'0'),(987,726,'0'),(988,727,'0'),(989,728,'0'),(990,729,'0'),(991,730,'0'),(992,731,'0'),(993,732,'0'),(994,733,'0'),(995,734,'0'),(996,735,'0'),(997,736,'0'),(998,737,'0'),(999,738,'0'),(1000,739,'0'),(1001,740,'0'),(1002,741,'0'),(1003,742,'0'),(1004,743,'0'),(1005,744,'0'),(1006,745,'0'),(1007,746,'0'),(1008,747,'0'),(1009,748,'0'),(1010,749,'0'),(1011,750,'0'),(1012,751,'0'),(1013,752,'0'),(1014,753,'0'),(1015,754,'0'),(1016,755,'0'),(1017,756,'0'),(1018,757,'0'),(1019,758,'0'),(1020,759,'0'),(1021,760,'0'),(1022,761,'0'),(1023,762,'0'),(1024,763,'0'),(1025,764,'0'),(1026,765,'0'),(1027,766,'0'),(1028,767,'0'),(1029,768,'0'),(1030,769,'0'),(1031,770,'0'),(1032,771,'0'),(1033,772,'0'),(1034,773,'0'),(1035,774,'0'),(1036,775,'0'),(1037,776,'0'),(1038,777,'0'),(1039,778,'0'),(1040,779,'0'),(1041,780,'0'),(1042,781,'0'),(1043,782,'0'),(1044,783,'0'),(1045,784,'0'),(1046,785,'0'),(1047,786,'0'),(1048,787,'0'),(1049,788,'0'),(1050,789,'0'),(1051,790,'0'),(1052,791,'0'),(1053,792,'0'),(1054,793,'0'),(1055,794,'0'),(1056,795,'0'),(1057,796,'0'),(1058,797,'0'),(1059,798,'0'),(1060,799,'0'),(1061,800,'0'),(1062,801,'0'),(1063,802,'0'),(1064,803,'0'),(1065,804,'0'),(1066,805,'0'),(1067,806,'0'),(1068,807,'0'),(1069,808,'0'),(1070,809,'0'),(1071,810,'0'),(1072,811,'0'),(1073,812,'0'),(1074,813,'0'),(1075,814,'0'),(1076,815,'0'),(1077,816,'0'),(1078,817,'0'),(1079,818,'0'),(1080,819,'0'),(1081,820,'0'),(1082,821,'0'),(1083,822,'0'),(1084,823,'0'),(1085,824,'0'),(1086,825,'0'),(1087,826,'0'),(1088,827,'0'),(1089,828,'0'),(1090,829,'0'),(1091,830,'0'),(1092,831,'0'),(1093,832,'0'),(1094,833,'0'),(1095,834,'0'),(1096,835,'0'),(1097,836,'0'),(1098,837,'0'),(1099,838,'0'),(1100,839,'0'),(1101,840,'0'),(1102,841,'0'),(1103,842,'0'),(1104,843,'0'),(1105,844,'0'),(1106,845,'0'),(1107,846,'0'),(1108,847,'0'),(1109,848,'0'),(1110,849,'0'),(1111,850,'0'),(1112,851,'0'),(1113,852,'0'),(1114,853,'0'),(1115,854,'0'),(1116,855,'0'),(1117,856,'0'),(1118,857,'0'),(1119,858,'0'),(1120,859,'0'),(1121,860,'0'),(1122,861,'0'),(1123,862,'0'),(1124,863,'0'),(1125,864,'0'),(1126,865,'0'),(1127,866,'0'),(1128,867,'0'),(1129,868,'0'),(1130,869,'0'),(1131,870,'0'),(1132,871,'0'),(1133,872,'0'),(1134,873,'0'),(1135,874,'0'),(1136,0,'0'),(1137,1,'0'),(1138,2,'0'),(1139,3,'0'),(1140,4,'0'),(1141,5,'0'),(1142,6,'0'),(1143,7,'0'),(1144,8,'0'),(1145,9,'0'),(1146,10,'0'),(1147,11,'0'),(1148,12,'0'),(1149,13,'0'),(1150,14,'0'),(1151,15,'0'),(1152,16,'0'),(1153,17,'0'),(1154,18,'0'),(1155,19,'0'),(1156,20,'0'),(1157,21,'0'),(1158,22,'0'),(1159,23,'0'),(1160,24,'0'),(1161,25,'0'),(1162,26,'0'),(1163,27,'0'),(1164,28,'0'),(1165,29,'0'),(1166,30,'0'),(1167,31,'0'),(1168,32,'0'),(1169,33,'0'),(1170,34,'0'),(1171,35,'0'),(1172,36,'0'),(1173,37,'0'),(1174,38,'0'),(1175,39,'0'),(1176,40,'0'),(1177,41,'0'),(1178,42,'0'),(1179,43,'0'),(1180,44,'0'),(1181,45,'0'),(1182,46,'0'),(1183,47,'0'),(1184,48,'0'),(1185,49,'0'),(1186,50,'0'),(1187,51,'0'),(1188,52,'0'),(1189,53,'0'),(1190,54,'0'),(1191,55,'0'),(1192,56,'0'),(1193,57,'0'),(1194,58,'0'),(1195,59,'0'),(1196,60,'0'),(1197,61,'0'),(1198,62,'0'),(1199,63,'0'),(1200,64,'0'),(1201,65,'0'),(1202,66,'0'),(1203,67,'0'),(1204,68,'0'),(1205,69,'0'),(1206,70,'0'),(1207,71,'0'),(1208,72,'0'),(1209,73,'0'),(1210,74,'0'),(1211,75,'0'),(1212,76,'0'),(1213,77,'0'),(1214,78,'0'),(1215,79,'0'),(1216,80,'0'),(1217,81,'0'),(1218,82,'0'),(1219,83,'0'),(1220,84,'0'),(1221,85,'0'),(1222,86,'0'),(1223,87,'0'),(1224,88,'0'),(1225,89,'0'),(1226,90,'0'),(1227,91,'0'),(1228,92,'0'),(1229,93,'0'),(1230,94,'0'),(1231,95,'0'),(1232,96,'0'),(1233,97,'0'),(1234,98,'0'),(1235,99,'0'),(1236,100,'0'),(1237,101,'0'),(1238,102,'0'),(1239,103,'0'),(1240,104,'0'),(1241,105,'0'),(1242,106,'0'),(1243,107,'0'),(1244,108,'0'),(1245,109,'0'),(1246,110,'0'),(1247,111,'0'),(1248,112,'0'),(1249,113,'0'),(1250,114,'0'),(1251,115,'0'),(1252,116,'0'),(1253,117,'0'),(1254,118,'0'),(1255,119,'0'),(1256,120,'0'),(1257,121,'0'),(1258,122,'0'),(1259,123,'0'),(1260,124,'0'),(1261,125,'0'),(1262,126,'0'),(1263,127,'0'),(1264,128,'0'),(1265,129,'0'),(1266,130,'0'),(1267,131,'0'),(1268,132,'0'),(1269,133,'0'),(1270,134,'0'),(1271,135,'0'),(1272,136,'0'),(1273,137,'0'),(1274,138,'0'),(1275,139,'0'),(1276,140,'0'),(1277,141,'0'),(1278,142,'0'),(1279,143,'0'),(1280,144,'0'),(1281,145,'0'),(1282,146,'0'),(1283,147,'0'),(1284,148,'0'),(1285,149,'0'),(1286,150,'0'),(1287,151,'0'),(1288,152,'0'),(1289,153,'0'),(1290,154,'0'),(1291,155,'0'),(1292,156,'0'),(1293,157,'0'),(1294,158,'0'),(1295,159,'0'),(1296,160,'0'),(1297,161,'0'),(1298,162,'0'),(1299,163,'0'),(1300,164,'0'),(1301,165,'0'),(1302,166,'0'),(1303,167,'0'),(1304,168,'0'),(1305,169,'0'),(1306,170,'0'),(1307,171,'0'),(1308,172,'0'),(1309,173,'0'),(1310,174,'0'),(1311,175,'0'),(1312,176,'0'),(1313,177,'0'),(1314,178,'0'),(1315,179,'0'),(1316,180,'0'),(1317,181,'0'),(1318,182,'0'),(1319,183,'0'),(1320,184,'0'),(1321,185,'0'),(1322,186,'0'),(1323,187,'0'),(1324,188,'0'),(1325,189,'0'),(1326,190,'0'),(1327,191,'0'),(1328,192,'0'),(1329,193,'0'),(1330,194,'0'),(1331,195,'0'),(1332,196,'0'),(1333,197,'0'),(1334,198,'0'),(1335,199,'0'),(1336,200,'0'),(1337,201,'0'),(1338,202,'0'),(1339,203,'0'),(1340,204,'0'),(1341,205,'0'),(1342,206,'0'),(1343,207,'0'),(1344,208,'0'),(1345,209,'0'),(1346,210,'0'),(1347,211,'0'),(1348,212,'0'),(1349,213,'0'),(1350,214,'0'),(1351,215,'0'),(1352,216,'0'),(1353,217,'0'),(1354,218,'0'),(1355,219,'0'),(1356,220,'0'),(1357,221,'0'),(1358,222,'0'),(1359,223,'0'),(1360,224,'0'),(1361,225,'0'),(1362,226,'0'),(1363,227,'0'),(1364,228,'0'),(1365,229,'0'),(1366,230,'0'),(1367,231,'0'),(1368,232,'0'),(1369,233,'0'),(1370,234,'0'),(1371,235,'0'),(1372,236,'0'),(1373,237,'0'),(1374,238,'0'),(1375,239,'0'),(1376,240,'0'),(1377,241,'0'),(1378,242,'0'),(1379,243,'0'),(1380,244,'0'),(1381,245,'0'),(1382,246,'0'),(1383,247,'0'),(1384,248,'0'),(1385,249,'0'),(1386,250,'0'),(1387,251,'0'),(1388,252,'0'),(1389,253,'0'),(1390,254,'0'),(1391,255,'0'),(1392,256,'0'),(1393,257,'0'),(1394,258,'0'),(1395,259,'0'),(1396,260,'0'),(1397,261,'0'),(1398,262,'0'),(1399,263,'0'),(1400,264,'0'),(1401,265,'0'),(1402,266,'0'),(1403,267,'0'),(1404,268,'0'),(1405,269,'0'),(1406,270,'0'),(1407,271,'0'),(1408,272,'0'),(1409,273,'0'),(1410,274,'0'),(1411,275,'0'),(1412,276,'0'),(1413,277,'0'),(1414,278,'0'),(1415,279,'0'),(1416,280,'0'),(1417,281,'0'),(1418,282,'0'),(1419,283,'0'),(1420,284,'0'),(1421,285,'0'),(1422,286,'0'),(1423,287,'0'),(1424,288,'0'),(1425,289,'0'),(1426,290,'0'),(1427,291,'0'),(1428,292,'0'),(1429,293,'0'),(1430,294,'0'),(1431,295,'0'),(1432,296,'0'),(1433,297,'0'),(1434,298,'0'),(1435,299,'0'),(1436,300,'0'),(1437,301,'0'),(1438,302,'0'),(1439,303,'0'),(1440,304,'0'),(1441,305,'0'),(1442,306,'0'),(1443,307,'0'),(1444,308,'0'),(1445,309,'0'),(1446,310,'0'),(1447,311,'0'),(1448,312,'0'),(1449,313,'0'),(1450,314,'0'),(1451,315,'0'),(1452,316,'0'),(1453,317,'0'),(1454,318,'0'),(1455,319,'0'),(1456,320,'0'),(1457,321,'0'),(1458,322,'0'),(1459,323,'0'),(1460,324,'0'),(1461,325,'0'),(1462,326,'0'),(1463,327,'0'),(1464,328,'0'),(1465,329,'0'),(1466,330,'0'),(1467,331,'0'),(1468,332,'0'),(1469,333,'0'),(1470,334,'0'),(1471,335,'0'),(1472,336,'0'),(1473,337,'0'),(1474,338,'0'),(1475,339,'0'),(1476,340,'0'),(1477,341,'0'),(1478,342,'0'),(1479,343,'0'),(1480,344,'0'),(1481,345,'0'),(1482,346,'0'),(1483,347,'0'),(1484,348,'0'),(1485,349,'0'),(1486,350,'0'),(1487,351,'0'),(1488,352,'0'),(1489,353,'0'),(1490,354,'0'),(1491,355,'0'),(1492,356,'0'),(1493,357,'0'),(1494,358,'0'),(1495,359,'0'),(1496,360,'0'),(1497,361,'0'),(1498,362,'0'),(1499,363,'0'),(1500,364,'0'),(1501,365,'0'),(1502,366,'0'),(1503,367,'0'),(1504,368,'0'),(1505,369,'0'),(1506,370,'0'),(1507,371,'0'),(1508,372,'0'),(1509,373,'0'),(1510,374,'0'),(1511,375,'0'),(1512,376,'0'),(1513,377,'0'),(1514,378,'0'),(1515,379,'0'),(1516,380,'0'),(1517,381,'0'),(1518,382,'0'),(1519,383,'0'),(1520,384,'0'),(1521,385,'0'),(1522,386,'0'),(1523,387,'0'),(1524,388,'0'),(1525,389,'0'),(1526,390,'0'),(1527,391,'0'),(1528,392,'0'),(1529,393,'0'),(1530,394,'0'),(1531,395,'0'),(1532,396,'0'),(1533,397,'0'),(1534,398,'0'),(1535,399,'0'),(1536,400,'0'),(1537,401,'0'),(1538,402,'0'),(1539,403,'0'),(1540,404,'0'),(1541,405,'0'),(1542,406,'0'),(1543,407,'0'),(1544,408,'0'),(1545,409,'0'),(1546,410,'0'),(1547,411,'0'),(1548,412,'0'),(1549,413,'0'),(1550,414,'0'),(1551,415,'0'),(1552,416,'0'),(1553,417,'0'),(1554,418,'0'),(1555,419,'0'),(1556,420,'0'),(1557,421,'0'),(1558,422,'0'),(1559,423,'0'),(1560,424,'0'),(1561,425,'0'),(1562,426,'0'),(1563,427,'0'),(1564,428,'0'),(1565,429,'0'),(1566,430,'0'),(1567,431,'0'),(1568,432,'0'),(1569,433,'0'),(1570,434,'0'),(1571,435,'0'),(1572,436,'0'),(1573,437,'0'),(1574,438,'0'),(1575,439,'0'),(1576,440,'0'),(1577,441,'0'),(1578,442,'0'),(1579,443,'0'),(1580,444,'0'),(1581,445,'0'),(1582,446,'0'),(1583,447,'0'),(1584,448,'0'),(1585,449,'0'),(1586,450,'0'),(1587,451,'0'),(1588,452,'0'),(1589,453,'0'),(1590,454,'0'),(1591,455,'0'),(1592,456,'0'),(1593,457,'0'),(1594,458,'0'),(1595,459,'0'),(1596,460,'0'),(1597,461,'0'),(1598,462,'0'),(1599,463,'0'),(1600,464,'0'),(1601,465,'0'),(1602,466,'0'),(1603,467,'0'),(1604,468,'0'),(1605,469,'0'),(1606,470,'0'),(1607,471,'0'),(1608,472,'0'),(1609,473,'0'),(1610,474,'0'),(1611,475,'0'),(1612,476,'0'),(1613,477,'0'),(1614,478,'0'),(1615,479,'0'),(1616,480,'0'),(1617,481,'0'),(1618,482,'0'),(1619,483,'0'),(1620,484,'0'),(1621,485,'0'),(1622,486,'0'),(1623,487,'0'),(1624,488,'0'),(1625,489,'0'),(1626,490,'0'),(1627,491,'0'),(1628,492,'0'),(1629,493,'0'),(1630,494,'0'),(1631,495,'0'),(1632,496,'0'),(1633,497,'0'),(1634,498,'0'),(1635,499,'0'),(1636,500,'0'),(1637,501,'0'),(1638,502,'0'),(1639,503,'0'),(1640,504,'0'),(1641,505,'0'),(1642,506,'0'),(1643,507,'0'),(1644,508,'0'),(1645,509,'0'),(1646,510,'0'),(1647,511,'0'),(1648,512,'0'),(1649,513,'0'),(1650,514,'0'),(1651,515,'0'),(1652,516,'0'),(1653,517,'0'),(1654,518,'0'),(1655,519,'0'),(1656,520,'0'),(1657,521,'0'),(1658,522,'0'),(1659,523,'0'),(1660,524,'0'),(1661,525,'0'),(1662,526,'0'),(1663,527,'0'),(1664,528,'0'),(1665,529,'0'),(1666,530,'0'),(1667,531,'0'),(1668,532,'0'),(1669,533,'0'),(1670,534,'0'),(1671,535,'0'),(1672,536,'0'),(1673,537,'0'),(1674,538,'0'),(1675,539,'0'),(1676,540,'0'),(1677,541,'0'),(1678,542,'0'),(1679,543,'0'),(1680,544,'0'),(1681,545,'0'),(1682,546,'0'),(1683,547,'0'),(1684,548,'0'),(1685,549,'0'),(1686,550,'0'),(1687,551,'0'),(1688,552,'0'),(1689,553,'0'),(1690,554,'0'),(1691,555,'0'),(1692,556,'0'),(1693,557,'0'),(1694,558,'0'),(1695,559,'0'),(1696,560,'0'),(1697,561,'0'),(1698,562,'0'),(1699,563,'0'),(1700,564,'0'),(1701,565,'0'),(1702,566,'0'),(1703,567,'0'),(1704,568,'0'),(1705,569,'0'),(1706,570,'0'),(1707,571,'0'),(1708,572,'0'),(1709,573,'0'),(1710,574,'0'),(1711,575,'0'),(1712,576,'0'),(1713,577,'0'),(1714,578,'0'),(1715,579,'0'),(1716,580,'0'),(1717,581,'0'),(1718,582,'0'),(1719,583,'0'),(1720,584,'0'),(1721,585,'0'),(1722,586,'0'),(1723,587,'0'),(1724,588,'0'),(1725,589,'0'),(1726,590,'0'),(1727,591,'0'),(1728,592,'0'),(1729,593,'0'),(1730,594,'0'),(1731,595,'0'),(1732,596,'0'),(1733,597,'0'),(1734,598,'0'),(1735,599,'0'),(1736,600,'0'),(1737,601,'0'),(1738,602,'0'),(1739,603,'0'),(1740,604,'0'),(1741,605,'0'),(1742,606,'0'),(1743,607,'0'),(1744,608,'0'),(1745,609,'0'),(1746,610,'0'),(1747,611,'0'),(1748,612,'0'),(1749,613,'0'),(1750,614,'0'),(1751,615,'0'),(1752,616,'0'),(1753,617,'0'),(1754,618,'0'),(1755,619,'0'),(1756,620,'0'),(1757,621,'0'),(1758,622,'0'),(1759,623,'0'),(1760,624,'0'),(1761,625,'0'),(1762,626,'0'),(1763,627,'0'),(1764,628,'0'),(1765,629,'0'),(1766,630,'0'),(1767,631,'0'),(1768,632,'0'),(1769,633,'0'),(1770,634,'0'),(1771,635,'0'),(1772,636,'0'),(1773,637,'0'),(1774,638,'0'),(1775,639,'0'),(1776,640,'0'),(1777,641,'0'),(1778,642,'0'),(1779,643,'0'),(1780,644,'0'),(1781,645,'0'),(1782,646,'0'),(1783,647,'0'),(1784,648,'0'),(1785,649,'0'),(1786,650,'0'),(1787,651,'0'),(1788,652,'0'),(1789,653,'0'),(1790,654,'0'),(1791,655,'0'),(1792,656,'0'),(1793,657,'0'),(1794,658,'0'),(1795,659,'0'),(1796,660,'0'),(1797,661,'0'),(1798,662,'0'),(1799,663,'0'),(1800,664,'0'),(1801,665,'0'),(1802,666,'0'),(1803,667,'0'),(1804,668,'0'),(1805,669,'0'),(1806,670,'0'),(1807,671,'0'),(1808,672,'0'),(1809,673,'0'),(1810,674,'0'),(1811,675,'0'),(1812,676,'0'),(1813,677,'0'),(1814,678,'0'),(1815,679,'0'),(1816,680,'0'),(1817,681,'0'),(1818,682,'0'),(1819,683,'0'),(1820,684,'0'),(1821,685,'0'),(1822,686,'0'),(1823,687,'0'),(1824,688,'0'),(1825,689,'0'),(1826,690,'0'),(1827,691,'0'),(1828,692,'0'),(1829,693,'0'),(1830,694,'0'),(1831,695,'0'),(1832,696,'0'),(1833,697,'0'),(1834,698,'0'),(1835,699,'0'),(1836,700,'0'),(1837,701,'0'),(1838,702,'0'),(1839,703,'0'),(1840,704,'0'),(1841,705,'0'),(1842,706,'0'),(1843,707,'0'),(1844,708,'0'),(1845,709,'0'),(1846,710,'0'),(1847,711,'0'),(1848,712,'0'),(1849,713,'0'),(1850,714,'0'),(1851,715,'0'),(1852,716,'0'),(1853,717,'0'),(1854,718,'0'),(1855,719,'0'),(1856,720,'0'),(1857,721,'0'),(1858,722,'0'),(1859,723,'0'),(1860,724,'0'),(1861,725,'0'),(1862,726,'0'),(1863,727,'0'),(1864,728,'0'),(1865,729,'0'),(1866,730,'0'),(1867,731,'0'),(1868,732,'0'),(1869,733,'0'),(1870,734,'0'),(1871,735,'0'),(1872,736,'0'),(1873,737,'0'),(1874,738,'0'),(1875,739,'0'),(1876,740,'0'),(1877,741,'0'),(1878,742,'0'),(1879,743,'0'),(1880,744,'0'),(1881,745,'0'),(1882,746,'0'),(1883,747,'0'),(1884,748,'0'),(1885,749,'0'),(1886,750,'0'),(1887,751,'0'),(1888,752,'0'),(1889,753,'0'),(1890,754,'0'),(1891,755,'0'),(1892,756,'0'),(1893,757,'0'),(1894,758,'0'),(1895,759,'0'),(1896,760,'0'),(1897,761,'0'),(1898,762,'0'),(1899,763,'0'),(1900,764,'0'),(1901,765,'0'),(1902,766,'0'),(1903,767,'0'),(1904,768,'0'),(1905,769,'0'),(1906,770,'0'),(1907,771,'0'),(1908,772,'0'),(1909,773,'0'),(1910,774,'0'),(1911,775,'0'),(1912,776,'0'),(1913,777,'0'),(1914,778,'0'),(1915,779,'0'),(1916,780,'0'),(1917,781,'0'),(1918,782,'0'),(1919,783,'0'),(1920,784,'0'),(1921,785,'0'),(1922,786,'0'),(1923,787,'0'),(1924,788,'0'),(1925,789,'0'),(1926,790,'0'),(1927,791,'0'),(1928,792,'0'),(1929,793,'0'),(1930,794,'0'),(1931,795,'0'),(1932,796,'0'),(1933,797,'0'),(1934,798,'0'),(1935,799,'0'),(1936,800,'0'),(1937,801,'0'),(1938,802,'0'),(1939,803,'0'),(1940,804,'0'),(1941,805,'0'),(1942,806,'0'),(1943,807,'0'),(1944,808,'0'),(1945,809,'0'),(1946,810,'0'),(1947,811,'0'),(1948,812,'0'),(1949,813,'0'),(1950,814,'0'),(1951,815,'0'),(1952,816,'0'),(1953,817,'0'),(1954,818,'0'),(1955,819,'0'),(1956,820,'0'),(1957,821,'0'),(1958,822,'0'),(1959,823,'0'),(1960,824,'0'),(1961,825,'0'),(1962,826,'0'),(1963,827,'0'),(1964,828,'0'),(1965,829,'0'),(1966,830,'0'),(1967,831,'0'),(1968,832,'0'),(1969,833,'0'),(1970,834,'0'),(1971,835,'0'),(1972,836,'0'),(1973,837,'0'),(1974,838,'0'),(1975,839,'0'),(1976,840,'0'),(1977,841,'0'),(1978,842,'0'),(1979,843,'0'),(1980,844,'0'),(1981,845,'0'),(1982,846,'0'),(1983,847,'0'),(1984,848,'0'),(1985,849,'0'),(1986,850,'0'),(1987,851,'0'),(1988,852,'0'),(1989,853,'0'),(1990,854,'0'),(1991,855,'0'),(1992,856,'0'),(1993,857,'0'),(1994,858,'0'),(1995,859,'0'),(1996,860,'0'),(1997,861,'0'),(1998,862,'0'),(1999,863,'0'),(2000,864,'0'),(2001,865,'0'),(2002,866,'0'),(2003,867,'0'),(2004,868,'0'),(2005,869,'0'),(2006,870,'0'),(2007,871,'0'),(2008,872,'0'),(2009,873,'0'),(2010,874,'0'),(2011,875,'0'),(2012,876,'0'),(2013,877,'0'),(2014,878,'0'),(2015,879,'0'),(2016,880,'0'),(2017,881,'0'),(2018,882,'0'),(2019,883,'0'),(2020,884,'0'),(2021,885,'0'),(2022,886,'0'),(2023,887,'0'),(2024,888,'0'),(2025,889,'0'),(2026,890,'0'),(2027,891,'0'),(2028,892,'0'),(2029,893,'0'),(2030,894,'0'),(2031,895,'0'),(2032,896,'0'),(2033,897,'0'),(2034,898,'0'),(2035,899,'0'),(2036,900,'0'),(2037,901,'0'),(2038,902,'0'),(2039,903,'0'),(2040,904,'0'),(2041,905,'0'),(2042,906,'0'),(2043,907,'0'),(2044,908,'0'),(2045,909,'0'),(2046,910,'0'),(2047,911,'0'),(2048,912,'0'),(2049,913,'0'),(2050,914,'0'),(2051,915,'0'),(2052,916,'0'),(2053,917,'0'),(2054,918,'0'),(2055,919,'0'),(2056,920,'0'),(2057,921,'0'),(2058,922,'0'),(2059,923,'0'),(2060,924,'0'),(2061,925,'0'),(2062,926,'0'),(2063,927,'0'),(2064,928,'0'),(2065,929,'0'),(2066,930,'0'),(2067,931,'0'),(2068,932,'0'),(2069,933,'0'),(2070,934,'0'),(2071,935,'0'),(2072,936,'0'),(2073,937,'0'),(2074,938,'0'),(2075,939,'0'),(2076,940,'0'),(2077,941,'0'),(2078,942,'0'),(2079,943,'0'),(2080,944,'0'),(2081,945,'0'),(2082,946,'0'),(2083,947,'0'),(2084,948,'0'),(2085,949,'0'),(2086,950,'0'),(2087,951,'0'),(2088,952,'0'),(2089,953,'0'),(2090,954,'0'),(2091,955,'0'),(2092,956,'0'),(2093,957,'0'),(2094,958,'0'),(2095,959,'0'),(2096,960,'0'),(2097,961,'0'),(2098,962,'0'),(2099,963,'0'),(2100,964,'0'),(2101,965,'0'),(2102,966,'0'),(2103,967,'0'),(2104,968,'0'),(2105,969,'0'),(2106,970,'0'),(2107,971,'0'),(2108,972,'0'),(2109,973,'0'),(2110,974,'0'),(2111,975,'0'),(2112,976,'0'),(2113,977,'0'),(2114,978,'0'),(2115,979,'0'),(2116,980,'0'),(2117,981,'0'),(2118,12,'A'),(2119,12,'A'),(2120,12,'A'),(2121,12,'A'),(2122,12,'0'),(2123,12,'0'),(2124,12,'0'),(2125,12,'0'),(2126,12,'0'),(2127,12,'0'),(2138,12,'0'),(2159,12,'0'),(2170,0,'0'),(2171,1,'0'),(2172,2,'0'),(2173,3,'0'),(2174,4,'0'),(2175,5,'0'),(2176,6,'0'),(2177,7,'0'),(2178,8,'0'),(2179,9,'0'),(2180,12,'0'),(2181,12,'A'),(2182,12,'A'),(2183,12,'A'),(2184,12,'A'),(2195,0,'0'),(2196,1,'0'),(2197,2,'0'),(2198,3,'0'),(2199,4,'0'),(2200,5,'0'),(2201,6,'0'),(2202,7,'0'),(2203,8,'0'),(2204,9,'0'),(2205,12,'Awith handlers'),(2206,12,'A+GP'),(2207,12,'A'),(2208,12,'Awith handlers'),(2209,12,'A+GP'),(2210,12,'A'),(4211,12,'A'),(4212,12,'A'),(4213,12,'Awith handlers'),(4216,12,'Awith handlers'),(4217,12,'Awith handlers'),(4218,12,'Awith handlers'),(4219,0,'Awith handlers'),(4220,1,'Awith handlers'),(4221,2,'Awith handlers'),(4222,3,'Awith handlers'),(4223,4,'Awith handlers'),(4224,5,'Awith handlers'),(4225,6,'Awith handlers'),(4226,7,'Awith handlers'),(4227,8,'Awith handlers'),(4228,9,'Awith handlers');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-25 22:48:13
