DROP TABLE IF EXISTS Services;
DROP TABLE IF EXISTS Postes;
DROP TABLE IF EXISTS Employes;

CREATE TABLE Services(id int primary KEY not null AUTO_INCREMENT,titre varchar(30),nbrePoste int);
CREATE TABLE Postes(id int PRIMARY KEY NOT NULL AUTO_INCREMENT,idService int,titre varchar(30), disponible boolean,CONSTRAINT key_Poste_Servic FOREIGN KEY (idService) REFERENCES Services(id));
CREATE TABLE Employes(id int,idPoste int,firstName varchar(50),lastName varchar(50),mail varchar(50),motDePasse varchar(15),CONSTRAINT key_employe_poste FOREIGN KEY (idPoste) REFERENCES Postes(id));

