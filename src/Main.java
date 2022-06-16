public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-                         Home Works                           -");
        System.out.println("----------------------------------------------------------------");
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();

    }
    public static  void homeWork1(){
        System.out.println("Home work 1");
        int[] massivInt = new int[]{1,2,3};
        double[] massivDouble={1.57, 7.654, 9.986};
        boolean[] massivBool={true,false,true};

        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork2(){

        System.out.println("Home work 2");
        int[] massivInt = new int[]{1,2,3};
        double[] massivDouble={1.57, 7.654, 9.986};
        boolean[] massivBool={true,false,true};
        for (int i=0;i<massivInt.length;i++){
            if (i<massivInt.length-1) {
                System.out.printf(massivInt[i]+",");
            }else System.out.printf(massivInt[i]+" ");
        }
        System.out.println("");
        for (int i=0;i<massivDouble.length;i++){
            if (i<massivDouble.length-1) {
                System.out.printf(massivDouble[i]+",");
            }else System.out.printf(massivDouble[i]+" ");
        }
        System.out.println("");
        for (int i=0;i<massivBool.length;i++){
            if (i<massivBool.length-1) {
                System.out.printf(massivBool[i]+",");
            }else System.out.printf(massivBool[i]+" ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork3(){
        System.out.println("Home work 3");

        int[] massivInt = new int[]{1,2,3};
        double[] massivDouble={1.57, 7.654, 9.986};
        boolean[] massivBool={true,false,true};

        for (int i=massivInt.length-1;i>=0;i--){
            if (i>0) {
                System.out.printf(massivInt[i]+",");
            }else System.out.printf(massivInt[i]+" ");
        }
        System.out.println("");

        for (int i=massivDouble.length-1;i>=0;i--){
            if (i>0) {
                System.out.printf(massivDouble[i]+",");
            }else System.out.printf(massivDouble[i]+" ");
        }
        System.out.println("");

        for (int i=massivBool.length-1;i>=0;i--){
            if (i>0) {
                System.out.printf(massivBool[i]+",");
            }else System.out.printf(massivBool[i]+" ");
        }
        System.out.println("");

        System.out.println("----------------------------------------------------------------");
    }

    public static  void homeWork4(){
        System.out.println("Home work 4");
        int[] massivInt = new int[]{1,2,3};

        for (int i=0;i<massivInt.length;i++){
            if(massivInt[i]%2!=0) massivInt[i]++;
            if (i<massivInt.length-1) {
                System.out.printf(massivInt[i]+",");
            }else System.out.printf(massivInt[i]+" ");
        }
        System.out.println("");

        System.out.println("----------------------------------------------------------------");
    }


}