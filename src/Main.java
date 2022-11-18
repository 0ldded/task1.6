import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        int[] arrMath = new int[10];
        int[] arrRand = new int[10];
        Random rnd1 = new Random();
        for(int i = 0; i < 10; i++)
        {
            arrMath[i] = (int) (Math.random()*6); //нужно добавить какойнибудь число,тк рандом выдает от 0 до 1
            arrRand[i] = rnd1.nextInt(1000);
        }

        System.out.println("Массив созданый с помщью. Math.random");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(arrMath[i]);
        }
        System.out.println("Массив созданый с помщью. Random.random");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(arrRand[i]);
        }
        //сортируем
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrMath.length - 1; i++) {
                if (arrMath[i] > arrMath[i + 1]) {
                    isSorted = false;

                    buf = arrMath[i];
                    arrMath[i] = arrMath[i + 1];
                    arrMath[i + 1] = buf;
                }
            }
        }
            isSorted = false;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < arrRand.length - 1; i++) {
                    if (arrRand[i] > arrRand[i + 1]) {
                        isSorted = false;

                        buf = arrRand[i];
                        arrRand[i] = arrRand[i + 1];
                        arrRand[i + 1] = buf;
                    }
                }
            }
        System.out.println("Массив созданый с помщью. Math.random после сортировки");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(arrMath[i]);
        }
        System.out.println("Массив созданый с помщью. Random.random после сортировки");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(arrRand[i]);
        }
    }}


