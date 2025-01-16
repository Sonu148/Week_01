class NullPointerExceptionDemo {

    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            // Attempt to call a method on a null variable
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Text is null. Please initialize it before accessing.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException:");
        handleNullPointerException();
    }
}
