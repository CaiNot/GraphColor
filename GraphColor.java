import model.FileOperation;

/**
 * Created by CaiNot on 2018/3/20.
 */
public class GraphColor {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);

        final String PATH="D:/instances/instances/DSJC125.1.col";

        FileOperation fileOperation=new FileOperation();
        int[][] graph=fileOperation.readFile(PATH);
        if(graph==null){
            System.out.println("Error file read error");
            System.exit(1);
        }
    }
}
