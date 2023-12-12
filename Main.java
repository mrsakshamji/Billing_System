import java.util.Scanner;

class FrontDesign
{
    void Design()
    {
        System.out.println("Welcome to Frydoo Billing Software!");
        System.out.println("1. Menu ");
        System.out.println("2. Add Product ");
        System.out.println("3. Exit ");
        System.out.println("Press 1 For Menu, Press 2 For Add Product & Press 3 For Exit");
    }
}

class Menu
{
    void MenuFirst()
    {

        System.out.println("Welcome to Cafe Yolo!");
        System.out.println("1. Pasta");
        System.out.println("2. Pizza");
        System.out.println("3. Main Course");
    }
}

class AddProduct
{
    void Add1()
    {
        System.out.println("ON WORKING");
    }
}

class Exit
{
    void Exit1()
    {
        System.out.println("ON WORKING");
    }
}

class Pasta
{
    void PastaShow()
    {
        System.out.println("NAME                        QUANTITY                       SELECT");
        System.out.println("1. Cheesey Pasta               1                              1");
        System.out.println("2. Alio E Olio Pasta           1                              2");
        System.out.println("3. Yolo Special Pasta          1                              3");
    }
}

class Pizza
{
    void PizzaShow()
    {
        System.out.println("1. Veg Pizza ");
        System.out.println("2. Corn Pizza ");
        System.out.println("3. Yolo Special Pizza ");
    }
}

class MainCourse
{
    void MainCourseShow()
    {
        System.out.println("1. Veg Fried Rice ");
        System.out.println("2. Fried Masala Papad ");
        System.out.println("3. Yolo Special Panner Pakoda ");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            // Object Create For Classes Start
            FrontDesign f1 = new FrontDesign();
            Menu m1 = new Menu();
            AddProduct a1 = new AddProduct();
            Exit e1 = new Exit();
            Pasta p1 = new Pasta();
            Pizza pi1 = new Pizza();
            MainCourse mc1 = new MainCourse();
            // Object Create For Classes End
            // LoginId
                int correctLoginId = 1234;
                int userInputLoginId;
        // Loop for login ID input check
        while (true)
        {
            System.out.print("Enter A Login Id or Press 2 For Exit: ");
            userInputLoginId = sc.nextInt();
            if (correctLoginId == userInputLoginId)
            {
                f1.Design();
                int menuChoice = sc.nextInt();
                if (menuChoice == 1)
                {
                    // for menu coding
                    m1.MenuFirst();
                    System.out.println("Press 1 For Pasta, Press 2 For Pizza & Press 3 For Main Course");
                    int userChoiceForMenuSelection = sc.nextInt();
                    if (userChoiceForMenuSelection == 1) {
                        // For Pasta Show Menu
                        p1.PastaShow();
                    } else if (userChoiceForMenuSelection == 2) {
                        // For Pizza Show Menu
                        pi1.PizzaShow();
                    } else if (userChoiceForMenuSelection == 3) {
                        // For Main Course Show Menu
                        mc1.MainCourseShow();
                    } else {
                        System.out.println("Invalid Choice Forcefully Exit");
                    }
                }
                else if (menuChoice == 2)
                {
                    // for add product coding
                    a1.Add1();
                }
                else if (menuChoice == 3)
                {
                    // for Exit coding
                    e1.Exit1();
                }
                else
                {
                    System.out.println("Invalid Choice Forcefully Exit");
                }
                break;
            }
            if (userInputLoginId == 2)
            {
                System.out.println("Exiting program...");
                break;
            }
            else
                {
                    System.out.println("Invalid Login Id Please Try Again");
                }
        }
    }
}