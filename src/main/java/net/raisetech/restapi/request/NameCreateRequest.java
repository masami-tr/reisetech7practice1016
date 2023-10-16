package net.raisetech.restapi.request;


//HTTPからのリクエストを受け取るクラス場所　Request=formでもOK
//フィールド名はJsonの名目と同じにする
public class NameCreateRequest {
    public String givenName;
    public String familyName;

    public NameCreateRequest(String givenName, String familyName) {
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
