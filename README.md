# Documentation

### The program consist of one Jframe window and 3 dialog windows

- Main (Jframe/Main Window)
- AddToCartDialog (Dialog Window)
- AddToCartDialogForAccessories (Dialog Window)
- BuyDialog (Dialog Window)

---

### DataStoring
Datas are locally stored in the program but not permanently. It is only stored in 2 Global variables of which are ArryLists.
 
This stores a product (Tops) that the user want's to buy
```java
ArrayList<Top> cart =  new ArrayList<>();
```
This stores a product (Accessories) that the user want's to buy
```java
ArrayList<Accessory> cartAccessory = new ArrayList<>();
```
---

### Main Window Functionalities

The main window consists of a cardlayout and buttons to change the focus of the cardlayout.

There are 5 buttons each card in the card layout (Tops, Accesories, History, Cart, And Size card).

If one of the buttons is trigerred a function is called for each buttons. A button has it's on corresponding funtion with a similar syntax and login.

```java
private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {
    // removes all cards in the cardlayout
    cards.removeAll();
    
    // adds the corresponding card in the card layout
    cards.add(cartcard);

    // renders the change in the frame
    cards.repaint();
    cards.revalidate();
}
```

Fucntionalities in Tops and Accessories card. There are multiple Top shirt products like basic-tees, hoodies, and bracelet. Each product has its own correspoding button and if the button is clicked it will show a dialog window.

```java
private void add8ballActionPerformed(java.awt.event.ActionEvent evt) {

    // Takes an image of the product to show in the dialog
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/8ballfront.png"));

    // Creates and object of a Product class
    Product product = new Product(icon, "HYPERPLAYER 8BALL", 500);

    // Calls addingProduct to dispay a dialog window and inputs the product object
    addingProduct(product);

    // If the product is Accessory this method is called instead
    // addingProductAccessory(accessory);
}
```

These are the functions that will be called just in case:
```java
// For Tops
private void addingProduct(Product product) {
    // Creates a AddToCartDialog
    AddToCartDialog dialog = new AddToCartDialog(this, true, product, cart);

    // Shows the Dialog
    dialog.setVisible(true);
}

// For Accesssories
private void addingProductAccessory(Product product) {
    // Creates a AddToCartDialogForAccessory
    AddToCartDialogForAccessories dialog = new AddToCartDialogForAccessories(this, true, product, cartAccessory);
    
    // Shows the Dialog
    dialog.setVisible(true);
}
```

### AddToCartDialog (For tops Products)

In this Dialog the there multiple radio buttons to choose from and labeled for different sizes. It has a textfield for inputting the amount of a the user want and an Add to cart button

The Dialog has 3 local variables that stores data from the parent Jframe (Main) so the dialog can those variables for changing and adding products in the cart.

```java
// This stores the cart for tops that is from the Jframe parent
ArrayList<Top> cart;

// This Stores the Product that the user wants
Product product;

// This stores the parent Jframe for renderring purpose
Main parent;
```

Dialog's Constructor
``` java
// Takes the parent jframe, modal state, product that the user wants, and the cart to store the item
public AddToCartDialog(java.awt.Frame parent, boolean modal, Product product, ArrayList<Top> cart) {
    //passed the parameters to the super class's constructor
    super(parent, modal);
    initComponents();

    // stores the parent
    this.parent = (Main) parent;

    // Displays necessary data
    this.setTitle(product.getProductName());
    setLocationRelativeTo(null);
    shirtIcon.setIcon(product.getProductIcon());
    shirtname.setText(product.getProductName());
    price.setText(String.format(
            "Price: %.2f Pesos", 
            product.getProductPrice()));
    
    // stores the cart and product
    this.cart = cart;
    this.product = product;
}

```


For ever radio button in the dialog there is a corresponding fuction with similar logic
```java
private void xsmallActionPerformed(java.awt.event.ActionEvent evt) {

    deselectAll();
    xsmall.setSelected(true);
    
}
```

When radiobutton is clicked a function is also called for deselecting all the radio buttons before selecting the radiobutton
```java
private void deselectAll() {
    xsmall.setSelected(false);
    small.setSelected(false);
    medium.setSelected(false);
    large.setSelected(false);
    xlarge.setSelected(false);
    xxxlarge.setSelected(false);
}
```

When the add to cart button is clicked it trigerrs the function below

```java
private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {

    // This will store the amount of the proucts
    int intAmount;
    
    try {
        //Storing and conversion of the amount into integer
        intAmount = Integer.parseInt(amount.getText());
    } catch (Exception e) {
        // When an Error/Exception is accoured the funtions return
        // instead of continuing or sending message
        return;
    }
    
    // This stores the size
    String size = null;
    boolean hasSize = false;
    
    // Checks all the radio button to store the 
    // right size in the size variable
    if (xsmall.isSelected()) {
        size = "X-Small";
        hasSize = true;
    }
    
    if (small.isSelected()) {
        size = "Small";
        hasSize = true;
    }
    
    if (medium.isSelected()) {
        size = "Medium";
        hasSize = true;
    }
    
    if (large.isSelected()) {
        size = "Large";
        hasSize = true;
    }
    
    if (xlarge.isSelected()) {
        size = "X-Large";
        hasSize = true;
    }
    
    if (xxxlarge.isSelected()) {
        size = "XXX-Large";
        hasSize = true;
    }
    
    // Checks if there are no selected radio button
    // if there is the the functions return
    if (!hasSize) {
        return;
    }
    
    // Checks all the item in the cart
    for (Top orderOnCart: cart) {
        
        // Checks the item if already in the cart
        if (orderOnCart.getProductName().equals(product.getProductName())
                && orderOnCart.getSize().equals(size)) {
            
            // Adds the amount in the cart
            orderOnCart.addAmount(intAmount);
            
            // This reders the changes in the cart card
            parent.renderCartPanel();

            // Closes, Disposes it, and then returns from the function
            setVisible(false);
            dispose();
            return;
        }
        
    }
    
    // If the item is not found we make the item
    Top order = new Top(
            product.getProductIcon(), 
            product.getProductName(), 
            product.getProductPrice(),
            intAmount,
            size);
    
    // adds the item in the cart for the tops products
    cart.add(order);        
    
    // renders the changes in the cart card
    parent.renderCartPanel();
    
    // closes the dialog
    setVisible(false);
    dispose();
}
```
---

### AddToCartDialogForAccessories (For Accessory Products)

This dialog is very similar to the AddToCartDialog it has the same attributes but the cart is for the Accessory class and a additional boolean attribute for checking a specific accessory product which is false by default.

The dialog has 5 radio buttons (unselected by default) for choosing different colors but these radios are disabled if the accessory that the user want is not "DON'T LET THE ENEMY BRACELET" accessory

```java
public AddToCartDialogForAccessories(java.awt.Frame parent, boolean modal, Product product, ArrayList<Accessory> cart) {

    // Similar to AddToCartDialog Class
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(null);
    this.parent = (Main) parent;
    setTitle(product.getProductName());
    icon.setIcon(product.getProductIcon());
    icon.repaint();
    icon.revalidate();
    name.setText(product.getProductName());
    price.setText(String.format(
            "Price: %.2f Pesos",
            product.getProductPrice()
    ));
    this.cart = cart;
    this.product = product;

    // checks if its the DONT LET THE ENEMY BRACELET
    if (product.getProductName().equals("HYPERPLAYER DONT LET THE ENEMY")) {
        // sets the boolean attribute to true
        isDLTE = true;
        silver.setEnabled(true);
        black.setEnabled(true);
        yellow.setEnabled(true);
        red.setEnabled(true);
        brown.setEnabled(true);
    }
}
```

When a radio button is clicked a logic and methods accurs that is similar from the previous dialog.

The dalog has also the same add to cart button functionality but with a different approach.

```java
private void addActionPerformed(java.awt.event.ActionEvent evt) {
    
    // Stores amount and color
    int intAmount;
    String color = "";
    
    // same try and catch from the previous dialog
    try {
        intAmount = Integer.parseInt(amount.getText());
    } catch (Exception e) {
        return;
    }
    
    // checks if the product is 
    if (isDLTE && !red.isSelected() 
            && !yellow.isSelected() && !black.isSelected()
            && !brown.isSelected() && !silver.isSelected()) {
        return;
    }
    
    // Checks what radio is selected
    if (red.isSelected()) 
        color = " - RED";
    
    if (yellow.isSelected()) 
        color = " - YELLOW";
    
    if (black.isSelected()) 
        color = " - BLACK";
    
    if (brown.isSelected()) 
        color = " - BROWN";
    
    if (silver.isSelected())
        color = " - SILVER";
    
    // The following code is similar to the previous dialog
    for (Accessory acc: cart) {
        
        if (acc.getProductName().equals(product.getProductName())) {
            acc.addAmount(intAmount);
            parent.renderCartPanel();
            return;
        }
        
    }
    
    Accessory accessory = new Accessory(
            product.getProductIcon(), 
            product.getProductName(), 
            product.getProductPrice(),
            intAmount);
    accessory.setColor(color);
    
    cart.add(accessory);
    parent.renderCartPanel();
    
    setVisible(false);
    dispose();
}
```

### Additional Panel (For displaying in the cart)

ProductOnCartPanel is a panel for displaying products in the cart. it is it's own class instead of being hardcoded in the Main class

It has for has 5 attributes. 1 for the parent Jframe (Main), 2 for the 2 carts from the parent, and 2 for the item but are set null by default.

The Panel has 2 constructors and very similar except for the parameter both takes the parent as parameter but the first constructor take an item in Top class, and the other one is the cart to Top products while on the other hand take an Accessory class and the cart for accessories.

```java
// First Constructor
public ProductOnCartPanel(Main parent,Top item, ArrayList<Top> cart) {
    initComponents();

    // Stores the paramenters in the corresponding atrributes
    this.parent = parent;
    itemTop = item;
    cartTop = cart;

    // Dislplays the necessary data and the panel
    this.size.setText(item.getSize());
    this.name.setText(itemTop.getProductName());
    this.icon.setIcon(itemTop.getProductIcon());
    this.amount.setText(itemTop.getAmount()+"");
    this.total.setText(String.format("PHP %.2f", itemTop.getTotal()));
    setVisible(true);
}

// Second Constructor
public ProductOnCartPanel (Main parent, Accessory acc, ArrayList<Accessory> cart) {
    initComponents();

    // Stores the paramenters in the corresponding atrributes
    this.parent = parent;
    itemAcc = acc;
    cartAcc = cart;

    // Dislplays the necessary data and the panel
    this.size.setText("");
    this.name.setText(itemAcc.getProductName());
    this.icon.setIcon(itemAcc.getProductIcon());
    this.amount.setText(itemAcc.getAmount()+"");
    this.total.setText(String.format("PHP %.2f", itemAcc.getTotal()));
    setVisible(true);
}
```

The Panel has 4 buttons for 4 different functionalities (Add, Minus, Delete, Buy)

    Add Function

```java
private void addActionPerformed(java.awt.event.ActionEvent evt) {
    
    // Checks which of the Accessory or Top attribute are not null and adds one amount of the item and displays the new item
    if (itemTop != null) {
        itemTop.addAmount(1);
        amount.setText(itemTop.getAmount()+"");
        total.setText(String.format("PHP %.2f", itemTop.getTotal()));
    } else {
        itemAcc.addAmount(1);
        amount.setText(itemAcc.getAmount()+"");
        total.setText(String.format("PHP %.2f", itemAcc.getTotal()));
    }
    
    // renders changes
    parent.renderCartPanel();
}
```

    Minus Function
```java
private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
    
    // Checks which of the Accessory or Top attribute are not null and minus by one amount of the item and displays the new item
    if (itemTop != null) {
        itemTop.decreamentAmount();
        amount.setText(itemTop.getAmount()+"");
        total.setText(String.format("PHP %.2f", itemTop.getTotal()));
        
        // if the the amount is zero the item is removed from its corresponding cart
        if (itemTop.getAmount() == 0) 
              deleteItem(itemTop);
        
    } else {
        itemAcc.decreamentAmount();
        amount.setText(itemAcc.getAmount()+"");
        total.setText(String.format("PHP %.2f", itemAcc.getTotal()));
        
        // if the the amount is zero the item is removed from its corresponding cart
        if (itemAcc.getAmount() == 0) 
            deleteItem(itemAcc);
    }

    // renders changes
    parent.renderCartPanel();
}
```

    Delete Function

```java
private void deleteActionPerformed(java.awt.event.ActionEvent evt) {

    // Checks what item is null and deletes it with the deleteItem function
    if (itemTop != null) 
        deleteItem(itemTop);
    else
        deleteItem(itemAcc);

    // renders changes
    parent.renderCartPanel();
}
```

    deleteItem Function

``` java
// Deltes item (Top class)
public void deleteItem(Top item) {
    
    // For storing the index of the item
    int index = -1;
    
    // Checks the items in it's cart one by one
    for (int i = 0; i < cartTop.size(); i++) {
        
        // takes an item by index
        Top itemOnCart = cartTop.get(i);

        // checks if its the same item Top class
        if (itemTop.getProductName().equals(itemOnCart.getProductName())
            && itemTop.getSize().equals(itemOnCart.getSize())) {
            
            // stores the index and breaks the loop
            index = i;
            break;
        }
    }
    
    // returns if the index variable dint change
    if (index == -1) return;
    
    // removes the item in it's cart
    cartTop.remove(index);
}

// Deltes item (Acccessory class)
public void deleteItem(Accessory item) {
    
    // For storing the index of the item
    int index = -1;
    
    // Checks the items in it's cart one by one
    for (int i = 0; i < cartAcc.size(); i++) {

        // takes an item by index
        Accessory itemOnCart = cartAcc.get(i);

        // checks if its the same product
        if (itemAcc.getProductName().equals(itemOnCart.getProductName())) {
            index = i;
            break;
        }
    }

    // returns if the index variable dint change
    if (index == -1) return;
    
    // removes the item in it's cart
    cartAcc.remove(index);
}
```

    Buy Function

``` java
private void buyActionPerformed(java.awt.event.ActionEvent evt) {

    // Creates a variable for buy dialog
    BuyDialog bd;
    
    // checkes which item is not null and creates a new buy dialog for the item
    if (itemTop != null) 
        bd = new BuyDialog(parent, true, cartTop, itemTop);
    else 
        bd = new BuyDialog(parent, true, cartAcc, itemAcc);
    
    // displays the dialog
    bd.setVisible(true);
}
```

### BuyDialog window

This window dialog isactivated when the user whats to check out a product from his/her carts

Its has the same Attributes and constructors as the ItemOnCartPanel and also the deleteItem fucntion.

This dialog has a textfield for inputing payments, a combobox for payment method what the user wants and a buy button.

A function is trigerred when the user changes the selected item in the combobox

``` java
 private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    
    // checks if the selected item is Online Payment
    if ("Online Payment".equals(jComboBox1.getSelectedItem())) 
        // sets the textfiled to editable
        cash.setEditable(true);
    else {
        // sets the textfiled to not editable and clears the textfield
        cash.setEditable(false);
        cash.setText("");
    }
}
```

### Product class

Product class is for creating objects for the items that is not on the carts. It has 3 attributes name, icon (ImageIcon), and price.

It's constructor takes parameter that corresponds to the class's attributes.

``` java
Product(ImageIcon icon, String name, double price) {
    this.name = name;
    this.icon = icon;  
    this.price = price;
}
```

It also has getter functions for the attributes because its all private.

``` java

public class Product {
    
    // attributes
    String name;
    private ImageIcon icon;
    double price;
    
    Product(ImageIcon icon, String name, double price) {
        this.name = name;
        this.icon = icon;  
        this.price = price;
    }
    
    // returns price
    public double getProductPrice() {
        return this.price;
    }

    // returns name
    public String getProductName() {
        return this.name;
    }

    // returns icon
    public ImageIcon getProductIcon() {
        return this.icon;
    }
    
}
```

### Top class

Top class is for creating objects that are t-shirts or hoodie. It Inherites The Product class and abstract it's data. It has it's own attributes for size, amount, and total and methods.

```java
public class Top extends Product{
    
    // Attributes
    private String size;
    private int amount;
    private double total;
    
    // Takes the same parameter as it's super class but also takes its own parameters for it's own attributes
    Top(ImageIcon icon, String name, double price, int amount, String size) {
        super(icon, name, price);
        this.size = size;
        this.amount = amount;
        this.total = this.price * this.amount;
    }
    
    // adds an amount to the already existing amount and changes the total
    public void addAmount(int amount) {
        this.amount += amount;
        this.total = this.price * this.amount;
    }
    
    // returns the amount of the item in the cart
    public int getAmount() {
        return this.amount;
    }
    
    // decrease the amount by 1 and changing the total
    public void decreamentAmount() {
        this.amount--;
        this.total = this.price * this.amount;
    }
    
    // returns total
    public double getTotal() {
        return this.total;
    }
    
    // returns the size
    public String getSize() {
        return this.size;
    } 
}
```

### Accessory class

Accessory class is for creating objects that are Accessory products. It Inherites The Product class and abstract it's data. It has it's own attributes for amount, and total and methods.

```java
public class Accessory extends Product{
    
    // attributes
    private int amount;
    private double total;
    
    // constructor that kaes the same paramers as it's super class but also takes new parameter for the class's attributes
    Accessory(ImageIcon icon, String name, double price, int amount) {
        super(icon, name, price);
        this.amount = amount;
        this.total = price * amount;
    }
    
    // this method is only used when the acccessory is 
    // DONT LET THE ENEMY
    // its sets color or the accessory but the string parameter is instead concatinated o the name
    public void setColor(String color) {
        super.name = super.name + color;
    }
    
    // returns the amount of the item in the cart
    public void addAmount(int amount) {
        this.amount += amount;
        this.total = this.price * this.amount;
    }
    
    // decrease the amount by 1 and changing the total
    public void decreamentAmount() {
        this.amount--;
        this.total = this.price * this.amount;
    }
    
    // returns the amount of the item in the cart
    public int getAmount() {
        return this.amount;
    }
    
    // returns total
    public double getTotal() {
        return this.total;
    }
    
}
```

# END OF DOCUMENTATION