public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        var friend = 19;



        //задача 2
        System.out.println("Задача 2");
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);

        //задача 3
        System.out.println("Задача 3");
        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);


        //задача 4
        System.out.println("Задача 4");
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);



        //задача 6
        System.out.println("Задача 6");
        var weightBoxerOne = 78.2;
        var weightBoxerTwo = 82.7;
        System.out.println("Суммма весов двух бойцов = " + (weightBoxerOne + weightBoxerTwo));

        //задача 7
        System.out.println("Задача 7");
        System.out.println("Разница весов = " + (weightBoxerTwo % weightBoxerOne));
        System.out.println("Разница весов = " + (weightBoxerTwo - weightBoxerOne));


        //задача 8
        System.out.println("Задача 8");
        var hours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = hours / hoursPerEmployee;
        System.out.println("Всего работников в компании " + hours/hoursPerEmployee + " человек");

        totalEmployees = totalEmployees + 94;
        hours = totalEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");





    }
}