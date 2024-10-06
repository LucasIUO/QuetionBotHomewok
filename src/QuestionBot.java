import java.util.Scanner;

public class QuestionBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入僵尸的血量
        int health = scanner.nextInt();
        int hits = 0; // 砍的次数

        while (health > 0) {
            hits++; // 每次攻击增加一次砍击计数
            health -= 2; // 每次攻击造成2点伤害

            // 每3次攻击后触发暴击
            if (hits % 3 == 0) {
                health -= 10; // 额外造成10点伤害
            }
        }

        // 输出砍了多少次
        System.out.println(hits);
        scanner.close();
    }
}
