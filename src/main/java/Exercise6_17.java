import static java.util.Collections.shuffle;

class Exercise6_17 {

    public static int[] shuffle(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);

            // arr[i]와 arr[j]의 값을 서로 바꾼다.
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] original = new int[9];

        //original 배열에 순서대로 1부터 9까지 값 넣기
        for (int i = 0; i < original.length; i++) {
            original[i] = i + 1;
        }

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

    }
}
