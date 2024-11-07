import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Champion c1 = createChampion("primeiro");
        Champion c2 = createChampion("segundo");

        System.out.print("\nQuantos turnos você deseja executar? ");
        int rounds = Integer.parseInt(input.nextLine());

        for(int i = 0; i < rounds; i++){
            c1.takeDamage(c2);
            c2.takeDamage(c1);

            System.out.println("Resultado do turno " +(i+1)+": ");

            System.out.println(c1.status());
            System.out.println(c2.status() + "\n");

            if(c1.getLife() <= 0 || c2.getLife() <= 0){
                break;
            }

        }

        System.out.print("### FIM DO COMBATE ###");

    }

    public static Champion createChampion(String texto){
        System.out.print("\nDigite os dados do " +texto+ " campeão: ");
        String name = input.nextLine();

        System.out.print("\nVida inicial: ");
        int life = Integer.parseInt(input.nextLine());

        System.out.print("\nAtaque: ");
        int attack = Integer.parseInt(input.nextLine());

        System.out.print("\nArmadura: ");
        int armor = Integer.parseInt(input.nextLine());

        return new Champion(name,life,attack,armor);
    }

}