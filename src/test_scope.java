import java.util.Random;

public class test_scope {
        public static void main(String[] args) {
            Random random = new Random();

            int x = random.nextInt(15) + 1;; // Escopo começa aqui

            if (x > 5) {
                // Escopo interno começa aqui
                int y = 20;
                System.out.println(x); // x é visível aqui
                System.out.println(y); // y é visível aqui
                // Escopo interno termina aqui
            }
            else {
                System.out.println(x);
            }


            // x ainda é visível aqui
            // y não é visível aqui, causaria um erro de compilação se tentasse acessá-lo
        }
    }

