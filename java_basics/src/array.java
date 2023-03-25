public class array {
    public static void main(String[] args) {
        String[] cars = {"Volvo","BMW", "Ford", "Mazda"};
        int[]Mynum = { 10, 20, 30, 40};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);

        Number[] myNumbers = new Number[4];
        myNumbers [0] = 10;
        myNumbers [1] = 20;
        myNumbers [2] = 30;
        myNumbers [3] = 40;

        //Akses elemen Array
        System.out.println(cars[0]);
        System.out.println(myNumbers[1]);

        //Manipulasi elemen Array
        myNumbers[1] = 100;
        myNumbers[2] = null;
        System.out.println(myNumbers[1]);
        System.out.println(myNumbers[2]);

        }

}