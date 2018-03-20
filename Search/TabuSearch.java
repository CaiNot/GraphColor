package Search;

import model.*;

/**
 * Created by CaiNot on 2018/3/20.
 */
public class TabuSearch {

    private Vex[] vex_enemy = null;
    private Vex vex = null;
    private int k = 0;
    private int[][] graph = null;

    public int init(int[][] graph, int k) {
        if (graph == null) {
            return 1;
        }
        this.k = k;
        this.vex_enemy = new Vex[graph.length];
        this.graph = graph;

        int[] enemy = null;

        for (int i = 0; i < graph.length; i++) {
            this.vex = new Vex(i, (int) (Math.random() * this.k));
            this.vex_enemy[i] = this.vex;
        }
        
        return 0;
    }

    public int[] initEnemy(Vex vex) {
        int is_near_vex = 0;
        int[] enemy = new int[this.k];
        Vex vex_temp = null;

        for (int i = 0; i < this.graph.length; i++) {
            is_near_vex = this.graph[vex.getVex()][i];
            if (is_near_vex == 1) {
                vex_temp = this.vex_enemy[i];
                enemy[vex_temp.getColor()]++;
            }
        }
        return enemy;
    }
}
