public class TrianguloRetangulo {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            String exit = ""; 
            for (int j = 0; j < i; j++) {
                exit = exit.concat("*");
            }
            System.out.println(exit);
        }
    }
}