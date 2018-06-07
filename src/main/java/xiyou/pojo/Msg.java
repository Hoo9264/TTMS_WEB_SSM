package xiyou.pojo;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    //状态码
    private int code;
    //    用户要返回的信息
    private String msg;

    private Map<String, Object> data= new HashMap<String, Object>();

    public static Msg success(){
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("success");
        return result;
    }
    public static Msg fail(){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("fail");
        return result;
    }

    public Msg add(String key,Object value){
        this.getData().put(key,value);
        return this;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }




}
