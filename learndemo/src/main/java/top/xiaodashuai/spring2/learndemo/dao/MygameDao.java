package top.xiaodashuai.spring2.learndemo.dao;

import top.xiaodashuai.spring2.learndemo.entity.Mygame;

import java.util.List;

public interface MygameDao {

    /*
     * 添加我玩的游戏
     */
    int addGame(Mygame mygame);

    /*
     * 删除我玩过的游戏
     */
    int delGame(Mygame mygame);

    /*
     * 修改我玩的游戏
     */
    int updateGame(Mygame mygame);

    /*
     *  查询我玩过的游戏
     */
    List<Mygame> queryGame();

    /*
     * 单独查询我玩过的游戏
     */
    Mygame queryGameById(Integer id);

}
