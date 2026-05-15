package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed(); // préremplissage
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    private void seed() {
        data.add(new Produit("BARBECUED CHICKEN PIZZA", 3.0,
                com.example.pizzarecipes.R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves\n- 1 cup barbecue sauce...",
                "Pizza au poulet barbecue simple et rapide.",
                "STEP 1: Griller le poulet.\nSTEP 2: Garnir et cuire."));
        data.add(new Produit("SPINACH PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza2, "25 min",
                "- Sauce Alfredo, épinards, tomates, fromage.",
                "Pizza crémeuse et légère aux légumes.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Crunchy PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza3, "15 min",
                "- Sauce Tomates, pipo, tomates, fromage.",
                "Pizza crunchy.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Fatouch PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza4, "37 min",
                "- Sauce Tomates, fatouch, tomates, fromage.",
                "Pizza crunchy.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Papirino PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza5, "24 min",
                "- Sauce Tomates, papirino, tomates, fromage.",
                "Pizza simple.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Love PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza6, "10 min",
                "- Sauce Tomates, love, tomates, fromage.",
                "Pizza avec love.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Weird PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza7, "45 min",
                "- Sauce Tomates, bizzard, tomates, fromage.",
                "Pizza bizzard.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Funny PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza8, "30 min",
                "- Sauce Tomates, drole, tomates, fromage.",
                "Pizza avec fun.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Happy PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza9, "19 min",
                "- Sauce Tomates, joie, tomates, fromage.",
                "Pizza souriante.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        data.add(new Produit("Final PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza10, "27 min",
                "- Sauce Tomates, fun, tomates, fromage.",
                "Pizza final.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}
