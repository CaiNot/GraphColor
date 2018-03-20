package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by CaiNot on 2018/3/20.
 */
public class FileOperation {

    /**
     * @Author: CaiNot
     * @param PATH 文件路径
     * @Description: 从文件读取，存为一个矩阵
     * @Date: 16:14 2018/3/20
     */
    public int[][] readFile(String PATH) {

        File file = new File(PATH);
        FileReader fileReader = null;
        int[][] graph=null;
        BufferedReader bufferedReader=null;
        String line = null;
        String[] detail = null;
        int x=0,y=0;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                detail=line.split(" ");
                if (detail[0]=="p"){
                    x=Integer.valueOf(detail[2]);
                    graph=new int[x][x];
                }else if(detail[0]=="e"){
                    if(graph==null)
                        return null;
                    else {
                        x=Integer.valueOf(detail[1])-1;
                        y=Integer.valueOf(detail[2])-1;
                        /** 减1，防止溢出 **/


                        graph[x][y]=1;
                        graph[y][x]=1;
                    }
                }

            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return graph;
    }
}
