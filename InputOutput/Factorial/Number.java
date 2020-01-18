package Factorial;

interface Number {
    int func(int n);
}
class Block {
    public static void main (String[] args) {
        Number factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <=n; i++)
                result = i * result;
            return result;
        };

        System.out.println(factorial.func(10));
    }
}
