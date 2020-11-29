/*
多条件嵌套分支，设计一个程序，根据天气情况选择外出或在家，
外出是逛街还是逛公园，在家是看电影还是玩游戏。
 */
public class text08 {
    public static void main(String[] args) {
        String str="晴天";
        if (str.equals("晴天")){
            if(true){
                System.out.println("逛街");
            }else{
                System.out.println("逛公园");
            }
        }else{
            if (true){
                System.out.println("看电影");
            }else{
                System.out.println("打游戏");
            }
        }
    }
}
