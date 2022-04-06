import java.text.DecimalFormat;

public class TestOrders {
    public static void main(String[] args) {
        // creating DecimalFormat to use decimals in this file.
        DecimalFormat df = new DecimalFormat(".00");

        // Menu items
        Item customer1Item = new Item();
        customer1Item.name = "Mocha";
        customer1Item.price = 4.15;

        Item customer2Item = new Item();
        customer2Item.name = "Green Tea Latte";
        customer2Item.price = 4.85;

        Item customer3Item = new Item();
        customer3Item.name = "Drip Coffee";
        customer3Item.price = 2.70;

        Item customer4Item = new Item();
        customer4Item.name = "Capuccino";
        customer4Item.price = 4.36;

        // Order variables -- order1, order2 etc.
        Order customerOrder1 = new Order();
        customerOrder1.name = "Cindhuri";
        System.out.println("Hello, " + customerOrder1.name + "! YOUR TOTAL IS: " + df.format(customerOrder1.total));
        customerOrder1.ready = true;
        System.out.println();
        System.out.println(customerOrder1.name + "! YOUR ORDER READY!: " + customerOrder1.ready);
        System.out.println();

        Order customerOrder2 = new Order();
        customerOrder2.name = "Jimmy";
        customerOrder2.items.add(customer1Item);
        customerOrder2.total += customer1Item.price;
        customerOrder2.ready = true;
        System.out.println("Hello, " + customerOrder2.name + "! YOUR ORDER READY!:  " + customerOrder2.ready);
        System.out.println();
        System.out.println(customerOrder2.name + "! YOUR TOTAL IS: " + df.format(customerOrder2.total));
        System.out.println();

        Order customerOrder3 = new Order();
        customerOrder3.name = "Noah";
        customerOrder3.items.add(customer4Item);
        customerOrder3.total += customer4Item.price;
        System.out.println(customerOrder3.name + "! YOUR TOTAL IS: " + df.format(customerOrder3.total));
        System.out.println();

        Order customerOrder4 = new Order();
        customerOrder4.name = "Sam";
        customerOrder4.items.add(customer2Item);
        customerOrder4.total += customer2Item.price;
        customerOrder4.items.add(customer2Item);
        customerOrder4.items.add(customer2Item);
        customerOrder4.total += (customer2Item.price * 2);
        System.out.println(customerOrder4.name + "! YOUR TOTAL IS: " + df.format(customerOrder4.total));
        System.out.println();
    }
}
