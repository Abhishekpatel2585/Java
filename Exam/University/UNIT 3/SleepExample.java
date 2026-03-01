class SleepExample {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        try {
            // Pause execution for 3 seconds (3000 milliseconds)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Sleep was interrupted");
        }

        System.out.println("Program resumes after 3 seconds...");
    }
}