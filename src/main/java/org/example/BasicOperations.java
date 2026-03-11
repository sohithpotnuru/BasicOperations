void main() {

    Scanner sc = new Scanner(System.in);

    IO.print("Enter first number: ");
    int a = sc.nextInt();

    IO.print("Enter second number: ");
    int b = sc.nextInt();

    // Arithmetic Operations
    IO.println("\n--- Arithmetic Operations ---");
    IO.println("Addition: " + (a + b));
    IO.println("Subtraction: " + (a - b));
    IO.println("Multiplication: " + (a * b));
    IO.println("Division: " + (a / b));
    IO.println("Modulus: " + (a % b));

    // Relational Operations
    IO.println("\n--- Relational Operations ---");
    IO.println("a > b : " + (a > b));
    IO.println("a < b : " + (a < b));
    IO.println("a >= b : " + (a >= b));
    IO.println("a <= b : " + (a <= b));
    IO.println("a == b : " + (a == b));
    IO.println("a != b : " + (a != b));

    // Logical Operations
    IO.println("\n--- Logical Operations ---");
    boolean x = (a > 0);
    boolean y = (b > 0);
    IO.println("x && y : " + (x && y));
    IO.println("x || y : " + (x || y));
    IO.println("!x : " + (!x));

    // Assignment Operations
    IO.println("\n--- Assignment Operations ---");
    int c = a;
    c += b;
    IO.println("c += b : " + c);
    c -= b;
    IO.println("c -= b : " + c);
    c *= b;
    IO.println("c *= b : " + c);
    c /= b;
    IO.println("c /= b : " + c);

    // Increment and Decrement
    IO.println("\n--- Increment & Decrement ---");
    int d = a;
    IO.println("Original value: " + d);
    d++;
    IO.println("After Increment: " + d);
    d--;
    IO.println("After Decrement: " + d);

    sc.close();
}