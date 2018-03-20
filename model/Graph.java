package model;

/**
 * Created by CaiNot on 2018/3/20.
 */
public class Graph {
    Vex[] vexes=null;

    public Graph(int vexes_nums){
        vexes=new Vex[vexes_nums];
    }

    public void addVex(Vex vex){
        vexes[vex.getVex()]=vex;
    }

    public int calcEnemyValue(){
        int value=0;
        for (int i=0;i<vexes.length;i++){
            value+=vexes[i].enemy_score;
        }
        return value;
    }
}