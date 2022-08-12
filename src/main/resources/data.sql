DROP TABLE IF EXISTS Services;
DROP TABLE IF EXISTS Postes;
DROP TABLE IF EXISTS Employes;

CREATE TABLE Services(id int primary KEY not null AUTO_INCREMENT,titre varchar(30),nbrePoste int);
CREATE TABLE Postes(id int PRIMARY KEY NOT NULL AUTO_INCREMENT,idService int,titre varchar(30), disponible boolean,CONSTRAINT key_Poste_Servic FOREIGN KEY (idService) REFERENCES Services(id));
CREATE TABLE Employes(id int,idPoste int,firstName varchar(50),lastName varchar(50),mail varchar(50),motDePasse varchar(15),CONSTRAINT key_employe_poste FOREIGN KEY (idPoste) REFERENCES Postes(id));



INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES (2,'COMPTABILITE');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(2,'MARKETING');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(2,'CHEF TECHNIQUE');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(4,'TECHNIQUE');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(2,'APRES VENTES');


INSERT INTO POSTES(disponible,id_service,titre) VALUES
(false ,1 , 'Comptable En Chef'),
(false ,1 , 'Comptable Adjoint'),

(false ,2 , 'Community Manager'),
(false ,2 , 'Chef Marketing'),

(false ,3 , 'Chef Technique Java'),
(false ,3 , 'Chef Technique PHP'),

(false ,4 , 'Developpeur Java 1'),
(false ,4 , 'Developpeur Java 2'),
(false ,4 , 'Developpeur PHP 1'),
(false ,4 , 'Developpeur PHP 2'),

(false ,5 , 'Agent Apres vente 1'),
(false , 5, 'Agent Apres vente 2');