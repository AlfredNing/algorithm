package stage01.lesson09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName TopologySort
 * @Description 拓扑排序
 * @Author Alfred.Ning
 * @Date 2022/5/22 14:20
 * @Version 1.0
 **/
public class TopologySort {
    public static List<Node> sortedTopology(Graph graph) {
        // key 节点 ，value 剩余入度
        HashMap<Node, Integer> inMap = new HashMap<>();
        // 只有入度为0的点，进入该队列
        LinkedList<Node> zeroInQueue = new LinkedList<>();
        for (Node value : graph.nodes.values()) {
            inMap.put(value, value.in);
            if (value.in == 0) {
                zeroInQueue.add(value);
            }
        }
        ArrayList<Node> res = new ArrayList<>();
        while (!zeroInQueue.isEmpty()) {
            Node cur = zeroInQueue.poll();
            res.add(cur);
            for (Node next : cur.nexts) {
                inMap.put(next, inMap.get(next) - 1);
                if (inMap.get(next) == 0){
                    zeroInQueue.add(next);
                }
            }
        }
        return res;
    }
}
