class Final_Variable {
    final int A = 99;
    void myMethod() {
        A = 101;
        System.out.println(A);
    }
    public static void main(String args[]) {
        Final_Variable obj = new Final_Variable();
        obj.myMethod();
    }
}