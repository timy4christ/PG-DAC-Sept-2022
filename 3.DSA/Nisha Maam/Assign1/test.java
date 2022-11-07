class test {
    public static void main(String[] args) {
        boolean a = true;

        if (a) {
            System.out.println("First");
        } else if (a = false) {
            System.out.println("Second");
        }

        System.out.println(a);
    }
}