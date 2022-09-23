package Lab_0;

// Варіант 2
public class Lab_0 {


    // Завдання 1
   public int zav1(int m) {
        int k = m / 1000;
        return k;
    }

    // Завдання 2
   public boolean zav2(int A ) {
       return A % 2 == 1;

//        if (A % 2 == 1) {
//            System.out.print("Число A непарне");
//        } else {
//            System.out.print("Число A парне");
//        }


   }

    // Завдання 3

    public int zav3( int B ) {
        if (B < 0) {
            B = B - 2;
        } else {
            B++ ;
        }
      return  B;
    }

    // Завдання 4
    public String zav4(int K ) {
    String word;

        switch (K) {
            case 1:
               word = "Погано";
                break;
            case 2:
                word = "Незадовільно";
                break;
            case 3:
                word = "Задовільно";
                break;
            case 4:
                word = "Добре";
                break;
            case 5:
                word = "Чудово";
                break;
            default:
                word = "Помилка K";
                break;
        }

        return word;
    }

    // Завдання 5
    public int[] zav5(int A,int B) {

        int[] res =  new int[B-A+1];
        res[0] = A;
            for(int i=1;i<B-A+1;i++) {
                res[i] = res[i-1]+1;
            }

        return res;
    }


    // Завдання 6
    public int zav6( int A ,int B ) {
       int n = 0;
      while(A-B>=0){
        A-=B;
        n++;}
      return n;
    }

    // Завдання 7
    public int[] zav7(int N ) {
        int  i,k=2;
        int[] arr  = new int[N];

        for (i = 0; i < N; i++) {
            arr[i] = k ;
            k*=2;
        }

        return arr;
    }


            // Завдання 8
            public int[][] zav8(int M, int N ) {
                int[][] matrix = new int[M][N];
                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < N; j++) {
                        matrix[i][j] = (j + 1) * 5;
                    }
                }
                return matrix;
            }

} //end

