package net.raisetech.restapi.response;
//登録が完了したことをメーセージとしてレスポンスするクラス

public class NameCreateResponse {
    //フィールド　クラスの情報定義
    public String massage;


    //コンストラクタ　初期化のため
    public NameCreateResponse(String massage) {
        this.massage = massage;
    }


    public String getMassage() {
        return massage;
    }
}

