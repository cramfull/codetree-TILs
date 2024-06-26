import java.util.*;
import java.io.*;

public class Main {

    static class Node implements Comparable<Node>{
        int idx;
        int cost;

        public Node(int idx, int cost){
           this.idx = idx;
           this.cost = cost; 
        }
        // @override
        public int compareTo(Node o){
            return Integer.compare(this.cost, o.cost);
        }
    }

    static ArrayList<ArrayList<Node>> graph =  new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str  = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(str.nextToken());
        int edge = Integer.parseInt(str.nextToken());

        for(int i=0;i<vertex+1;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<edge;i++){
            str = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(str.nextToken());
            int ed = Integer.parseInt(str.nextToken());
            int cost = Integer.parseInt(str.nextToken());

            graph.get(st).add(new Node(ed, cost));
        }
        
        dijkstra(vertex, 1);



    }

    static void dijkstra(int vertex, int st){
        boolean [] visited = new boolean[vertex+1];
        int dist [] = new int[vertex+1];
        int INF = Integer.MAX_VALUE;
        for(int i=0;i<dist.length;i++){
            dist[i]= INF;
        }
        dist[st] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(st,0));

        while(!pq.isEmpty()){
            Node nowV = pq.poll();
            if(!visited[nowV.idx]){
                visited[nowV.idx]=true;
                
                for(int i=0;i<graph.get(nowV.idx).size();i++){
                    Node nxtV = graph.get(nowV.idx).get(i);
                    if(dist[nxtV.idx]>dist[nowV.idx]+nxtV.cost){
                        dist[nxtV.idx] = dist[nowV.idx]+nxtV.cost;

                        pq.offer(new Node(nxtV.idx, dist[nxtV.idx]));
                    }
                }


            }
        }

        for(int i=2;i<dist.length;i++){
            if(dist[i]== INF){
                System.out.println("-1");
            }else{
                System.out.println(dist[i]);
            }
        }
    }


}