package Opera;
import java.util.Random;
import java.util.Scanner;
public class Tetris {
    private static final int WIDTH = 10; // Ширина игрового поля
    private static final int HEIGHT = 20; // Высота игрового поля
    private static final char EMPTY = '.'; // Символ пустой клетки
    private static final char BLOCK = '#'; // Символ заполненной клетки
    private static final int[][] SHAPES = { // Фигуры Тетриса
            {1, 1, 1, 1}, // I-образная
            {1, 1, 1, 0, 1}, // T-образная
            {1, 1, 0, 1, 1}, // Z-образная
            {0, 1, 1, 1, 1}, // S-образная
            {1, 1, 1, 1, 0}, // L-образная
            {1, 1, 1, 0, 0, 1}, // J-образная
            {1, 1, 1, 1} // O-образная
    };

    private char[][] grid; // Игровое поле
    private int[] currentShape; // Текущая фигура
    private int shapeX, shapeY; // Позиция фигуры на поле
    private boolean gameOver; // Флаг завершения игры

    public Tetris() {
        grid = new char[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = EMPTY;
            }
        }
        gameOver = false;
        spawnShape();
    }

    // Создание новой фигуры
    private void spawnShape() {
        Random random = new Random();
        currentShape = SHAPES[random.nextInt(SHAPES.length)];
        shapeX = WIDTH / 2 - 1;
        shapeY = 0;
        if (!canMove(shapeX, shapeY)) {
            gameOver = true;
        }
    }

    // Проверка, может ли фигура переместиться в новую позицию
    private boolean canMove(int newX, int newY) {
        for (int i = 0; i < currentShape.length; i++) {
            if (currentShape[i] == 1) {
                int x = newX + i % 2;
                int y = newY + i / 2;
                if (x < 0 || x >= WIDTH || y >= HEIGHT || (y >= 0 && grid[y][x] != EMPTY)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Перемещение фигуры вниз
    private void moveDown() {
        if (canMove(shapeX, shapeY + 1)) {
            shapeY++;
        } else {
            placeShape();
            clearLines();
            spawnShape();
        }
    }

    // Перемещение фигуры влево
    private void moveLeft() {
        if (canMove(shapeX - 1, shapeY)) {
            shapeX--;
        }
    }

    // Перемещение фигуры вправо
    private void moveRight() {
        if (canMove(shapeX + 1, shapeY)) {
            shapeX++;
        }
    }

    // Поворот фигуры
    private void rotateShape() {
        int[] rotatedShape = new int[currentShape.length];
        for (int i = 0; i < currentShape.length; i++) {
            rotatedShape[i] = currentShape[currentShape.length - 1 - i];
        }
        if (canMove(shapeX, shapeY)) {
            currentShape = rotatedShape;
        }
    }

    // Размещение фигуры на поле
    private void placeShape() {
        for (int i = 0; i < currentShape.length; i++) {
            if (currentShape[i] == 1) {
                int x = shapeX + i % 2;
                int y = shapeY + i / 2;
                if (y >= 0 && y < HEIGHT && x >= 0 && x < WIDTH) {
                    grid[y][x] = BLOCK;
                }
            }
        }
    }

    // Очистка заполненных линий
    private void clearLines() {
        for (int y = HEIGHT - 1; y >= 0; y--) {
            boolean fullLine = true;
            for (int x = 0; x < WIDTH; x++) {
                if (grid[y][x] == EMPTY) {
                    fullLine = false;
                    break;
                }
            }
            if (fullLine) {
                for (int yy = y; yy > 0; yy--) {
                    System.arraycopy(grid[yy - 1], 0, grid[yy], 0, WIDTH);
                }
                for (int x = 0; x < WIDTH; x++) {
                    grid[0][x] = EMPTY;
                }
                y++; // Проверяем текущую строку снова
            }
        }
    }

    // Отрисовка игрового поля
    private void draw() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (y >= shapeY && y < shapeY + 2 && x >= shapeX && x < shapeX + 2) {
                    int index = (y - shapeY) * 2 + (x - shapeX);
                    if (index < currentShape.length && currentShape[index] == 1) {
                        System.out.print(BLOCK);
                        continue;
                    }
                }
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }

    // Основной игровой цикл
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            draw();
            System.out.println("Управление: a - влево, d - вправо, s - вниз, r - поворот, q - выход");
            String input = scanner.nextLine();
            switch (input) {
                case "a":
                    moveLeft();
                    break;
                case "d":
                    moveRight();
                    break;
                case "s":
                    moveDown();
                    break;
                case "r":
                    rotateShape();
                    break;
                case "q":
                    gameOver = true;
                    break;
            }
            moveDown();
        }
        System.out.println("Игра окончена!");
    }

    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.run();
    }
}