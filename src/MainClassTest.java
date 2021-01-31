import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        //Создание экземпляра класса
        MainClass mainClass = new MainClass();

        //вызов метода для получения числа 14
        int result = mainClass.getLocalNumber();

        //проверка что метод отдал число 14
        Assert.assertEquals("Число должно быть равно 14", 14, result);
    }

    @Test
    public void testGetClassNumber() {
        //Создание экземпляра класса
        MainClass mainClass = new MainClass();

        //вызов метода для получения числа
        int result = mainClass.getClassNumber();

        //проверка что метод отдал число больше 45
        Assert.assertTrue("Число должно быть больше 45", result > 45);


    }

    @Test
    public void testGetClassString() {
        //Создание экземпляра класса
        MainClass mainClass = new MainClass();

        String result = mainClass.getClassString();


        Assert.assertTrue("в строке должно быть слово hello", result.contains("hello"));
    }


}
