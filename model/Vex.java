package model;

import java.util.ArrayList;

/**
 * Created by CaiNot on 2018/3/20.
 */
public class Vex {
    private int vex;
    private int step_to_move;
    private int color;
    private int last_color;
    private int[] enemy = null;
    public int enemy_score=0;

    public ArrayList<Vex> vexes_near=new ArrayList<>();

    public Vex(int vex, int color) {
        this.vex = vex;
        this.color = color;
        this.last_color=color;
        this.step_to_move = 0;
    }

    public void addEdge(Vex vex){
        vexes_near.add(vex);
    }

    public int getVex() {
        return vex;
    }

    public void setVex(int vex) {
        this.vex = vex;
    }

    public int getStep_to_move() {
        return step_to_move;
    }

    public void setStep_to_move(int step_to_move) {
        this.step_to_move = step_to_move;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int[] getEnemy() {
        return enemy;
    }

    public void setEnemy(int[] enemy) {
        this.enemy = enemy;
    }

    public int getLast_color() {
        return last_color;
    }

    public void setLast_color(int last_color) {
        this.last_color = last_color;
    }

    public int calcEnemyValue(){
        int value=0;
        for(int i=0;i<enemy.length;i++){
            value+=enemy[i];
        }
        this.enemy_score=value;
        return value;
    }
}
