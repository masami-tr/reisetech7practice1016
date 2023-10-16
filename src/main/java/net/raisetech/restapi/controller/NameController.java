package net.raisetech.restapi.controller;

import net.raisetech.restapi.request.NameCreateRequest;
import net.raisetech.restapi.response.NameCreateResponse;
import net.raisetech.restapi.response.NameResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class NameController {

    @GetMapping("/hello")//取得
    public List<NameResponse> getNames() {
        List<NameResponse> names = List.of(
                new NameResponse("takuya", "tanaka"),
                new NameResponse("hanako", "yamada"));
        return names;
    }

   /* @GetMapping("hellohello")
    public HelloResponse hello() {
        return new HelloResponse("！！！");//インスタンス生成して返す
    }*/

    @PostMapping("/")//登録
    public NameCreateResponse createName(@RequestBody NameCreateRequest nameCreateRequest) { //NameCreateResponseクラスへ送って戻す　（）インプット＝引数を入力 @RequestBody（Postmanでの記入）インスタンスの生成
        return new NameCreateResponse("created a new name"); //インスタンスの生成して返す
    }
}
