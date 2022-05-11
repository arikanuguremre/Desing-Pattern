package com.dp;

import com.dp.decoratorpattern.BasicCar;
import com.dp.decoratorpattern.Car;
import com.dp.decoratorpattern.LuxuryCar;
import com.dp.decoratorpattern.SportsCar;
import com.dp.singleton.EagerInitializedSingleton;
import com.dp.strategypattern.CreditCardStrategy;
import com.dp.strategypattern.Item;
import com.dp.strategypattern.PaypalStrategy;
import com.dp.strategypattern.ShoppingCart;

public class Main {

    public static void main(String[] args) {
/*
        //Testing Singleton********************
        EagerInitializedSingleton onlyOneInstance=EagerInitializedSingleton.getInstance();
        onlyOneInstance.show();

        EagerInitializedSingleton anotherButSameAddress=EagerInitializedSingleton.getInstance();

        //We cannot create another new  instance b/c constructor is private;
        //EagerInitializedSingleton anotherInstance = new EagerInitializedSingleton();


        //to ensure the same address
        System.out.println(onlyOneInstance);
        System.out.println(anotherButSameAddress);
        //**********************************************

        //Testing Strategy Pattern
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    */

        //Decorator Pattern Test

        Car sportCar = new SportsCar(new BasicCar());
        sportCar.assemble();
        System.out.println("\n*******");

        Car sportsLuxuryCar = new  SportsCar(new LuxuryCar(new BasicCar()));

        sportsLuxuryCar.assemble();

    }
}

