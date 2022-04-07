package at.campus02.iwi.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H'},
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0'},
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},

    };

    public void print() {
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char obstacleType) {
        int sum = 0;
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                if (obstacleType == 'H') {
                    if (environment[i][j] == 'H') {
                        sum += 1;
                    }
                }
                if (obstacleType == 'L') {
                    if (environment[i][j] == 'L') {
                        sum += 1;
                    }
                }
            }
        }
        return sum;
    }

    public int[] countObstaclesPerRow(int row) {

        int[] obstacles = new int[2];

        for (int i = 0; i < environment.length; i++) {
                if (environment[i][row] == 'H') {
                    obstacles[0] += 1;
                }
                if (environment[i][row] == 'L') {
                    obstacles[1] += 1;
                }
        }
        return obstacles;
    }

    public int energyNeededInRow(int row) {
        int energyPoints = 0;
        for (int i = 0; i < environment.length; i++) {

            if (environment[row][i] == 'H') {
                energyPoints += 2;
            }
            if (environment[row][i] == 'L') {
                energyPoints = -1;
            }
        }
        return energyPoints;
    }


    public int ableToFinishHiking(int points) {
        int howManyRows = 0;
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                if (points == energyNeededInRow(0)) {
                    howManyRows += 1;
                }
            }
        }
        return howManyRows;
    }
}
