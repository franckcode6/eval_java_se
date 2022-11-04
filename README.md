Bon, on a récupéré une mission pas terrible...

Le PO nous a confié ce code de jeu d'échec fait par son fils dans le cadre d'un examen.
Il est bien parti, mais il manque des choses.

Le PO nous a demandé de donner un coup de main à son prodige, afin qu'il puisse enfin valider l'UE de Java qu'il repasse pour la quatrième année.

Le code est par endroit très propre, par endroit c'est un enfer.

--Ne te laisse pas impressioner par la logique métier en place. Plein de code semble bon(logique des mouvements, création/print de l'échiquier...), inutile de la modifier (mais il faut identifier pour ne pas la modifier!)--

Quoi qu'il en soit, il faut :

.Réparer les erreurs et faire en sorte que le projet se lance.

Comme c'est un projet scolaire, il faut être carré avec les normes :
.Netoyer le code.

.Un seul package... Imagine!

.Par contre, il a mélangé anglais/francais. J'ai vu un endroit où ca coinçait, je sais plus où (un switch?).

En fonctionnalités manquantes, on a :
.Un petit DDC informel serait pas mal, histoire d'y voir plus clair?

.Le nom des joueurs est impersonel, il faudrait demander aux joueurs pour personnaliser. Ca serait pas mal de mettre en place une page qui recence tous les joueurs.

.Je ne sais pas comment il a fait, mais toutes les pièces ont du code sauf la Reine. Apres, c'est un mix entre la Tour et le Fou, ca devrait être faisable.

.Il serait pas mal de faire un petit blabla à destination du fiston, pour qu'il sache ce qu'"il" a fait sur "son" projet. Avec un avis général+quelques détails sur le code, ca peut être pas mal.

Tu t'y prends comme tu veux, mais le projet doit être prêt aujourd'hui.

PETIT BLABLA A DESTIONATION DU FISTON :)

Le travail effectué était quasi terminé, mise à part quelques, deja gros soucis dans la méthode main de la classe Executeur, là où se lance l'application. Il manquait le static à la méthode main ainsi que le paramètre qui n'était pas bon String[] à la place Character[]. De plus, il faut utiliser l'objet g au lieu de reprendre la classe Game pour lancer le jeu.

Pas mal de soucis d'indentation, sauts de ligne inutiles et de visibilité des attributs et des méthodes dans les classes, notemment dans celle de Roi. Une fois ceci fait, il faut utiliser les getters/setters dans la méthode update() de la classe Game.

Je me suis permis de rajouter la possibilité de permettre au joueurs d'indiquer leur nom en début de partie.

Dans la classe Joueur, une petite inversion dans les couleurs affectait l'affichage des pièces sur l'échiquier. Au niveau de l'échiquier, dans la méthode afficherEchiquier(), le switch de pièces utilisait des case en anglais, ce qui ne correspond pas au nom de nos classes qui sont en français.

Au niveau des pièces, chaque classe fille de Piece implémente l'interface Mouvement, il n'y a pas besoin de celà. Piece étant la classe mère, on a juste à implémenter celle ci et les classes filles qui lui sont rattachées seront elles memes reliées à cette interface.

Pour la classe Reine, il manquait tout le contenu de la classe, le extend vers sa classe mère Pièce, son constructeur, sa méthode de mouvement qui était en gros un mélange entre celle du Fou et de la Tour, ainsi que sa méthode toString() pour l'affichage de ses coordonnées en console.
