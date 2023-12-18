package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int counter = 1;
        for(int i= 1; i<= cathetusLength; i++){
            for (int j = cathetusLength; j > 0;j--){
                if(j > counter){
                    System.out.print(' ');
                }else {
                    System.out.print(j);
                }
            }

            for (int k = 2; k <= counter;k++){
                if(k > counter){
                    System.out.print(' ');
                }else {
                    System.out.print(k);
                }
            }
            counter++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
