package net.raisetech.restapi.response;

public class HelloResponse {
    //フィールド　クラスの情報定義
    public String massage;


    //コンストラクタ　初期化のため
    public HelloResponse(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }
}
