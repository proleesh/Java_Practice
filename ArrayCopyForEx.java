
public class ArrayCopyForEx {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        for(int i=0; i < oldStrArray.length; ++i){
            newStrArray[i] = oldStrArray[i];
        }

        for(int k=0; k < newStrArray.length; ++k){
            System.out.print(newStrArray[k] + ", ");
        }

    }
}
