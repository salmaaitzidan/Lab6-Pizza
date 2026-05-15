# 🍕 PizzaRecipes Android App

##  Description
PizzaRecipes est une application Android simple permettant d’afficher une liste de pizzas ainsi que leurs détails (image, prix, durée, ingrédients, description et étapes de préparation).

L’application est structurée selon une architecture propre en couches :
**DAO / Service / Adapter / UI (Activities)**

---

## Architecture du projet

Le projet est organisé comme suit :

1. **DAO (Data Access Object)**  
   Définit les opérations de base (CRUD) pour la gestion des données.

2. **Service (ProduitService)**  
   Gère la logique métier et stocke les données en mémoire.

3. **Adapter (PizzaAdapter)**  
   Permet d’afficher les données dans une liste (ListView).

4. **Activities (UI)**  
   Gèrent les écrans et l’interaction utilisateur :
   - Splash Screen
   - Liste des pizzas
   - Détails d’une pizza

---

##  Démonstration

###  Splash Screen
<img width="281" height="603" alt="Splash Screen" src="https://github.com/user-attachments/assets/d3e18f53-e5b3-40d1-8a6d-fc8008ad9918" />

---

###  Liste des pizzas
<img width="284" height="604" alt="Liste des pizzas" src="https://github.com/user-attachments/assets/6959e9d4-ac2d-4cb0-bf34-df2273cfab5c" />

---

###  Détails des pizzas
<img width="285" height="611" alt="Détails pizza 1" src="https://github.com/user-attachments/assets/bc92312d-2a32-4209-9962-b99aa2c26148" />

<img width="281" height="612" alt="Détails pizza 2" src="https://github.com/user-attachments/assets/7cb1d438-d68c-4ef7-adbc-b7a9f30aa54f" />

---



## ✨ Auteur
Projet réalisé dans un cadre académique pour apprendre l’architecture Android en couches (DAO / Service / Adapter / UI).
