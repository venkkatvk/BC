public class Main {
    static void main(String[] args) {
//        Box box1 = new Box(4,5,6);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//
//        System.out.println(box3.h + " " +box3.weight);
//
        Box box5 = new BoxWeight(4,5,4,4);
        System.out.println(((BoxWeight) box5).weight);
        System.out.println(box5.h);

       // BoxWeight box6 = new BoxWeight(5,4,5);
     //   System.out.println(box6.l);
    }
}
