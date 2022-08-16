# HR-API
Projet HR sur Openclassroom avec des entites ajoutés notamment Service et Poste
Structurer selon que l entreprise a plusieurs services comme le service Marketing, Apres ventes, Infographie, Technique.Chaque service a des poste qui peuvent etre
disponible ou pas. Et les employes occupent les postes. 

-----------
Base de donnée H2
les donnes sont a copie en bas ici
+++++++++++++++++++++++++


INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES (2,'COMPTABILITE');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(2,'MARKETING');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(2,'CHEF TECHNIQUE');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(4,'TECHNIQUE');
INSERT INTO SERVICES(NBRE_POSTE,TITRE) VALUES(2,'APRES VENTES');



INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,1 , 'Comptable En Chef'),
(false ,1 , 'Comptable Adjoint');

INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,2 , 'Community Manager');
INSERT INTO POSTES(disponible,id_service,titre) VALUES(false ,2 , 'Chef Marketing');

INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,3 , 'Chef Technique Java');
INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,3 , 'Chef Technique PHP');

INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,4 , 'Developpeur Java 1');
INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,4 , 'Developpeur Java 2');
INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,4 , 'Developpeur PHP 1');
INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,4 , 'Developpeur PHP 2');

INSERT INTO POSTES(disponible,id_service,titre) VALUES (false ,5 , 'Agent Apres vente 1');
INSERT INTO POSTES(disponible,id_service,titre) VALUES (false , 5, 'Agent Apres vente 2');

INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES
(  'Zango '  , 1  ,  'Abdoul Karim '  , 'zangokarim226@gmail.com  '   ,'NADA'    );


INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES (  'Ouedraogo ',2   ,  'Wendemi Bibata '  , 'wendemiBiba226@gmail.com  '   ,'NADA '    );



INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES ( 'Ilboudo', 3 ,  'Zakari '  , 'zakidjess226@gmail.com  '   ,'NADA'    );


INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES( 'Ouedraogo ',4   ,  'Eloi '  , 'eloiouedra226@gmail.com  '   ,'NADA '    );



INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES (  'Konfe',5    ,  'Faissal '  , 'konfefaissail226@gmail.com  '   ,'NADA'    );

INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES ( 'Darga ',6     ,  'julda '  , 'elujuldadarga226@gmail.com  '   ,'NADA '    );



INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES( 'Ouedraogo',7    ,  'Souleymady '  , 'souleyouedraogo226@gmail.com  '   ,'NADA'    );


 INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES ( 'Nana ', 8  ,  'Boureima'  , 'nnboureinma226@gmail.com  '   ,'NADA '    );


INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES (  'Ilboudo',9   ,  'Lamine'  , 'lamineIldboudo226@gmail.com  '   ,'NADA'    );

 INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES ( 'Kere ' ,10  ,  'Isaac '  , 'eluihk226@gmail.com  '   ,'NADA '    );



INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES ( 'Nombre',11   ,  'Faissal '  , 'nombrefaissail226@gmail.com  '   ,'NADA'    );

INSERT INTO EMPLOYES
(first_name,id_poste,last_name,mail,mot_de_passe) VALUES (  'Darga ' ,12  ,  'Eloise '  , 'eluleloisedarga226@gmail.com  '   ,'NADA '    );

+++++++++++++++++++++++++++++++++++++++++
Voila de quoi vous rejouir n est ce pas ?
++++++++++++++++++++++++++++++++++++++++++++
Certains request ne fonctionnent pas avec les classes Test mais avec POST man et je me demande pourquoi. Quoi qu il en soit je vais trouver le Why et le resoudre.
En bon attendant salut
