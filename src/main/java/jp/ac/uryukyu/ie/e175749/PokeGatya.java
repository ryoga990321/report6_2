package jp.ac.uryukyu.ie.e175749;

public class PokeGatya {
    int val,number; //乱数を取得する

    //ガチャから排出されるポケモンの配列
    String[] ssr = {"フリーザー", "ファイアー", "サンダー", "ミュウツー", "ミュウ", "エンテイ", "ライコウ", "スイクン", "ホウオウ", "ルギア", "セレビィ", "レジロック", "レジアイス", "レジスチル", "グラードン", "カイオーガ", "レックウザ", "ラティアス", "ラティアス", "デオキシス", "ジラーチ",};
    String[] sr = {"リザードン", "フシギバナ", "カメックス", "カイリキー", "フーディン", "ゴローニャ", "ニドクイン", "ニドキング", "ニョロボン", "ゲンガー", "カイリュー", "ピジョット", "バタフリー", "スピアー", "ラフレシア", "ウツボット", "ワタッコ", "プクリン", "デンリュウ", "メガニウム", "バクフーン", "バシャーモ", "アゲハント", "ドクケイル", "ライチュウ", "ダーテング", "ケッキング", "ジュカイン", "ハスブレロ", "マリルリ", "オーダイル", "ラグラージ", "トドゼルガ", "キングドラ", "クロバット", "バクオング", "ピクシー", "ボスゴドラ", "バンギラス", "サーナイト", "フライゴン", "ボーマンダ", "メタグロス", "ニョロトノ", "キレイハナ"};
    String[] r = {"リザード", "フシギソウ", "カメール", "ゴーリキー", "ユンゲラー", "ゴローン", "ニドリーナ", "ニドリーノ", "ニョロゾ", "ゴースト", "ハクリュー", "ピジョン", "トランセル", "コクーン", "クサイハナ", "ウツドン", "ポポッコ", "プリン", "モココ", "ベイリーフ", "マグマラシ", "ワカシャモ", "カラサリス", "マユルド", "ピカチュウ", "コノハナ", "ヤルキモノ", "ジュプトル", "ハスブレロ", "マリル", "アリゲイツ", "ヌマクロー", "トドグラー", "シードラ", "ゴルバット", "ドゴーム", "ピッピ", "コドラ", "サナギラス", "キルリア", "ビブラーバ", "コモルー", "メタング"};
    String[] n = {"ヒトカゲ", "フシギダネ", "ゼニガメ", "ワンリキー", "ケーシィ", "イシツブテ", "ニドラン♀", "ニドラン♂", "ニョロモ", "ゴース", "ミニリュウ", "ポッポ", "キャタピー", "ビードル", "ナゾノクサ", "マダツボミ", "ハネッコ", "ププリン", "メリープ", "チコリータ", "ヒノアラシ", "アチャモ", "ケムッソ", "ピチュー", "タネボー", "ナマケロ", "キモリ", "ハスボー", "ルリリ", "ワニノコ", "ミズゴロウ", "タマザラシ", "タッツー", "ズバット", "ゴニョニョ", "ピィ", "ココドラ", "ヨーギラス", "ラルトス", "ナックラー", "タツベイ", "ダンバル"};

    //レア度が保存された変数
    String name1="ssr";
    String name2="sr";
    String name3="r";
    String name4="n";

    String monster; //ポケモンの名前を保存する

    /**
     * 確率で場合分けされたガチャメソッド
     * case1;5%
     * case2;15%
     * case3;40%
     * case4;40%
     */
    public void rareGatya() {
        sulot();
        if (val >= 1 && val <= 5) {
            poket(ssr);
            celect(name1);
        } else if (val >= 6 && val <= 20) {
            poket(sr);
            celect(name2);
        } else if (val >= 21 && val <= 60) {
            poket(r);
            celect(name3);
        } else if (val >= 61 && val <= 100) {
            poket(n);
            celect(name4);
        }
    }

    /**
     *ssrとsrだけのガチャメソッド
     * case1;25%
     * case2;75%
     */
    public void lastGatya() {
        sulot();
        if (val >= 1 && val <= 25) {
            poket(ssr);
            celect(name1);
        } else if (val >= 26 && val <= 100) {
            poket(sr);
            celect(name2);
        }
    }

    /**
     *ssr排出の確率を大きくしたガチャメソッド
     * case1;15%
     * case2;15%
     * case3;35%
     * case4;35%
     */
    public void superGatya() {
        sulot();
        if (val >= 1 && val <= 15) {
            poket(ssr);
            celect(name1);
        } else if (val >= 16 && val <= 30) {
            poket(sr);
            celect(name2);
        } else if (val >= 31 && val <= 65) {
            poket(r);
            celect(name3);
        } else if (val >= 65 && val <= 100) {
            poket(n);
            celect(name4);
        }
    }

    /**
     * レア度に応じてコメントするメソッド
     * @param name ポケモンのレア度
     */
    public void celect(String name){
        System.out.println(name+":"+monster);
        if (name==name1){
            System.out.println("いやっほーい！伝説だべ！！");
        }else if(name==name2){
            System.out.println("まあ、あたりっちゃあたりだべ");
        }else if(name==name3){
            System.out.println("ハズレだっぺな");
        }else if(name==name4){
            System.out.println("クソが！");
        }
    }

    /**
     * 指定した配列からランダムにポケモン名を取得するメソッド
     * @param rare ポケモンの配列
     * 処理:ポケモン名をthis.monsterに保存
     */
    public void poket(String[] rare){
        if(rare==ssr){
            number=(int) (Math.random() * 21);
        }else if(rare==sr){
            number=(int) (Math.random() * 45);
        }else if(rare==r){
            number=(int) (Math.random() * 43);
        }else if(rare==n){
            number=(int) (Math.random() * 42);
        }
        monster=rare[number];
    }

    /**
     * 1~100の乱数を取得するメソッド
     */
    public void sulot(){
        val = (int) (Math.random() * 100) + 1;
    }

    /**
     * 指定した特定のポケモン名を取得するメソッド(今回は未使用)
     * @param number インデックス
     * @param rare 特定のポケモンが存在する配列
     * 処理1:インデックスをthis.numberに保存する
     * 処理2:特定のポケモンをthis.monsterに保存する
     */
    public void choice(int number,String[] rare){
        this.number=number;
        monster=rare[number];
    }

}


