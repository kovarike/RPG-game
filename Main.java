import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao RPG simples!");
        System.out.println("Escolha seu personagem:");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");

        int choice = scanner.nextInt();
        
        Character player;
        if (choice == 1) {
    	   System.out.println("Digite o nome do seu personagem:");
           String name = scanner.nextLine();
           player = new Warior(name);
        }else if(choice == 2) {
    	   System.out.println("Digite o nome do seu personagem:");
           String name = scanner.nextLine();
           player = new Mage(name);
        } else {
    	   System.out.println("Não escolheu? Vai ser guerreirto então.\nDigite o nome do seu personagem:");
    	   String name = scanner.nextLine();
           player = new Warior(name);
           
        }
        
        scanner.nextLine(); // Consumir a quebra de linha
        
        

        System.out.println("Seu personagem: " + player.getName() + ", Vida: " + player.getHealth());

        Enemy enemy = new Enemy();
        System.out.println("Um inimigo apareceu! Vida: " + enemy.getHealth());

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n--- Sua vez ---");
            int playerAttack = player.attack();
            enemy.takeDamage(playerAttack);
            System.out.println(player.getName() + " atacou o inimigo e causou " + playerAttack + " de dano.");
            System.out.println("Vida do inimigo: " + enemy.getHealth());

            if (!enemy.isAlive()) {
                System.out.println("Você derrotou o inimigo!");
                break;
            }

            System.out.println("\n--- Turno do Inimigo ---");
            int enemyAttack = enemy.attack();
            player.takeDamage(enemyAttack);
            System.out.println("O inimigo atacou e causou " + enemyAttack + " de dano.");
            System.out.println("Sua vida: " + player.getHealth());

            if (!player.isAlive()) {
                System.out.println("Você foi derrotado...");
            }
        }

        scanner.close();
        
        
        
    }
}
