public class Main {
    public static void main(String[] args) {
        boolean amount = true;
        amount = canPack(1, 0, 5);
        System.out.println(amount);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        //Invalid options

        if (bigCount < 0 || smallCount <0 || goal < 0) {
            return false;
        }

        // examples if goal = 9; bigCount = 1 (5); smallCount = 4; -> 5 + 4 = 9; -> true

        int bigCountTotal = 0;

        bigCountTotal = bigCount * 5;
        System.out.println("Big Count total: " + bigCountTotal);
        System.out.println("Small Count Total: " + smallCount);
        System.out.println("Goal: " + goal);

        int total = bigCountTotal + smallCount;
        if (total == goal) {
            System.out.println("Goal matched!");
            return true;
        } else if (bigCountTotal % goal != 0) {
            while (bigCountTotal > goal) {
                bigCountTotal = 5;
            }
        }
        int smallValue = goal - bigCountTotal;
        return smallValue >= smallValue ? true : false;
    }
}