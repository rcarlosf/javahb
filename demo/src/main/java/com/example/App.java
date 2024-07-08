package com.example;

import java.util.UUID;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;*/

import com.example.pizza.Ingredient;
import com.example.pizza.Pizza;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        Ingredient ingredient = Ingredient.create(UUID.randomUUID(), "tomate", 1D);
        Ingredient ingredient2 = Ingredient.create(UUID.randomUUID(), "aceitunas", 2D);
        
        UUID id = UUID.randomUUID();

        Pizza pizza1 = Pizza
            .builder()
            .setId(UUID.randomUUID())
            .setName("carbonara")
            .setDescription("pizza excelente")
            .setUrl("url")
            .build();

        Pizza pizza2 = Pizza
            .builder()
            .setId(UUID.randomUUID())
            .setName("4 estaciones")
            .setDescription("pizza mediocre")
            .setUrl("url")
            .build();

        /*Pizza pizza = Pizza.create(UUID.randomUUID(),
                "carbonara",
                "la mejor del mundo",
                "url");*/
                
        pizza1.addIngredient(ingredient);
        pizza1.addIngredient(ingredient);

        pizza2.addIngredient(ingredient);
        pizza2.addIngredient(ingredient2);

        pizza2.addIngredient(Ingredient.create(id, "chapiñones", 1.0D));
        

        //esto no se debería permitir
        //pizza.getIngredients().add(ingredient);

        System.err.println("Pizza 1 - Número de ingredientes: " + pizza1.getIngredients().size());
        System.err.println("Pizza 1 - Precio de la pizza: " + pizza1.getPrice());

        System.err.println("Pizza 2 - Número de ingredientes: " + pizza2.getIngredients().size());
        System.err.println("Pizza 3 - Precio de la pizza: " + pizza2.getPrice());

        // EntityBase entiy = new EntityBase(UUID.randomUUID());
        // System.out.println("Hello World!");
        //setup();
    }

    public static void setup() {
        /*final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(Events.class)
                .buildMetadata()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        var tr = session.beginTransaction();

        Events events = new Events();
        events.id = 1;

        session.persist(events);
        // var result = session.get(Events.class, 1);
        // session.remove(events);

        tr.commit();

        // var result = session.get(Events.class, 1);

        session.close();*/
    }
}