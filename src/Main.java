public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxerOne = 78.2;
        var weightBoxerTwo = 82.7;
        var totalWeight = weightBoxerOne + weightBoxerTwo;
        System.out.println(totalWeight);
        var weightDifference = weightBoxerTwo % weightBoxerOne;
        System.out.println(weightDifference);
        var weightDifferenceTwo = weightBoxerTwo - weightBoxerOne;
        System.out.println(weightDifferenceTwo);


        var hours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = hours / hoursPerEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        var hoursOne = totalEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + hoursOne + " часов работы может быть поделено между сотрудниками");





    }
}