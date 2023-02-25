
public class castsample {

    public static void main(String[] args) {
        // int型変数aとbの宣言及び初期化
        int a = 3;
        int b = 2;

        //int型同士の徐算(結果はint型)
        System.out.println(a / b);

        //int型aを一時的にdouble型に変換して徐算する
        System.out.println((double)a / b);

        //int型同士の徐算をした結果をdouble型に変換
        System.out.println((double)(a /b));

    }

}
