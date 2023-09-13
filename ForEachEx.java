
public class ForEachEx {
    public static void main(String[] args) {
        String[] names = {"Apple", "Gucci", "Hermes", "Prada", "Fendi"};
        int[] prices = {999,8999,99999,23444,19999};

        for(String name : names){
            System.out.print("name: " + name + "\n");
        }
        System.out.println();
        int sumPrice = 0;
        for(int price : prices){
            sumPrice += price;
        }
        System.out.println("물건 총합: " + sumPrice);

        double avg = (double)sumPrice / prices.length;
        System.out.println("물건 평균값: " + avg);
    }
}
