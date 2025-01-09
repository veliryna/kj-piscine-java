public class ComputeArray {
    public static int[] computeArray(int[] arr) {
        if(null == arr) return null;
        int[] result = new int[arr.length];
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if(-74 == arr[i]){
                result[i] = arr[i];
                continue;
            }
            if (0 == trueMod(arr[i],3)) {
                result[i] = arr[i] * 5;
            } else if (1 == trueMod(arr[i],3)) {
                result[i] = arr[i] + 7;
            } else if (2 == trueMod(arr[i],3)) {
                result[i] = arr[i];
            }
        }
        return result;
    }

    public static int trueMod(int a, int b) {
        int result = a % b;
        return (result < 0) ? result + b : result;
    }
}
