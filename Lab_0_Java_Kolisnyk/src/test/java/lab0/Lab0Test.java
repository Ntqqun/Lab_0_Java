package lab0;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Lab_0.Lab_0; //!!!

public class Lab0Test {


    // тест 1
    @Test(dataProvider = "intProvider")
    public void intProviderTest(int input,int expected) {
        assertEquals(new Lab_0().zav1(input),expected);// як в іншому файлі
    }

    @DataProvider
    public Object[][] intProvider() {
        return new Object[][] {{1001,1},{2000,2},{100,0},{3000,3}};
    }



    // тест 2
    @Test(dataProvider = "boolProvider")
    public void boolProviderTest(int input,boolean expected) {
        assertEquals(new Lab_0().zav2(input),expected);
    }

    @DataProvider
    public Object[][] boolProvider() {

        return new Object[][] {{13,true},{20,false},{5,true},{100,false}};
    }




    // тест 3
    @Test(dataProvider = "ifProvider")
    public void ifProviderTest(int input,int expected) {
        assertEquals(new Lab_0().zav3(input),expected);
    }

    @DataProvider
    public Object[][] ifProvider() {

        return new Object[][] {{13,14},{-20,-22},{5,6},{-100,-102}};
    }

    // тест 4
    @Test(dataProvider = "caseProvider")
    public void caseProviderTest(int input, String expected) {
        assertEquals(new Lab_0().zav4(input),expected);
    }

    @DataProvider
    public Object[][] caseProvider() {

        return new Object[][] {{1,"Погано"},{2,"Незадовільно"},{3,"Задовільно"},{4,"Добре"},
                {5,"Чудово"},{100,"Помилка K"}};
    }

    // тест 5
    @Test(dataProvider = "forProvider")
    public void forProviderTest(int input_1,int input_2, int[] expected) {
        assertEquals(new Lab_0().zav5(input_1,input_2),expected);
    }

    @DataProvider
    public Object[][] forProvider() {

        return new Object[][] {{1,5, new int[]{1,2,3,4,5}},{-3,3, new int[]{-3,-2,-1,0,1,2,3}}};
    }


    // тест 6
    @Test(dataProvider = "whileProvider")
    public void whileProviderTest(int input_1,int input_2, int expected) {
        assertEquals(new Lab_0().zav6(input_1,input_2),expected);
    }

    @DataProvider
    public Object[][] whileProvider() {

        return new Object[][] {{7,3,2},{9,3,3},{7,1,7},{14,5,2}};
    }


    // тест 7
    @Test(dataProvider = "arrayProvider")
    public void arrayProviderTest(int input, int[] expected) {
        assertEquals(new Lab_0().zav7(input),expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {

        return new Object[][] {{ 3, new int[]{2, 4, 8} }, {5,new int[]{2, 4, 8, 16, 32}},
                {7,new int[]{2, 4, 8, 16, 32, 64, 128}}};
    }


    // тест 8
    @Test(dataProvider = "matrixProvider")
    public void matrixProviderTest(int input_1,int input_2, int[][] expected) {
        assertEquals(new Lab_0().zav8(input_1,input_2),expected);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        return new Object[][]{{3, 3, new int[][]{ {5, 10, 15}, {5, 10, 15}, {5, 10, 15}}}};
    }

    } // end
