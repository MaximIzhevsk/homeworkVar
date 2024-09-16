public class Main {
    public static void main(String[] args) {


//        var dog = 8.0;
//        dog = dog + 4;
//        dog = dog - 3.5;
//
//        var cat = 3.6;
//        cat = cat + 4;
//        cat = cat - 1.6;
//
//        var paper = 763789;
//        paper = paper + 4;
//        paper = paper - 7639;
//
//        System.out.println(dog);
//        System.out.println(cat);
//        System.out.println(paper);

//        var friend = 19;
//        System.out.println(friend);
//        friend = friend + 2;
//        System.out.println(friend);
//        friend = friend / 7;
//        System.out.println(friend);

//        var frog = 3.5;
//        System.out.println(frog);
//        frog = frog * 10;
//        System.out.println(frog);
//        frog = frog / 3.5;
//        System.out.println(frog);
//        frog = frog + 4;
//        System.out.println(frog);

//        var firstFighter = 78.2;
//        var secondFighter = 82.7;
//        var totalMass = firstFighter + secondFighter;
//        System.out.println(totalMass);
//        var weightDifference = secondFighter - firstFighter;
//        System.out.println(weightDifference);

//        var remainderFromDivision = secondFighter % firstFighter;
//        System.out.println(remainderFromDivision);

        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalPeople = totalHours / hoursPerPerson;
        System.out.println("Всего работников в компании - " + totalPeople + " человек");

        totalPeople = totalPeople + 94;
        totalHours = hoursPerPerson * totalPeople;
        System.out.println("Если в компании работает " + totalPeople +
                " человек, то всего " + totalHours +
                " часов работы может быть поделено между сотрудниками");



    }
}