package SECOND;

public class Main2 {
    public static void main(String[] args) {
        Logger simple = new SimpleLogger();
        simple.log("Привет");
        simple.log("Тест");

        Logger smart = new SmartLogger();
        smart.log("Старт");
        smart.log("Загрузка");
        smart.log("error: файл не найден");
        smart.log("Повтор");
        smart.log("ERROR опять");
    }
}