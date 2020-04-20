# GEN - Laboratoire 3
_Auteurs : Clarisse Fleurimont et Matthieu Burguburu_

## Objectifs
- Mettre en oeuvre les deux premières itérations du jeu du monopoly
- Apprendre à utiliser les annotation et assertion de JUnit
- Pratiquer l'utilisation de Git, Maven et Travis en les configurant nous-mêmes afin que Travis fasse tourner nos tests unitaires à chaque pull request

## Itération 1
- Les joueurs bougent sur les cases du plateau de jeu
- Deux à huit joueurs peuvent jouer
- Une partie est une série de 20 tours. Durant un tour, chaque joueur fait une suite d'actions. Durant son tour, le joueur avance son pion dans le sens des aiguilles d'une montre sur le plateau, du nombre de cases correspondant au nombre obtenu avec les deux dès 
- Après un lancé de dés, le nom du joueur et le résultat des dés sont affichés. Quand un joueur arrive sur une case, le nom du joueur ainsi que celui de la case sont affichés.
- Chaque case possède un nom. Le pion de chaque joueur commence sur la case "Go" au début du jeu. Les noms des cases sont : Go, Square 1, Square 2, ..., Square 39
- Faire une simulation ne nécessitant pas d'entrée utilisateur autre que le nombre de joueurs.

## Itération 2
- Tous les joueurs reçoivent $1500 au début du jeu
- Lorsqu'un joueur arrive sur la case "Go", ce joueur reçoit $200
- Lorsqu'un joueur arrive sur la case "Go-To-Jail", ce joueur doit aller sur la case "Jail"
- Au tour suivant son entrée dans la case "Jail", un joueur quitte la-dite case comme il le ferai pour une case normale
- Lorsqu'un joueur arrive sur la case "Income-Tax" il doit payer un minimum de $200 ou 10% de leurs possession ("worth")