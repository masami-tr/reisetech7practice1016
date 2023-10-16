package net.raisetech.restapi.response;

public class NameResponse {
    //フィールド　何を固定するかの定義　Jsonにしたい項目を書く
    private String givenName;
    private String familyName;

    //コンストラクタ
    public NameResponse(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }
}
